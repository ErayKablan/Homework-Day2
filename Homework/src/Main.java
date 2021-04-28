
public class Main {

	public static void main(String[] args) {
		
		profileManager profileManager = new profileManager();
		
		Profile profile1 = new Profile("eraykablan1903@gmail.com", "Eray", "Kablan");
		profileManager.informationRegister();
		System.out.println("-----");
		Profile[] profiles = {profile1};
		
		for (Profile profile : profiles) {
			System.out.println("Gmail: " + profile.mail);
			System.out.println("�sim: " + profile.name);
			System.out.println("Soyisim: " + profile.surname);
			profileManager.registerMember();
			System.out.println("----------------------------");
		}
		
		profileManager.informationLogin();
		System.out.println("-----");
		
		for (Profile profile : profiles) {
			System.out.println("Gmail: " + profile.mail);
			System.out.println("�sim: " + profile.name);
			System.out.println("Soyisim: " + profile.surname);
			profileManager.loginSuccessful();
			System.out.println("----------------------------");
		}
		
		
		
		Category category1 = new Category(1, "Kurslar�m");
		
		Category category2 = new Category(2, "T�m Kurslar");
		
		Category category3 = new Category(3, "S�k�a Sorulan Sorular");
		
		Category category4 = new Category(3, "Kampa Haz�rl�k");
		
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
		
		


		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�");
		
		Course course2 = new Course (2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�");
		
		Course course3 = new Course (3, "Yaz�l�m Geli�tirme Kamp�", "Engin Demiro�");
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println("Kurs ad�: " + course.name);
			System.out.println("Kurs ��retmeni: " + course.teacher);
		}
		
		



	}

}
