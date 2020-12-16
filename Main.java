package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();

        System.out.println(sum(a1, a2));

        //new Menu();
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
