/*Example Expected Output Here are some example interactions:

Winning Scenario:

Welcome to the Ultimate Adventure Game!
Your goal is to find the hidden treasure. Choose wisely!
You are at a crossroad. Do you want to go left or right?
Type 'left' or 'right': left
You walk down a dark path and find a mysterious cave.
Do you want to enter the cave or walk past it?
Type 'enter' or 'walk': enter
Inside the cave, you find a sleeping dragon!
Do you want to fight the dragon or sneak past it?
Type 'fight' or 'sneak': sneak
You sneak past the dragon and find the treasure behind it. You win!


Invalid Scenario:

Welcome to the Ultimate Adventure Game!
Your goal is to find the hidden treasure. Choose wisely!
You are at a crossroad. Do you want to go left or right?
Type 'left' or 'right': forward
Invalid choice. You got lost in the wilderness. Game over.


Final Solution: Check Only If Needed!

⚠️ ONLY CHECK THIS AFTER COMPLETING THE EXERCISE YOURSELF OR IF YOU ARE STUCK!*/

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("Your goal is to find the hidden treasure. Choose wisely!");

        System.out.println("You are at a crossroad. Do you want to go left or right?");
        System.out.print("Type 'left' or 'right': ");
        String choice1 = scanner.nextLine().toLowerCase();

        switch (choice1) {
            case "left":
                System.out.println("You walk down a dark path and find a mysterious cave.");
                System.out.println("Do you want to enter the cave or walk past it?");
                System.out.print("Type 'enter' or 'walk': ");
                String choice2 = scanner.nextLine().toLowerCase();

                switch (choice2) {
                    case "enter":
                        System.out.println("Inside the cave, you find a sleeping dragon!");
                        System.out.println("Do you want to fight the dragon or sneak past it?");
                        System.out.print("Type 'fight' or 'sneak': ");
                        String choice3 = scanner.nextLine().toLowerCase();

                        switch (choice3) {
                            case "fight":
                                System.out.println("You bravely fight the dragon and...");
                                System.out.println("You are victorious! The dragon guards the treasure. You win!");
                                break;
                            case "sneak":
                                System.out.println("You sneak past the dragon and find the treasure behind it. You win!");
                                break;
                            default:
                                System.out.println("Invalid choice. You got caught by the dragon and lost.");
                                break;
                        }
                        break;
                    case "walk":
                        System.out.println("You walk past the cave and fall into a hidden trap. Game over.");
                        break;
                    default:
                        System.out.println("Invalid choice. You got lost in the wilderness. Game over.");
                        break;
                }
                break;
            case "right":
                System.out.println("You walk through a dense forest and find a river.");
                System.out.println("Do you want to swim across or build a raft?");
                System.out.print("Type 'swim' or 'raft': ");
                String choice2b = scanner.nextLine().toLowerCase();

                switch (choice2b) {
                    case "swim":
                        System.out.println("You swim across the river and encounter a wild bear!");
                        System.out.println("Do you want to run away or climb a tree?");
                        System.out.print("Type 'run' or 'climb': ");
                        String choice3b = scanner.nextLine().toLowerCase();

                        switch (choice3b) {
                            case "run":
                                System.out.println("You run away safely and find a hidden path to the treasure. You win!");
                                break;
                            case "climb":
                                System.out.println("You climb the tree, but the bear waits for you. You are stuck. Game over.");
                                break;
                            default:
                                System.out.println("Invalid choice. The bear catches you. Game over.");
                                break;
                        }
                        break;
                    case "raft":
                        System.out.println("You build a raft and safely cross the river. You find the treasure on the other side. You win!");
                        break;
                    default:
                        System.out.println("Invalid choice. You got swept away by the river. Game over.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice. You got lost in the wilderness. Game over.");
                break;
        }

        scanner.close();
    }
}
