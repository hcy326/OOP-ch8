class CTest{
	void test(int x) {
		if (x%2==1) {
			System.out.println("计计");
		}
		else if (x==0) {
			System.out.println("计 0");
		}
		else {
			System.out.println("计案计");
		}
	}
}
public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest t=new CTest();
		t.test(3);
		t.test(8);
		t.test(0);
	}

}
