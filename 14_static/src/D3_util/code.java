package D3_util;
import java.util.Random;

public class code {
    public static String code(int length) {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String code = "";
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
