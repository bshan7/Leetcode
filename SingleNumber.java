import java.util.HashSet;
import java.util.Scanner;

public class SingleNumber {
    static Scanner scan = new Scanner(System.in);
    public static int SinglenumberBitMaipulation(int[] arr) {
        int res = 0;
        for (int i: arr) {
            res = res ^ i;
        }
        return res;
    }
    static int UsingSetAndMath(int[] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
        int onesum=0, twosum=0;
        for(int i:arr)
        {
            if(hs.add(i))
            {
                onesum += i;
            }
            twosum += i;
        }
        return 2*onesum - twosum;
    }

    public static void main(String[] args)
    {
        int n;
        int[] arr = new int[100];
        System.out.println("Enter length of array:");
        n = scan.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Bit Manipulation" + SinglenumberBitMaipulation(arr));
        System.out.println("Using sets" + UsingSetAndMath(arr));

    }
}
