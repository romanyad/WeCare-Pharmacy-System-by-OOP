//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

import java.util.Scanner;
import java.util.ArrayList;

public class RegistrationTransaction {
    public static void main(String[] args) {
        
        double cost []; 
		double deliveryPrice[];
		double totalPrice=0;
		double totalDeliveryCharge=0;
		double netTotal=0;

        cost=new double[100];
		deliveryPrice = new double [100];		
		
		int costNum=0;
		int delNum=0;
		
		
		// An array to store all the items
		ArrayList <Item> arrList = new ArrayList<Item> ();

        Pharmacist p1 = new Pharmacist("Sultan Omar", "Dhaka", " Dhanmondi", " Kalabagan", "1209", "01659832659", "omar@yahoomail.com", "Lazz Pharma",10);		
		Pharmacist p2 = new Pharmacist("Towhid Alam", "Narayanganj", "CTP", "4 lane Road", "1214", "0166358945", "alam247@gmail.com", "24/7 Pharma", 25);
		Pharmacist p3 = new Pharmacist("Hasif Rahman", "Dhaka", "Old Town", "Nazimuddin Road", "1211", "01163894545", "btlife@gmail.com", "Better Life Pharma",12);
		Pharmacist p4 = new Pharmacist("Abu Roman", "Dhaka", "Keraniganj", "Kuddus Road", "1313", "01689465131", "edroman@gmail.com", "Everyday Drugs",15);

        	// ----------------------------------- (already registered Medical items)----------------------------------------
		GeneralMedicine gm1 = new GeneralMedicine("Napa Extra", 20, p1);
		GeneralMedicine gm2 = new GeneralMedicine("D-cough Syrup", 65, p4);
		GeneralMedicine gm3 = new GeneralMedicine("Cholera Saline IV Infusion", 10, p4);
		GeneralMedicine gm4 = new GeneralMedicine("Seclo Capsule", 40, p1);

		
		Lists<GeneralMedicine> gmList = new Lists<GeneralMedicine>();
		gmList.addPreExisting(gm1);
		gmList.addPreExisting(gm2);
		gmList.addPreExisting(gm3);
		gmList.addPreExisting(gm4);
       
		


		SpecialisedMed sm1 = new SpecialisedMed("Lonapam Tablet", 200, p3);
		SpecialisedMed sm2 = new SpecialisedMed("Acilog SC Injection", 1200, p2);
		SpecialisedMed sm3 = new SpecialisedMed("Maxima Capsule ", 300, p3);
		SpecialisedMed sm4 = new SpecialisedMed("Nolvadex", 3000, p1);


		
		Lists <SpecialisedMed> spList = new Lists <SpecialisedMed>();

		spList.addPreExisting(sm1);
		spList.addPreExisting(sm2);
		spList.addPreExisting(sm3);
		spList.addPreExisting(sm4);
        
		
		BabyCare bp1 = new BabyCare("Baby saline IV Infusion", 15, p4);
		BabyCare bp2 = new BabyCare("Vitachild Syrup", 135, p3);
		BabyCare bp3 = new BabyCare("lactogen 1", 635, p2);
		BabyCare bp4 = new BabyCare("Cerelac", 352, p3);

		Lists <BabyCare> bcList= new Lists <BabyCare>();
		bcList.addPreExisting(bp1);
		bcList.addPreExisting(bp2);
		bcList.addPreExisting(bp3);
		bcList.addPreExisting(bp4);
		


// -------------------------- pre-registered Delivery Companies----------------------------------

		DeliveryCompany d1 = new DeliveryCompany("Saddam Islam", "Dhaka", "Tejgaon", "Road 12", "1211", "0177777777", "emneidiyedibo@gmail.com", "Diye Dibo");
		
		DeliveryCompany d2 = new DeliveryCompany("Bin Laden", "Dhaka", " Gulistan", " Pagla Mazar", "1205", "0111111111","arekbardiyedibo@gmail.com", "Arekbar Diye Dibo");
		DeliveryCompany d3 = new DeliveryCompany("Adil Rahid", "Narayanganj", "Chashara", "Nesha Mor", "1150", "01133333333", "arektudiyedibo@gmail.com",	"Arektu Diye Dibo");

	
		
		DeliveryCompanyList dList = new DeliveryCompanyList();
		dList.addCompanyPreExisting(d1);
		dList.addCompanyPreExisting(d2);
		dList.addCompanyPreExisting(d3);

        int option =0;

		do {
			
            System.out.println("|| -----------------------------Main Menu---------------------------------- ||\n ");
            
			System.out.println("-----------------Select the action you want to perform--------------------- =>");
			System.out.println("1. For (User) Pharmacist : Register Medical Products you want to sell !!");
			System.out.println("2. For (User) Delivery Company : Register your company into our system !!");
			System.out.println("3. For (User) Customer: Make an ORDER !!");			
			System.out.println("4. Enter 4 to EXIT");
			System.out.print("Select 1,2,3 or 4=> ");

		Scanner sc = new Scanner(System.in);
        // Use of Exception				
		boolean validInput = false;
        int value = 0;
        do{
            
            try{
                value = Integer.parseInt(sc.nextLine());
                validInput = true;
               
            }catch(IllegalArgumentException e){
                System.out.println("This field requires you to input a number. Thank you.Select 1,2,3,4 or 5 => ");
            }
        }while(!validInput);

        option = value;
			
			switch (option) {

			case 1:	
				int choice=0;

				do {
					System.out.println("\n----------------------------- HELLO PHARMACIST ---------------------------------");
					System.out.println("\n-------------Select the type of Medical products you want to register-----------");
					System.out.println("  1. General Medicines");
					System.out.println("  2. Specialised Medicines");
					System.out.println("  3. Baby Care");
					System.out.println("  9. Exit");
					System.out.print("Select 1,2,3 or 9 => ");

					Scanner input = new Scanner(System.in);

                    // Use of Exception				
					boolean validdataInput = false;
                    int value2 = 0;
                    do{
                        
                        try{
                            value2 = Integer.parseInt(sc.nextLine());
                            validdataInput = true;
                           
                        }catch(IllegalArgumentException e){
                            System.out.println("This field requires you to input a number. Thank you.Select 1,2,3 or 9 =>  ");
                        }
                    }while(!validdataInput);
                    choice=value2;	      
					
					 
					
					switch (choice) {

					case 1:
                        gmList.addNewProduct(new GeneralMedicine());
						break;

					case 2:
                        spList.addNewProduct(new SpecialisedMed());
						break;

					case 3:
                        bcList.addNewProduct(new BabyCare());
						break;						
					
					}
				} while (choice != 9);
                break;

			case 2:
				System.out.println("\n------------------------------------------------------ HELLO Delivery Company Owner --------------------------------------------------------");
				dList.addNewCompany();
				
				break;

			case 3:
				System.out.println("\n\n-------------------------------------- HELLO CUSTOMER!!!------------------------------------------");
				Scanner n = new Scanner(System.in);
				int op =0;
				
				Customer cList =new Customer();	
				cList.input();
				
				DeliveryCompany d = new DeliveryCompany();
				
				
				
				do {
					System.out.println("\n-------------Select the type of produce you want to buy------------");
					System.out.println("  1. General Medicines");
					System.out.println("  2. Specialised Medicines");
					System.out.println("  3. Baby Care");
					System.out.println("  4. Exit (If you donot want to purchase more items)");
					System.out.print("Select 1,2,3 or 4 => ");

					
					// Use of Exception				
					boolean validfInput = false;
					 int value3 = 0;
					 do{
					     
					     try{
					         value3 = Integer.parseInt(sc.nextLine());
					         validfInput = true;
					        
					     }catch(IllegalArgumentException e){
					         System.out.println("This field requires you to input a number. Thank you.Select 1,2,3 or 4 => ");
					     }
					 }while(!validfInput);	 
					 
					 op=value3;	      

					
					switch (op) {

					case 1:
						
                        gmList.printList("\n\n-----------List of General Medicines Available for sale--------", "\nG.Med ID ");
						GeneralMedicine generalMedItem = new GeneralMedicine();
						generalMedItem = gmList.choice("\nSelect the ID of Medicines that you want to purchase=>");						
						
						
						arrList.add(generalMedItem);							
						
						break;

					case 2:
						
                        spList.printList("\n\n-----------List of Specialised Medicines Available for sale--------", "\nS.Med ID ");
						SpecialisedMed specialMedItem = new SpecialisedMed();
						specialMedItem = spList.choice("\nSelect the ID of Medicines that you want to purchase=>");
						

						arrList.add(specialMedItem);
						
						
						break;

					case 3:						
                    bcList.printList("\n\n-----------List of baby Care Products Available for sale--------", "\nBaby Product ID ");
						BabyCare babyCareItem = new BabyCare();
						babyCareItem = bcList.choice("\nSelect the ID of Animal Product that you want to purchase=>");
						
						arrList.add(babyCareItem);
						
						
						break;						
					
					}
					
					
				}while (op != 4);
				
				System.out.println("<==-Select a Delivery Company from the following list of delivery companies to deliver your product-==>");
				dList.printDeliveryOptions();//				
				d = dList.companyChoice();
				
				
				System.out.println("\n\n------------------------------------------------------------(( ORDER RECEIPT ))------------------------------------------------------------ \n");
				System.out.println("\n---Customer details---\n");
				String c=cList.toString();
				System.out.println(c);
				
				
				System.out.println("--Delivery details--");
				System.out.println("Will be delivered by : " + d.getCompanyName());
				
				System.out.println("\n\n----Item details---- \n");
				System.out.println("Items Bought\t\tPharmacy Name\t\tPrice");
				System.out.println("------------\t\t-----\t\t---------");
				
				for(int i=0; i< arrList.size(); i++) {
				System.out.println(arrList.get(i).itemName +"\t\t\t" + arrList.get(i).getPharmacist().getPharmacyName() + "\t\t\t" + arrList.get(i).itemPrice );	
				
				totalPrice+=arrList.get(i).getItemPrice();
				totalDeliveryCharge+=arrList.get(i).getDeliveryCost();					
				}								
				
				System.out.println(" The Total price of all Items bought              : " + totalPrice + " RM");
				System.out.println(" The Total delivery charge of all Items bought    : " + totalDeliveryCharge + "  RM");
				
				netTotal=totalPrice+totalDeliveryCharge;
				System.out.println("                                      Net Total   : " + netTotal + " RM");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\n\n");
								
				break;		
				
				
				
				
			}
		}while (option != 4);


    }
    
}
