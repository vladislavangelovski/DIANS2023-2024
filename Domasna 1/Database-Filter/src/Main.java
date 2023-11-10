import java.io.*;


public class Main {
    public static void main(String[] args) {
        String inputFile = "./src/resources/startMap.csv";
        String outputFile = "./src/resources/finalMap.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            Pipe<String> pipe = new Pipe<>();
            int[] selectedColumnIndices = {0, 1, 2, 7, 15};
            AttributesFilter attributesFilter = new AttributesFilter(selectedColumnIndices);
            RemoveNullNamesFilter removeNullNamesFilter = new RemoveNullNamesFilter();
            pipe.addFilter(attributesFilter);
            pipe.addFilter(removeNullNamesFilter);
            String line;
            while ((line = reader.readLine()) != null) {
                String filteredLine = pipe.runFilter(line);
                if(filteredLine != null)
                {
                    writer.write(filteredLine);
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}