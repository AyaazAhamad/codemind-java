import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int R;
        double A;
        Scanner sc=new Scanner(System.in);
        R=sc.nextInt();
        A=3.14*R*R;
        System.out.format("%.2f",A);
        sc.close();
    }
}