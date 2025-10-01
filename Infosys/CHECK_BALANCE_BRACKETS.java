import java.util.*;

public class CHECK_BALANCE_BRACKETS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(check_bracket(str));

    }

    private static String check_bracket(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] arr = s.toCharArray();

        for(int i = 0; i <= arr.length; i++){
            char ch = arr[i];

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                char bracket = stack.pop();
                if((ch == ')' && bracket != '(') ||
                (ch == '}' && bracket != '{') ||
                (ch == ']' && bracket != '['))
                    return "Not Balanced";
            }
        }
        if(stack.isEmpty()){
            return "Balanced";
        }else{
            return "Not Balanced";
        }
    }
}
