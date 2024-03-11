package ru.kazim;

import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
            ((HttpURLConnection) new URL("https://mail.russianpost.ru/").openConnection()).connect();
            System.out.println("OK!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
