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

    public String observe() {
        if (state == Door.Open) return items.toString();
        return "Шкаф закрыт";
    }

    public int findIt(String item) {
        return this.items.indexOf(item);
    }

    public void addItems(ArrayList<String> items) {
        this.items.addAll(items);
    }

    public void addItems(String item) {
        this.items.add(item);
    }

    //
    public void takeItems(ArrayList<String> items) {
        this.items.removeAll(items);
    }

    public void takeItems(String item) {
        this.items.remove(item);
    }

    public Door getState() {
        return state;
    }

    public void setState() { //для открытия и закрытия один мктод
        if (this.state == Door.Close) {this.state = Door.Open; return;}
        else {this.state = Door.Close; return;}
    } 
}
