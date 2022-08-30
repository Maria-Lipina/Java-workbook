package FamilyTree;

import java.util.ArrayList;

public class FamilyTree { // может быть тут как раз время создать интерфейс? Время второй лекции?
    
    private ArrayList<Node> tree = new ArrayList<>();

    enum Type {
        mother, father, daughter, son, brother, sister, wife, husband
    }

    class Node {

        Person who;
        Type re;
        Person toWhom;

        public Node(Person who, Type re, Person toWhom) {
            this.who = who;
            this.re = re;
            this.toWhom = toWhom;
        }

        public Node(Type re, Person toWhom) {
            this.who = null;
            this.re = re;
            this.toWhom = toWhom;
        }

        public Node(Person who, Type re) {
            this.who = who;
            this.re = re;
            this.toWhom = null;
        }

        public String toString() {
            return String.format("<%s %s %s>", who, re, toWhom);
        }
    }

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void addNode(Person who, Type re, Person toWhom) {
        tree.add(new Node(who, re, toWhom));
    }

}
