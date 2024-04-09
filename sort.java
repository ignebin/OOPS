QUESTION:
Program to Sort strings

CODE:

import java.util.Scanner;
import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of words");
    int num=sc.nextInt();
    String word[]=new String[num];
    sc.nextLine();
    for( i=0;i<num;i++){
    System.out.println("\nEnter a Word\n");
    word[i]=sc.nextLine();
    }
    for( i=0;i<num-1;i++){
       for( j=i+1;j<num;j++){
           if(word[i].compareTo(word[j])>0){
               String temp = word[i];
               word[i]=word[j];
               word[j]=temp;
           }
       }
        }
    System.out.println("Sorted Strings using compareTo function ="+Arrays.toString(word));
    System.out.println(word);

}}


OUTPUT

mlm@mlm-desktop:~/Desktop/Rojin/java$ javac sort.java
mlm@mlm-desktop:~/Desktop/Rojin/java$ java sort
Enter the number of words
3

Enter a Word

APPLE

Enter a Word

ORANGE

Enter a Word

GRAPES

Sorted Strings using compareTo function =[APPLE, GRAPES, ORANGE]
[Ljava.lang.String;@1540e19d
