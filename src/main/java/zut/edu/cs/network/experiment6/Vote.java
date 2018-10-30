package zut.edu.cs.network.experiment6;

public class Vote {
	private int count = 0;

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void increment() {
		count += 1;
	}
	
	public void decrement() {
		count -= 1;
	}
	
	public void clear() {
		count = 0;
	}
}
