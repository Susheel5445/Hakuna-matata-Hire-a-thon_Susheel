import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import javax.security.auth.login.AccountException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONObject {
    public static <JSONParser, JSONArray> void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {     
            Object obj = parser.parse(new FileReader("Hackathon Timesheet.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            String product = (String) jsonObject.get("product");
            System.out.println(product);

            String date = (String) jsonObject.get("date");
            System.out.println(date);

           double hour = (double) jsonObject.get(hour);
            System.out.println(hour);
            
            String owner = (String) jsonObject.get("owner");
            System.out.println(owner);
             
            
            String team = (String) jsonObject.get("team");
            System.out.println(team);
            
            
            String billingstatus = (String) jsonObject.get("billingstatus");
            System.out.println(billingstatus);
       .    

            // loop array
            JSONArray cars = (JSONArray) jsonObject.get("cars");
            Iterator<String> iterator = ((Object) cars).iterator();
            while (iterator.hasNext()) {
             System.out.println(iterator.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }

	private String get(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}