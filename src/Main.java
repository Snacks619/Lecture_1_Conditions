import java.lang.annotation.Target;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome !");

        String name = "Snacks";

        System.out.println(name.charAt(0));

//      Alter way of doing it also could be known as Ternary statement
//        if(name.charAt(0) == 'A' ? true: false)
        if (name.charAt(0) == 'A') {

            System.out.println("Name starts with A");

        } else{

            System.out.println("Name does not start with A");

            System.out.println(mathOne());

            System.out.println(escape());

            System.out.println(mathClass());

            printStatements();

            WhatDayQM("1");

            loops(13);
        }
    }

//    This is Increment a number until
    static void loops(int num){
        for(int i = 0; i<num; i++){
            System.out.println("Number in the for loop: "+i);
        }

        while(num > 5){

            System.out.println("This is the number:" + num);

            if (num < 10){

            }
            num--;

//            This is decrement a number
            do{

                System.out.println("This is a do while loop !" + num);

                num--;

            }while(num > 5);

        }
    }

    static int mathOne(){
//       **Wrapper Classes**: In Java, wrapper classes turn primitive data types (int, char, double, etc.) into objects.

//       **Autoboxing**: The automatic conversation that the java compiler maes between the primitive types and their corresponding object wrapper classes.

//       **Unboxing**: The reverse of autoboxing. It is the automatic conversion of wrapper classes back to their respective primitive types.


        // AutoBoxing
        Integer Myinteger = 25;

        int num = Myinteger;

        return num;

    }


//    when using Void you don't use return because with void you don't want it to return anything back
    static void stringOne(){
//        Create and use Strings

        String name = "Snacks";

        String newStr = new String(" Put it in the bag !");

        System.out.println(newStr.replace("t","").toUpperCase().replace(" ", ""));

    }

    static String escape(){

//        \n creates a new line for what ever you are typing
//        \ It can also add new character that you might want to add. You must put a \ " in the begining and the end of the line that you want to do
        return "\"Snacks\" \nCool";
    }
//   We must change char to String then also instead of double quotes to single quotes
    static boolean isCapital(String c){

        if(c == c.toUpperCase() ){

            System.out.println();

                return true;
            } else{
                return false;
        }



    }

    static void printStatements() {

        System.out.println("Hello World !");

        System.out.print("Hello");

        System.out.print("World");

        System.out.printf("AGE %d, NAME: %s",30,"Snacks");
    }

//      Had to change int to double because sqrt does not always give out exactly one number everytime
//      Also depending on the class the .(dot) can show you a list of
    static double mathClass(){

//        double a = Math.

        return Math.sqrt(16);
    }

    static String WhatDayQM(String s){

        switch(s){
            case "1": s = "Monday";
            System.out.println("It is " + s);
            break;
            case "2": s = "Tuesday";
            break;
            case "3": s = "Wednesday";
            break;
            case "4": s = "Thursday";
            break;
            case "5": s = "Friday";
            break;
            case "6": s = "Saturday";
            break;
            case "7": s = "Sunday";

        }


        return s;
    }



}



