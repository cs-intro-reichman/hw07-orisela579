/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		StdDraw.line(0.1, 0.153, 0.9, 0.153);
		StdDraw.line(0.1, 0.153, 0.5, 0.846);
		StdDraw.line(0.9, 0.153, 0.5, 0.846);
		sierpinski(n, 0.1, 0.9, 0.5, 0.153, 0.153, 0.846);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
			if(n==0) return;
			double x4 = (x1 + x2) / 2;
			double x5 = (x2 + x3) / 2;
			double x6 = (x3 + x1) / 2;
			double y4 = (y1 + y2) / 2;
			double y5 = (y2 + y3) / 2;
			double y6 = (y3 + y1) / 2;
			StdDraw.line(x4, y4, x5, y5);
			StdDraw.line(x6, y6, x5, y5);
			StdDraw.line(x6, y6, x4, y4);
			sierpinski(n-1, x1, x4, x6, y1, y4, y6);
			sierpinski(n-1, x2, x4, x5, y2, y4, y5);
			sierpinski(n-1, x3, x5, x6, y3, y5, y6);
		}
}

