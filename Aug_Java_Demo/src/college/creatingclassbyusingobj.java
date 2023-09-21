package college;

public class creatingclassbyusingobj {
	
	public void playMusic() 
	{
		System.out.println("x: play music");
	}
	public String getMeApen(int cost)
	{
		if(cost>=60) 
		return "pen";
		else
			return "nothing";
		
		
	}
	public static void main(String[] args)
	{
		creatingclassbyusingobj obj= new creatingclassbyusingobj();
		obj.playMusic();
		String str=obj.getMeApen(10);
		System.out.println(str);
	}

}
