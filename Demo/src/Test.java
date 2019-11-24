import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Test test= new Test();
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
//		test.findElement(arr, 5);
//		System.out.println(test.findElement(arr, 5));
		
//		System.out.println(test.oddNumbers(0, 10));	
		
		System.out.println(test.firstRepeatedWord("my name,  My "));
		
		boolean True=true;
		boolean b=True;
		System.out.println("value of b :"+b);
		
		int i=5;
		int j=i;
		System.out.println("value of j: "+j);
		
		
		Hashtable<String, String> hs= new Hashtable<>();
		hs.put("java", "Jitun");
		
		System.out.println("fibonacci series: "+test.getFibonacciSeries(4));
	}
	
	private String findElement(List<Integer> arr, int k){
		for(int i=0; arr.size()>i;i++){
			if(arr.get(i)==k)
				return "YES";
		}
		return "NO";
	}
	
	private List<Integer> oddNumbers(int l, int r){
		if (r <= l) return null;

	    l = (l % 2) == 0 ? l + 1 : l;
	    System.out.println(l);
	    int size = ((r - l) / 2) + 1;
	    System.out.println(size);
	    List<Integer> theArray = new ArrayList<>();
	    
	    for (int i=0; i < size; ++i) {
	    	if(i==2){
	    		theArray.add(i);
	    	}
	        theArray.add( l + (i*2));
	    }
		return theArray;
	}
	
	public void sortPersons(List<Person> persons, String[] sortBy){
		List<String> sortBy1=Arrays.asList(sortBy);
		if(sortBy1.size()==1){
			if(sortBy1.contains("firstName")){
				Collections.sort(persons, Person.firstNameComparator);
			}
			if(sortBy1.contains("country")){
				Collections.sort(persons, Person.countryComparator);
			}
		}
		if(sortBy1.size()<1){
				Collections.sort(persons, Person.countryComparator);
				Collections.sort(persons, Person.firstNameComparator);
		}
		
	}
	
	public String firstRepeatChar(String str){
		char[] c_arr = str.toCharArray();
        HashSet<String> h = new HashSet<>(); 
  
        for (int i=0; i<=c_arr.length-1; i++) 
        { 
            String ch = String.valueOf(c_arr[i]); 
  
            if (h.contains(ch)){
            	return ch; 
            }else {
            	h.add(ch); 
            }
        } 
        return ""; 
	}
	String str2;
	public String firstRepeatedWord(String str){
		String str2=str.replaceAll("[,:;-]", " ");
		
		System.out.println(", replace : "+str2);
		List<String> wordList= Arrays.asList(str.split("\\s+"));
		Map<String, Integer> occurnaces= new LinkedHashMap<>();
		for(String word:wordList){
			Integer oldCount = occurnaces.get(word);
			if(oldCount == null){
				oldCount = 0;
			}
			occurnaces.put(word, oldCount+1);
		}
		
		return "";
	}
	 
	public long MaximumSum(List<Integer> arr){
		Integer[] arr1=(Integer[]) arr.toArray();
		long newsum=arr1[0];
	       long max=arr1[0];
	       for(int i=1;i<arr1.length;i++){
	           newsum=Math.max(newsum+arr1[i],arr1[i]);
	           max= Math.max(max, newsum);
	       }
	       return max;
	}
	
	public List<Integer> getFibonacciSeries(int n){
		
		//in java8
//		return Stream.iterate(new int[]{0,1}, t-> new int[]{t[1], t[0]+t[1]})
//				.limit(n).map(i->i[0]).collect(Collectors.toList());
		List<Integer> list=new ArrayList<>();
		int  t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
        	list.add(t1);
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return list;
		
	}
}
