package Part_2_classVSobjects.First_Game_GessWords;

public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Я думаю що число, " + number);
    }
}
