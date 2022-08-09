package WardrobeAndPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Random r = new Random();

        Container shelf = new Container();
        Wife masha = new Wife();
        
        for (int i = 0; i < 10; i++) {
         shelf.addItems("item" + r.nextInt(10));   
        }
        shelf.setState();
        System.out.println(shelf.observe());
    }
}
