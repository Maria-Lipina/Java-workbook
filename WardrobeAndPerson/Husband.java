package WardrobeAndPerson;

import java.util.ArrayList;
import java.util.Random;

import WardrobeAndPerson.Container.Door;

public class Husband {

    Random r = new Random();

    public Husband() {

    }

    private void confirm(Wife w, Container c) {
        if (w.permission() == false) {
            return;
        } else {
            c.setState();
        }
    }

    public void observe(Wife w, Container c) {
        confirm(w, c);
        if (c.getState() == Door.Open)
            System.out.println(c.items.toString());
        else
            System.out.println("В другой раз");
        c.state = Door.Close;
    }

    public void takeItems(ArrayList<String> items, Container c, Wife w) {
        confirm(w, c);
        if (c.getState() == Door.Open) {
            c.items.removeAll(items);
            c.state = Door.Close;
        }
    }

    public void takeItems(String item, Container c, Wife w) {
        confirm(w, c);
        if (c.getState() == Door.Open) {
            c.items.remove(item);
            c.state = Door.Close;
        }
    }

}
