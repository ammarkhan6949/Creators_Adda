//Rock , Paper and Scissor Game 
import java.util.Random;
import java.util.Scanner; 

class Task4{ 
    public static void main(String args[]) 
    { 
        String[] rps={"rock","paper","scissor"};  
        Scanner sc=new Scanner(System.in); 
        String playerMove;
        while(true){
        String computerMove=rps[new Random().nextInt(rps.length)]; 
        while (true) {  
            System.out.println("Enter either rock or paper or scissor : ");
            playerMove=sc.nextLine(); 
            if(playerMove.equals("rock")|| playerMove.equals("paper")||playerMove.equals("scissor")){ 
                break;
            } 
            System.out.println("Enter the valid option");
        } 
        System.out.println("computerMove : "+computerMove); 
        if(playerMove.equals(computerMove)){ 
            System.out.println("You are tied");
        } 
        else if(playerMove.equals("rock")){ 
            if(computerMove.equals("paper")){ 
                System.out.println("You are lose");
            } 
            else if(computerMove.equals("scissor")){ 
                System.out.println("You are won");
            }
        } 
        else if(playerMove.equals("paper")){ 
            if(computerMove.equals("rock")) { 
                System.out.println("You are won");
            } 
            else if(computerMove.equals("scissor")){ 
                System.out.println("You are loss");
            }
        } 
        else if(playerMove.equals("scissor")){ 
            if(computerMove.equals("paper")){ 
                System.out.println("You are won");
            } 
            else if(computerMove.equals("rock")){ 
                System.out.println("You are lose");
            }
        } 
        System.out.println("Enter y/n to play the game: "); 
        String a=sc.nextLine(); 
        if(!a.equals("y")){ 
            break;
        }
    }
}
}
