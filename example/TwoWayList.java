package example;

/**
 * Базовая реализация двусвязного списка
 */
public class TwoWayList {
    Node head;
    Node tail;

    /**
     * Найти элемент value в двусвязном списке
     * @param value
     * @return элемент списка Node, в котором хранится искомое значение
     */
    //Можно ли запускать поиск в обе стороны? Насколько это будет оправданно?
    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
    return null;
    }

    /**
     * Добавление элемента в конец списка
     * @param value
     */
    public void add (int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }


    /**
     * Добавление элемента в список после другого элемента - основная логика, которую рассматривали в лекции. Сокрытие и публичный метод ниже - добавление от меня
     * @param value значение элемента, добавляемого в список
     * @param node элемент списка, после которого добавляется value
     */
    void add (int value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;
        }
    }


    /**
     * Добавление элемента в список после другого
     * @param value значение элемента, добавляемого в список
     * @param position значение элемента, после которого в список добавляется value
     */
    public void add(int value, int position){
        Node node = this.find(position);
        if (node != null) this.add(value, node);
        else this.add(value);
    }

    /**
     * Удаление элемента из списка - основная логика, которую рассматривали в лекции. Метод ниже - добавление от меня.
     * @param node - удаляемый элемент
     */
    void delete(Node node){
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null){
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.previous = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    /**
     * Удаление элемента из списка
     * @param value
     */
    public void delete (int value) {
        Node node = this.find(value);
        if (node != null) this.delete(node);
    }


    /**
     * Разворот двусвязного списка
     */
    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) tail = currentNode;
            if (next == null) head = currentNode;
            currentNode = next;
        }
    }

//    /**
//     * Если бы список был односвязным, то разворот производился бы по этому методу.
//     Можно ли реализовать его через цикл?
//     */
//    public void revert() {
//        Node temp = head; //первый вариант обработки ссылки на следующую ноду в голове списка
//        if(head != null && head.next != null) {
//            revert(head.next, head);
//        }
//        temp.next = null;
//    }
//    void revert(Node currentNode, Node previousNode){
//        if(currentNode.next == null) head = currentNode;
//        else revert(currentNode.next, currentNode);
//        currentNode.next = previousNode;
//        previousNode.previous = null; //второй вариант
//    }

//    /**
//     * Так же односвязный список используется в работе со стеками и очередями
//     * При этом нода tail может присутствовать в односвязном списке, если работать с очередями Queue или для другими специфичными частными случаями, в которых нужна костантная скорость вставки в конец списка
//     Для очереди и стека метод push одинаков, кроме строки head.previous = node, которая закомментирована для очереди
//     */
//    public void push(int value){
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        //head.previous = node;
//        head = node;
//    }
//
//    /**
//     * получение последнего, верхнего элемента стека
//     * @return значение в элементе списка.
//     */
//    public Integer pop(){
//        Integer result = null;
//        if(head != null) {
//            result = head.value;
//            head = head.next;
//        }
//        return result;
//    }
//
//    public Integer peek() {
//        Integer result = null;
//        if(tail != null){
//            result = tail.value;
//            tail.previous.next = null;
//            tail = tail.previous;
//        }
//        return result;
//    }

}

class Node { //здесь по хорошему должен быть дженерик вместо int. Что-то вроде наследования от обджекта, чтобы поддерживал все типы данных
    int value;
    Node next;
    Node previous;
}

