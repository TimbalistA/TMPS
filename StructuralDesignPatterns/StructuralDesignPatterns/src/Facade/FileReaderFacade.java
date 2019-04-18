package Facade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFacade {
    String readFile(String fileName) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while ((i = bufferedReader.read()) != -1){
            stringBuilder.append((char)i);
        }
        return stringBuilder.toString();
    }
}
