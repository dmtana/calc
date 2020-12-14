package calc;

import java.util.Scanner;

public class Menu {

    Menu(){
        System.out.println(
                "\tHi, this is menu of roman-arabic calculator\n" +
                "\tEnter in the line an expression consisting of Arabic or Roman numerals\n" +
                "\tfor example '7*5' or 'X+IV':");

        this.ShowMenu();
    }

    void ShowMenu(){
        System.out.println("For Exit write - exit; \nEnter the expression: ");
        String expression = new Scanner(System.in).nextLine();

        try {
            // This is highway to hell...
            if(expression.contains("I")|expression.contains("V")|expression.contains("X")){

                String answer = "";
                if(expression.contains("-")){
                    String numbers[] = expression.trim().split("-");
                    if(numbers.length>2){
                        throw new ArithmeticException("Something wrong! \nRoman 001.0");
                    }
                    answer = switchRomanToArabic(numbers[0].trim())+"-"+switchRomanToArabic(numbers[1].trim());
                }
                if(expression.contains("+")){
                    String numbers[] = expression.trim().split("\\+");
                    if(numbers.length>2){
                        throw new ArithmeticException("Something wrong! \nRoman 001.1");
                    }
                    answer = switchRomanToArabic(numbers[0].trim())+"+"+switchRomanToArabic(numbers[1].trim());
                }
                if(expression.contains("/")){
                    String numbers[] = expression.trim().split("/");
                    if(numbers.length>2){
                        throw new ArithmeticException("Something wrong! \nRoman 001.2");
                    }
                    answer = switchRomanToArabic(numbers[0].trim())+"/"+switchRomanToArabic(numbers[1].trim());
                }
                if(expression.contains("*")){
                    String numbers[] = expression.trim().split("\\*");
                    if(numbers.length>2){
                        throw new ArithmeticException("Something wrong! \nRoman 001.3");
                    }
                    answer = switchRomanToArabic(numbers[0].trim())+"*"+switchRomanToArabic(numbers[1].trim());
                }
                System.out.println(Menu.Roman(new Calculator().selectOperation(answer)));
            } else {
                //Call the normal calc
                System.out.println(new Calculator().selectOperation(expression));
            }
        } catch (ArithmeticException e){
            System.out.println("Something wrong, try again... "+e);
        }

        if(!expression.equalsIgnoreCase("exit")) this.ShowMenu();
    }

    /**
     * WORK!!!
     * */
    public static String Roman(int input){

        String s = "";

        if (input <1 | input < 999)
            //System.out.println("negative roman numeral value ");

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }



    static int switchRomanToArabic(String num) throws ArithmeticException{
        switch (num){
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            default: throw new ArithmeticException("Something wrong! \nRoman 002") ;
        }
    }
}
