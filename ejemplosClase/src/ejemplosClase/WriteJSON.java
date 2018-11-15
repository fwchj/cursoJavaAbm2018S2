package ejemplosClase;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;  // requires the org.json.jar file 
import org.json.simple.JSONObject;

public class WriteJSON {
	public static void main(String[] args) {

               
        // We start with the lowest level: the individual books
        // BOOK 1
        JSONObject book1 = new JSONObject();
        book1.put("title", "The Philosopher's Stone");
        book1.put("author", "J.K. Rowling");
        book1.put("year", "1997");
        
        // BOOK 2
        JSONObject book2 = new JSONObject();
        book2.put("title", "The Chamber of Secrets");
        book2.put("author", "J.K. Rowling");
        book2.put("year", "1998");
        
        // Now we combine them into an array
        JSONArray books = new JSONArray();
        books.add(book1);
        books.add(book2);
        
        
        // An finally, we add this array to the main object
        JSONObject main = new JSONObject();
        main.put("booklist", books);
        
        
        

        try (FileWriter file = new FileWriter("books.json")) {

            file.write(main.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(main);

    }
}
