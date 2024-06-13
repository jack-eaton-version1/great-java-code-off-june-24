package org.decoder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {

    final CaesarCipher cipher = new CaesarCipher();

    @Test
    public void testEncodeMessage() {
        // Test case 1: Basic shift
        String message = "A";
        String encodedMessage = "D";
        assertEquals(message, cipher.decodeMessage(encodedMessage, 3));
    }

    @Test
    public void testEncodeMessage_CompleteMessage() {
        String message = "TOP SECRET: Version1 summer party isn't far away! get the suncream ready!";
        String encodedMessage = "AVW ZLJYLA: Clyzpvu1 zbttly whyaf pzu'a mhy hdhf! nla aol zbujylht ylhkf!";
        assertEquals(message, cipher.decodeMessage(encodedMessage, 7));
    }

    @Test
    public void testDecodeMessage() {
        // Test case 1: Basic shift
        String encodedMessage1 = "D";
        int shift1 = 3;
        String expectedOutput1 = "A";
        assertEquals(expectedOutput1, cipher.decodeMessage(encodedMessage1, shift1));

        // Test case 2: Shift with wrap-around
        String encodedMessage2 = "B";
        int shift2 = 3;
        String expectedOutput2 = "Y";
        assertEquals(expectedOutput2, cipher.decodeMessage(encodedMessage2, shift2));

        // Test case 3: Mixed case and non-letter characters
        String encodedMessage3 = "AVW ZLJYLA: Clyzpvu1 zbttly whyaf pzu'a mhy hdhf! nla aol zbujylht ylhkf!";
        int shift3 = 7;
        String expectedOutput3 = "TOP SECRET: Version1 summer party isn't far away! get the suncream ready!";
        assertEquals(expectedOutput3, cipher.decodeMessage(encodedMessage3, shift3));

        // Test case 4: No shift
        String encodedMessage4 = "Hello, World!";
        int shift4 = 0;
        String expectedOutput4 = "Hello, World!";
        assertEquals(expectedOutput4, cipher.decodeMessage(encodedMessage4, shift4));

        // Test case 5: Full alphabet shift
        String encodedMessage5 = "Hello, World!";
        int shift5 = 26;
        String expectedOutput5 = "Hello, World!";
        assertEquals(expectedOutput5, cipher.decodeMessage(encodedMessage5, shift5));

        // Test case 6: Large shift value
        String encodedMessage6 = "Hello, World!";
        int shift6 = 29; // equivalent to a shift of 3
        String expectedOutput6 = "Ebiil, Tloia!";
        assertEquals(expectedOutput6, cipher.decodeMessage(encodedMessage6, shift6));
    }
}