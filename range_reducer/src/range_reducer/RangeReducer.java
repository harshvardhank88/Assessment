package range_reducer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author harsh
 *
 *	Helper class to perform Zipcode range reducing process
 */
public class RangeReducer {

	//filtered range list
	List<ZipRange> filteredRangeList = new ArrayList<ZipRange>();
	
	//current Range from the filteredRangeList
	ZipRange currRange = new ZipRange() ;
	
	public List<ZipRange> filterRanges(List<ZipRange> rangeList){
		
		//if filteredRange is empty add the first element from the 
		//rangeList to filteredRangeList
		if(filteredRangeList.size()==0) {
			
			filteredRangeList.add(rangeList.get(0));
			currRange = rangeList.get(0);
		}
		


		// Iterate Range list
		for(int i=1; i<rangeList.size();i++) {
			
			ZipRange rng = rangeList.get(i);
			
			ZipRange filtrRng = currRange;
			
			// Crtieria for Filterining
			if((filtrRng.getLowerBound() < rng.getLowerBound()) && (rng.getLowerBound() < filtrRng.getUpperBound())) {
					
				filtrRng.setLowerBound(filtrRng.getLowerBound());
				filtrRng.setUpperBound(rng.getUpperBound());
				
			}else {
				
				filteredRangeList.add(rng);
				currRange = rng;
				
			}
			
		}	
		
		return filteredRangeList;
	}
	
	
}
