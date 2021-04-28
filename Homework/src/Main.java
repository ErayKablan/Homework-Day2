
public class Main {

	public static void main(String[] args) {
		
		profileManager profileManager = new profileManager();
		
		Profile profile1 = new Profile("eraykablan1903@gmail.com", "Eray", "Kablan");
		profileManager.informationRegister();
		System.out.println("-----");
		Profile[] profiles = {profile1};
		
		for (Profile profile : profiles) {
			System.out.println("Gmail: " + profile.mail);
			System.out.println("Ýsim: " + profile.name);
			System.out.println("Soyisim: " + profile.surname);
			profileManager.registerMember();
			System.out.println("----------------------------");
		}
		
		profileManager.informationLogin();
		System.out.println("-----");
		
		for (Profile profile : profiles) {
			System.out.println("Gmail: " + profile.mail);
			System.out.println("Ýsim: " + profile.name);
			System.out.println("Soyisim: " + profile.surname);
			profileManager.loginSuccessful();
			System.out.println("----------------------------");
		}
		
		
		
		Category category1 = new Category(1, "Kurslarým");
		
		Category category2 = new Category(2, "Tüm Kurslar");
		
		Category category3 = new Category(3, "Sýkça Sorulan Sorular");
		
		Category category4 = new Category(3, "Kampa Hazýrlýk");
		
		Category[] categories = {category1, category2, category3, category4};
		for (Category category : categories) {
			System.out.println(category.id + " : " + category.name);
			
		}	
		
		categoryManager Categorymanager = new categoryManager();
		System.out.println("----------------------------");
		Categorymanager.selectCategory(category1);
		System.out.println("----------------------------");
		Categorymanager.selectCategory(category2);
		System.out.println("----------------------------");
		Categorymanager.selectCategory(category3);
		System.out.println("----------------------------");
		Categorymanager.selectCategory(category4);
		System.out.println("----------------------------");
		
		


		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demiroð");
		
		Course course2 = new Course (2, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð");
		
		Course course3 = new Course (3, "Yazýlým Geliþtirme Kampý", "Engin Demiroð");
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println("Kurs adý: " + course.name);
			System.out.println("Kurs Öðretmeni: " + course.teacher);
		}
		
		



	}

}
