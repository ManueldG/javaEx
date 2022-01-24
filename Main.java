

package lambda;

public class Main {
	
	

	public static void main(String[] args) {
		
		FormaGeometrica rect = (a,b)->a*b;
		double area = rect.calcolArea(2, 4);
		System.out.print(area);

	}

}
