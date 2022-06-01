//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

import java.util.Scanner;

public class BabyCare extends Item{
    public BabyCare() {
		super("",0.00,null);
	}
	
	public BabyCare(String _itemName, double _itemPrice, Pharmacist f) {
		super(_itemName,_itemPrice,f);
	}

    //----------------------------------------(Other Methods)----------------------------------
	

    public  void productReg() {
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("----------Fill in the information to register Baby care Products that you want to sell---------------- ");
    	
    	System.out.print("Baby Product Name: ");
    	itemName=sc.nextLine();
    	System.out.print("Baby Product Price: ");
    	
    	// exception implementation
        boolean validInput = false;
		 double value = 0;
		 do{
		     
		     try{
		         value = Double.parseDouble(sc.nextLine());
		         validInput = true;
		        
		     }catch(IllegalArgumentException e){
		         System.out.println("This field requires you to input a number. Try again please by restarting. Thank you !\nBaby Product Price  => ");
		     }
		 }while(!validInput);	 
		 
		 itemPrice=value;	       
        
    	
    	
         pharmacist =new Pharmacist();
         pharmacist.input();
    	
    	
    }
	
	 public  void printOut() {
		 System.out.println("Baby Product Name     : " + itemName);
	        System.out.println("Price           : " + itemPrice + " bdt");
	        if (pharmacist.getPharmacyDistance() < 10) {
	        	deliveryCharge= shortDistancefee; 
	        	
	            System.out.println("Delivery Fee   :   " + deliveryCharge + "bdt");
	        } else {
	        	deliveryCharge=longDistanceFee;
	            System.out.println("Delivery Fee   :   " + deliveryCharge + "bdt");
	        }
	        pharmacist.display();		 
		 
		 
		 }


	
    
}
