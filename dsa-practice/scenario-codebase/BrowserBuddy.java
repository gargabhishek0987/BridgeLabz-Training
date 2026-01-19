import java.util.Stack;
public class BrowserBuddy {
     static class Node{
        String page;
        Node prev;
        Node next;

        Node (String page){
            this.page = page;
            this.prev = null;
            this.next = null;
        }
    }

    static class BrowserHistory{
        private Stack<Node> closedTabs;
        private Node current;


        BrowserHistory(String homepage){
            current = new Node(homepage);
            closedTabs = new Stack<>();
        }




        public void visit(String page){
            Node newNode = new Node(page);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;

        }

        public void forward(){
            if(current.next!= null){
                current = current.next;

            }
            else{
                System.out.println("No next page");
            }

        }
        public void back(){
            if(current.prev !=null){
                current = current.prev;
            }
            else{
                System.out.println(" No Previous page");

            }
            }
            public void closeTabs(){
                closedTabs.push(current);

            }
            public void restoreTab(){
                current = closedTabs.pop();

            }




        }
        public static void main(String[] args) {
            BrowserHistory browser = new BrowserHistory("google.com");
            browser.visit("facebook.com");
            browser.visit("twitter.com");

            browser.back();
        browser.forward();
        browser.closeTabs();
        browser.restoreTab();

        System.out.println("Current Page" + browser.current.page);
        System.out.println("Closed Tabs " + browser.closedTabs);
            
            
        }




    }
    

