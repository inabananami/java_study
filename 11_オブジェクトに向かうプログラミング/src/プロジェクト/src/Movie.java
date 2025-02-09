package プロジェクト.src;

public class Movie {
    String[] name = new String[10];
    int[] price = new int[10];
    int[] id = new int[10];
    //初期化
    public Movie() {
        for(int i = 0; i < name.length; i++) {
            name[i] = "samplename"+(i+1);
            price[i] = 10 + i;
            id[i] = i + 1;
        }
    }
    
    public void GetInfo() {
        System.out.println("this is the movie now on cinema!");
        for(int i = 0; i < name.length; i++) {
            System.out.println(id[i]+" is: "+name[i]);
            System.out.println("the price is: "+price[i]);
        }
    }

    public void SearchById(int ID) {
        for(int i = 0; i < id.length; i++) {
            if(id[i] == ID) {
                System.out.println("the name of the "+id[i]+" movie is: "+name[i]);
                System.out.println("the price of this movie is: "+price[i]);
            }
        }
    }
}
