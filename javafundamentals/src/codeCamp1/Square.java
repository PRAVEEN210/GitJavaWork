package codeCamp1;

	public class Square extends Shape
	{
	int a;
	double perimeter,area;
	Square(int a)
	{
	this.a=a;
	}
	@Override
	void getPerimeter()
	{
	perimeter=4*a;
	System.out.println("perimeter of square:"+perimeter);

	}
	@Override
	void getArea()
	{
	area=a*a;
	System.out.println("area of square:"+area);

	}


	}

