import java.util.LinkedList;
public class RemoveAll {
public static void main(String[] args) {
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Apple");
linkedList.add("Banana");
linkedList.add("Cherry");
linkedList.add("Date");
System.out.println("Initial LinkedList: " + linkedList);
linkedList.clear();
System.out.println("LinkedList after removing all elements: " + linkedList);
}
}
mlm@mlm-Vostro-3902:~/Desktop/nandha$ javac RemoveAll.java
mlm@mlm-Vostro-3902:~/Desktop/nandha$ java RemoveAll
Initial LinkedList: [Apple, Banana, Cherry, Date]
LinkedList after removing all elements: []
