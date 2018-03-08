
public class PaintRunner {

	public static void main(String[] args) {

		
		Paint CMax = new Paint ("CheapoMax", 25.00, 20, 10);
		Paint AJoes = new Paint ("AverageJoes", 25.00, 15, 11);
		Paint DPaint = new Paint ("DuluxorousPaint", 25.00, 10, 20);
		
		
		System.out.println("£" + CMax.caulateBill(1000));
		System.out.println("£" + AJoes.caulateBill(1000));
		System.out.println("£" + DPaint.caulateBill(1000));

		
	}
}