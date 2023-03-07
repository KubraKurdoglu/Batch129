package day32collections;

import java.util.LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

/*
   "Queue" larda ilk gelen ilk isleme girer.(First In First Out ==> FIFO)
   Bazen de son gelen ilk isleme girer.(Last In First Out ==> LIFO)
   "Deque" ==> "Double Ended Queue"


"Queue" bir interface'dir bu yüzden constructor'ı yoktur. Dolayisiyla object oluştururken
"new" keyword'ünden sonra kullanılamaz
 "new" keyword'ünden sonra data type'i "Queue" olan bir object oluşturmak için "new" keyword'unden sonra
 i)LinkedList veya ii)PriorityQUeue Class'ları kullanılabilir

 */


    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury water]

        // bu alttaki uc method'da ilk elemanla alakali


        //Retrieves and removes the "head of this queue", or returns "null" if this queue is empty
        myQueue.poll();

//Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
//Returns: the head of this queue
//Throws: NoSuchElementException – if this queue is empty
        myQueue.remove();

//Retrieves, but does not remove, the head of this queue.
//This method differs from peek only in that it throws on exception if this queue is empty.
//Throws: NoSuchElementException - if this queue is empty
        myQueue.element();

//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        myQueue.peek();


        /*
        poll() ile remove() ikiside ilk elemani siler ve size verir.
        poll() bos "Queue" lar icin "null" verir, remove() ise bos "Queue" ler icin Exception atar.
        */

        /*
        element() ile peek() ikiside ilk elemani silmeden size verir.
         peek() bos "Queue" lar icin "null" verir, element() ise bos "Queue" ler icin Exception atar.
        */


        /*

     Ogrencilerden aldigim not;
        myQueue.poll();//cut paste yapar. ilk elemanı verir. boşsa null verir.
        myQueue.remove();//cut paste yapar. ilk elemanı verir. boşsa exception atar.
        myQueue.peek();//copy paste yapar.ilk elemanı verir.boşsa null verir.
        myQueue.element();//copy paste yapar.ilk elemanı verir.peek metodundan farkı boş olduğunda exception atmasıdır.


         */


        boolean r = myQueue.offer("Avocado");
        System.out.println(r);///true verdi, cunku "avocadoyu" ekleyebildi
        System.out.println(myQueue);//[Jam, Egg, Luxury water, Avocado]==> avocado'yu ekledi


        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");
        System.out.println(yourQueue);//[Butter, Egg, Jam, Milk, Luxury water]
    }











    }

