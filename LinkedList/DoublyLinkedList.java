public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    void insertRear(int element){
        Node newNode = new Node(element);

        if(head == null){
            head = newNode;
        }else{
             Node temp = head;
             while(temp.nextLink != null){
                 temp = temp.nextLink;
             }
             temp.nextLink = newNode;
             newNode.prevLink = temp;

             tail = newNode;
        }
    }

    void insertFront(int element){
        Node newNode = new Node(element);

        if(head == null){
            head = newNode;
        }else{
            newNode.nextLink = head;
            head = newNode;
            head.nextLink.prevLink = head;
        }
    }

    void deleteRear(int element){
        if(head == null){
            System.out.println("Deletion not possibility");
        }else if(head.nextLink == null){
            System.out.println("Element deleted is : " + head.data);
            head = null;
        }else{
            Node temp = head;
            while(temp.nextLink != null){
                temp = temp.nextLink;
            }
            System.out.println("Element deleted is : " + temp.nextLink.data);
            temp.nextLink.prevLink = null;
            temp.nextLink = null;
        }
    }

    void deleteFront(){

    }

    void displayForward(){

    }

    void displayBackward(){

    }
}
