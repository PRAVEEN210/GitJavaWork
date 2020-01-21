package codeCamp1;

	public class Circle extends Shape
	{
	double r,perimeter,area;

	Circle(double r)
	{
	this.r=r;
	}
	@Override
	void getPerimeter()
	{
	perimeter=2*3.14*r;
	System.out.println("perimeter of circle:"+perimeter);
	}

	@Override
	void getArea()
	{

	area=3.14*r*r;
	System.out.println("area of circle:"+area);
	}
	
}
