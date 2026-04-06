import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("===================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=================================\n");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("After Adding Bogies: ");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");
        System.out.println("Passenger Bogies: " +trainConsist);
        System.out.println();
        System.out.println("After removing AC Chair: ");
        trainConsist.remove("AC Chair");
        System.out.println("Passenger Bogies: " +trainConsist);
        System.out.println();
        System.out.println("Checking if 'Sleeper' exists: ");
        System.out.println("Contains Sleeper?: " +trainConsist.contains("Sleeper"));
        System.out.println();
        System.out.println("Final Train Passenger Consist: ");
        System.out.println(trainConsist);
        System.out.println();
        System.out.println("UC2 Operations completed successfully.");
    }
}


