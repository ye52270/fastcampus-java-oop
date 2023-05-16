package org.fastcampus.service;

import org.fastcampus.logic.Sort;

import java.util.List;

public class SortService {

  //DIO(의존성 주입)
  private final Sort<String> sort;

  public SortService(Sort<String> sort) {
    this.sort = sort;
    System.out.println("[구현체]------------" + sort.getClass().getName());
  }

  public List<String> doSort(List<String> list) {
    //Sort<String> sort = new JavaSort<>(); 의존성이 주입되었기 때문에 필요 없다

    return sort.sort(list);

  }
}
