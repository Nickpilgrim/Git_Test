
public class PhraseRandomGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {"цілодобовий", "круглий", "казковий", "цинічний", "адаптивний", "синхронізований", "інтерктивний", "завантижений"};
        String[] wordLostTwo = {"упоноважений", "важкий", "чистий продукт", "центральний", "кастомізативний", "використний з вигодою", " банановий", "фічя", "дизайн", "перформенс"};
        String[] wordLostTree = {"процес", "креатив", "підтримка", "біль", "знак", "застосування", "гнучкий процес", "залогуватися", "абстрактний", "клієнт"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordLostTwo.length;
        int treeLenght = wordLostTree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * treeLenght);

        String praze = wordListOne[rand1] + " " + wordLostTwo[rand2] + " " + wordLostTree[rand3];
        System.out.println("Усе, що нам потрібно знати - це " + praze);

    }
}