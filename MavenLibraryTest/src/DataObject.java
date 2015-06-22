
import java.util.ArrayList;
import java.util.List;
 
public class DataObject {
 


	private int data1 = 100;
	private String data2 = "hello";
	@SuppressWarnings("serial")
	private List<String> list = new ArrayList<String>() {
	  {
		add("String 1");
		add("String 2");
		add("String 3");
	  }
	};
	
	public DataObject(int data1, String data2, List<String> list)
	{
		this.data1 = data1;
		this.data2 = data2;
		this.list = list;
	}
	
	public DataObject() {
		// TODO Auto-generated constructor stub
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
 
	//getter and setter methods
 
	@Override
	public String toString() {
	   return "DataObject [data1=" + data1 + ", data2=" + data2 + ", list="
		+ list + "]";
	}
 
}