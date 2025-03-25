import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest3 {
    public static void main(String[] args) {
        //異常をユーザーに知らせる
        try {
            test1();
        } catch (Exception e) {
            System.out.println("error!!!");
            e.printStackTrace();
        }
    }

    //Exceptionを使っては足りる
    public static void test1() throws Exception {
        //dateformat機能
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse("2028/11/11 10:24:11");
        System.out.println(date);
        test2();
    }

    //Exceptionを使っては足りる
    public static void test2() throws Exception {
        // ファイルを読み込む
        InputStream is = new FileInputStream("D:/长期素食.png");
    }
}
