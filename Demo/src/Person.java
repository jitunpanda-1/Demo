import java.util.Comparator;

public class Person {

	String firstName;
	String lastName;
	int age;
	String country;
	String Private;
	byte b=125;
	boolean check=true;
	String str="length";
	char chr='c';
	double flt=2.5;
	
	public Person(String firstName, String lastName, int age, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", country=" + country
				+ "]";
	}
	
	public static Comparator<Person> firstNameComparator = new Comparator<Person>() {

		public int compare(Person s1, Person s2) {
		   String firstName1 = s1.getFirstName().toUpperCase();
		   String firstName2 = s2.getFirstName().toUpperCase();

		   return firstName1.compareTo(firstName2);

	    }};
	    
	    public static Comparator<Person> countryComparator = new Comparator<Person>() {

			public int compare(Person s1, Person s2) {
			   String countryName1 = s1.getCountry().toUpperCase();
			   String countryName2 = s2.getCountry().toUpperCase();

			   return countryName1.compareTo(countryName2);

		    }};
	
}
