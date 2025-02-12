package d12_extend_visit;

public class Z extends F {
    String name = "name2";
    public void showName() {
        System.out.println(name);
        //父クラスでnameを探す
        System.out.println(super.name);
    }
}