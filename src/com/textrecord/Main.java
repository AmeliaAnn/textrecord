package com.textrecord;

import java.io.*;
public class Main {

    public static void main(String args[])throws IOException

    {
        File file = new File("Example.txt");
// Создание файла

        file.createNewFile();

//Создание объекта

        FileWriter FileWriter writer = new FileWriter(file);

// Запись содержимого в файл

        writer.write("This is simple example,\n where we make\n with Java\n record to file\n and read from file\n");
        writer.flush();
        writer.close();


        FileReader FileReader fr = new FileReader(file);
        char [] a = new char[200];
        fr.read(a, 0, a.length);


        for(char c : a)
            System.out.print(c);

    }

}