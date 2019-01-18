// Clear screen, text art, delay, 
import java.io.*;
public class Game2
{ public static void main(String[] args) throws IOException
  { InputStreamReader reader = new InputStreamReader(System.in);
  BufferedReader input = new BufferedReader(reader);
  int hp = 100;
  for (int i = 0; i < 2; i++)
  { System.out.println(" ");
  } 
System.out.println("  ____   ____  _____  _____  _    _  ____     _____  _   _  ____  ____  _____");
 System.out.println(" |  _ \\ | ___||  _  ||_   _|| |__| || ___|   |  _  || | | || ___|| ___||_   _|");
 System.out.println(" | |_| || __| | |_| |  | |  |  __  ||___ |   | |_| || |_| || __| |___ |  | |");
 System.out.println(" |____/ |____||_| |_|  |_|  |_|  |_||____|   |____\\||_____||____||____|  |_|");
System.out.println(" ");
System.out.println("                        A GAME BY ERWIN M. AND MARK C."); 
System.out.println("");
System.out.println("");
 System.out.println("                         _____");
 System.out.println("                        |     |");
 System.out.println("                        |     |");
 System.out.println("            ____________|     |______________________________________");
 System.out.println("           /               _                                         \\");
 System.out.println("          |   X X X X     {_}            __________________           >  ");
 System.out.println("           \\____________       ______________________________________/");
 System.out.println("                        |     |");
 System.out.println("                        |     |");
 System.out.println("                        |_____|");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("\t\t         < Best played when maximized >");
 try {
  Thread.sleep(7200);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
} // Clearing the console
  for(int clear = 0; clear <50; clear++) {
	  System.out.println("\b");
}
System.out.println("Backstory:");
  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("You are a hero, named Antony, of a small village called Gortstrolm.");
  try {
  Thread.sleep(4200);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("Your beloved pet dog has been taken by an evil dragon. Get him back!");
  try {
  Thread.sleep(4000);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("One problem:");
  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
	System.out.print("You only have 100 health points. Good luck!");
  try {
  Thread.sleep(2250);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
	  for (int i = 0; i < 35; i++)
  { System.out.println(" ");
  } 
    for (int i = 0; i < 18; i++)
  { System.out.println(" ");
  } 
// FIRST SCENARIO - BRIDGE 
  System.out.println("You are stopped by an old bridge that can collapse");
    try {
  Thread.sleep(2300);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
	System.out.print("at any moment. You have three options and 100 hp.");
	System.out.println("");
	  try {
  Thread.sleep(2500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
	System.out.println("");
System.out.println("1) Go to the forest and build a plane");
System.out.println("2) Walk over the bridge");
System.out.println("3) Go the long way around");
	  try {
  Thread.sleep(3000);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
	System.out.println("");
System.out.println("What will you do?");
String answer1 = input.readLine();
int answer = Integer.parseInt(answer1);
System.out.println("");
	  try {
  Thread.sleep(2500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
switch (answer)
{ case 3:
System.out.println("You sprained your ankle badly but get out alive. -75 hp.");
hp -= 75;
break;
case 2:
System.out.println("You cross safely and carry forward.");
break;
case 1:
System.out.println("Your plane crashed and you died. -100 hp.");
hp -= 100;
if (hp <= 0)
System.exit(0);
break;
default:
System.out.println("Invalid. Stopping game.");
hp -= 100;
if (hp <= 0)
System.exit(0);
}
	  try {
  Thread.sleep(5000);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
		  for (int i = 0; i < 35; i++)
  { System.out.println(" ");
  } 
    for (int i = 0; i < 18; i++)
  { System.out.println(" ");
  }
System.out.println("You successfully cross the bridge and are greeted by a merchant.");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("He offers to give you any free item you wish.");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}System.out.println("Your options are: ");
System.out.println("");
System.out.println("1) Refuse to take anything");
System.out.println("2) Mystery Box");
System.out.println("3) Golden Apple");
System.out.println("");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("What will you decide to take? Your health is at " + hp);
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
String answer2 = input.readLine();
int answer2nd = Integer.parseInt(answer2);
System.out.println("");
	  try {
  Thread.sleep(2500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
switch (answer2nd)
{ case 3:
System.out.println("You take the golden apple and it gives you additional 25hp.");
hp += 25;
break;
case 2:
System.out.println("A snake comes out and bites you on the neck. -100hp");
System.exit(0);
break;
case 1:
System.out.println("The merchant gets mad and fights you. You come victorious but lose 25 hp.");
hp -= 25;
if (hp <= 0) System.out.println("You died. Game over.");
System.exit(0);
break;
default:
System.out.println("Invalid. Stopping game.");
hp -= 700;
if (hp <= 0)
System.exit(0);
}
	  try {
  Thread.sleep(5000);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
		  for (int i = 0; i < 35; i++)
  { System.out.println(" ");
  } 
    for (int i = 0; i < 18; i++)
  { System.out.println(" ");
  }
System.out.println("Night comes and the temperature is dropping.");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("You are stranded in the woods with just your homemade tent.");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("There is a lone house with no lights in the distance.");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("What will you do?");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("");
System.out.println("1) Knock on the door and hope for the best");
System.out.println("2) Sleep in your tent, regardless");
System.out.println("3) Break down the door of the house and pillage it");
  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("What will you decide to do? Your health is at " + hp);
System.out.println("  ");
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
String answer3 = input.readLine();
int answer3rd = Integer.parseInt(answer3);
System.out.println("");
	  try {
  Thread.sleep(2500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
switch (answer3rd)
{ case 1:
System.out.println("The owner lets you in with open arms and boosts your health!");
if (hp < 100) hp = 100;
else hp = 125;
System.out.print(" Your hp is " + hp);
break;
case 2:
System.out.println("You get through the night, but with mild frostbite. -15hp");
hp -= 15;
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
if (hp <= 0)
System.exit(0);
break;
case 3:
System.out.println("The owner of the house was home and defends it. You come victorious but lose 75 hp.");
hp -= 75;
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
if (hp <= 0) System.out.println("You died. Game over.");
System.exit(0);
break;
default:
System.out.println("Invalid. Stopping game.");
hp -= 700;
if (hp <= 0)
System.exit(0);
}
	  try {
  Thread.sleep(5000);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
		  for (int i = 0; i < 35; i++)
  { System.out.println(" ");
  } 
    for (int i = 0; i < 18; i++)
  { System.out.println(" ");
  }
    try {
  Thread.sleep(5000);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
		  for (int i = 0; i < 35; i++)
  { System.out.println(" ");
  } 
    for (int i = 0; i < 18; i++)
  { System.out.println(" ");
  }
System.out.println("You wake up next morning and continue your journey.");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("On your way you get attack by a wild dog!");
System.out.println("");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("Your options are:");
	  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("  ");
System.out.println("1) Fight the dog");
System.out.println("2) Run away from the dog");
System.out.println("3) Try to befriend the dog");
  try {
  Thread.sleep(1500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
System.out.println("What will you decide to do? Your health is at " + hp);
System.out.println("  ");
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
String answer4 = input.readLine();
int answer4th = Integer.parseInt(answer4);
System.out.println("");
	  try {
  Thread.sleep(2500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
switch (answer4th)
{ case 1:
System.out.println("You fight the dog and win, but you got bitten a few times. - 25hp");
hp -= 25;
System.out.print(" Your hp is " + hp);
if (hp <= 0)
System.exit(0);
break;
case 2:
System.out.println("The dog gets tired of chasing you and falls asleep.");
System.out.print(" Your hp is " + hp);
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
break;
case 3:
System.out.println("You try to befriend the dog and he bites you, so you fight back. - 40hp");
hp -= 40;
System.out.print(" Your hp is " + hp);
if (hp <= 0)
System.exit(0);
	  try {
  Thread.sleep(500);
}catch(InterruptedException ex) {
	Thread.currentThread().interrupt();
	}
if (hp <= 0) System.out.println("You died. Game over.");
System.exit(0);
break;
default:
System.out.println("Invalid. Stopping game.");
hp -= 700;
if (hp <= 0)
System.exit(0);
}





}
}


