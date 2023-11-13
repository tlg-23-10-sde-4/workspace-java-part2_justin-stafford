/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

    public static void main(String[] args) {
        // TODO: create two instances of your thread subclass and start them up
        MessagePrinter mp1 = new MessagePrinter("Roses are red", 25, 3000);
        mp1.start();
        MessagePrinter mp2 = new MessagePrinter("Violets are blue", 10, 200);
        mp2.start();
        MessagePrinter mp3 = new MessagePrinter("Limes are green", 20, 1000);
        mp3.start();
        MessagePrinter mp4 = new MessagePrinter("and my kids are means", 30, 5000);
        mp4.start();


    }
}