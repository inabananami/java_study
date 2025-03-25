package D7_Period;

import java.time.LocalDate;
import java.time.Period;

public class D7_Period {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2029, 8, 10);
        LocalDate end = LocalDate.of(2029, 9, 10);

        //Periodオブジェクトを作成する
        Period period = Period.between(start, end);

        //periodオブジェクトに通じて、二つの日付オブジェクトの情報の違いを獲得する
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
