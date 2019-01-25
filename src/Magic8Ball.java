import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    static Scanner keyboard = new Scanner(System.in);
    static ArrayList<String> magicResponse=new ArrayList<String>();

    public static void main(String[] args) {

             String userResponse="";

                do {
                    System.out.println("Ask your question to the magic ball:");
                    String input = keyboard.nextLine();
                    System.out.println("You asked: " + input+"/n");
                    int index =getRandom();
                    String randomChoice=responses().get(index);
                    System.out.println("MAGIC 8-BALL SAYS: " + randomChoice);
                    System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
                    userResponse=keyboard.next();
                    keyboard.nextLine();
                }while(!userResponse.equalsIgnoreCase("n"));

            }
            public static ArrayList<String>responses(){
                magicResponse.add("It is certain");
                magicResponse.add("It is decidedly so");
                magicResponse.add("Without a doubt");
                magicResponse.add("Yes definitely");
                magicResponse.add("You may rely on it");
                magicResponse.add("As I see it, yes");
                magicResponse.add("Most likely");
                magicResponse.add("Outlook good");
                magicResponse.add("Yes");
                magicResponse.add("Signs point to yes");
                magicResponse.add("Reply hazy try again");
                magicResponse.add("Ask again later");
                magicResponse.add("Better not tell you now");
                magicResponse.add("Cannot predict now");
                magicResponse.add("Concentrate and ask again");
                magicResponse.add("Don't count on it");
                magicResponse.add("My reply is no");
                magicResponse.add("My sources say no");
                magicResponse.add("Outlook not so good");
                magicResponse.add("Very doubtful");
                return magicResponse;
            }
            public static int getRandom(){
                Random rand = new Random();
                int index = rand.nextInt(magicResponse.size()+1);
                return index;
            }

        }



