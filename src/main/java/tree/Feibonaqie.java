package tree;

public class Feibonaqie {

   //0，1，1，2，3，5，8，13，21，34

    public static int getFeibonaqie(int i){

        if(i<=1)
            return i;
        else
            return getFeibonaqie(i-1)+  getFeibonaqie(i-2);
    }

    public static void main(String[] args) {

    }
}
