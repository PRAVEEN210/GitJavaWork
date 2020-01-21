package codeCamp1;
import java.util.Scanner;
public class Student1 {
		public static void main(String[] args) {

			Student r=new Student();
			r.add();
			}

			}
			class Student
			{
			private String fname;
			private String lname;
			private String Grade;
			public Student(String fname, String lname, String Grade) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.Grade = Grade;
			}
			Student(){}
			public void add()
			{
			System.out.print("Enter number of classes: ");
			Scanner sc=new Scanner(System.in);
			String fname;
			String lname;
			String mark;
			int num=sc.nextInt();
			Student[] stu=new Student[num];
			for(int i=0;i<num;i++)
			{
			System.out.print("Enter fname: ");
			fname=sc.next();
			System.out.print("Enter lname: ");
			lname=sc.next();
			System.out.print("Enter Grade: ");
			Grade=sc.next();
			Student s= new Student(fname,lname,Grade);
			stu[i]=s;
			}
			for(Student st:stu){
			System.out.println(st.toString());
			}
			}

			@Override
			public String toString() {
			return "Student info [fname=" + fname + ", lname=" + lname + ", Grade=" + Grade + "]";
			}
		

	}

