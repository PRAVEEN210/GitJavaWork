public class ItemType {
    
	private String itemTypeName;
	private double cost;
	
	public ItemType() {
		super();
	}

	public ItemType(String itemTypeName, double cost) {
		super();
		this.itemTypeName = itemTypeName;
		this.cost = cost;
	}

	public String getItemTypeName() {
		return itemTypeName;
	}

	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}