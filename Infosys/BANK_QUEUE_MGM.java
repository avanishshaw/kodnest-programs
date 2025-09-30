import java.util.*;

public class BANK_QUEUE_MGM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] ops = new String[n];
        for (int i = 0; i < n; i++) {
            ops[i] = sc.nextLine();
        }
        System.out.println(bankQueue(ops));
    }

    private static String bankQueue(String[] ops){
        return "";
    }
}
