
public class PhraseRandomGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {"Начальник", "Девелопер", "Тестер", "Тімлід", "Сішарпіст", "Айчар", "Прибиральник", "Бекенд розробник", "Фронтенд розробник"};
        String[] wordListTwo = {"серйозний", "добрий", "класний", "досконалий", "упоротий", "мімімішний", "шалений", "рожевий", "роботящий", "офігіваючий", "красунчик"};
        String[] woedListTree = {"перець", "байстрюк", "мудак", "розумник", "халтурщик", "лис", "слон", "супер герой", "довбатель", "солодкоїжка", "дрищь", "поц", "бетман", "нінзя", "чайник", "кабан"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int treeLenght = woedListTree.length;

        int randomOne = (int) (Math.random() * oneLenght);
        int randomTwo = (int) (Math.random() * twoLenght);
        int randomTree = (int) (Math.random() * treeLenght);

        String prase = wordListOne[randomOne] + " " + wordListTwo[randomTwo] + " " + woedListTree[randomTree];

        System.out.println("Усе, що нам потрібно знати - це що: " + prase);
    }
}