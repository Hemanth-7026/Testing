import java.util.ArrayList;

public class Act9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Hemanth");
        myList.add("Karthik");
        myList.add("Raghu");
        myList.add("Anil");
        myList.add("Varma");

        for (String name : myList) {
            System.out.println(name);
        }
        String thirdName = myList.get(2);
        System.out.println(thirdName);

        boolean containsName = myList.contains("Varma");
        System.out.println(containsName);
        int size = myList.size();
        System.out.println(size);

        myList.remove("Hemanth");
        size = myList.size();
        System.out.println(size);
    }
}