//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

import java.util.Scanner;

public class GeneralMedicine extends Item{
    
    public GeneralMedicine() {
        super("", 0.00, null);

    }

    public GeneralMedicine(String _itemName, double _itemPrice, Pharmacist f) {
        super(_itemName, _itemPrice, f);

    }
    @Override
    public void productReg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Fill in the information to register General Medicines that you want to register & sell----------- ");

        System.out.print("Medicine Name: ");
        itemName = sc.nextLine();
        System.out.print("Medicine Price: ");        
  
        // exception implementation
        boolean validInput = false;
		 double value = 0;
		 do{
		     
		     try{
		         value = Double.parseDouble(sc.nextLine());
		         validInput = true;
		        
		     }catch(IllegalArgumentException e){
		         System.out.println("This field requires you to input a number. Try again please by restarting. Thank you !\nMedicine Price  => ");
		     }
		 }while(!validInput);	 
		 
		 itemPrice=value;	       
        
        
         pharmacist=new Pharmacist();
         pharmacist.input();
    }

    @Override
    public void printOut() {

        

        System.out.println("General Medicine Name     : " + itemName);
        System.out.println("Price          : " + itemPrice + " bdt");
        if (pharmacist.getPharmacyDistance() < 10) {
        	deliveryCharge= shortDistancefee; 
        	
            System.out.println("Delivery Fee   :   " + deliveryCharge + " bdt");
        } else {
        	deliveryCharge=longDistanceFee;
            System.out.println("Delivery Fee   :   " + deliveryCharge + " bdt");
        }
        pharmacist.display();

    }
}
    

