package io;

public class intbyte {
    public static  byte[] IntToByte(int num) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) ((num >> 24) & 0xff);
        bytes[1] = (byte) ((num >> 16) & 0xff);
        bytes[2] = (byte) ((num >> 8) & 0xff);
        bytes[3] = (byte) (num & 0xff);
        return bytes;
    }

    public static void main(String[] args) {
       /* System.out.println(intbyte.IntToByte(160));
        byte a=(byte)160;
        byte b=(byte)128;
        byte c=(byte)100;
        int  x=0xff;//255
        byte d=(byte)x;
        x=0x80;//128
        byte f=(byte)x;
        c=(byte)(c*3);
        System.out.println(a+" "+b+" "+c+" "+d+" "+f );



*/
        byte b=2;
       int a=b;

        System.out.println(a);
        int i=160;
        byte bb= (byte) i;

        int i2=0xa0;
        System.out.println(i2);

        byte bb2= (byte) i2;

        System.out.println(bb);
        System.out.println(bb2);

    }


}
