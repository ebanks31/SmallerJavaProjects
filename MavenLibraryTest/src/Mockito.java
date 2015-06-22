import java.util.ArrayList;


public class Mockito {

    public Mockito() {
    }
    public int count(ArrayList<Object> items) {
    	
         int results = 0;
         
         for(Object curItem : items) {
              results ++;
         }
         return results;
    }
}

