class CSphere{
	private int x;
	private int y;
	private int z;
	private int radius;
	private double pi=3.14;
	void setLocation(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}
    void setRadius(int d) {
		radius=d;
	}
	 double surfaceArea() {
		return 4*pi*radius*radius;
	}
	 double volume() {
		return (4/3)*pi*radius*radius;
	}
	 void showCenter(){
		 System.out.println("x:"+x+",y:"+y+",z:"+z);
	 }
}
public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere obj=new CSphere();
		obj.setLocation(3,4,5);
		obj.setRadius(1);
		System.out.println("surfaceArea:"+obj.surfaceArea());
		System.out.println("volume:"+obj.volume());
		obj.showCenter();
	}

}
