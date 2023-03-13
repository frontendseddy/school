package XPVs.interfacesxd;

public class Caesar implements Cipher {
    @Override
    public String encrypt(int key, String text) {
        key = key % 26;
        //..caesar cipher
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        text = text.toLowerCase();
        char[] message = text.toCharArray();
        String encrypted = "";
        for (int i = 0; i < message.length; i++) {
            if (alphabet.indexOf(message[i])+key >= alphabet.length()){
                encrypted += alphabet.charAt(alphabet.indexOf(message[i])+key-alphabet.length());

            }else {
                encrypted += alphabet.charAt(alphabet.indexOf(message[i])+key);
            }
        }
        return encrypted;
    }

    @Override
    public String decrypt(int key, String secret) {
        String text = encrypt(26-key,secret);
        return text;
    }

    public static void main(String[] args) {
        Cipher cipher = new Caesar();
        System.out.println("Encrypt: " + cipher.encrypt(3,"hello"));
        System.out.println("Decrypt: " + cipher.decrypt(3,"khoor"));
        System.out.println();
    }
}
