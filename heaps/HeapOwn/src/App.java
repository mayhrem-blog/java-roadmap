public class App {
    public static void main(String[] args) throws Exception {
        Heap heap = new Heap();
        heap.insert(300);
        heap.insert(200);
        heap.insert(100);
        heap.insert(3);
        System.out.println(heap.getHeap());
        heap.insert(400);
        System.out.println(heap.getHeap());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.getHeap());
    }
}
