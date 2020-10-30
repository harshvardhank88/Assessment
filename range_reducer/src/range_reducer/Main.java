package range_reducer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author harsh
 * 
 * Main class that performs the filter process
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter Input String : ");
		
		Scanner sc = new Scanner(System.in);
		
		//Read the input from cmd prompt
		String inputString = sc.nextLine(); 
				
		sc.close();
				
		Main main = new Main();
		main.startProcess(inputString);
		
		
	}

	
	private void validateInput(String inputString) throws Exception{
		if(inputString.isEmpty()) {
			throw new Exception("Input cannot be empty");
		}
	}
	
	public String startProcess(String inputString) throws Exception {
		
		validateInput(inputString);
		
		String[] arr = inputString.split(" ");
				
		List<ZipRange> list = new ArrayList<>();
		
		// Populate ZipRange object from received input
		for(int i=0;i<arr.length;i++) {
			String s = arr[i];
			String[] str = s.split(",");
			ZipRange z = new ZipRange();
			z.setLowerBound(Integer.parseInt(str[0].substring(1)));
			z.setUpperBound(Integer.parseInt(str[1].substring(0,str[1].length()-1)));
			list.add(z);
		}

		//Add Ranges to the list
		RangeReducer rr = new RangeReducer();
		
		//Filter Ranges
		List<ZipRange> filteredRanges = rr.filterRanges(list);
		
		//Print the filtered output
		System.out.print("Output : ");	
		
		String outputString = formatOutput(filteredRanges);		
		
		System.out.println(outputString);
		
		return outputString;
	}
	
	
	public String formatOutput(List<ZipRange> filteredRanges){
		StringBuffer outputString = new StringBuffer("");
		for(int i=0; i<filteredRanges.size();i++) {
			outputString.append("[");
			outputString.append(filteredRanges.get(i).toString());
			outputString.append("]");
			if(i<filteredRanges.size()-1) {
				outputString.append(" ");
			}
		
		}
		return outputString.toString();
	}
	
	

}
