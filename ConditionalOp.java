class ConditionalOp
{
public static void main(String[]args)
{
int a=10;
int b=20;
int sum=a+b;
int a1=sum/10;
int b1=sum%10;
int X=a1+b1;
boolean result =(X%2==1)?(true):(false);
System.out.println("X is odd:"+result);
}}

/*
Compile Time:Success
Run Time:Success
X is odd:true
*/