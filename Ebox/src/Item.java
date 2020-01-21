public class Item {
    
	private int itemNumber;
	private String vendor;
	private ItemType itemType;
	
	public Item() {
		super();
	}

	public Item(int itemNumber, String vendor, ItemType itemType) {
		super();
		this.itemNumber = itemNumber;
		this.vendor = vendor;
		this.itemType = itemType;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
}