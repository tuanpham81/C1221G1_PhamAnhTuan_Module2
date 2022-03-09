package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void copyFile() throws IOException {
        File file = new File("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\source.txt");
        BufferedReader bufferedReader = null;
        File targetFile =new File("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\destination.txt");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        CopyFile.copyFile();
    }
}
