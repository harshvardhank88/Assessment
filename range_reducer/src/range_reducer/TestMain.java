package range_reducer;


/**
 * @author harsh
 * 
 * Test class with three input test cases
 *
 */
public class TestMain {
	
	public static void main(String[] args) throws Exception {
		
		String inputString1 = "[10,15] [14,20]";
		String inputString2 = "[94133,94133] [94200,94299] [94600,94699]";
		String inputString3 = "[94133,94133] [94200,94299] [94226,94399]";
		Main main = new Main();
		main.startProcess(inputString1);
		System.out.println();
		main.startProcess(inputString2);
		System.out.println();
		main.startProcess(inputString3);
		System.out.println();
		
				
				
		

		
	}

}
