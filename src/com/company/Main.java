package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String fileName = "src/resources/input.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach((e)->{
                int val = Integer.parseInt(e);

                if(val!= 0 && val>26 && val <128){
                    Clock clock = new Clock(val);
                    clock.init();
                    new Movement().run(clock);;
                }else{
                    System.out.println(e + " : is an invalid value, should be in [27,127]");
                }

            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
