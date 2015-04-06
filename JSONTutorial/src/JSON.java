/*
 * 
 */

import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// TODO: Auto-generated Javadoc
/**
 * The Class JSON.
 */
public class JSON {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[]  args) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname",null);
		StringWriter out = new StringWriter();
		try {
			obj.writeJSONString(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jsonText = out.toString();
		System.out.print(jsonText);
	}

	/**
	 * Encode json.
	 *
	 * @throws ParseException the parse exception
	 */
	public void encodeJson() throws org.json.simple.parser.ParseException {
	      JSONParser parser=new JSONParser();
	      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
	      Object obj = parser.parse(s);
		 JSONArray array = (JSONArray)obj;
		 System.out.println("The 2nd element of array");
		 System.out.println(array.get(1));
		 System.out.println();

		 JSONObject obj2 = (JSONObject)array.get(1);
		 System.out.println("Field \"1\"");
		 System.out.println(obj2.get("1"));    

		 s = "{}";
		 obj = parser.parse(s);
		 System.out.println(obj);

		 s= "[5,]";
		 obj = parser.parse(s);
		 System.out.println(obj);

		 s= "[5,,2]";
		 try {
			obj = parser.parse(s);
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(obj);
	}

}
