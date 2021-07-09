import java.util.HashSet;
import java.util.Scanner;

public class happynumber {
    static Scanner sc = new Scanner(System.in);
    public static boolean happy(int n)
    {
        HashSet<Integer> hs = new HashSet<>();
        while(hs.add(n))
        {
            int sum = 0;
            while(n>0) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
                if (sum == 1)
                    return true;
                else
                    n = sum;
        }
        return false;
    }
    public static void main(String [] args)
    {
        int n;
        n = sc.nextInt();
        System.out.println(happy(n));
    }
}
