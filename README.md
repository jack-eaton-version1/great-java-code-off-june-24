# Great Java Code off

## Caesar Cipher

The Caesar Cipher, used by Julius Caesar around 58 BC, is a substitution cipher that shifts letters in a message to make
it unreadable if intercepted. To decrypt, the receiver reverses the shift.

A shift number indicates how many letters the receiver should move along the alphabet to decrypt the message.
For example: encoded message of `Khoor` with a shift key of `3` would mean that the original
message had been shifted along the alphabet by 3 characters so reversing would lead to K -3 letters = H etc
leading to the decoded message of `Hello`

[More reading on caesar cipher wikipedia link](https://en.wikipedia.org/wiki/Caesar_cipher)

## The challenge

Your mission is to create a decoder that will take in an encoded message and apply a shift key
to return a decoded message

Decode the supplied encoded message whilst also providing tests to prove that the decoder works with positive and
negative
shifts, eg can shift +3 along the alphabet or -3 along the alphabet

### Look out for

The shift applies to the decoded message, so supplying the encoded message would mean your shift would be reversed!
encoded `Khoor` with a shift key of `3` means you'll have to go DOWN the alphabet 3...

Keep case sensitivity - capitals stay capitals and lowercase stays lowercase

Keep punctuation - punctuation doesn't get encoded, it stays the same and in place throughout

### Extra challenge

The mission continues - if time permits, the president of the world needs you to also create an encoder method
so messages can be provided with a shift key and a decoded message is produced! (remember
a shift towards an encoded message doesn't get reversed the same way decoding a message does!
`Hello` with 3 shift outputs to `Khoor`)

## No No's

- AI
- stackoverflow

