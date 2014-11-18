package ajaxtestpackage;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
	
	Map map; 
	
	public AccountManager() {
		// TODO Auto-generated constructor stub
		 map = new HashMap();
		 map.put("Patrick", "1234");
		 map.put("Molly", "FloPup");
		 
	}
	
	public boolean checkLogin(String user, String password){
		if(map.containsKey(user)){
			if (map.get(user).equals(password)){
				
				return true;
			}
		}	
			return false;
	}
	
	public boolean userExist(String user){
		return map.containsKey(user);
	}

	public void createAccount(String user, String password){
		map.put(user, password);
	}

}
