import java.util.*;
public class UNDO_REDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] ops = new String[n];
        for (int i = 0; i < n; i++) {
            ops[i] = sc.nextLine();
        }
        System.out.println(textEditor(ops));
    }

    private static String textEditor(String[] ops) {
        //Create a Linkedlist
        LinkedList<String> list = new LinkedList<>();

        // Create a Stack
        Stack<String> stack = new Stack<>();

//      Iterate through the array of string to perform operations
        for(String s: ops){
            switch(s){
                case "UNDO":
                    if(!list.isEmpty()){
                        stack.push(list.removeLast());
                    }
                    break;

                case "REDO":
                    if(!stack.isEmpty()){
                        list.add(stack.pop());
                    }
                    break;

                default:
                    list.add(s);
                    stack.clear();
            }
        }
        if(list.isEmpty()){
            return "EMPTY";
        }else{
            return String.join(" ",list);
        }
    }
}
