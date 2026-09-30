/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class BubbleMainClass {
     public static void main(String[] args) {
        int[] numbers = {9,12,2,4,5,8,3};
        sorting.BubbleSort bubbleSort = new sorting.BubbleSort (numbers);
        System.out.print("Origianal Array: ");
        bubbleSort.print();
        System.out.println();
      
        //perporm bubble sort
         bubbleSort.sort();
     
      // show sorted array
        System.out.print("\nSorted Array: ");
        bubbleSort.print();
        
       
    }
    
}