import java.util.Scanner;
class ChairIsAnObject{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rolls = "";

        System.out.print("You are about to create a chair.\nHow many legs does your chair have: ");
        int numOfLegs = input.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        boolean rolling = input.nextBoolean();
        input.nextLine();
        System.out.print("What is your chair made of: ");
        String material = input.nextLine();

        chair ch = new chair(numOfLegs, rolling, material);

        if(!ch.rolling){
            rolls = "not ";
        }

        System.out.println("Your chair has " + ch.numOfLegs + ", is " + rolls + "rolling, and is made of " + ch.material + ".");
    }
}