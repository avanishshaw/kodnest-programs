public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        int factn = 1;
        int factm = 1;

        int i = 1;

        do{
            factn = factn * i;
            i++;
        }while(i <= n);

        int j = 1;
        do{
            factm = factm * j;
            j++;
        }while(j <= m);

        System.out.println("Factorial of " + n + " is : " + factn);
        System.out.println("Factorial of " + m + " is : " + factm);
    }
}
