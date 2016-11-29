package Part_2_classVSobjects.Movie;

public class TestClass {
    public static void main(String[]args)
    {
        Movies comedy = new Movies();
        comedy.name = "Hobbit";
        comedy.movieTime = 180;
        comedy.movieRating = 7;
        comedy.genre = "Si-Fi";

        comedy.filmDetails();
        comedy.playIt();

        Movies horror = new Movies();
        horror.name = "Killers";
        horror.movieTime = 120;
        horror.movieRating = 6;
        horror.genre = "Horror";

        horror.filmDetails();

        Movies historicalDrama = new Movies();

    }

}
