package com.echo.algorithm.sort;

/**
 * @author echo
 * @since 16-11-2
 */
public class InsertionSort implements ISort {

  @Override
  public String getName() {
    return "insertion";
  }

  @Override
  public void doSort(int[] records) {
    for (int i = 1; i < records.length; i++) {
      if (records[i] < records[i - 1]) {
        int tmp = records[i];
        int j;
        for (j = i; j - 1 >= 0 && records[j - 1] > tmp; j -= 1) {
          records[j] = records[j - 1];
        }
        records[j] = tmp;
      }
    }
  }

}
