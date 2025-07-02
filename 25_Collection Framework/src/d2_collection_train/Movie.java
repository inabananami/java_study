package d2_collection_train;

public class Movie {
    private String name;
    private double score;
    private String actor;

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }
    public String getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", score=" + score + ", actor=" + actor + "]";
    }
}
