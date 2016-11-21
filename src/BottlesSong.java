

public class BottlesSong {
    public static void main (String[] args)
    {
        int buttelNumbers = 10;
        String word_1 = "пляшок";
        String word_2 = "пляшку";

        while (buttelNumbers > 1)
        {
            if (buttelNumbers == 0)
            {
                System.out.println("Пляшки кінчилися");
            }

            System.out.println(buttelNumbers + " пляшок пива на столі");
            System.out.println("Візьми одну " + word_2 + " і пусти по колу");
            System.out.println();
            buttelNumbers = buttelNumbers - 1;
        }

        System.out.println("Нема пляшок на столі");





    }
}
