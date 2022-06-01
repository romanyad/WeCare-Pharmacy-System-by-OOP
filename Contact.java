//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

public class Contact {
    
    private String phoneNum;
	private String email;
	
	
	public Contact() {
		phoneNum="";
		email="";		
	}
	
	public Contact(String _phoneNum, String _email) {
		phoneNum=_phoneNum;
		email=_email;		
	}
	
//------------------------setter--------------------------	
	
	public void setPhoneNum(String _phoneNum) {
		phoneNum=_phoneNum;
	}
	
	
	public void setEmail(String _email) {
		email=_email;
	}

//------------------------getter--------------------------
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getEmail() {
		return email;
	}
	
}
