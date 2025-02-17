import java.util.Scanner;

public class kabu {
    public static void main(String[] args) {
        double money = 1080;  // 初始资金
        double rise = 1.00;   // 初始涨幅
        double earn = 0;      // 总收益
        double sellRatio = 0.10;  // 每次卖出的比例

        // 模拟逐步减仓
        while (money > 0 && rise <= 1.3) {  // 涨幅不超过30%
            // 模拟股价上涨
            rise += 0.05;  // 每次上涨5%
            money *= rise; // 更新资金

            // 卖出一定比例的资金
            double sellAmount = money * sellRatio;
            money -= sellAmount;  // 扣除卖出的金额
            earn += sellAmount;   // 累加收益

            // 输出当前资金和收益
            System.out.println("Current money: " + money);
            System.out.println("Total earned: " + earn);
        }
    }
}

