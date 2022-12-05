public class Application {
	public static void main(String[] args) {
		User u1 = new User("remi.fasola", "Développeur");
		User u2 = new User("lea.rico", "Chef de projet");
		
		PostIt p1 = new PostIt(u1, 'a', "Hello world!");
		PostIt p2 = new PostIt(u2, 'a', "Hello @remi.fasola !");
		PostIt p3 = new PostIt(u2, 't', "Il faut écrire les classes");
		PostIt p4 = new PostIt(u2, 't', "Il faut écrire les interfaces");
		
		PostIt p1bis = null;
		try {
			p1bis = (PostIt) p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(p1);
		System.out.println(p1bis);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}