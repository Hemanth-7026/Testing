import java.util.HashMap;
import java.util.Map;

public class Act11 {

    public static void main(String[] args) {
        Map<String, Integer> colours = new HashMap<>();

        colours.put("red", 1);
        colours.put("green", 2);
        colours.put("blue", 3);
        colours.put("orange", 4);
        colours.put("yellow", 5);

        System.out.println("The Colors are in key value pair:" +colours);
        colours.remove(2);
        boolean containsGreen = colours.containsValue("green");

        int size = colours.size();

        System.out.println(containsGreen);
        System.out.println(size);
    }
}