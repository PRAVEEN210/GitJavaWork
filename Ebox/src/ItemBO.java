import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ItemBO {
    
	void writeFile(List<Item> lt,FileWriter fw)
	{
		
		for (Item item : lt) {
			try {
				String det= item.getItemNumber()+","+item.getVendor()+","+item.getItemType().getItemTypeName()+","+item.getItemType().getCost()+"\n";
				fw.write(det);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		try {
			fw.close();
		    } 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}