//import org.springframework.beans.BeanUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CopyUtils {
//
//
//    public static List copyList(List list, Class clazz) {
//
//        List list2 = new ArrayList<>();
//        list.stream().forEach(source -> {
//            Object obj = null;
//            try {
//                obj = clazz.newInstance();
//                BeanUtils.copyProperties(source, obj);
//                list2.add(obj);
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        });
//        return list2;
//    }
//
//
//
//
//
//
//}
