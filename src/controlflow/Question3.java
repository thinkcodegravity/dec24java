package controlflow;

public class Question3 {
	/*
	 * Write a program that has-a registered phone, userid, password
	   Create a method to retrieve userid. That will take input as phone and if phone matches registered phone return userid.
	   Create a method to retrieve password. That will take input as userid and if userid matches registered userid return password.
	 */
	
	long phoneRegister = 1231231231;
	String userId = "John321";
	String password;
	
	public String idRegistration(long phoneInput) {
		if(phoneInput == phoneRegister) {
			System.out.println(userId);
			return userId;
		}else {
			return "invalid phone";
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 qq = new Question3();
		String userid=qq.idRegistration(1231231231);// return type hanlding ???
		System.out.println("userid retrieved is:"+userid);
	}
	
	public String pwdRegistration(String loginUserId) {
		if(loginUserId == userId) {
			System.out.println(password);
			return password;
		}else {
			System.out.println("Not able to retrive password");
			return "invalid userid";
		}
		
		
	}

	
}
