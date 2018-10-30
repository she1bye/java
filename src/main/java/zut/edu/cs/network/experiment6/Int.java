package zut.edu.cs.network.experiment6;

/**
*
* @author ’≈Ã⁄ª‘
* Int¿‡
*/

public class Int {
	private int value;
	
	
	public Int(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isPrime() {
		boolean flag = true;
		if(value < 2) {
			return false;
		}
		else {
			for(int i = 2; i <= Math.sqrt(value); i++) {
				if(value % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public boolean isPrime(int value ) {
		boolean flag = true;
		if(value < 2) {
			return false;
		}
		else {
			for(int i = 2; i <= Math.sqrt(value); i++) {
				if(value % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public boolean isEven() {
		boolean flag = false;
		if((value & 1) != 1) {
			flag = true;		
		}
		return flag;
	}
	
	public boolean isEven(int value) {
		boolean flag = false;
		if((value & 1) != 1) {
			flag = true;		
		}
		return flag;
	}
	
	public boolean equals(int anotherValue) {
		if(anotherValue == value)
			return true;
		else
			return false;
	}
}
