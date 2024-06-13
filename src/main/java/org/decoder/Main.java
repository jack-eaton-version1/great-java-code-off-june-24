package org.decoder;

public class Main {

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        String encodedMessage = "AVW ZLJYLA: Clyzpvu1 zbttly whyaf pzu'a mhy hdhf! nla aol zbujylht ylhkf!";

        String output = cipher.decodeMessage(encodedMessage, 7);
    }
}