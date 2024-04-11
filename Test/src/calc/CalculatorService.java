package calc;

public class CalculatorService {
	private Calculator calculator;
	
	
	public CalculatorService(Calculator calculator) {
		this.calculator = calculator;
		
	}

	public String addAndReport(int a, int b) {
		int result = calculator.add(a, b);
		return "Result:" + result;
		
	}
	
	public String substractAndReport(int a, int b) {
		int result = calculator.substract(a, b);
		return "Result:" + result;

	}

}

