public class Main {
    public static void main(String[] args) {

        //Integers
        int myValue=10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue =Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " +(myMaxIntValue +1));
        System.out.println("Busted MIN Value = " +(myMinIntValue -1));
        int myMaxIntTest=2147483647;

        //Bytes
        byte myMinByteValue=Byte.MIN_VALUE;
        byte  myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("byte Minimum Byte Value = "+myMinByteValue);
        System.out.println("byte Maximum Byte Value = "+myMaxByteValue);

        //Shorts
        short myMinShortValue=Short.MIN_VALUE;
        short  myMaxShortValue=Short.MAX_VALUE;
        System.out.println("short Minimum Short Value = "+myMinShortValue);
        System.out.println("short Maximum short Value = "+myMaxShortValue);
        
        //Longs
        long myLongValue=100L;
        long myMinlongValue=Long.MIN_VALUE;
        long  myMaxlongValue=Long.MAX_VALUE;
        System.out.println("long Minimum Long Value = "+myMinlongValue);
        System.out.println("long Maximum Long Value = "+myMaxlongValue);
        long bigLongLittealValue=2147483647765L;

        //casting
        int myTotal =(myMinIntValue/2);
        byte myNewByteValue =(byte)(myMinByteValue/2);
        short myNewShortValue=(short)(myMinShortValue/2);

        //challenge
        byte validByte=10;
        short validShort=20;
        int validInt=50;
        long validLong=50000L+10L*(validByte+validShort+validInt);
        System.out.println("Challenge = " + validLong);



    }
}
