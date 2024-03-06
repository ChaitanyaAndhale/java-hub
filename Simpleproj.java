import java.util.Scanner;
class Simpleproj
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*****Choose College****");
        System.out.println("1.native  2.in india 3.in world 4.remote");
        System.out.println("enter the key :");
        int key=sc.nextInt();
        System.out.println("enter the percentage ;");
        int percentage=sc.nextInt();
        System.out.println("enter the grade :");
        char grade=sc.next().charAt(0);
        switch(key)
        {
            case 1: 
            if(percentage>=70||grade=='A')
            System.out.println("you get college in native");
            else
            System.out.println("SORRY...! you can not get college in native. check your grade it must be A ");
            break;

            case 2:
            if(percentage>60 || grade=='A' || grade=='B')
            System.out.println("you get college in india");
           else 
            System.out.println("SORRY...! you can not get college in india. check your grade it must be A or B");
            break;

            case 3:
            if(percentage>90 || grade=='A')
            System.out.println("you get college in world");
           else
            System.out.println("SORRY...! you can not get college in world. check your grade it must be A ");
            break;
            
            case 4:
            if(percentage>35)
            System.out.println("you get college in remote");
           
            break;

        }

    
    }
}
/******Choose College****
1.native  2.in india 3.in world 4.remote
enter the key :
1
enter the percentage ;
60
enter the grade :
c
SORRY...! you can not get college in native. check your grade it must be A  */