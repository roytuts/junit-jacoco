package spring.junit5.jacoco.report.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class CalculatorServiceTest {

	@Spy
	private CalculatorService calc;

	@Test
	public void testFindMax() {
		int result = calc.findMax(new int[] { 1, 3, 4, 2 });
		assertEquals(4, result);
		result = calc.findMax(new int[] { -12, -1, -3, -4, -2 });
		assertEquals(-1, result);
	}

	@Test
	public void testGetRemainder() {
		int result = calc.getRemainder(5, 2);
		assertEquals(1, result);
	}

	@Test
	public void testGetRemainderEx() {
		assertThrows(IllegalArgumentException.class, () -> calc.getRemainder(5, 0));
	}

}
