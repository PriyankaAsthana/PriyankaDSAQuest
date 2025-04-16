import java.util.*;
public class javab{
    
    public static void pattern(int n, int m){
        if(n==m){
            System.out.println("Its not a rectangle but a square!");
            return;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(((i==0)||(i==n-1))||((j==0)||(j==m-1))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n= sc.nextInt();
        System.out.println("Enter no. of columns:");
        int m= sc.nextInt();
        pattern(n,m);
        sc.close();
    }
}
