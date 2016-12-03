package com.echo.algorithm.sort;

/**
 * @author echo
 * @since 16-11-2
 */
public class ShellSort implements ISort {

  @Override
  public String getName() {
    return "shell";
  }

  @Override
  public void doSort(int[] records) {
    int d = records.length / 2;
    while (d >= 1) {
      for (int i = d; i < records.length; i += d) {
        if (records[i] < records[i - d]) {
          int tmp = records[i];
          int j;
          for (j = i; j - d >= 0 && records[j - d] > tmp; j -= d) {
            records[j] = records[j - d];
          }
          records[j] = tmp;
        }
      }
      d /= 2;
    }
  }

}
