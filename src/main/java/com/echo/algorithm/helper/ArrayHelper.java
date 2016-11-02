package com.echo.algorithm.helper;

/**
 * @author echo
 * @since 16-11-2
 */
public class ArrayHelper {

  public static void swap(int[] records, int a, int b) {
    int tmp = records[a];
    records[a] = records[b];
    records[b] = tmp;
  }

}
