package example.WardrobeAndPerson;

import java.util.ArrayList;

import example.WardrobeAndPerson.Container.Door;

public class Husband {

    public Husband() { }

    /*Перед тем, как заглянуть в шкаф (покопаться в нем) или взять из него что-то, необходимо получить разрешение жены - обеспечить открытие шкафа. Даже жене как классу, производному от мужа, нужно переспросить себя, перед тем как выполнить действия в Husband */
    
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
            c.items.remove(c.items.indexOf(item));
            c.state = Door.Close;
        }
    }

}
