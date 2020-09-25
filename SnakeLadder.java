
public class SnakeLadder {
	
	public static final int END_POINT = 100;
public static void main(String[] args) {
	int StartPoint=0, counter=0; int position=StartPoint;
	System.out.println("YOUR POSITION AT THE START : "+ position);
	while(position!=END_POINT)
	{
		++counter;
	int getDice=(int)Math.floor(Math.random()*10);
	if(getDice>6)
		while(getDice>6)
		{
			getDice=(int)Math.floor(Math.random()*10);
	
		}
	position+=getDice;
	System.out.println("You Got:" +getDice);
	System.out.println("Your Position: "+ position);
		
	
	
	}
}
}
