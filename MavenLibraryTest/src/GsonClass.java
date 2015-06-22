import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * The Class GsonClass.
 */
public class GsonClass {

	/**
	 * Instantiates a new gson class.
	 */
	public GsonClass()
	{
		
	}
	
	/**
	 * Write employee to json.
	 */
	public  void writeEmployeeToJSON()
	{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Eric");
		employee.setLastName("Banks");
		employee.setRoles(Arrays.asList("ADMIN", "MANAGER"));
		 
		Employee employee2 = new Employee();
		employee.setId(1);
		employee.setFirstName("John");
		employee.setLastName("Allen");
		employee.setRoles(Arrays.asList("USER", "DEVELOPER"));
		
		Gson gson = new Gson();
		String json = gson.toJson(employee);
		System.out.println(json);
		
		
		String json2 = gson.toJson(employee2);
		System.out.println(json2);
	
	}
	
	/**
	 * Gets the employee from json.
	 *
	 * @return the employee from json
	 */
	public  void getEmployeeFromJSON()
	{
		Gson gson = new Gson();
		String json = "{'id':1,'firstName':'Eric','lastName':'Banks','roles':['ADMIN','MANAGER']}";
		Employee emp = gson.fromJson(json, Employee.class);
		System.out.println(emp);
		

	}
	
	/**
	 * Write json to file.
	 */
	public  void writeJsonToFile()
	{

		DataObject obj = new DataObject();
		Gson gson = new Gson();
	 
		// convert java object to JSON format,
		// and returned as JSON formatted string
		//String json = gson.toJson(obj);
	 
        GsonBuilder builder = new GsonBuilder();
        Gson gson1 = builder.setPrettyPrinting().create();
        String json = gson1.toJson(obj);
        System.out.println(json);
        
		try {
			//write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter("k:\\file.json");
			writer.write(json);
			writer.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
		System.out.println(json);
	}
	
	/**
	 * Read jso nfrom file.
	 */
	public  void readJSONfromFile()
	{
		Gson gson = new Gson();
		 
		try {
	 
			BufferedReader br = new BufferedReader(
				new FileReader("k:\\file.json"));
	 
			//convert the json string back to object
			DataObject obj = gson.fromJson(br, DataObject.class);
	 
			System.out.println(obj);
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
	}
}
