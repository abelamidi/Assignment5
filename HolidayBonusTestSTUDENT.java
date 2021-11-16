import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HolidayBonusTestSTUDENT {
	
	private double[][] dataSetSTUDENT = {{1.1, 2.2}, {5.5, 7.7}, {8.8, 9.9}};

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

		@Test
		public void testCalculateHolidayBonus() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT,6000,2000,3000);
			assertEquals(4000.0,result[0],.001);
			assertEquals(6000.0,result[1],.001);
			assertEquals(12000.0,result[2],.001);
					}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}
	@Test
	public void testCalculateTotalHolidayBonus() {
		assertEquals(22000.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT, 6000, 2000, 3000),.001);
	
	}

}
