package test;

import dbAccess.ComputeParkingFee;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComputeParkingFeeTest extends TestCase {
	
	private ComputeParkingFee obj;
	private String time;
	private double ParkingTime;
	
	
@Before
	protected void setUp() throws Exception {
		obj=new ComputeParkingFee();
		time="30";
		ParkingTime=Double.parseDouble(time);	
	}

@After
	protected void tearDown() throws Exception {
		obj=null;
	}

	public void testComputeParkingFee() {
		fail("Not yet implemented");
	}

	public void testCalculateFee() {
		fail("Not yet implemented");
	}

	public void testComputeParkingtime() {
		fail("Not yet implemented");
	}

	public void testSetBaseRate() {
		fail("Not yet implemented");
	}

}
