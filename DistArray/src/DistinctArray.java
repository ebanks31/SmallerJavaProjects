import java.util.ArrayList;
import java.util.Arrays;

import javax.lang.model.element.Element;


public class DistinctArray {

	
	public static void main(String [] args)
	{
		
		
		ArrayList<String> stringlist = new 	ArrayList<String>();

	}
	
	
	public static ArrayList<String> getDistinctValues(String[] originalarraylist)
	{
		String finalresult="";
	
		ArrayList<String> stringlist = new 	ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(originalarraylist));
		
		for(int i=0;i<arrayList.size();i++)
		{
			String currentcharacter = originalarraylist[i];
			
			stringlist.add(originalarraylist[i]);
			
			if(stringlist.contains(currentcharacter))
			{
				stringlist.remove(currentcharacter);
			}

		}
		
		return stringlist;
		
	}
}
