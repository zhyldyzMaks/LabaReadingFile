package readingFile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class FileUtilsPractice {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("InputFile.txt");
        String fileContents = FileUtils.readFileToString(inputFile, Charset.forName("UTF-8"));
        System.out.println(fileContents);

        String[] words = StringUtils.split(fileContents);
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        int uniqueWordsCount = uniqueWords.size();
        File outputFile = new File("Output.txt");
        FileUtils.writeStringToFile(outputFile, String.valueOf(uniqueWordsCount), "UTF-8");
    }

}

