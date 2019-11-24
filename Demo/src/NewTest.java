
public class NewTest {

	public static void main(String[] args) {
		System.out.println(getString("Hello"));

//		Employee emp= new Employee();
		/*emp.setName("Jitun");
		emp.getName().equals("Jitun");*/
	}
	
	public static String getString(String str){
		str.concat("hi");
		return str;
	}

}
