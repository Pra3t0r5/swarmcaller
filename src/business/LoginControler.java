package business;

import java.util.ArrayList;

import entities.*;

public class LoginControler {
	/* this static arrayList should be removed and 
	 * replaced by the data layer
	 */
	public static ArrayList<User> mockUsers = // <- por que el cambio de letra y como?
			new ArrayList<User>() {{ // <-por que doble llaves?
				add(new User("jperez@gmail.com","juanperez","123", null));
				add(new User("jd@gmail.com","johndoe","jdrules", null));
				add(new User("mm@gmail.com","mastermind","smarter", null));
			}};
			
	public User getUser(User user) {
		for (User u : mockUsers) {
			if (u.equals(user) && u.getPassword().equals(user.getPassword())) {
				return u;
			}
		}
		return null;
	}

}
