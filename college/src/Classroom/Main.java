package Classroom;
import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("*");
        }
        else if(n==3)
        {
            System.out.println("* * *");
            System.out.println("* * *");
            System.out.println("* * *");
        }
        else if(n==5)
        {
            System.out.println("* - * - *");
            System.out.println("- * * * -");
            System.out.println("* * * * *");
            System.out.println("- * * * -");
            System.out.println("* - * - *");
        }
        else if(n==7)
        {
            System.out.println("* - - * - - * ");
            System.out.println("- * - * - * -");
            System.out.println("- - * * * - -");
            System.out.println("* * * * * * *");
            System.out.println("- - * * * - - ");
            System.out.println("- * - * - * -");
            System.out.println("* - - * - - *");
        }
        else if(n==9)
        {
            System.out.println("* - - - * - - - *");
            System.out.println("- * - - * - - * -");
            System.out.println("- - * - * - * - -");
            System.out.println("- - - * * * - - -");
            System.out.println("* * * * * * * * *");
            System.out.println("- - - * * * - - -");
            System.out.println("- - * - * - * - -");
            System.out.println("- * - - * - - * -");
            System.out.println("* - - - * - - - *");
        }
       
        else if(n==11)
        {   System.out.println("* - - - - * - - - - *");
            System.out.println("- * - - - * - - - * -");
            System.out.println("- - * - - * - - * - -");
            System.out.println("- - - * - * - * - - -");
            System.out.println("- - - - * * * - - - -");
            System.out.println("* * * * * * * * * * *");
            System.out.println("- - - - * * * - - - -");
            System.out.println("- - - * - * - * - - -");
            System.out.println("- - * - - * - - * - -");
            System.out.println("- * - - - * - - - * -");
            System.out.println("* - - - - * - - - - *");
        }
        else if(n==13)
        {   
            System.out.println("* - - - - - * - - - - - *");
            System.out.println("- * - - - - * - - - - * -");
            System.out.println("- - * - - - * - - - * - -");
            System.out.println("- - - * - - * - - * - - -");
            System.out.println("- - - - * - * - * - - - -");
            System.out.println("- - - - - * * * - - - - -");
            System.out.println("* * * * * * * * * * * * *");
            System.out.println("- - - - - * * * - - - - -");
            System.out.println("- - - - * - * - * - - - -");
            System.out.println("- - - * - - * - - * - - -");
            System.out.println("- - * - - - * - - - * - -");
            System.out.println("- * - - - - * - - - - * -");
            System.out.println("* - - - - - * - - - - - *");
        }
        
        
    }
}