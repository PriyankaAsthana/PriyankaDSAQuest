import java.util.*;
public class javab{
    
    public static void isprime(int n){
        if(n<=1){
            System.out.println("No!");
            return;
        }
        if(n==2){
            System.out.println("Yes!");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("No!");
                return;
            }
            else{
                System.out.println("Yes!");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n= sc.nextInt();
        isprime(n);
        sc.close();
    }
}
