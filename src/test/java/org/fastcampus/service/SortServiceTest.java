package org.fastcampus.service;

import org.fastcampus.logic.BubbleSort;
import org.fastcampus.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
  private SortService sut = new SortService(new JavaSort<String>());
//  private SortService sut = new SortService(new BubbleSort<>());

  @Test
  void test() {
    List<String> actual = sut.doSort(List.of("3", "1", "2"));
    assertEquals(List.of("1", "2", "3"),actual);
  }
}