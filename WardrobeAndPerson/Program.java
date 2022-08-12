package WardrobeAndPerson;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Random r = new Random();

        Container shelf = new Container();
        Wife masha = new Wife();
        Husband sasha = new Husband();

        ArrayList<String> bag = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bag.add("item" + r.nextInt(7));   
        }
        
        for (int i = 0; i < 13; i++) {
         masha.addItems("item" + r.nextInt(8), shelf);   
        }
        System.out.println(shelf.items.toString() + "просто в строку. Далее take 1");
        // sasha.observe(masha, shelf);
        // System.out.println("------");
        sasha.takeItems("item4", shelf, masha);
        System.out.println(shelf.items.toString() + " - Далее take bag");
        sasha.takeItems(bag, shelf, masha);
        System.out.println(shelf.items.toString());
        System.out.println("------");
        System.out.println("А теперь жена вернет все, что муж забрал (или добавит запас, уж как разрешение)");
        masha.addItems(bag, shelf);
        System.out.println(shelf.items.toString());

        System.out.println("------");
        System.out.println("А теперь что если жена попробует take и observe");

        ArrayList<String> bag1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bag1.add("item" + r.nextInt(1, 6));   
        }
        masha.observe(masha, shelf);
        masha.takeItems(bag1, shelf, masha);
        System.out.println(shelf.items.toString());

        System.out.println("--------");
        System.out.println("А теперь шведская небинарная семья");

        Husband zhenya = new Wife();
        zhenya.takeItems(bag1, shelf, masha);
        sasha.observe(masha, shelf);
    }
}
