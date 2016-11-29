package Part_2_classVSobjects.Movie;

public class Movies {
    String name;
    int movieTime;
    byte movieRating;
    String genre;


    public void playIt()
    {
        System.out.println("Відтворення фільму: " + name );
    }
    void filmDetails()
    {
        System.out.println("Movie name: " + name);
        System.out.println("Movie genre: " + genre);
        System.out.println("Movie Rating: " + movieRating +"/10");
        System.out.println("Movie time: " + movieTime);
    }
}
