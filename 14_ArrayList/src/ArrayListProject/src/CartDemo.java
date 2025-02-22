package ArrayListProject.src;
import java.util.Scanner;
import java.util.ArrayList;

public class CartDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Cart = new ArrayList<>();
        String KeyWord;
        Cart.add("Javaの入門");
        Cart.add("お酒");
        Cart.add("ラブライブ！デイズ！");
        Cart.add("鹿の子の子");
        Cart.add("ぬまっちゃ");
        Cart.add("ディスプレイ2k144hzfast-ips");
        System.out.println("The thing what your bought are:");
        System.out.println(Cart);
        System.out.println("what item do you want to delete? please input the keyword: ");
        KeyWord = scanner.nextLine();
        System.out.println(KeyWord);
        for(int i = 0; i < Cart.size(); i++) {
            String Key = Cart.get(i);
            System.out.println(Key);
            if(Key.contains(KeyWord)) {
                Cart.remove(Key);
                i--;
            }
        }
        System.out.println(Cart);
        scanner.close();
    }    
}