import java.io.*;
public  class sample14
{
    public static void main(String args[]) throws IOException
    {
       int d = 2;
       double pi = 3.14;
    
       System.out.println("圓的直徑是"+d+"公分");
       System.out.println("圓周率是"+d*pi+"公分");

       int num1 = 5;
       int num2 = 4;

       double div1 = num1/num2;
       double div2 = (double)num1/(double)num2;
       
       System.out.println("5/4等於 = " + div1);
       System.out.println("5/4等於 = " + div2);
    }
}