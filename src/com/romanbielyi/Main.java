package com.romanbielyi;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append("some string to append to cause OOM");
        }
    }
}