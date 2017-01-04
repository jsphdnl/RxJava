package com.nineleaps.rx1;

import rx.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mamu on 1/4/17.
 */
public class Main {
  public static void main(String[] args) {

    Integer [] list = {1,2,3,4};
    Observable<Integer> observable = Observable.from(list);
    observable.subscribe(x -> System.out.println(x), y -> System.out.println(y), z -> System.out.printf("completed"));

  }
}
