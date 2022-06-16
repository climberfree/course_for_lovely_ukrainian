package borodinOleh.hw2;

import java.io.FileReader;
import java.io.IOException;

class ReadFile {
    public static void readTxtFile(String fileName) {

        try {

            FileReader tfr = new FileReader(fileName);
            char[] buffer = new char[8096];

            int chars = tfr.read(buffer);

            while (chars != -1) {
                System.out.println(String.valueOf(buffer, 0, chars));
                chars = tfr.read(buffer);
            }

            tfr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

