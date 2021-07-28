package Test;

public class LadderSnake 
{

		public static void main(String[] args){
			int count1 = 0;
			int count = 0;
		    int Player1 = 0;
		    int Player2 = 0;
		  while((Player1<=99)&&(Player2<=99)) 
		  {
			//System.out.println("Player1 is " + Player1);
			int Die1=(int) (Math.random() * 10) % 6+1;
			int Die2=(int) (Math.random() * 10) % 6+1;
				count =(count + 1);
				count1 =(count1 + 1);
				System.out.println("Die1 value is " +Die1);
				System.out.println("Die2 value is " +Die2);
			int type=(int) (Math.random() * 10) % 3+1;
			int type1=(int) (Math.random() * 10) % 3+1;
			//System.out.println("case number is " + type);
			 switch(type) {
			   case 1:
			   System.out.println( "No Play You are in the same Player1" );
			   break;
			  
			   case 2:
			   Player1 = (Player1 + Die1);
			   if(Player1>100){
				   Player1 = (Player1 - Die1);
				   continue;
			   }
			   System.out.println( "After ladder Player1 is at :" + Player1 );
			   break;
			   
			   case 3: 
			   Player1 = (Player1 - Die1);
			  
			  if(Player1<0){
				  Player1 = 0;
			  }
				 System.out.println( "After snake Player1 is at :" + Player1 );
			   break;
			   }
			   //2nd player
			  switch(type1) {
			   case 1:
			   System.out.println( "No Play You are in the same Player2" );
			   break;
			  
			   case 2:
			   Player2 = (Player2 + Die2);
			   if(Player2>100){
				   Player2 = (Player2 - Die2);
				   continue;
			   }
			   System.out.println( "After ladder Player2 is at :" + Player2 );
			   break;
			   
			   case 3: 
			   Player2 = (Player2 - Die2);
			  
			  if(Player2<0){
				  Player2 = 0;
			  }
				 System.out.println( "After snake Player2 is at :" + Player2 );
			   break;
			   }
			  
			    }
				
				if(Player1 == 100){
				System.out.println( "Player 1 is the Winner!");
				System.out.println( "Die play number " + count );
				}
					else{
						System.out.println( "Player 2 is the Winner!" );
						System.out.println( "Die play number " + count1 );
				}
				System.out.println( "Die Total play number is " + (count1+count));
				}
			     }

