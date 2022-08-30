package FamilyTreeAbstract;

import FamilyTreeAbstract.Tree.Type;
import FamilyTreeAbstract.Printer;

public class MyProgram {
  public static void main(String[] args) {

  var irina = new Person("Ирина");
  var vasya = new Person("Вася");
  var masha = new Person("Маша");
  var jane = new Person("Женя");
  var ivan = new Person("Ваня");

    Tree ft = new Tree();

    ft.addNode(irina, Type.wife, vasya);
    ft.addNode(masha, Type.daughter, vasya);
    ft.addNode(jane, Type.daughter, vasya);
    ft.addNode(ivan, Type.son, vasya);

    Research children = new Research(ft);
    Printer p = new Printer();
    System.out.println(p.people(children.findAll(vasya, Type.son)));
    System.out.println(p.people(children.findAll(vasya, Type.daughter)));
  }

}
