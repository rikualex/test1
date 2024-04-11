package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

	
	private Calculator calculator;
	private CalculatorService service;
	
	
	@BeforeEach
	public void setUp() {
		// テスト前にCalculatorとCalculatorSeriveをセットアップ
		calculator = new Calculator();
		service = new CalculatorService(calculator);
	}

	@Test
	public void testAddAndReport() {
		// CalculatorのaddメソッドとCalculatorSeriviceのaddReportメソッドが正しく連携するかテスト
		assertEquals("Result:5", service.addAndReport(2, 3));
		
	}

	@Test
	 public void testSubstractAndReport() {
		// CalculatorのsubtractメソッドとCalculatorSeriveのsubstractAndReportメソッドが正しく連携するかテスト
		assertEquals("Result:1", service.substractAndReport(3, 2));
	}

}
