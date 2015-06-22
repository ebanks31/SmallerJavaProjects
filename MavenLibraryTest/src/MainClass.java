import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class MainClass {

	public static void main(String[] args) {
		GsonClass gson = new GsonClass();
		gson.readJSONfromFile();
	    gson.writeEmployeeToJSON();
		gson. getEmployeeFromJSON();
		gson.writeJsonToFile();
		
		ApachePoiExcel excel = new ApachePoiExcel();
		excel.createExcel();
		
		
		
	}
	
	
	

}
