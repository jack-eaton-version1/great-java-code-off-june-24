package org.decoder;

import java.util.stream.Collectors;

public class CaesarCipher {

    public String decodeMessage(String inputToEncode, int messageShiftedBy) {
        return inputToEncode.chars()
                .mapToObj(c -> (char) c)
                .map(c -> {
                    if (Character.isLetter(c)) {
                        if (Character.isUpperCase(c) & (int) c - messageShiftedBy < 65) { // Mayus
                            int diff = 65 - ((int) c - messageShiftedBy);
                            return Character.toString((int) 'Z' - diff + 1);
                        }

                        if (Character.isLowerCase(c) && (int) c - messageShiftedBy < 97) {
                            int diff = 97 - ((int) c - messageShiftedBy);
                            return Character.toString((int) 'z' - diff + 1);
                        }

                        return Character.toString((int) c - messageShiftedBy);

                    } else
                        return Character.toString(c);
                })
                .collect(Collectors.joining());
    }

    public String encodeMessage(String inputToEncode, int messageShiftedBy) {
        return inputToEncode.chars()
                .mapToObj(c -> (char) c)
                .map(c -> {
                    if (Character.isLetter(c)) {
                        if (Character.isUpperCase(c) & (int) c + messageShiftedBy > 90) { // Mayus
                            int diff = ((int) c + messageShiftedBy) - 90;
                            return Character.toString((int) 'A' + diff - 1);
                        }

                        if (Character.isLowerCase(c) && (int) c + messageShiftedBy > 122) {
                            int diff = ((int) c + messageShiftedBy) - 122;
                            return Character.toString((int) 'a' + diff - 1);
                        }

                        return Character.toString((int) c + messageShiftedBy);

                    } else
                        return Character.toString(c);
                })
                .collect(Collectors.joining());
    }
}
