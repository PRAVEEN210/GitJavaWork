package Myio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable
{
	private int rollNumber;
	private String studentName;
	private float marks;
	//private transient String collegeName;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
}
class Markscomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		float m1=s1.getMarks();
		float m2=s2.getMarks();
		if(m1>m2)
			return 1;
		else
			return 0;
	}
	
}
public class Persistdemo {

	public static void main(String[] args) throws IOException{
		Student s1=new Student();
		s1.setRollNumber(9999);
		s1.setStudentName("Arun Kumar");
		s1.setMarks(320);
		
		Student s2=new Student();
		s2.setRollNumber(1111);
		s2.setStudentName("Sivaram prasad");
		s2.setMarks(200);
		
		//serialization
		File f=new File("C:/Users/TSSVJA/Desktop/Sivaram/student.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
				
		//create homogeneous collection
		ArrayList<Student> slist=new ArrayList<Student>();
		//adding elements to collection
		slist.add(s1);
		slist.add(s2);
		
		//write object to hard drive or external storage media
				oos.writeObject(slist);
			
				
				//close stream objects
				oos.close();
				fos.close();
				
		
		//sort the objects in a collection(elements) according to attribute
		Collections.sort(slist, new Markscomparator());
		System.out.println("Student list sorted on marks:");
		
		//display sorted marks
		for(Student s : slist)
		{
			System.out.println("Student Roll No:"+s.getRollNumber());
			System.out.println("Student Name:"+s.getStudentName());
			System.out.println("Student marks"+s.getMarks());
		}
		
		
	}

}
