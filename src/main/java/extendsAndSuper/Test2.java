//package extendsAndSuper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Test2 {
//    static class a1 {
//
//    }
//
//    static class a2 extends a1 {
//
//    }
//    static class a3 extends a2 {
//
//    }
//    static class a4 extends a3 {
//
//    }
//    static class a5 extends a4 {
//
//    }
//
//
//
//    public static void main(String[] args) {
////        PECS：Producer 用 extends ，Consumer 用 super 。
//
//        //=======================extends=======================
//        List<? extends a3> extends_a1list =new ArrayList<a1>();
//        List<? extends a3> extends_a2list =new ArrayList<a2>();
//
//
//        List<? extends a3> extends_a3list =new ArrayList<a3>();
//        List<? extends a3> extends_a4list =new ArrayList<a4>();
//
//         //编译报错
//        extends_a3list.add(new a1());
//        extends_a3list.add(new a2());
//        extends_a3list.add(new a3());
//        extends_a3list.add(new a4());
//
//
//
//
//        //=======================super=======================
//         //编译报错
//        List<? super a3> super_a5List = new ArrayList<a5>();
//        List<? super a3> super_a4List = new ArrayList<a4>();
//
//        List<? super a3> super_a3List = new ArrayList<a3>();
//        List<? super a3> super_a2List = new ArrayList<a2>();
//        List<? super a3> super_a1List = new ArrayList<a1>();
//
//        super_a3List.add(new a1());
//        super_a3List.add(new a2());
//        super_a3List.add(new a3());
//
//
//
//
//    }
//}
