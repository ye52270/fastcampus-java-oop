package org.fastcampus;


import org.fastcampus.logic.BubbleSort;
import org.fastcampus.logic.JavaSort;
import org.fastcampus.logic.Sort;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //BubbleSort<String> sort = new BubbleSort<>();
    Sort<String> sort = new JavaSort<>();

    System.out.println("[result]" + sort.sort(Arrays.asList(args)));
  }

}