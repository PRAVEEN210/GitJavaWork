package bootcamp4;
import java.util.Scanner;
	
abstract class Shape{
	    abstract void numberofsides();
	    protected double area;  
	    public double getArea() {
	        return area;
	    }
	    protected abstract void onAreaChange();
	}
	class Triangle extends Shape {
	void numberofsides() {
	System.out.println("Number of sides of Triangle is :3");
	}
	@Override
	protected void onAreaChange() {
	}
	}
	class Trepizoid extends Shape {
	   

	@Override
	protected void onAreaChange() {
	}
	void numberofsides() {
	System.out.println("Number of sides of Trapezoid is :4");
	}
	}
	class Hexagon extends Shape {
	protected void onAreaChange() {
	}
	@Override
	void numberofsides() {
	System.out.println("Number of sides of Hexagon is :6");
	}
	 }
	public class Main1 {
	   public static Scanner sc = new Scanner(System.in);
	   public static void main(String[] args) {
	    Shape s;
	    double base;
	   double height;
	   double side1, side2, height1;
	        {
	           System.out.println("Enter the number which you want to compute the area");
	           System.out.print("(1) Triangle (2) Trepizoid (3) Hexagon ?");
	           switch (sc.nextInt()) {
	           case 1:
	            s=new Triangle();
	               s.numberofsides();
	               Triangle triang = new Triangle();
	               System.out.print("Base: ");
	               base=sc.nextDouble();
	               System.out.print("Height: ");
	               height=sc.nextDouble();                
	               double area = 0.5 *base * height;                
	               System.out.println("Area of triangle: " +area);
	               break;
	           case 2:
	            s=new Trepizoid();
	               s.numberofsides();
	            Trepizoid trepi=new Trepizoid();
	            System.out.println("Enter Length of Two Parallel Sides of Trapezium: ");
	            side1=sc.nextDouble();
	            side2=sc.nextDouble();
	               System.out.println("Enter Height of Trapezium: ");
	               height1=sc.nextDouble();
	               area = 1.0 / 2 * (side1 + side2) * height1;
	               System.out.println("Area of trepizoid " + area);
	               break;
	               
	           case 3:
	            s=new Hexagon();
	               s.numberofsides();
	            Hexagon hexa=new Hexagon();
	            System.out.println("Enter the side of a hexagon: ");
	            double side=sc.nextDouble();
	            area = ( 3 * Math.sqrt(3) *(side*side)) / 2;
	               System.out.println("Area of hexagon " + area);
	               break;
	           }
	      }
}
	
}
