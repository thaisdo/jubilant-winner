import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleETL {
    public static void main(String[] args) {
        String inputPath = "../data/input.csv";
        String outputPath = "../output/output.csv";

        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputPath));
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(outputPath))) {
        
            String header = br.readLine();
            bw.write(header + "\n");

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    parts[1] = parts[1].toUpperCase();
                    bw.write(String.join(",", parts) + "\n");
                }
            }
            System.out.println("ETL finalizado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}