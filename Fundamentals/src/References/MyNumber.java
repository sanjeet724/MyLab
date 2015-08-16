package References;

public class MyNumber {
	private int num;
	
	public MyNumber (int n) {
		num = n;
	}
	
	public String toString() {
		return "My Number is " + num;
	}
	
	// getters and setters
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int n) {
		this.num = n;
	}
}