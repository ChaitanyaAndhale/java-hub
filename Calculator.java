import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();
System.out.println("Enter the operator:");

        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+'->
            System.out.println("The addition is:"+(a+b));
            case '-'->
            System.out.println("The subtraction is:"+(a-b));
            case '*'->
            System.out.println("The multiplication is:"+(a*b));
            case '/'->
            System.out.println("The division is:"+(a/b));
            case '%'->
            System.out.println("The remainder is:"+(a%b));
        }

    }
}
/*enter the number:
12
enter the number
6
Enter the operator:
-
The subtraction is:6*/ 