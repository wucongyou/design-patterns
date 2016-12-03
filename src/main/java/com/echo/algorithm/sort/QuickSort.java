package com.echo.algorithm.sort;

/**
 * @author echo
 * @since 16-11-2
 */
public class QuickSort implements ISort {

  @Override
  public String getName() {
    return "quick";
  }

  @Override
  public void doSort(int[] records) {
    doSort(records, 0, records.length - 1);
  }

  private void doSort(int[] records, int start, int end) {
    if (start < end) {
      int pIndex = partition(records, start, end);
      doSort(records, start, pIndex - 1);
      doSort(records, pIndex + 1, end);
    }
  }

  private int partition(int[] records, int start, int end) {
    int pItem = records[start];
    int i = start;
    int j = end;
    while (i < j) {
      for (; i < j && records[j] >= pItem; j--) ;
      if (i < j) {
        records[i] = records[j];
      }
      for (; i < j && records[i] <= pItem; i++) ;
      if (i < j) {
        records[j] = records[i];
      }
    }
    records[j] = pItem;
    return j;
  }

}
