package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static List<Country> readFileCSV() {
        List<Country> countryList = new ArrayList<>();
        File file = new File("src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\Country.java");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) { //readline tự nhảy xuống dòng?
                arr = line.split(",");
                Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countryList.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList = readFileCSV();
        System.out.println("List of countries");
        for (Country element : countryList) {
            System.out.println(element);
        }
    }
}
