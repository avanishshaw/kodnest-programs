import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        posOrNeg(n);
    }
    public static void posOrNeg(int n){
        if(n > 0){
            System.out.println("Positive");
        }else if(n < 0){
            System.out.println("Negetive");
        }else{
            System.out.println("Zero");
        }
    }
}
