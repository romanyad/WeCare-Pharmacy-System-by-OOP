//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

import java.util.Scanner;
public abstract class User {
    protected String Name;
	protected Address address;
	protected Contact contact;
	
	public User() {				
		Name="";
		address= new Address();		
		contact= new Contact();
	}
	
	public User(String _name,  String _city, String _state, String _street, String _zip ,String _phoneNum, String _email) {
		// TODO Auto-generated constructor		
		Name=_name;		
		address= new Address(_city, _state, _street, _zip);		
		contact= new Contact(_phoneNum, _email);			
	}
	
	
	
//	//------------------------(Setters)-------------------------- 
	
	
	
	public void settName(String _name) {
		Name=_name;}
	
	
	
	public void setUserCity(String _city) {
		address.setCity(_city);
	}

	public void setUserState(String _state) {
		address.setState(_state);
	}

	public void setUserStreet(String _street) {
		address.setStreet(_street);
	}

	public void setUserZip(String _zip) {
		address.setZip(_zip);
	}
	
		
	public void setUserPhoneNum(String _phoneNum) {
		contact.setPhoneNum(_phoneNum);
	}
	
	
	public void setUserEmail(String _email) {
		contact.setEmail(_email);
	}
	
	
	//----------------------other methods-------------------------
	
	public void input() {
		Scanner sc =new Scanner (System.in);		
		
		
		
		System.out.print("Name => ");
		Name=sc.nextLine();		
		
		System.out.print("City       => ");
		String city=sc.nextLine();
		setUserCity(city);		
		
		System.out.print("State      => ");
		String state=sc.nextLine();
		setUserState(state);		
		
		System.out.print("Street     => ");
		String street=sc.nextLine();
		setUserStreet(street);		
		
		System.out.print("Zip        => ");
		String zip=sc.nextLine();
		setUserZip(zip);		
		
		System.out.print("Email      => ");
		String email=sc.nextLine();
		setUserEmail(email);		
		
		System.out.print("Phone No.  => ");
		String phone=sc.nextLine();
		setUserPhoneNum(phone);		
	}
	
	
	
	
	
	
	public  String toString()	
	{		
		return "Name:  " + Name +  "\nCity: " + address.getCity() + "\nState: " + address.getState() + "\nStreet:  " + address.getStreet() + "\nZIP: " + address.getZip() + "\nEmail:  " + contact.getEmail() + "\nPhone Number:  " + contact.getPhoneNum();
	}	
	
	public abstract void display();
}
