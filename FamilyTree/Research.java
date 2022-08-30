package FamilyTree;

import java.util.ArrayList;
// import FamilyTree.*;

public class Research {
    ArrayList<FamilyTree.Node> tree;

    public Research(FamilyTree famTree) {
        tree = famTree.getTree();
    }

    public ArrayList<Person> findAll(Person whose, FamilyTree.Type re) {
        ArrayList<Person> result = new ArrayList<>();
        for (FamilyTree.Node t : tree) {
          if (t.toWhom.getFullName() == whose.getFullName() && t.re == re) {
            result.add(t.who);
          }
        }
        return result;
      }
}
