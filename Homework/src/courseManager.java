
public class courseManager {
	
	void joinCourse(Course course) {
		System.out.println(course.name + " adlý kursa giriþ yapýldý!");
	}
	
	void courseContent(Course course) {
		System.out.println("Kurs içeriði: " + course.name + " Kurs Öðretmeni: " + course.teacher);
	}

}
