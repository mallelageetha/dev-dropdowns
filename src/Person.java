import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	
	private String name;
	
	private String ssn;
	
	private static int DEFAULT_NO_OF_LEGS = 2;
	
	private int[] arr = new int[4] ;
	
	private List<String> sList = new ArrayList<String>();
	
	private Map<String, Person> personMap = new HashMap<String, Person>();
	
	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public static void main(String[] s) {
		
		System.out.println(Person.DEFAULT_NO_OF_LEGS);
		Person p = new Person("Vihana", "3226");
		
		map.put("3226",p);
		
		System.out.println("person created " + p.name);
	}

}
