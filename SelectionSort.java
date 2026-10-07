/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class SelectionSort {
     int[] numbers;

    SelectionSort(int[] numbers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   public void sort() {
    // code for sorting
    for (int i = 0; i < numbers.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[min] > numbers[j]) {
          min = j;
        }
      }
      int temp = numbers[i];
      numbers[i] = numbers[min];
      numbers[min] = temp;

        System.out.println("Step" + (i+1) +"- Swapped " + numbers[i] + " <->" + temp + " :");
        print();
        System.out.println();
    }
  }

  public void print() {
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }
}