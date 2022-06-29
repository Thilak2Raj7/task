package DesignBoard;

import java.util.Scanner;

public class Board {
	Scanner scan=new Scanner(System.in);
	PlayGame obj=new PlayGame();
public void getPosition()
{
	
	System.out.println("Enter the position of the coin");
	String coin=scan.nextLine();
	obj.getPosition(coin);
	
}
public  void rookPosition() {
obj.rookPosition("d3");
	
}
public  void bishopPosition() {
obj.bishopPosition("d3");
	
}
public static void main(String[] args)
{
Board board=new Board();
int play=0;

Scanner scan=new Scanner(System.in);
try {
	System.out.println("Enter the opertion to perform");
    play=scan.nextInt();
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}



switch(play)
{
case 1:
    board.getPosition();
	break;
case 2:
	board.rookPosition();
	break;
case 3:
	board.bishopPosition();
	break;
}
	
	
}


}