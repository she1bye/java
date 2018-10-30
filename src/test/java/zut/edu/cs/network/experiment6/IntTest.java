package zut.edu.cs.network.experiment6;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.apache.log4j.*;

public class IntTest {

	private static Logger logger = Logger.getLogger(FanTest.class);
	Int value1 = new Int(7);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("Test start");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        logger.info("End of test");
    }
	@Test
	public void testInt() {
		logger.info("test Int Constructor");
		Int value2 = new Int(9);
		assertEquals(9, value2.getValue());
		logger.info("Output the value of value2"+value2.getValue());
	}

	@Test
	public void testGetValue() {
		logger.info("test GetValue method");
		assertEquals(7, value1.getValue());
		logger.info("Output the value of value2"+value1.getValue());		
	}

	@Test
	public void testIsPrime() {
		logger.info("test isPrime method");
		assertEquals(true, value1.isPrime());
	}

	@Test
	public void testIsPrimeInt() {
		logger.info("test isPrimeInt method");
		assertEquals(false, value1.isPrime(8));
	}

	@Test
	public void testIsEven() {
		logger.info("test isEven method");
		assertEquals(false, value1.isEven());
	}

	@Test
	public void testIsEvenInt() {
		logger.info("test isEvenInt method");
		assertEquals(true, value1.isEven(12));
	}

	@Test
	public void testEqualsInt() {
		logger.info("test EqualsInt method");
		assertEquals(false, value1.equals(36));
	}

}
