package zut.edu.cs.network.experiment6;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.apache.log4j.*;


public class CandidateTest {

	private static Logger logger = Logger.getLogger(FanTest.class);
	Vote vt = new Vote();	
	Candidate cd = new Candidate("zhang",vt);		

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("Test start");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
       logger.info("End of test");
    }

	@Test
	public void testCandidateStringVote() {		
		logger.info("test Candidate");
		assertEquals("zhang", cd.getName());
		assetrEquals(vt,cd.getVote());
	}

	private void assetrEquals(Vote vt2, Vote vote) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testGetName() {
		logger.info("test getName");
		assertEquals("zhang", cd.getName());
	}

	@Test
	public void testGetVote() {
		Vote vt1 = new Vote();
		Candidate cd = new Candidate("wang",vt1);	
		logger.info("test getVote");
		assertEquals(vt1, cd.getVote());
	}

	@Test
	public void testGetNumberOfCandidates() {
		logger.info("getNumberOfCandidates");
		cd.setNumberOfCandidates(3);
		assertEquals(3, cd.getNumberOfCandidates());
	}

	@Test
	public void testGetCount() {
		logger.info("test getCount");
		vt.increment();
		assetrEquals(1, vt.getCount());
	}

	private void assetrEquals(int i, int count) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testIncrement() {
		logger.info("test increment");
		vt.increment();
		vt.increment();
		assetrEquals(2, vt.getCount());
	}

	@Test
	public void testDecrement() {
		logger.info("test decrement");
		vt.increment();
		vt.increment();
		vt.decrement();
		assetrEquals(1, vt.getCount());
	}

	@Test
	public void testClear() {
		logger.info("test clear");
		vt.increment();
		vt.clear();
		assetrEquals(0, vt.getCount());
	}

}
