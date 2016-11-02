package com.echo.algorithm.sort;

/**
 * @author echo
 * @since 16-11-2
 */
public class SelectionSort implements ISort {

  @Override
  public void doSort(int[] records) {
    for (int i = 0; i < records.length - 1; i++) {
      int minIndex = i;
      int indexValue = records[i];
      for (int j = i + 1; j < records.length; j++) {
        if (records[j] < indexValue) {
          minIndex = j;
          indexValue = records[j];
        }
      }
      if (minIndex != i) {
        int tmp = records[minIndex];
        records[minIndex] = records[i];
        records[i] = tmp;
      }
    }
  }

}
