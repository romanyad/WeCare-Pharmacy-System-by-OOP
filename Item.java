//Mostafa Musab Naveed(A19EC4017);
//Abu Sayed Khudri Roman(A19EC4002);
//Yusuf Abdullah Mahfuz (A19EC9031);


package WeCare;

public abstract class Item implements DeliveryFee, Func{
    
    protected String itemName;
	protected double itemPrice;
	protected double deliveryCharge;
	protected Pharmacist pharmacist;

    public Item() {
		itemName="";
		itemPrice = 0.0;
		pharmacist = null;
		deliveryCharge = 0;

	}
    public Item(String _itemName,  double _itemPrice, Pharmacist f) {

		
		itemName=_itemName;
		itemPrice=_itemPrice;

		pharmacist=f;
	}
    //------------------------------------------(Getters)---------------------------------------------

	public String getItemName() {
		return itemName;
		}

	public double getItemPrice() {
		return itemPrice;
		}
	
	public double getDeliveryCost() {
		return deliveryCharge;
	}

	public Pharmacist getPharmacist() {
		return pharmacist;
	}

    //-------------------------------------------(Setters)---------------------------------------------
	public void setItemName(final String itemName) {
		this.itemName = itemName;
	}

	public void setItemPrice(final double _itemPrice) {
		itemPrice=_itemPrice;
	}

	public void setPharmacist(final Pharmacist p) {
		pharmacist=p;
	}

    
}
