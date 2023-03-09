package example;

/**
 * Базовая реализация двусвязного списка
 */
public class TwoWayList <T extends Comparable<T>>{
    Node<T> head;
    Node<T> tail;

    /**
     * Найти в двусвязном списке
     * @param value значение элемента, который нужно найти
     * @return элемент списка Node, в котором хранится искомое значение
     */
    //Можно ли запускать поиск в обе стороны? Насколько это будет оправданно?
    public Node<T> find(T value) {
        Node<T> currentNode = head;
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
     * @param value значение добавляемого элемента
     */
    public void add (T value) {
        Node<T> node = new Node<>();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
    }


    /**
     * Добавление элемента в список после другого элемента - основная логика, которую рассматривали в лекции. Сокрытие и публичный метод ниже - добавление от меня
     * @param value значение элемента, добавляемого в список
     * @param node элемент списка, после которого добавляется value
     */
    void add (T value, Node<T> node) {
        Node<T> next = node.next;
        Node<T> newNode = new Node<>();
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
    public void add(T value, T position){
        Node<T> node = this.find(position);
        if (node != null) this.add(value, node);
        else this.add(value);
    }

    /**
     * Удаление элемента из списка - основная логика, которую рассматривали в лекции. Метод ниже - добавление от меня.
     * @param node - удаляемый элемент
     */
    void delete(Node<T> node){
        Node<T> previous = node.previous;
        Node<T> next = node.next;
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
     * @param value значение удаляемого элемента
     */
    public void delete (T value) {
        Node<T> node = this.find(value);
        if (node != null) this.delete(node);
    }


    /**
     * Разворот двусвязного списка
     */
    public void revert(){
        Node<T> currentNode = head;
        while (currentNode != null){
            Node<T> next = currentNode.next;
            Node<T> previous = currentNode.previous;
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
//        Node<T> temp = head; //первый вариант обработки ссылки на следующую ноду в голове списка
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
//        Node<T> node = new Node<>();
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
//    public T pop(){
//        T result = null;
//        if(head != null) {
//            result = head.value;
//            head = head.next;
//        }
//        return result;
//    }
//
//    public T peek() {
//        T result = null;
//        if(tail != null){
//            result = tail.value;
//            tail.previous.next = null;
//            tail = tail.previous;
//        }
//        return result;
//    }

}

class Node <T extends Comparable<T>> {
    T value;
    Node<T> next;
    Node<T> previous;
}

