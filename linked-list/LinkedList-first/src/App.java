public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.append(4);
        list.append(10);
        list.append(5);
        list.append(0);
        list.print();
        list.removeLast();
        list.print();
        list.prepend(4);
        list.prepend(2);
        list.prepend(1);
        list.print();
    }
}
