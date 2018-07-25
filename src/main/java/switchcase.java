public class switchcase {

    public static String aa()
    {
        int i = 2;
        switch(i){
            case 0:
                return"0";
            case 1:
                return"1";
            case 2:
                return"2";
            default:
                return"default";
        }

}

    public static void main(String[] args) {
        System.out.println(switchcase.aa());
    }
}
