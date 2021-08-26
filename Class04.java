import java.util.Scanner;

class CBox{
	int length;
	int width;
	int height;
}
public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);  
		CBox box;
	    box=new CBox();
	    box.length=sc.nextInt();
	    box.width=sc.nextInt();
	    box.height=sc.nextInt();
	    System.out.println("length= "+box.length);
	    System.out.println("width= "+box.width);
	    System.out.println("height= "+box.height);
	}

}
