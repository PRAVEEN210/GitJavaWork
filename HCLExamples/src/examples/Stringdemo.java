package examples;

public class Stringdemo {
	
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	
int age1=0;
int age2=0;

if(s1.equals(s1))
{
	System.out.println("Both objects are same");
	
}
if(age1==age2)
{
	System.out.println("Both ages are same");
}
System.out.println("String methods usage");
String s="praveen";
//to replace a character with another,use replace(old char,newchar) method from String class
String repl_s=s.replace('S', 's');
System.out.println("Replaced with character-string:"+repl_s);

//to get a sub string,from a string use substring() method from String
String sub_str=s.substring(4);
System.out.println("The substring is from index no 4 is\n(Note:index starts at 0)"+sub_str);

//to change the case of a string
String upperCaseString=s.toUpperCase();
String lowerCaseString=s.toLowerCase();
System.out.println("UPPER CASE string is:"+upperCaseString);
System.out.println("LOWER CASE string is:"+lowerCaseString);




}
}
