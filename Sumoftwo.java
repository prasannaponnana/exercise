import java.util.Scanner;
public class Sumoftwo
{
    public static void main(String[] args)
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum"+sum);
    }
}
