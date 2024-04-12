package Package1;
/*
 * testSelectionSort.java
 *
•⁠  ⁠To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 3;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 3;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr,arr);
        
        /* add tests to check for this unit test */
    }
    @Test
    public void testNegative(){
    	
    	 int[] arr = new int[5];
         arr[0] = -6;
         arr[1] = -3;
         arr[2] = -7;
         arr[3] = -10;
         arr[4] = -11;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -11;
         Sortedarr[1] = -10;
         Sortedarr[2] = -7;
         Sortedarr[3] = -6;
         Sortedarr[4] = -3;
         
         SelectionSort sorter = new SelectionSort();
         arr = sorter.basicSelectionSort(arr);
         assertArrayEquals(Sortedarr,arr);

        /* Test data contains negative values only */
    }
    @Test
    public void testMixed(){
    	
    	 int[] arr = new int[5];
         arr[0] = -1;
         arr[1] = 3;
         arr[2] = -5;
         arr[3] = 10;
         arr[4] = -2;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -5;
         Sortedarr[1] = -2;
         Sortedarr[2] = -1;
         Sortedarr[3] = 3;
         Sortedarr[4] = 10;
         
         SelectionSort sorter = new SelectionSort();
         arr = sorter.basicSelectionSort(arr);
         assertArrayEquals(Sortedarr,arr);

        /* Test data contains with both positive, negative and zeros */
    }
    @Test
    public void testDuplicates(){
    	
    	 int[] arr = new int[5];
         arr[0] = 4;
         arr[1] = 2;
         arr[2] = 2;
         arr[3] = 4;
         arr[4] = 2;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = 2;
         Sortedarr[1] = 2;
         Sortedarr[2] = 2;
         Sortedarr[3] = 4;
         Sortedarr[4] = 4;
         
         SelectionSort sorter = new SelectionSort();
         arr = sorter.basicSelectionSort(arr);
         assertArrayEquals(Sortedarr,arr);

        /* Test data contains duplicates */
    }


}