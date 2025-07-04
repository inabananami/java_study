public class increase {
    public static void main(String[] args) {
        double money = 800.0;
        double increase = 1.035;
        for (int i = 1; i <= 25; i++) {
            money = money * increase;
            money += 800;
        }
        System.out.println("money = " + money);
    }
}