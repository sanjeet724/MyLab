package References;

class Driver {
	public static void main(String[] args) {
		MyNumber x = new MyNumber(9);
		System.out.println (x);
		MyNumber p = changeNumber(x);
		System.out.println (p);
		x.setNum(7);
		System.out.println (x);
	}
	
	public static MyNumber changeNumber( MyNumber n){
		n = new MyNumber(5);
		return n;	
	}
}
