import cn.hutool.core.io.CharsetDetector;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileNameUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.extra.compress.CompressUtil;
import cn.hutool.extra.compress.extractor.Extractor;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static filecharset.test.getFileEncode;

/**
 * @Author QiongQiong.He
 * @Description:
 * @Date 2022/3/1 1:51 下午
 */
public  class SyncAbstractDataProcess {


    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
//        String fileName="http://www.gov.cn/guoqing/2017-06/09/5200994/files/cc03a305032a4da1a25df44002852e26.zip";
//        String decode = URLDecoder.decode(fileName, "UTF-8");
//        System.out.println(decode);
        Charset charset = Charset.defaultCharset();


        SyncAbstractDataProcess syncAbstractDataProcess = new SyncAbstractDataProcess();
        String fromPath = "G:\\compressTest\\1.zip";

        String archiverName = FileNameUtil.extName(fromPath);


        List<String> archiveTypeList = new ArrayList<>();
        archiveTypeList.add("zip");
        archiveTypeList.add("tar");
        archiveTypeList.add("gz");
        archiveTypeList.add("7z");

        FileInputStream fileInputStream = new FileInputStream(fromPath);
        Charset charset1 = CharsetDetector.detect(new File(fromPath));

        syncAbstractDataProcess.fileAllExtract(fromPath, archiverName, archiveTypeList);


    }

    /**
     * 解压文件处理
     *
     * @param fromPath
     */
    private void fileAllExtract(String fromPath, String archiverName, List<String> archiveTypeList) {
        if (StringUtils.isBlank(fromPath)) {
//            log.error("fromPath=[{}]参数缺失", fromPath);
            return;
        }
        File file = cn.hutool.core.io.FileUtil.file(fromPath);
        if (!file.exists()) {
//            log.error("fromPath=[{}]文件不存在", fromPath);
            return;
        }

        String targetPath = file.getParent();
        Extractor extractor = CompressUtil.createExtractor(
                Charset.forName(getFileEncode(fromPath)), archiverName,
                file);

        File file1 = FileUtil.file(targetPath);
        extractor.extract(file1);
        //解压成功后，删除压缩包
//        boolean delBoole = file.delete();
//        log.debug("fromPath=[{}] 解压成功后删除文件结果[{}]", delBoole);
        //获取目录下。所有文件，是否有需要的解压操作
        //获取目录下所有文件
        HashSet<String> resultFileList = new HashSet<>();
        FileUtilsV.getAllFileInDirectoryPath(targetPath, resultFileList);
        for (String pathStr : resultFileList) {
            if (archiveTypeList.contains(FileNameUtil.extName(pathStr))) {
                fileAllExtract(pathStr, FileNameUtil.extName(pathStr), archiveTypeList);
            } else {
//                log.warn("{} 不是压缩包文件，跳过", pathStr);
            }
        }
    }

}
