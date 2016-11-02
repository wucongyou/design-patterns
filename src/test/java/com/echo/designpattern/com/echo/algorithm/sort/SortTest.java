package com.echo.designpattern.com.echo.algorithm.sort;

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
    return records;

  }

}
