package Encapsulation.Movie;

class Movie{
    private String director;
    private String title;
    private int duration;



    public void setTitle(String title) {
        this.title = title;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }



    public void setDirector(String director) {
        this.director = director;
    }

    public String info(){
        return "Title: " + title + " ,Director: " + director + " ,Duration: " + duration + " minutes";
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setDirector("Christopher Nolan");
        m.setDuration(148);
        m.setTitle("Inception");

        System.out.println(m.info());
    }
}
