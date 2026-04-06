import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================\n");

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Initial Train Consist: ");
        list.add("Engine");
        list.add("Sleeper");
        list.add("AC");
        list.add("Cargo");
        list.add("Guard");
        System.out.println(list);
        System.out.println();
        System.out.println("After Inserting 'Pantry Car' at position 2: ");
        list.add(2,"Pantry Car");
        System.out.println(list);
        System.out.println();
        System.out.println("After removing First and Last Bogie: ");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println();
        System.out.println("UC4 ordered consist operations completed...");
    }
}

