package calc;

public class Calculator{

    public int selectOperation(String string) {
        if(string.trim().contains("-")){
            String numbers[] = string.trim().split("-");
            if(numbers.length>2){
                throw new ArithmeticException("Something wrong! 003. Minus - Calculator");
            } else {
                return Integer.parseInt(numbers[0].trim()) - Integer.parseInt(numbers[1].trim());
            }
        }
        else if(string.trim().contains("+")){
            String numbers[] = string.trim().split("\\+");
            if(numbers.length>2){
                throw new ArithmeticException("Something wrong! 003. Plus - Calculator");
            } else {
                return Integer.parseInt(numbers[0].trim()) + Integer.parseInt(numbers[1].trim());
            }
        }
        else if(string.trim().contains("/")){
            String numbers[] = string.trim().split("/");
            if(numbers.length>2){
                throw new ArithmeticException("Something wrong! 003. Divide - Calculator");
            } else {
                return Integer.parseInt(numbers[0].trim()) / Integer.parseInt(numbers[1].trim());
            }
        }
        else if(string.trim().contains("*")){
            String numbers[] = string.trim().split("\\*");
            if(numbers.length>2){
                throw new ArithmeticException("Something wrong! 003. Multiply - Calculator");
            } else {
                return Integer.parseInt(numbers[0].trim()) * Integer.parseInt(numbers[1].trim());
            }
        } else return -1;
    }
}
