package Exercises;

public class AddressBookdemo {
	public static void main(String[] args) {
		//creating AddressBook-innerclass object
		AddressBook ab=new AddressBook();
		//creating Address-innerclass object
		AddressBook.Address address=new AddressBook().new Address();
		//set values to attributes of inner class
		address.setHousename("Jayalakshmi nilayam");
		address.setStreet("Seethammavari Street");
		address.setCity("Vijayawada");
		address.setState("AP");
		//set values to attributes of outer class
		ab.setTempAdd(address);
		
		//creating Address-innerclass object
		AddressBook.Address paddress=new AddressBook().new Address();
		//set values to attributes of inner class
		paddress.setHousename("P nivas");
		paddress.setStreet("Bhavani puram");
		 paddress.setCity("Ongole");
		  paddress.setState("Andhra pradesh");
		  
		  //set values to attributes of outer class
		  ab.setPermAdd(paddress);
		  
		  //display addresses
		  System.out.println("Temporary address:\n"+ab.getTempAdd());
		  System.out.println("Permenant address:\n"+ab.getPermAdd());
		 }



}



