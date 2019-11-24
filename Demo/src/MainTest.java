import java.util.HashMap;

public class MainTest {

	public static void main(String[] args) {
		Employee e1= new Employee(1, "java");
		Employee e2= new Employee(1, "java");
		Employee e3=e1;
		HashMap<Employee, Integer> map=new HashMap<>();
		map.put(e1, 1);
		map.put(e2, 1);
		map.put(e3, 2);
		System.out.println(map);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		System.out.println(e3);
		
		int i=0;
		MainTest.test(i, e1);
		System.out.println(i+" : "+e1.i);

	}
	public static void test(int i, Employee e){
		i++;
		e.i++;
	}

}
