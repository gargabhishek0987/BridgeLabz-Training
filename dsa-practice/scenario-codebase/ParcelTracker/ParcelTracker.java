public class ParcelTracker {
    static Node head;

    static class Node {
        String stage;
         Node next;
         
          Node(String stage){
            this.stage = stage;
            this.next = next;

          }

    }
    
    
    static void addStage(String stage){
        Node newNode = new Node(stage);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void addCheckPoint(String after , String stage){ // simply add elements or custom stage between nodes or stages
        Node temp = head;
        while(temp != null && !temp.stage.equals(after)){
            temp = temp.next;

        }

        //parcel missing
        if(temp == null)
        {
            return;
        }
        Node newNode = new Node(stage);
        newNode.next = temp.next;
        temp.next = newNode;

        
    }

    static void track(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.stage+"->>");
            temp = temp.next;
        }
        System.out.println("end");

    }
    public static void main(String[] args) {
        addStage("Packed");
        addStage("Shipped");
        addStage("In Transit"); 
        addStage("Delivered");

        addCheckPoint("Shipped", "checking");
        track();
    }
}
