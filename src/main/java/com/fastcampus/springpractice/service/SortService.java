package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SortService {

    private final Sort<String> sort;    //제어의 역전 - 생성자에서 한번만 주입

//    public SortService(Sort<String> sort) { //sort의 구현체가 2개임(bubblesort, javasort) -> 구체적으로 지정해줘야 함
    public SortService(@Qualifier("bubbleSort") Sort<String> sort) { //sort의 구현체가 2개임(bubblesort, javasort) -> 구체적으로 지정해줘야 함
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);     // 이 코드는 어떻게 정렬이 실행되는지 알 수 없음
    }
}
