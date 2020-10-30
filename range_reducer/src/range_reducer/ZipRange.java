package range_reducer;

public class ZipRange {

	private int upperBound;
	private int lowerBound;
	
	public int getUpperBound() {
		return upperBound;
	}
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	public int getLowerBound() {
		return lowerBound;
	}
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
		
	@Override
	public String toString() {
		return this.lowerBound + ","+ this.upperBound;
	}
	
}
