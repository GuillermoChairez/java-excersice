public class  Queue{
  private int[] elements;
  private int size;

  public Queue() {
    elements = new int[8];
  }

  public Queue(int capacity) {
    elements = new int[capacity];
  }

  public void enqueue(int value) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length*2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = value;
  }

 
  public int dequeue() {
    return elements[--size];
  }

  public boolean empty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }
}