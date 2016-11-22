package Part_2_classVSobjects;

public class Movies {
    String name;
    int movieTime;
    int movieRating;
    String genre;


    void playIt()
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
