package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilePrinter {
    
    private String fileName;
    
    public FilePrinter(String fileName){
        this.fileName = fileName;
    }

    public void writeFile() throws FileNotFoundException, UnsupportedEncodingException{
        PrintWriter writer = new PrintWriter(this.fileName, "UTF-8");
        writer.println("The first line");
        writer.close();
    }
}
