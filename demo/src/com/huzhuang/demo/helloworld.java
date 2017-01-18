package com.huzhuang.demo;

import java.util.Scanner;

/**
 * Created by cauahu on 17-1-16.
 */
public class helloworld {
    public static void main(String argc[])
    {
        //System.out.println("hello world" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleace input your own text: " );
        while (true)
        {
            String line = scanner.nextLine();
            if(line.equals("exit"))
                break;
            System.out.println(">>>" + line);
        }
    }
}
