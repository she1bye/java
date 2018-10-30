package zut.edu.cs.network.experiment6;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.apache.log4j.*;

public class MyPointTest {

	private static Logger logger = Logger.getLogger(FanTest.class);
	MyPoint point1 = new MyPoint(0.5,0.5);
	

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("Test start");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        logger.info("End of test");
    }

	@Test
	public void testMyPointDoubleDouble() {
		MyPoint point2 = new MyPoint(1.2,0.5);
		logger.info("test MyPoint");
		assertEquals(1.2, point2.getX(),0.1);
		assertEquals(0.5, point2.getY(),0.1);
	}

	@Test
	public void testGetX() {
		assertEquals(0.5, point1.getX(),0.1);
	}

	@Test
	public void testGetY() {
		assertEquals(0.5, point1.getY(),0.1);
	}

	@Test
	public void testDistance() {
		MyPoint point3 = new MyPoint(1.5,1.5);
		MyPoint point4 = new MyPoint(2.5,2.5);
		logger.info(point3.distance(point3, point4));
		assertEquals(1.414, point3.distance(point3, point4),0.001);
	}

}
