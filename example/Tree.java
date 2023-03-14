package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Базовое дерево для понимания структуры данных
 */
public class Tree {

    Node root;
    private class Node {
        int value;
        List<Node> children;
    }

    /**
     * Поиск элемента в дереве с помощью обхода в глубину
     * @param value искомое значение
     * @return true, если элемент найден
     */
    public boolean findDepth(int value) {
        if (root != null) {
            if (findDepth(root, value) != null) {
                return true;
            }
        }
        return false;
    }

    private Node findDepth(Node node, int value) {
        if (node.value == value){
            return node;
        } else {
            for (Node child : node.children) {
                Node result = findDepth(child, value);
                if(result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * Поиск элемента в дереве с помощью обхода в ширину
     * @param value искомое значение
     * @return true, если элемент найден
     */
    //имей в виду, когда захочешь вывести красиво дерево на экран
    public Node findBreadth(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while(line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value ){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

}
