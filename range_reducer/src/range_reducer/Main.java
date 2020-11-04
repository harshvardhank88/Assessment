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

	public static void main(String[] args) throws IncorrectInputFormatException {
		
		System.out.println("Enter Input String : ");
		
		Scanner sc = new Scanner(System.in);
		
		//Read the input from cmd prompt
		String inputString = sc.nextLine(); 
				
		sc.close();
				
		Main main = new Main();
		main.startProcess(inputString);
		
		
	}


	
	public String startProcess(String inputString) throws IncorrectInputFormatException {
		
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
		ZipcodeUtils ziputil = new ZipcodeUtils();
		
		//Filter Ranges
		List<ZipRange> filteredRanges = ziputil.filterRanges(list);
		
		//Print the filtered output
		System.out.print("Output : ");	
		
		String outputString = formatOutput(filteredRanges);		
		
		System.out.println(outputString);
		
		return outputString;
	}
	
	
	
	private void validateInput(String inputString) throws IncorrectInputFormatException{
		if(inputString.isEmpty()) {
			throw new IncorrectInputFormatException("Input cannot be empty");
		}
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
