package example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PasswordGenerator {

    private static final String chars = "0123456789ABCDEFGHIJKLM01234NOPQRSTUVWXYZ0123456789abcdefghijklmn56789opqrstuvwxyz0123456789";


    public static void withHash(String outputFile, byte passLen, int quantity) {
        try (FileOutputStream fos = new FileOutputStream(
                outputFile, true)) {
            String st = IntStream.range(0, quantity)
                    .mapToObj(randPass1 -> PasswordGenerator.passGenHash(passLen))
                    .collect(Collectors.joining("\n"));
            fos.write(st.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void withoutHash(String outputFile, byte passLen, int quantity) {
        try (FileOutputStream fos = new FileOutputStream(
                outputFile, true)) {
            String st = IntStream.range(0, quantity)
                    .mapToObj(randPass1 -> PasswordGenerator.passGen(passLen))
                    .collect(Collectors.joining("\n"));
            fos.write(st.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String passGen(int len){
        SecureRandom random = new SecureRandom();
        return IntStream.range(0, len)
                .mapToObj(randomIndex -> String.valueOf(
                        chars.charAt(random.nextInt(chars.length()))))
                .collect(Collectors.joining());
    }

    private static String passGenHash(int len){
        SecureRandom random = new SecureRandom();
        String pw = IntStream.range(0, len)
                .mapToObj(randomIndex -> String.valueOf(
                        chars.charAt(random.nextInt(chars.length()))))
                .collect(Collectors.joining());
        return String.format("%d;%s", pw.hashCode(), pw);
    }
}
