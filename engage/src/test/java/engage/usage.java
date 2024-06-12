package engage;

import java.awt.Robot;
import java.util.Random;

public class usage {
	
	public static final int SIX_SECONDS = 60000;
	public static final int MAX_Y = 400;
	public static final int MAX_Y1 = 400;
	
	public static void main(String... args) throws Exception {
		Robot robot = new Robot();
		
		Random random = new Random();
		int i = 0;
		while(i<=900) {
			robot.mouseMove(random.nextInt(MAX_Y1), random.nextInt(MAX_Y));
			Thread.sleep(SIX_SECONDS);
			System.out.println(i);
			i++;
			
		}
	}
}