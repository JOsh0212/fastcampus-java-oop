//package com.fastcampus.springpractice;
//
//import com.fastcampus.springpractice.logic.JavaSort;
//import com.fastcampus.springpractice.logic.Sort;
//import com.fastcampus.springpractice.service.SortService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
////        Sort<String> sort = new JavaSort<>();
////        Sort<String> sort = context.getBean(Sort.class); //객체를 생성하지 않고 spring context가 빈을 꺼내오는 형식으로 코드 작성
//        SortService sortService = context.getBean(SortService.class); //소트 구현체 -> 소트 서비스 가져오기
//
//        System.out.println("sort.sort(Arrays.asList(args)) = " + sortService.doSort(Arrays.asList(args)));
//    }
//}
