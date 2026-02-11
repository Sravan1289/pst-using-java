import java.util.Scanner;

class King 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        int num, max, min, sum = 0;

        System.out.println("Enter the numbers:");

        num = sc.nextInt();
        max = num;
        min = num;
        sum = num;

        for(int i = 2; i <= n; i++)
        {
            num = sc.nextInt();
            sum = sum + num;

            if(num > max)
            {
                max = num;
            }

            if(num < min)
            {
                min = num;
            }
        }

        double avg = (double) sum / n;
        System.out.println("\n----- RESULT -----");
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        System.out.println("Average : " + avg);

        sc.close();
    }
}
