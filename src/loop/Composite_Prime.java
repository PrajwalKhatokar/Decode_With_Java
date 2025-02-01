package loop;
import java.util.*;

public class Composite_Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=0; //means we are putting the flag for the prime number
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("composite number");
                x=1;// if we get some composite number then x value wil be 1
                break;
            }
        }
        if(n==1) System.out.println("nor prime nor composite number");
        else if(x==0) System.out.println("prime number");

    }
}
