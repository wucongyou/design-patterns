package com.echo.algorithm.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author echo
 * @since 16-12-3
 */
public class SortTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testBubbleSort() {
    sortTestTemplate(new BubbleSort());
  }

  @Test
  public void testSelectionSort() {
    sortTestTemplate(new SelectionSort());
  }

  @Test
  public void testInsertionSort() {
    sortTestTemplate(new InsertionSort());
  }

  @Test
  public void testBinSort() {
    sortTestTemplate(new BinSort());
  }

  @Test
  public void testShellSort() {
    sortTestTemplate(new ShellSort());
  }

  @Test
  public void testQuickSort() {
    sortTestTemplate(new QuickSort());
  }

  private void sortTestTemplate(ISort sort) {
    sortTestTemplate(sort, 10);
  }

  private void sortTestTemplate(ISort sort, int iteration) {
    for (int i = 0; i < iteration; i++) {
      int[] records = mockRecords();
      String recordsBefore = Arrays.toString(records);
      int[] recordsCopy = Arrays.copyOf(records, records.length);
      sort.doSort(records);
      Arrays.sort(recordsCopy);
      System.out.println(String.format("%s: %s -> %s",
          sort.getName(), recordsBefore, Arrays.toString(records)));
      assertArrayEquals(records, recordsCopy);
    }
  }

  private int[] mockRecords() {
    int[] records = new int[10];
    for (int i = 0; i < 10; i++) {
      records[i] = new Random().nextInt(100);
    }
    return records;
  }
}
