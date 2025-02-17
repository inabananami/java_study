package D5_Runtime;

public class Test {
    public static void main(String[] args) {
        //今のJavaアプリとリンクしている実行オブジェクトを返す
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);

        //仮想マシンを中止する（０ではなければ、異常な中止です）
        //runtime.exit(0);

        //仮想マシンが使用できるCPU数を獲得する
        System.out.println(runtime.availableProcessors());

        //JVMのメモリー総量を返す
        System.out.println(runtime.totalMemory()/1024.0/1024.0 + "MB");

        //JVMの使用できるメモリーを返す
        System.out.println(runtime.freeMemory()/1024/1024 + "MB");
    }
}
