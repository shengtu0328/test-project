package regux;

public class replacereplaceall {
    public static void main(String[] args) {
        String src = new String("ab43ab2c43d");
        System.out.println(src.replace("ab", "f"));

//        System.out.println(src.replace("3", "f"));
//        System.out.println(src.replace('3', 'f'));
//        System.out.println(src.replaceAll("\\d", "f"));
//        System.out.println(src.replaceAll("a", "f"));
//        System.out.println(src.replaceFirst("4", "h"));




        String str = "Hello Java. Java is a language.";
        System.out.println(str.replace("Java.", "c++"));//打印 Hello c++ Java is a language.
        System.out.println(str.replaceAll("Java.", "c++"));//打印 Hello c++ c++is a language.

    }
}
