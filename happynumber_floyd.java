import java.util.Scanner;

public class happynumber_floyd {
    Scanner sc = new Scanner(System.in);
    public int squaresum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum += (n%10) * (n%10);
            n /= 10;
        }
        return sum;
    }
    public boolean happynum(int n)
    {
        int slow,fast;
        slow = fast = n;
        do {
            slow = squaresum(slow);
            fast = squaresum(fast);
            fast = squaresum(fast);
            if(fast == 1)
               return true;
        } while(slow!=fast);
        return false;
    }
    public void main(String[] args)
    {
        int n;
        n = sc.nextInt();
        System.out.println(happynum(n));
    }
}
