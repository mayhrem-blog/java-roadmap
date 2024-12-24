import java.util.ArrayList;
import java.util.List;

// ? Class for creating a DSA -> Heap
public class Heap {
  // ? Use ArrayList to store data
  private ArrayList<Integer> heap;

  // ? Initialize our List as empty
  public Heap() {
    heap = new ArrayList<>();
  }

  // ? Return the complete arrayList
  public List<Integer> getHeap() {
    return heap;
  }

  // ? Get left child of parent node
  private int getLeftChild(int index) {
    return (index * 2) + 1;
  }

  // ? Get roight child of parent node
  private int getRigthChild(int index) {
    return (index * 2) + 2;
  }

  // ? Get parent of any child
  private int getParent(int index) {
    return (index - 1) / 2;
  }

  // ? Method to swap two elements due its indexes
  private void swap(int index1, int index2) {
    // ? Create temp to store index1 value
    int temp = heap.get(index1);
    heap.set(index1, heap.get(index2));
    heap.set(index2, temp);
  }

  // ? Insert a new method -> move that value until it reach the highest place it
  // can have
  public void insert(int value) {
    // ? Add value to the end of the list
    heap.add(value);
    // ? Get last index -> last value added
    int current = heap.size() - 1;
    // ? Iterate following some conditions
    while (
    // ! current index must be greather than zero
    current > 0 &&
    // ! If the current value (last index) is greather than its parent
        heap.get(current) > heap.get(getParent(current))) {
      // ? Swap elements child with parent
      swap(current, getParent(current));
      // ? Change the index of the last index to the new index
      current = getParent(current);
    }
  }

  // ? Helper to move elements when removing the top node
  private void sinkDown(int index) {
    int maxIndex = index; // ? set maxIndex as the top
    while (true) {
      // ? Get left and right children nodes of top
      int left = getLeftChild(index);
      int right = getRigthChild(index);
      // ? Search for the highest child in both sides
      if (left < heap.size() && heap.get(left) > heap.get(maxIndex))
        maxIndex = left;
      if (right < heap.size() && heap.get(right) > heap.get(maxIndex))
        maxIndex = right;
      // ? If the index has changed -> we start changing nodes places until get the
      // highest value at the top
      if (maxIndex != index) {
        swap(index, maxIndex);
        index = maxIndex;
      } else
        return; // ? return until finished
    }
  }

  public Integer remove() {
    //? Return null in case of empty heap
    if (heap.size() == 0)
      return null;
    //? Return the unique value stored in the list
    if (heap.size() == 1)
      return heap.remove(0);
    //? Get max value as the top node
    int maxValue = heap.get(0);
    //? Change first element with the last element of the heap
    heap.set(0, heap.remove(heap.size() - 1));
    //? We remove by using 0 as the first index, which is the lowest to move the highest
    sinkDown(0);
    //? Return max value which was the first element at the beginning before aby changes.
    return maxValue;
  }

  public Integer peek () {
    if (heap.size() == 0) return null;
    return heap.get(0);
  }

  public int size () {
    return heap.size();
  }

  public boolean isEmpty () {
    return heap.isEmpty();
  }
  

}
