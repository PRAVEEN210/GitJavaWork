package codeCamp1;

	public class Pentagon extends Shape
	{
	double s,perimeter,area;
	Pentagon(double s)
	{
	this.s=s;
	}

	@Override
	void getPerimeter()
	{
	perimeter=5*s;
	System.out.println("perimeter of pentagon:"+perimeter);

	}

	@Override
	void getArea()
	{
	area=(Math.sqrt(5*(5 + 2*(Math.sqrt(5))))* s*s)/4;
	System.out.println("area of pentagon:"+area);

	}


}
