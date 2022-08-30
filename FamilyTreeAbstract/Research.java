package FamilyTreeAbstract;

import java.util.ArrayList;
// import Tree.*;

public class Research {
    ArrayList<Tree.Node> tree;

    public Research(Tree famTree) {
        tree = famTree.getTree();
    }

    public ArrayList<Person> findAll(Person whose, Tree.Type re) {
        ArrayList<Person> result = new ArrayList<>();
        for (Tree.Node t : tree) {
          if (t.toWhom.getFullName() == whose.getFullName() && t.re == re) {
            result.add(t.who);
          }
        }
        return result;
      }
}
