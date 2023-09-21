package college;

public class trycatchMethod {
	public static void main(String[] args) {
		try {
			int[] mynumber= {1,2,36,6,9,9,3,6,6,5,5};
			System.out.println(mynumber[11]);
		}catch(Exception e) {
			System.out.println("something went wrong");
			}finally{
				System.out.println("this 'try and catch ' are finished");
			}
	}

}
