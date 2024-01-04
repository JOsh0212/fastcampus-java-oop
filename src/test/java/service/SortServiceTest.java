package service;

import logic.BubbleSort;
import logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new BubbleSort<String>());  // 사용하는 쪽에서 구현체를 주입 -> 변경시 service코드는 변경할 필요 없음
    @DisplayName("자바 소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void givenList_WhenExcution_ThenReturnSortedList(){

        //when
        List<String> actual = sut.doSort(List.of("3","2","4","5","1"));

        //then
        assertEquals(List.of("1","2","3","4","5"),actual);
    }
}