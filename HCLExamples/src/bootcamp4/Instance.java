package bootcamp4;
import java.util.ArrayList;
import java.util.Scanner;
class Student{}
class Trainer{}
class HCL{}
public class Instance{
	 static String count(ArrayList mylist){
	 int a = 0,b = 0,c = 0;
	 for(int i = 0; i < mylist.size(); i++){
	 Object element=mylist.get(i);
	 if(element instanceof Student) a++;
	 if(element instanceof Trainer) b++;
	 if(element instanceof HCL) c++;
	 }
	 String ret = Integer.toString(a)+" "+Integer.toString(b)+" "+ Integer.toString(c);
	return ret;
	}
	public static void main(String []args){
	ArrayList mylist = new ArrayList();
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=0; i<t; i++){
	String s=sc.next();
	if(s.equals("Student"))mylist.add(new Student());
	if(s.equals("Trainer"))mylist.add(new Trainer());
	if(s.equals("HCL"))mylist.add(new HCL());
	}
	System.out.println(count(mylist));
	}

}
