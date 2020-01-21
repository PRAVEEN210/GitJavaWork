import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		List<Item> lt= new ArrayList<>();
		FileWriter fw=null;
		try {
			fw = new FileWriter("output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter number of items purchased");
		int m= Integer.parseInt(scan.nextLine());
		if(m<=0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("Enter item details in CSV(Item Number,Vendor Name,ItemType Name,Cost)");
			for(int j=0;j<m;j++)
			{
				String line= scan.nextLine();
				String details[]= line.split(",");
				ItemType it= new ItemType(details[2], Double.parseDouble(details[3]));
				Item it1= new Item(Integer.parseInt(details[0]),details[1],it);
				lt.add(it1);
			}
			
			ItemBO bo= new ItemBO();
			bo.writeFile(lt, fw);
		}
		}

}