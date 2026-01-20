import java.util.*;


public class bookShelf {
   static  HashMap<String , List<String>> library = new HashMap<>();
   static HashMap<String , HashSet<String>> bookset = new HashMap<>();


   static void ensureGenre(String genre) {
        if (!library.containsKey(genre)) {
            library.put(genre, new LinkedList<>());
            bookset.put(genre, new HashSet<>());
        }
    }

   static void addBook(String genre , String book){ 
    ensureGenre(genre);
    if(!bookset.get(genre).contains(book)){
        library.get(genre).add(book);
        bookset.get(genre).add(book);
    }
    else{
        System.out.println("Duplicate book ignore "+book);
    

    }
   }
   static void borowBook(String genre, String book){
    if(library.containsKey(genre) && library.get(genre).contains(book)){
        library.get(genre).remove(book);
        bookset.get(genre).remove(book);

    }
   }
   static void showLibrary(){
    for(String genre : library.keySet()){
        System.out.println(genre +" " + library.get(genre));
    
    }

   }
   public static void main(String[] args) {
       addBook("Fiction" , "Avengers");
       addBook("action", "Ghosted");
       addBook("Fiction", "Ghosted"); 
        addBook("Science", "Cosmos");
        System.out.println("library before borrow");
        showLibrary();

        borowBook("Fiction", "Ghosted");
        System.out.println("library after borrow");

        showLibrary();


   }


}
