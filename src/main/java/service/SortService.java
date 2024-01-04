package service;

import logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;    //제어의 역전 - 생성자에서 한번만 주입

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);     // 이 코드는 어떻게 정렬이 실행되는지 알 수 없음
    }
}
