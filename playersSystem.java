import java.util.ArrayList;
import java.util.Scanner;

public class playersSystem {
        Scanner sc = new Scanner(System.in);
        void AddPlayers(ArrayList<String> Players, ArrayList<Integer> Scores) {
                String PlayerName;
                Integer Score;
                
                if (Players.size() < 10) {
                	    System.out.println("Enter the player Name");
                        PlayerName = sc.next();
                        Players.add(PlayerName);
              
                        System.out.println("Enter the player Score");
                        Score = sc.nextInt();
                        Scores.add(Score);
                        System.out.println("Player Added Succesfully!!");
                }
                else {
                        System.out.println("Already 10 Players are in List:");
                }
            }
        void GetByName(ArrayList<String> Players, ArrayList<Integer> Scores) {
                String PlayerName;
                System.out.println("Enter the player Name");
                PlayerName = sc.next();
                if (Players.contains(PlayerName)) {
                        int pos = Players.indexOf(PlayerName);
                        System.out.println(PlayerName + " " + Scores.get(pos));
                }
                else {
                        System.out.println("No such player exist in the list!!!");
                }
        }
        void DeletePlayers(ArrayList<String> Players, ArrayList<Integer> Scores) {
                String PlayerName;
                if (Players.size() == 0) {
                        System.out.println("List is Empty:");
                }
                else {
                        System.out.println("Enter Player name to delete Name and Score:");
                        PlayerName = sc.next();
                        int pos = Players.indexOf(PlayerName);
                        Players.remove(PlayerName);
                        Scores.remove(pos);
                        System.out.println("Name and Scores deleted from List!!");
                }
        }
        void DisplayPlayers(ArrayList<String> Players, ArrayList<Integer> Scores) {
                System.out.println("Players and their Scores are:");
                System.out.println(Players);
                System.out.println(Scores);

        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                javatask4 P = new javatask4();
                ArrayList<String> Players = new ArrayList<String>();
                ArrayList<Integer> Scores = new ArrayList<Integer>();
                Players.add("Rahul");
                Scores.add(270);
                Players.add("Sachin");
                Scores.add(200);
                Players.add("Sehwag");
                Scores.add(219);
                Players.add("Rohit");
                Scores.add(264);
                int x;
                System.out.println("Chhose Option from the List:");
                System.out.println();
                System.out.println("1.Add Players and Scores");
                System.out.println("2.Delete Players and Scores");
                System.out.println("3.Diplay Players and Scores");
                System.out.println("4.Get Player and Score by Name");
                x = sc.nextInt();

                switch (x) {
                case 1:
                        P.AddPlayers(Players, Scores);
                        break; 
                case 2:
                        P.DeletePlayers(Players, Scores);
                        break;
                case 3:
                        P.DisplayPlayers(Players, Scores);
                        break;
                case 4:
                        P.GetByName(Players, Scores);
                        break;
                default:
                        System.out.println("Enter correct value!!");
                }
        }

}