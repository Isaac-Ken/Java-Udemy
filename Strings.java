public class Main {
    public static void main(String[] args) {
        //Strings
        String myString   ="this is my string";
        System.out.println("myString is equal to "+myString);
        myString =(myString + ", and this is more string");
        System.out.println(myString);
        myString=myString+" \u00A9 2022";
        System.out.println("myString is equal to "+myString);
        String numberString ="250.55";
        numberString=numberString+"49.95";
        System.out.println(numberString);
        String lastString ="10";
        int myInt =50;
        lastString= lastString+myInt;
        System.out.println("LastString is equal to "+lastString);
        double doubleNumber =120.47d;
        lastString=lastString+doubleNumber;
        System.out.println("LastString is equal to "+lastString);



    }
}
