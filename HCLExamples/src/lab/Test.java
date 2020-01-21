package lab;

class Vol1 {
	double width, height, depth;

	Vol1(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Vol1(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}
}

public class Test {
	public static void main(String args[]) {

		Vol1 myvol1 = new Vol1(15, 20, 10);

		Vol1 mycube = new Vol1(9);

		double vol;

		vol = myvol1.volume();
		System.out.println(" Volume of myvol1 is " + vol);

		vol = mycube.volume();
		System.out.println(" Volume of mycube is " + vol);
	}
}
