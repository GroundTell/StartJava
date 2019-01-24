import java.util.Scanner; 

public class Calculator {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);
            
        System.out.print("Enter the first number");
        int number1 = input.nextInt();

        System.out.print("Enter operation (*, -, +, /, ^, % : ");
        char operation = input.next().charAt(0);

        System.out.print("Enter the second number");
        int number2 = input.nextInt();
        
        if (operation == '+') {
            System.out.println(number1 + number2);
        } else if (operation == '-') {
            System.out.println(number1 - number2);
        } else if (operation == '*') {
            System.out.println(number1 * number2);
        } else if (operation == '/') {
            System.out.println(number1 / number2); 
        } else if (operation == '%') {
            System.out.println(number1 % number2);
        } else if (operation == '^') {
         int result = number1;
                for (int count = 1; count <= number2 - 1; count++) {
                    result *= number1;
            }
            System.out.println(result);
        } else {
            System.out.println("Mistake!!");
        }       		
    }
}
