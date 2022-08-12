package WardrobeAndPerson;

import java.util.ArrayList;
import java.util.Random;

import WardrobeAndPerson.Container.Door;

public class Wife extends Husband {

    Random r = new Random();

    public Wife() { }
   
    public boolean permission() {
        if (r.nextInt(2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void addItems(ArrayList<String> items, Container c) {
        c.state = Door.Open;
        c.items.addAll(items);
        c.state = Door.Close;
    }

    public void addItems(String item, Container c) {
        c.state = Door.Open;
        c.items.add(item);
        c.state = Door.Close;
    }
    
    public void findIt(String item, Container c) {
        c.state = Door.Open;
        if (c.items.contains(item)) System.out.println("Есть");
        else System.out.println("Надо купить?");
        c.state = Door.Close;
    }
    
}
