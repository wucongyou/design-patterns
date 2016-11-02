package com.echo.algorithm.sort;

import com.echo.algorithm.helper.ArrayHelper;

/**
 * @author echo
 * @since 16-11-2
 */
public class BinSelectSort implements ISort {

  @Override
  public void doSort(int[] records) {
    int len = records.length;
    for (int i = 0; i < len / 2; i++) {
      int minIndex = i;
      int maxIndex = len - 1 - i;
      for (int j = i; j < len - i; j++) {
        if (records[j] > records[maxIndex]) {
          maxIndex = j;
        }
        if (records[j] < records[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        ArrayHelper.swap(records, minIndex, i);
      }
      if (maxIndex != len - 1 - i) {
        if (maxIndex == i) {
          ArrayHelper.swap(records, minIndex, len - 1 - i);
        } else {
          ArrayHelper.swap(records, maxIndex, len - 1 - i);
        }
      }
    }
  }

}
