class CCircle {
	double pi=3.14;
	
	void area (double r) {
		System.out.println("area(2)="+pi*r*r);
	}
	void area (float r) {
		System.out.println("area(2.2f)="+pi*r*r);
	}
	void area (int r) {
		System.out.println("area(2.2)="+pi*r*r);
	}

}
public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CCircle obj=new CCircle();
		obj.area(2);
		obj.area(2.2f);
		obj.area(2.2);
	}

}
