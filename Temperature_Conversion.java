import java.util.Scanner;
class Temp
{
 public static void main(String args[])
 {
     int n;
     double f;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     f=(n*1.8)+32;
     System.out.printf("%.2f",f);
  }
 }