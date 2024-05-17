import java.io.*;

/**
 *
 * @author mhmdsatria
 */

public class FileMerge {

    public static void main(String[] args) {
        String[] files = {"C:\\Users\\komputer 28\\Desktop\\tile\\Satria\\file1.txt", "C:\\Users\\komputer 28\\Desktop\\tile\\Satria\\file2.txt"};
        String mergedFile = "C:\\Users\\komputer 28\\Desktop\\tile\\Satria\\merge.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
