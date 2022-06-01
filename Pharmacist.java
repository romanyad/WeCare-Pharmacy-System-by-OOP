//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

import java.util.Scanner;
public class Pharmacist extends User{
    private String pharmacyName;
    private double pharmacyDistance; 
    
    
        
    
      public Pharmacist () {
          
          super();
          pharmacyName="";
          pharmacyDistance=0.0;
          
      }
      public Pharmacist ( String n,String _city, String _state, String _street, String _zip, String _phoneNum, String _email, String _farmName, double _farmDis) {
		super(n, _city, _state, _street, _zip, _phoneNum,_email);
		pharmacyName=_farmName;
		pharmacyDistance=_farmDis;
		
	}

    //-----------------------------------------------------------(Getters)----------------------------------------------------------
	 public String getPharmacyName() {
        return pharmacyName;
    } 
    
    public double getPharmacyDistance() {
        return pharmacyDistance;
    }
    
    
    
    //---------------------------------------------------------(Setters)-----------------------------------------------------------
    public void setPharmacyName(String _fn) {
        pharmacyName=_fn;
    }
    
    public void setPharmacyDistance(double _fd) {
        pharmacyDistance=_fd;
    }

    //--------------------------------------------------------(other methods)-----------------------------------------------------
	 
	 
	 @Override
	 public void input() {
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("\n--------------Registration Pharmacist-----------------");
		 super.input();
		 System.out.print("Pharmacy Name         =>");
		 pharmacyName=sc.nextLine();
		 
		 System.out.print("Pharmacy Distance     =>");

// use of exception
 
		 
		 boolean validInput = false;
		 double value = 0;
		 do{
		     
		     try{
		         value = Double.parseDouble(sc.nextLine());
		         validInput = true;
		        
		     }catch(IllegalArgumentException e){
		         System.out.println("This field requires you to input a number. Try again please by restarting. Thank you !\nFirm Distance  => ");
		     }
		 }while(!validInput);	 
		 
		 pharmacyDistance=value;
		 
	 }
	 
	 
	 
	 @Override
		public String toString() {
		 		return super.toString()+ "\nPharmacy Name:  " + pharmacyName + "\nPharmacy Distance:  " + pharmacyDistance + "\n\n";
		}
	 
	 public void display() {
		 System.out.println("Pharmacy Name	:  " + pharmacyName + "\nPharmacy distance	: " + pharmacyDistance + " km" );			 
		 
	 }
	 
    
}
