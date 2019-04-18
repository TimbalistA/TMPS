package Facade;

import java.io.IOException;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        FileReaderFacade fileReaderFacade = new FileReaderFacade();
        System.out.println(fileReaderFacade.readFile("readme.txt"));
    }
}
