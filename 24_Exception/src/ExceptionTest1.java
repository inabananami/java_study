import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest1 {
    public static void main(String[] args) throws Exception {
//        Integer.valueOf("abc");

        //運行中の異常
//        int[] arr = {11, 22, 23};
//        System.out.println(arr[5]);

        //プログラムの異常を監視する
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            //
            Date d = sdf.parse("2028-11-11 10:24:23");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}