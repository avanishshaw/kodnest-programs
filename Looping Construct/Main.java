public class Main {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5){
//            System.out.println(i);
            i++;
        }

        sum(10);
        factorial(5);
    }

    public static void sum(int n){
        int i = 1;
        int sum = 0;

        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public static void factorial(int n){
        int fact = 1;

        while(n > 0){
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }
}
