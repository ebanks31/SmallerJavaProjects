import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

public class Guava {

	public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
			  "red",
			  "orange",
			  "yellow",
			  "green",
			  "blue",
			  "purple");

	
	public String Joiner()
	{
		Joiner joiner = Joiner.on("; ").skipNulls();
		String result = joiner.join("Harry", null, "Ron", "Hermione");
		System.out.println(result);
		return result;
	}
	
	public String joinList()
	{
		return Joiner.on(",").join(Arrays.asList(1, 5, 7)); // returns "1,5,7"
	}
	
	public Iterable<String> splitGuava()
	{
		return Splitter.on(',')
	       .trimResults()
	       .omitEmptyStrings()
	       .split("foo,bar,,   qux");
	}
	
	
	public void unOrderedPermutation()
	{
	    List<Integer> vals = Ints.asList(new int[] {1, 2, 3});
	    
	    Collection<List<Integer>> orderPerm = 
	            Collections2.permutations(vals);
	    
	    for (List<Integer> val : orderPerm) {
	        System.out.println(val + "\n");
	    }
	}
	
	
	public void orderedPermutation()
	{
	    List<Integer> vals = Lists.newArrayList(1, 2, 3);
	    
	    Collection<List<Integer>> orderPerm = 
	            Collections2.orderedPermutations(vals);
	    
	    for (List<Integer> val : orderPerm) {
	        System.out.println(val + "\n");
	    }
	}
	
	public void transform()
	{
	    List<String> numbersAsStrings = Lists.newArrayList(
	            "1", "2", "3");
	    
	    Collection<Double> doubles = Collections2.transform(
	            numbersAsStrings, new Function<String, Double>() {
	        @Override
	        public Double apply(String input) {
	            return new Double(input);
	        }
	    });
	    
	    for (double value : doubles)
	    {
	    	  System.out.println(value + "\n");
	    }
	}
	
	public void printImmutableStringList()
	{
		for (String word: COLOR_NAMES)
		{
			System.out.println(word + "\n");
		}
	}
	
	
	public double sqrt(double input) throws IllegalArgumentException {
	      Preconditions.checkArgument(input > 0.0,
	         "Illegal Argument passed: Negative value %s.", input);
	      return Math.sqrt(input);
	   }	

	   public int sum(Integer a, Integer b){
	      a = Preconditions.checkNotNull(a,
	         "Illegal Argument passed: First parameter is Null.");
	      b = Preconditions.checkNotNull(b,
	         "Illegal Argument passed: Second parameter is Null.");
	      return a+b;
	   }

	   public int getValue(int input){
	      int[] data = {1,2,3,4,5};
	      Preconditions.checkElementIndex(input,data.length,
	         "Illegal Argument passed: Invalid index.");
	      return 0;
	   }
}
