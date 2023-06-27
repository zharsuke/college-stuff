/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Imam`
 */
public class DLLMain {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addLast(10);
        dll.addLast(100);
        dll.addLast(34);
        dll.addLast(20);
        dll.addLast(200);
        dll.addLast(75);
        System.out.println("Initial data : ");
        dll.print();
        System.out.println();
        
        System.out.println("Display data from toArray() function : ");
        //cek fungsi toArray()
        int[] arr = dll.toArray();
        for(int x : arr){
            System.out.print(" "+x);
        }
        
        System.out.println();
        System.out.println();

        System.out.println("Display data from sublist() function : ");
        
        //cek fungsi sublist()
        DLL subList = dll.sublist(1, 3);
        subList.print();

        System.out.println();
        
        //cek fungsi addAll()
        DLL dll2 = new DLL();
        dll2.addLast(212);
        dll2.addLast(212);
        dll2.addLast(212);
        dll.addAll(dll2);
        System.out.println("Display data from addAll() function : ");
        dll.print();

        System.out.println();
        
        //cek fungsi containAll
        DLL dll3 = new DLL();
        dll3.addLast(100);
        dll3.addLast(34);
        dll3.addLast(212);
        System.out.println("Display data from containsAll() function : ");
        System.out.println(""+dll.containsAll(dll3));

        System.out.println();
        
        //cek fungsi removeAll()
        dll.removeAll(dll3);
        System.out.println("Display data from removeAll() function : ");
        dll.print();
    }
}
