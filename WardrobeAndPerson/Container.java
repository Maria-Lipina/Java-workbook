package WardrobeAndPerson;

import java.util.ArrayList;

public class Container {
    ArrayList<String> items;
    enum Door {
        Open,
        Close;
    }
    protected Door state;

    public Container() { //штанга для вешалок-плечиков с вещами или просто полка. Вещи представлены коллекцией items
        this.items = new ArrayList<>();
        this.state = Door.Close;
    }

    public Door getState() {
        return state;
    }

    protected void setState() { //для открытия и закрытия один мктод
        if (this.state == Door.Close) {this.state = Door.Open; return;}
        else {this.state = Door.Close; return;}
    } 
}
