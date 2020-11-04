package range_reducer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestZipCodeUtils {

	@Test
	public void testfilterRanges() {
		List<ZipRange> rangeList = new ArrayList<ZipRange>();
		ZipRange r1 = new ZipRange();
		r1.setLowerBound(94133);
		r1.setUpperBound(94133);
		
		ZipRange r2 = new ZipRange();
		r2.setLowerBound(94200);
		r2.setUpperBound(94299);
		
		ZipRange r3 = new ZipRange();
		r3.setLowerBound(94226);
		r3.setUpperBound(94399);
		
		rangeList.add(r1);
		rangeList.add(r2);
		rangeList.add(r3);
		
		ZipcodeUtils ziputil = new ZipcodeUtils();
		List<ZipRange> filteredList = ziputil.filterRanges(rangeList);
		
		assertEquals(2, filteredList.size());
		
	}
	
}
