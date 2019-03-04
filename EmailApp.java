package emailApp;

/**
 * 
 * Main application runner for Email App. 
 * Refer to readme for additional information on this application
 * 
 * @author Chris M
 *
 */
public class EmailApp {

	public static void main(String[] args) {

		// construct new email address
		Email em1 = new Email("John", "Smith");
		
		// set alternate email
		em1.setAlernateEmail("cm@gmail.com");
		System.out.println(em1.getAlternateEmail());
		
		// print out all the info
		System.out.println(em1.showInfo());
		
	}

}
