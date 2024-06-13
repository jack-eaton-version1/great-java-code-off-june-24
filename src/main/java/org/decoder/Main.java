package org.decoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

    public static boolean flag = false;
    public static java.io.BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("Start");

        while (!flag) {
            String controls;
            System.out.println("Fuctions: \n 1 - Output Encoded Message \n 2 - Encode Message");
            controls = br.readLine();
            if (controls.equals("1")) {
                flag = true;
                outputDecodedMessage();
            } else if (controls.equals("2")) {
                flag = true;
                outputEncodedMessage();
            }
        }
    }

    public static void outputDecodedMessage() throws IOException {
        String encodedMessage;
        int shiftNum = 0;
        boolean validInput = false;

        System.out.println("Enter encoded message you wish you be translated");
        encodedMessage = br.readLine();

        while (!validInput) {
            try {
                System.out.println("Enter the shift number for your encoded message");
                shiftNum = Optional.of(Integer.parseInt(br.readLine())).orElse(0);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a integer here");
            }
        }

        CaesarCipher cipher = new CaesarCipher();
        System.out.printf("Output Decoded Message: %s", cipher.decodeMessage(encodedMessage, shiftNum));
    }

    public static void outputEncodedMessage() throws IOException {
        String message;
        int shiftNum = 0;
        boolean validInput = false;

        System.out.println("Enter the message you wish you be encoded");
        message = br.readLine();

        while (!validInput) {
            try {
                System.out.println("Enter the shift number you want to apply to the message");
                shiftNum = Optional.of(Integer.parseInt(br.readLine())).orElse(0);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a integer here");
            }
        }

        CaesarCipher cipher = new CaesarCipher();
        System.out.printf("Output Encoded Message: %s", cipher.encodeMessage(message, shiftNum));
    }
}