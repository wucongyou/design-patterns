package com.echo.designpattern.com.echo.algorithm.sort;

import com.echo.algorithm.sort.BinSort;
import com.echo.algorithm.sort.BubbleSort;
import com.echo.algorithm.sort.ISort;
import com.echo.algorithm.sort.InsertionSort;
import com.echo.algorithm.sort.QuickSort;
import com.echo.algorithm.sort.SelectionSort;
import com.echo.algorithm.sort.ShellSort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author echo
 * @since 16-11-2
 */
public class SortTest {

  private ISort sort;
  private int[] records;

  @Before
  public void before() {
    sort = new SelectionSort();
    sort = new InsertionSort();
    sort = new QuickSort();
    sort = new ShellSort();
    sort = new BinSort();
    sort = new BubbleSort();
    records = mockRecords();
  }

  @Test
  public void testSort() {
    System.out.println(Arrays.toString(records));
    sort.doSort(records);
    System.out.println(Arrays.toString(records));
  }

  private int[] mockRecords() {
    int[] records = new int[10];
    for (int i = 0; i < 10; i++) {
      records[i] = new Random().nextInt(100);
    }
    //int[] recordstmp = {54, 18, 43, 34, 44, 11, 75, 88, 38, 31};
    //[25, 70, 59, 89, 45, 41, 20, 28, 19, 43]
    //records = recordstmp;
    return records;

  }

}
