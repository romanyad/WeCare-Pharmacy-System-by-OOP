//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);
package WeCare;

import java.util.Scanner;

public class DeliveryCompany extends User  {

    private String companyName; 
	
	
	public DeliveryCompany() {
		super();
		companyName="";
	}
	
	
	public DeliveryCompany(String n, String _city, String _state, String _street, String _zip, String _phone, String _email, String _companyName) {
		super( n,_city, _state, _street, _zip,_phone, _email);
		companyName=_companyName;
	}

	
	//---------------------------------(getters)---------------------
	public String getCompanyName() {
		return companyName;
	}
	
	
	//-------------------------------(setters)---------------------
	public void setCompanyName(String _companyName) {
		companyName=_companyName;

	}
	
	//-------------------------------(other methods)----------------------
	@Override	
	public void input() {
			System.out.println("\n\n----------------DeliveryCompany Regitration------------------");
			super.input();
			
			Scanner input = new Scanner (System.in);
			System.out.print("Delivery Company Name        =>");			
			companyName=input.nextLine();		
			
			
			
			
			
		}
	
	
	@Override
	public String toString() {
		return  "Delivery Company Name : "+ companyName + "\n" +  super.toString() + "\n\n"; 
	}
	
	
	public void display() {
		System.out.println("Delivery Company Name : " + companyName + "\n" );
	}
	
    
}
