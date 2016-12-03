package com.echo.algorithm.sort;

import com.echo.algorithm.helper.ArrayHelper;

/**
 * @author echo
 * @since 16-11-3
 */
public class BubbleSort implements ISort {

  @Override
  public String getName() {
    return "bubble";
  }

  @Override
  public void doSort(int[] records) {
    int len = records.length;
    for (int i = 0; i < len; i++) {
      for (int j = 1; j < len - i; j++) {
        if (records[j - 1] > records[j]) {
          ArrayHelper.swap(records, j, j - 1);
        }
      }
    }
  }

}
