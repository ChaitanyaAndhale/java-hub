class LargestNO
{
public static void main(String[]args)
{
int a=10;
int b=20;
int c=30; 
int d=40;

int largest= a>b ? (a>c ? (a>d ? a : d) : (c>d ? c : d)) : (b>c ? (b>d ? b : d) : (c>d ? c : d));

System.out.println( "the largest number among 10,20,30 and 40 is:"+largest);
}}

/*
Output:
Compile Time:Success
Runtime:Success
the largest number among 10,20,30 and 40 is:40
*/