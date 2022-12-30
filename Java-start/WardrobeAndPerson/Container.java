package WardrobeAndPerson;

import java.util.ArrayList;

public class Container {
    
    enum Door {
        Open,
        Close;
    }
    protected Door state;

    protected ArrayList<String> items;

    /* штанга для вешалок-плечиков с вещами или просто полка. Вещи представлены коллекцией items*/
    public Container() {
        this.items = new ArrayList<>();
        this.state = Door.Close;
    }

    public Door getState() {
        return state;
    }

    protected void setState() {
        if (this.state == Door.Close) {this.state = Door.Open; return;}
        else {this.state = Door.Close; return;}
    } 
}
