package readingFile;

import java.io.*;

public class FileReadingPractice {

    public static void main(String[] args) throws IOException {
        File file = new File("InputFile.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }
        finally {
            if (br != null)
                br.close();
            if (fr != null)
                fr.close();
        }
    }
}
