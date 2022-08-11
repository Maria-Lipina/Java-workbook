package WardrobeAndPerson;

import java.util.ArrayList;

import WardrobeAndPerson.Container.Door;

public class Wife extends Husband {

    public Wife() {
        
    }
   
    public boolean permission() {
        if (super.r.nextInt(2) == 0) {
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
        if (c.items.contains(item)) System.out.println("есть");
        else System.out.println("Надо купить?");
        c.state = Door.Close;
    }
    
}
