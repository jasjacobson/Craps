//Craps
import java.util.Random;
public class Craps {
	public static void main(String args[]){
		Random rndm = new Random();
			//LOOP
		int i;
		for(i=0; i<=1000; i++){
			int x = 1 + rndm.nextInt(6);
			System.out.print("You rolled " + x + " + ");
			int y = 1 + rndm.nextInt(6);
			System.out.print(y + " = ");
			//natural
			int sum = x + y;
			System.out.println(sum);
			if (sum==7||sum==11){
				System.out.println("you win!");
				break;
			}
			//craps
		    else if (sum==2||sum==3||sum==12){
		    System.out.println("you lose!");
		    break;
		    }
             //point established
		    else {
			System.out.println("\nA point has been established!!\n");
		        //Second LOOP
		        int j;
		        for(j=0;j<100;j++){
		            int a = 1 + rndm.nextInt(6);
			        System.out.print("You rolled " + a + " + ");
			        int b = 1 + rndm.nextInt(6);
			        System.out.print(b + " = ");
				int newSum = a + b;
			        System.out.println(newSum);
				if
			        (newSum==7){
				    System.out.println("you lose!");
				    break;
			        }
			        else if (newSum==sum){
			            System.out.println("you win!");
				        break;
			        }
			     }
			 break;
		    }
		}
	}
}
