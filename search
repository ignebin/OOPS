QUESTION:
Search an element in an array.

CODE:

import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        int i,j,x=0;
        boolean state = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemets in array");
        int num=sc.nextInt();
        String word[]=new String[num];
        sc.nextLine();
        for( i=0;i<num;i++){
        System.out.println("\nEnter a Word\n");
        word[i]=sc.nextLine();
        }
        System.out.println("Enter the element to Search");
        String search = sc.nextLine();
        for( i=0;i<num;i++){
            if(word[i].equals(search)){
                 x = i;
                state = true;
            }
            }
            if(state){
        System.out.println("Element found at  position = "+x);
            }
            else{
        System.out.println("Element found not found");

            }
    }
    
}

OUTPUT

mlm@mlm-desktop:~/Desktop/Rojin/java$ javac Search.java
mlm@mlm-desktop:~/Desktop/Rojin/java$ java Search
Enter the number of elemets in array
3

Enter a Word

innova

Enter a Word

swift

Enter a Word

ignis
Enter the element to Search
ignis
Element found at  position = 2
