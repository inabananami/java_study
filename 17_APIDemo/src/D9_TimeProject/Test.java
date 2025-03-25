package D9_TimeProject;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String start = "2024年11月11日 0:0:0";
        String end = "2024年11月11日 0:10:0";
        String xj = "2024年11月11日 0:01:18";
        String xp = "2024年11月11日 0:10:51";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xjDate = sdf.parse(xj);
        Date xpDate = sdf.parse(xp);

        if(!xjDate.after(endDate) && !xjDate.before(startDate)) {
            System.out.println("小贾抢到了");
        }
        else {
            System.out.println("小贾没抢到");
        }
        if(!xpDate.after(endDate) && !xpDate.before(startDate)) {
            System.out.println("小皮抢到了");
        }
        else {
            System.out.println("小皮没抢到");
        }
    }
}
