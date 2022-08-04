package WardrobeAndPerson;

import java.util.ArrayList;

public class Container {
    ArrayList<String> items;
    enum Door {
        Open,
        Close;
    }
    private Door state;

    public Container() { //штанга для вешалок-плечиков с вещами или просто полка. Вещи представлены коллекцией items
        this.items = new ArrayList<>();
        this.state = Door.Close;
    } 
}
