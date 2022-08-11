package WardrobeAndPerson;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Random r = new Random();

        Container shelf = new Container();
        Wife masha = new Wife();
        Husband sasha = new Husband();
        
        for (int i = 0; i < 10; i++) {
         masha.addItems("item" + r.nextInt(10), shelf);   
        }
        sasha.observe(masha, shelf);
        sasha.observe(masha, shelf);


    }
}
