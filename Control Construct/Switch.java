import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5 : ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Your number is 1");
                break;
              case 2:
                System.out.println("Your number is 2");
                break;
              case 3:
                System.out.println("Your number is 3");
                break;
              case 4:
                System.out.println("Your number is 4");
                break;
              case 5:
                System.out.println("Your number is 5");
                break;
            default: System.out.println("INVALID ENTRY");

        }
    }
}
