import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number_one;
        int number_two;
        char operation;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" please enter number_one");
         number_one = scanner.nextInt();
         System.out.println(" enter number_two");
         number_two = scanner.nextInt();
         System.out.println(" enter your operation ");
         operation =  scanner.next().charAt(0);
         int result = 0;
         if (operation == '+')
        {
            result = number_one + number_two;
            System.out.println(" Result  = "+number_one +operation +number_two +" = " + result);
        }
       else if (operation == '-')
        {
            result = number_one - number_two;
            System.out.println(" Result  = "+number_one +operation +number_two +" = " + result);

        }
         else if (operation == '*')
         {
             result = number_one * number_two;
             System.out.println(" Result  = "+number_one +operation +number_two +" = " + result);

         }

         else if (operation == '/')
         {
             result = number_one / number_two;
             System.out.println(" Result  = "+number_one +operation +number_two +" = " + result);

         }
    }
}