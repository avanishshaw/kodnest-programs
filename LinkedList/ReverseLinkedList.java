import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        LinkedList<String> playlist = new LinkedList<>();

        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            playlist.add(name);
        }

        reverseLinkedList(playlist);

        for(String song: playlist){
            System.out.println(song + " ");
        }
    }

    private static void reverseLinkedList(LinkedList<String> playlist){
        LinkedList<String> reverse = new LinkedList<>();

        while(!playlist.isEmpty()) {
            reverse.add(playlist.removeLast());
        }

        playlist.addAll(reverse);
    }
}
