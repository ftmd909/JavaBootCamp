
public class Student extends User {

	public Student(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		System.out.println(getFirstName() +" "+ getLastName() +":Ogrenci olarak eklendi");
	}

}
