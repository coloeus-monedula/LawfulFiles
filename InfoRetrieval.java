import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * InfoRetrieval
 */
public class InfoRetrieval {
    static Map<String, Integer> input = new HashMap<String, Integer>();
    public static void main(String[] args) {
/*         File ffcuk= new File(".");
        System.out.print(ffcuk.getAbsolutePath()); */
        loadFile("../cs/home/sh318/Documents/cs1003-exercises/w04-2/ground_truth.csv");
    }

    public static void loadFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader("fileName"))) {
            System.out.println(reader.readLine());
            for (String line; (line = reader.readLine()) != null ; ){
                String[] lineArray = line.split("\u0009");
                input.put(lineArray[0], Integer.parseInt(lineArray[1]));

            }

            System.out.println(input);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("not found");
        }
    }



}