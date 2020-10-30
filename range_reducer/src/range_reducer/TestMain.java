package range_reducer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestMain {

	@Test
	public void teststartProcess() {
		String inputString1 = "[94133,94133] [94200,94299] [94600,94699]";
		String expectedOutput1 = "[94133,94133] [94200,94299] [94600,94699]";
		Main main = new Main();
		try {
			assertEquals(expectedOutput1,main.startProcess(inputString1));
		} catch (Exception e) {
			fail("Test Case Failed ");
			e.printStackTrace();
		}
		
		String inputString2 = "[94133,94133] [94200,94299] [94226,94399]";
		String expectedOutput2 = "[94133,94133] [94200,94399]";
		try {
			assertEquals(expectedOutput2,main.startProcess(inputString2));
		} catch (Exception e) {
			fail("Test Case Failed ");
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testformatOutput(){
		List<ZipRange> rangeList = new ArrayList<ZipRange>();
		ZipRange r1 = new ZipRange();
		r1.setLowerBound(500);
		r1.setUpperBound(1000);
		
		ZipRange r2 = new ZipRange();
		r2.setLowerBound(1500);
		r2.setUpperBound(2000);
		
		rangeList.add(r1);
		rangeList.add(r2);
		
		Main m = new Main();
		String outputString = m.formatOutput(rangeList);
		assertEquals("[500,1000] [1500,2000]", outputString);
	}

}
