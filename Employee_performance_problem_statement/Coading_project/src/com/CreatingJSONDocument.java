package com;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
public class CreatingJSONDocument {
   public static void main(String args[]) {
      //Creating a JSONObject object
      JSONObject jsonObject = new JSONObject();
      //Inserting key-value pairs into the son object
      jsonObject.put("project", "AAA");
      jsonObject.put("date", "23/02/2015");
      jsonObject.put("hour", "1.5");
      jsonObject.put("Owner", "sankar");
      jsonObject.put("team", "Design");
      jsonObject.put("bilingstatus", "billable");
      try {
         FileWriter file = new FileWriter("Hackathon Timesheet.json");
         file.write(jsonObject.toString());
         file.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      System.out.println("JSON file created: "+jsonObject);
   }
}