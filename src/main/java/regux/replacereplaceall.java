package regux;

public class replacereplaceall {
    public static void main(String[] args) {
        String src = new String("ab43a2c43d");
        System.out.println(src.replace("3", "f"));
        System.out.println(src.replace('3', 'f'));
        System.out.println(src.replaceAll("\\d", "f"));
        System.out.println(src.replaceAll("a", "f"));
        System.out.println(src.replaceFirst("4", "h"));
    }
}
