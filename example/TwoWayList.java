package example;

import java.util.Comparator;
import java.util.StringJoiner;

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
    public void pushBack (T value) {
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

        public void pushFront(T value){
        Node<T> node = new Node<>();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    /**
     * Добавление элемента в список после другого элемента - основная логика, которую рассматривали в лекции. Сокрытие и публичный метод ниже - добавление от меня
     * @param value значение элемента, добавляемого в список
     * @param node элемент списка, после которого добавляется value
     */
    void insert(T value, Node<T> node) {
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
    public void insert(T value, T position){
        Node<T> node = this.find(position);
        if (node != null) this.insert(value, node);
        else this.pushBack(value);
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

    @Override
    public String toString(){
        Node<T> currentNode = head;
        StringJoiner sj = new StringJoiner(" ");
        while (currentNode != null){
            sj.add(currentNode.value.toString());
//            System.out.printf("%s ", currentNode.value);
            currentNode = currentNode.next;
        }
//        System.out.println();
        return sj.toString();
    }

    /**
     * Cортировка слиянием из интернета - с багами
     */
    public void mergeSort() {

//        mergeSort(head);
        mergeSort(head, tail);
    }

    //3 Стратегия быстрого и медленного указателя
    private Node<T> findMiddlePointer(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head.next;
        while (fast != null) {
            fast = fast.next;
            if(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }


    /* Метод возвращает ноду поменьше, но при этом во всей сортировке почему-то игнорируются значения меньше head
     //84 5 69 75 61 81 52 69 92 42
    */
    private Node<T> merge(Node<T> a, Node<T> b) {
        if (a == null) return b;
        if (b == null) return a;
        if (0 >= a.value.compareTo(b.value)) {
            a.next = merge(a.next, b);
//            a.next.previous = a;
//            a.previous = null;
            return a;
        }
        else {
            b.next = merge(a, b.next);
//            b.previous.next = b;
//            b.previous = null;
            return b;
        }
    }

    //нерабочий набросок
    Node<T> mergeSort(Node<T> begin) {
        if (begin == null || begin.next == null) return begin;
        Node<T> a = begin;
        Node<T> slow = findMiddlePointer(begin);
        Node<T> b = slow.next;
        slow.next = null;
        a = mergeSort(a);
        b =  mergeSort(b);
        begin = merge(a, b);
        return begin;
    }

    //Не работает, набросок
    void mergeSort(Node<T> begin, Node<T> end) {
        if (begin == null && end != null) return;
        if (begin != null && end == null) return;
        Node<T> a = begin;
        Node<T> b = end;
        while (begin.previous != end && begin.previous != end.previous) {
            begin = begin.next;
            end = end.previous;
        }
        mergeSort(a, begin);
        mergeSort(begin, b);
    }



    /**
     * должно было быть сортировкой, но пока просто хитрая итерация
     */
    public TwoWayList<T> quickSort () {
        TwoWayList<T> buffer = new TwoWayList<>();
        buffer.pushBack(head.value);
        buffer.pushBack(tail.value);
        quickSort(head.next, tail.previous, buffer);
        return buffer;
    }

    //pushFront - это head, min. Pushback - это tail, max
    void quickSort(Node<T> begin, Node<T> end, TwoWayList<T> buffer) {
        while (begin.previous != end && begin.previous != end.previous) {
            System.out.printf("%s, begin, %s end\n", begin.value, end.value);

            //Условие 1: Минимум меньше begin
            if(0 <= buffer.head.value.compareTo(begin.value)) {
                System.out.printf("if#1 head %s, begin %s%n", buffer.head.value, begin.value);
                buffer.pushFront(begin.value);
                System.out.printf("Весь buffer: %s%n", buffer);
            }
            //Условие 2: Минимум меньше end
            if(0 <= buffer.head.value.compareTo(end.value)){
                System.out.printf("if#2 head %s, end %s%n", buffer.head.value, end.value);
                buffer.pushFront(end.value);
                System.out.printf("Весь buffer: %s%n", buffer);
            }
            //Условие 3: Максимум меньше begin(min-part)
            if(0 >= buffer.tail.value.compareTo(begin.value)){
                System.out.printf("if#3 tail %s, begin %s%n", buffer.tail.value, begin.value);
                buffer.pushBack(begin.value);
                System.out.printf("Весь buffer: %s%n", buffer);
            }
            //Условие 4: Максимум меньше end(max-part)
            if(0 >= buffer.tail.value.compareTo(end.value)){
                System.out.printf("if#4 tail %s, end %s%n", buffer.tail.value, end.value);
                buffer.pushBack(end.value);
                System.out.printf("Весь buffer: %s%n", buffer);
            }
            begin = begin.next;
            end = end.previous;

            System.out.println("конец итерации");
        }
        System.out.println("конец цикла\n");
    }


    /**
     * Сортировка вставками по возрастанию
     */
    public void sort () {
        if (head != null && head.next != null) {
            Node<T> current = head;
            while (current != null) {
                Node<T> compareWith = current.next;
                while (compareWith != null) {
                    if (current.value.compareTo(compareWith.value) > 0) {
                        T temp = current.value;
                        current.value = compareWith.value;
                        compareWith.value = temp;
                    }
                    compareWith = compareWith.next;
                }
                current = current.next;
            }
        }
    }

    /**
     * Сортировка вставками, метод от другого студента
     * @param comparator порядок сортировки
     */
    public void selectionSort(Comparator<T> comparator) {
        Node<T> node = head;
        while(node != null) {
            Node<T> minValueNode = node;
            Node<T> node2 = node.next;
            while(node2 != null) {
                if(comparator.compare(minValueNode.value, node2.value) > 0) {
                    minValueNode = node2;
                }
                node2 = node2.next;
            }
            if(minValueNode != node) {
                T buff = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buff;
            }
            node = node.next;
        }
    }

    private class Node <T extends Comparable<T>> {
        T value;
        Node<T> next;
        Node<T> previous;
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

