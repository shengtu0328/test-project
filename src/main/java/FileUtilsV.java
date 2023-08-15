import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 文件工具类
 *
 * @author chongwenjun
 */
public class FileUtilsV {
    /**
     * 日志类
     */
    private static final Logger logger = LoggerFactory.getLogger(FileUtilsV.class);

    /**
     * Linux系统标示
     */
    public static final int Linux = 0;
    /**
     * Windows系统标示
     */
    public static final int Windows = 1;
    /**
     * Mac系统标示
     */
    public static final int Mac = 2;

    public static void main(String args[]) {
        // test1
        getNextLevelDirectorysInCurrentDirectoryPath(
                "/Users/chongwenjun/Documents/OneDrive/前端/inspiniaAdmin/Static_Full_Version");
        HashSet<String> result = new HashSet<>();
        logger.info("**************************************");
        // test2
        getAllFileInDirectoryPath("/Users/chongwenjun/Documents/CodeWorkSpase/cms/c:/data/cms", result);
        for (String path : result) {
            logger.info(path);
        }
        logger.info("**************************************");
        // test3
        boolean exceFlag = createFileShortCut(
                "/Users/chongwenjun/Documents/CodeWorkSpase/cms/c:/data/cms/SP096144382/filetest.html",
                "/Users/chongwenjun/Documents/CodeWorkSpase/cms/c:/data/publishview/SP096144382/filetest.html.link");
        logger.info(String.valueOf(exceFlag));
    }

    /**
     * 复制文件
     *
     * @param source
     * @param dest
     */
    @SuppressWarnings("resource")
    public static void copyFileUsingFileChannels(File source, File dest) {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        if (source == null || dest == null) {
            return;
        }
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e) {
            logger.error("复制文件失败：{} , {}------>{}", source.getName(), dest.getName(), e);
        } finally {
            try {
                if (inputChannel != null) {
                    inputChannel.close();
                }
                if (outputChannel != null) {
                    outputChannel.close();
                }
            } catch (IOException e) {
                logger.error("复制文件失败：{} , {}------>{}", source.getName(), dest.getName(), e);
            }
        }
    }

    /**
     * 删除文件夹
     *
     * @param file
     * @param resultFileList
     */
    public static void deleteDir(File file, HashSet<String> resultFileList) {
        if (resultFileList == null) {
            resultFileList = new HashSet<>();
        }
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                deleteDir(f, resultFileList);
            }
        }
        file.delete();
        resultFileList.add(file.getPath());
        logger.info("{} 删除成功", file.getPath());
    }

    /**
     * 判断系统是linux还是windows
     *
     * @return int【0：linux，1：windows】
     */
    public static int getSystemOs() {
        String os = System.getProperty("os.name");
        logger.info("当前系统信息 : {}", os);
        if (os.toLowerCase().startsWith("linux")) {
            // 0：linux
            return Linux;
        }
        if (os.toLowerCase().startsWith("mac")) {
            // 2：Mac
            return Mac;
        }
        // 1：windows
        return Windows;
    }

    /**
     * 环境创建文件快捷方式
     *
     * @param filePath
     * @param shortCutPath
     */
    public static boolean createFileShortCut(String filePath, String shortCutPath) {
        if (StringUtils.isBlank(filePath)) {
            logger.warn("创建文件快捷方式失败，原始文件路径为空");
            return false;
        }
        if (StringUtils.isBlank(shortCutPath)) {
            logger.warn("创建文件快捷方式失败，快捷方式路径为空");
            return false;
        }
        if (getSystemOs() == Windows) {
            logger.warn("当前系统不是Linux，暂时不支持创建快捷方式");
            return false;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            logger.warn("文件不存在 : {} 创建文件快捷方式失败", filePath);
        }
        file = null;
        file = new File(shortCutPath);
        if (file.exists()) {
            // 快捷方式已经存在，删除
            file.delete();
            logger.warn("快捷方式已经存在，删除，准备重建");
        }
        file = null;
        String command = "ln -s " + filePath + " " + shortCutPath;
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            logger.error("创建文件快捷方式失败：{} , {}------>{}", filePath, shortCutPath, e);
            return false;
        }
        return true;
    }

    /**
     * 获得指定目录下的所有文件【包括子文件夹】
     *
     * @param resultFileList
     * @param filePath
     */
    public static void getAllFileInDirectoryPath(String filePath, HashSet<String> resultFileList) {
        if (resultFileList == null) {
            resultFileList = new HashSet<>();
        }
        if (StringUtils.isBlank(filePath)) {
            logger.warn("文件夹目录为空字符串，无法获取下属所有文件");
            return;
        }
        File file = new File(filePath);
        if (file.isFile()) {
            logger.warn("{} 是文件，无法获取下属所有文件", filePath);
            // 加入文件
            resultFileList.add(filePath);
            return;
        }
        // 将该目录下的所有文件放置在一个File类型的数组中
        File[] fileList = file.listFiles();
        if (fileList == null || fileList.length == 0) {
            logger.info("{} ，没有下级目录或文件", filePath);
            return;
        }
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].isFile()) {
                logger.info("获取文件 : {}", fileList[i].getPath());
                // 加入文件
                resultFileList.add(fileList[i].getPath());
            } else if (fileList[i].isDirectory()) {
                // 如果是文件夹，则递归调用
                getAllFileInDirectoryPath(fileList[i].getPath(), resultFileList);
            } else {
                logger.warn("{} 不是文件，也不是文件夹，跳过");
            }
        }
    }

    /**
     * 获取指定文件夹路径目录下的所有文件
     *
     * @param directoryPath
     * @return List<String>
     */
    public static List<String> getFileInCurrentDirectoryPath(String directoryPath) {
        // 判断是否目录路径为空
        if (StringUtils.isBlank(directoryPath)) {
            logger.warn("文件夹目录为空字符串，无法获取下属目录");
            return new ArrayList<>();
        }
        File file = new File(directoryPath);
        if (file.isFile()) {
            logger.info("{} 是文件，无法获取下属目录", directoryPath);
            return new ArrayList<>();
        }
        // 将该目录下的所有文件放置在一个File类型的数组中
        File[] fileList = file.listFiles();
        if (fileList == null || fileList.length == 0) {
            logger.info("{} ，没有下级目录", directoryPath);
            return new ArrayList<>();
        }
        List<String> files = new ArrayList<>();
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].isFile()) {
                logger.info(fileList[i].getPath());
                files.add(fileList[i].getPath());
            }
        }
        return files;
    }

    /**
     * 获取指定文件夹路径目录下一级的所有目录
     *
     * @param directoryPath
     * @return List<String>
     */
    public static List<String> getNextLevelDirectorysInCurrentDirectoryPath(String directoryPath) {
        // 判断是否目录路径为空
        if (StringUtils.isBlank(directoryPath)) {
            logger.warn("文件夹目录为空字符串，无法获取下属目录");
            return new ArrayList<>();
        }
        File file = new File(directoryPath);
        if (file.isFile()) {
            logger.info("{} 是文件，无法获取下属目录", directoryPath);
            return new ArrayList<>();
        }
        // 将该目录下的所有文件放置在一个File类型的数组中
        File[] fileList = file.listFiles();
        if (fileList == null || fileList.length == 0) {
            logger.info("{} ，没有下级目录", directoryPath);
            return new ArrayList<>();
        }
        List<String> fileDirectorys = new ArrayList<>();
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].isDirectory()) {
                logger.info(fileList[i].getPath());
                fileDirectorys.add(fileList[i].getPath());
            }
        }
        return fileDirectorys;
    }

//    /**
//     * 获取目录大小
//     *
//     * @param path
//     * @return long
//     */
//    public static long sizeOfDirectory(String path) {
//        if (StringUtils.isBlank(path)) {
//            return 0;
//        }
//        File f = new File(path);
//        if (!f.exists()) {
//            return 0;
//        }
//        return org.apache.commons.io.FileUtils.sizeOfDirectory(f);
//    }

    /**
     * 修改名字
     *
     * @param oldName
     * @param newName
     */
    public static void rename(String oldName, String newName) {
        if (StringUtils.isBlank(oldName) || StringUtils.isBlank(newName)) {
            return;
        }
        File f = new File(oldName);
        if (!f.exists()) {
            return;
        }
        f.renameTo(new File(newName));
    }

    /**
     * 获取文件后缀
     *
     * @param fileName
     * @return
     */
    public static String getExtension(String fileName) {
        if (StringUtils.INDEX_NOT_FOUND == StringUtils.indexOf(fileName, "."))
            return StringUtils.EMPTY;
        String ext = StringUtils.substring(fileName, StringUtils.lastIndexOf(fileName, ".") + 1);
        return StringUtils.trimToEmpty(ext);
    }

    /**
     * 获取文件名
     *
     * @param header
     * @return
     */
    public static String getFileName(String header) {
        String[] tempArr1 = header.split(";");
        String[] tempArr2 = tempArr1[2].split("=");
        // 获取文件名，兼容各种浏览器的写法
        return tempArr2[1].substring(tempArr2[1].lastIndexOf("\\") + 1).replaceAll("\"", "");

    }

    /**
     * 取文件权限
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static String getPermissions(Path path) throws IOException {
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        PosixFileAttributes readAttributes = fileAttributeView.readAttributes();
        Set<PosixFilePermission> permissions = readAttributes.permissions();
        return PosixFilePermissions.toString(permissions);
    }

    /**
     * 文件权限设置
     *
     * @param file
     * @param permsCode
     * @param recursive
     * @return
     * @throws IOException
     */
    public static String setPermissions(File file, String permsCode, boolean recursive) throws IOException {
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(file.toPath(),
                PosixFileAttributeView.class);
        fileAttributeView.setPermissions(PosixFilePermissions.fromString(permsCode));
        if (file.isDirectory() && recursive && file.listFiles() != null) {
            for (File f : file.listFiles()) {
                setPermissions(f, permsCode, true);
            }
        }
        return permsCode;
    }

    /**
     * 文件追加信息
     *
     * @param fileName
     * @param content
     */
    public static void appendContentAtLast(String fileName, String content) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            // 如果文件存在，则追加内容；如果文件不存在，则创建文件
            File f = new File(fileName);
            fw = new FileWriter(f, true);
            pw = new PrintWriter(fw);
            pw.println(content);
            pw.flush();
        } catch (IOException e) {
            logger.error("{}", e);
        } finally {
            try {
                if (fw != null) {
                    fw.flush();
                }
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                logger.error("{}", e);
            }
        }
    }

    /**
     * 写入文件
     *
     * @param inputStream
     * @param f
     * @return
     */
    public static boolean write(InputStream inputStream, File f) {
        boolean ret = false;
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(f);
            int read;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
            ret = true;
        } catch (IOException e) {
            logger.error("{}", e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                logger.error("{}", e);
            }
        }
        return ret;
    }

    /**
     * 创建文件夹
     *
     * @param fileName
     */
    public static void mkFolder(String fileName) {
        File f = new File(fileName);
        if (!f.exists()) {
            f.mkdirs();
        }
    }

    /**
     * 创建文件
     *
     * @param fileName
     * @return
     */
    public static File mkFile(String fileName) {
        File f = new File(fileName);
        try {
            f.createNewFile();
        } catch (IOException e) {
            logger.error("{}", e);
        }
        return f;
    }

    /**
     * 上级目录
     *
     * @param dirFile
     */
    public static void fileProber(File dirFile) {

        File parentFile = dirFile.getParentFile();
        if (!parentFile.exists()) {
            // 递归寻找上级目录
            fileProber(parentFile);
            parentFile.mkdir();
        }
    }

    /**
     * 得到当天的年月日
     *
     * @return
     */
    public static String getCurrentDateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date());
    }

    /**
     * 读取文件获取文件内容返回String
     *
     * @param fileName
     * @return String
     */
    public static String readFile(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        if (!file.exists()) {
            logger.error("文件不存在，无法读取 : {}", fileName);
            return "";
        }
        Long filelength = file.length();
        FileInputStream in = null;
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            in = new FileInputStream(file);
            in.read(filecontent);
            return new String(filecontent, encoding);
        } catch (Exception e) {
            logger.error("{}", e);
            return null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error("{}", e);
                }
            }
            file = null;
        }
    }
}
