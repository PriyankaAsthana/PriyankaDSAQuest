import java.util.*;
public class javab{
    
    public static void isprime(int n){
        int temp=n;
        int digits=0;
        int sum=0;
        while(temp>0){
            temp/=10;
            digits++;
        }
        temp=n;
        while(temp>0){
            int rev= temp%10;
            sum+= (int)Math.pow(rev,digits);
            temp/=10;
        }
        if(sum==n){
            System.out.println("Yes!");
            return;
        }
        System.out.println("No!");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n= sc.nextInt();
        isprime(n);
        sc.close();
    }
}
