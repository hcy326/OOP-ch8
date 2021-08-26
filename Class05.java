class CBox{
	int length=1;
	int width=1;
	int height=1;
	void showDate() {
		System.out.println("showDate:length="+length+",width="+width+",height="+height);
	}
	void showAll() {
		System.out.println("showAll:length="+length+",width="+width+",height="+height+",surfaceArea ="+length*width*6+",volume ="+length*width*height);
		}
}
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox showDate,showAll;
		showDate=new CBox();
	    showAll=new CBox();
	    showDate.showDate();
	    showAll.showAll();
	}

}