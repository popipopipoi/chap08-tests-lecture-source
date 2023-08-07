package com.ohgiraffers.section02.junit;

import com.ohgiraffers.section01.tests.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/* 단위 테스트(Unit Test)
* 한 가지 기능(함수)마다 일을 잘 수행하는지 확인하며 특정 모듈이 의도된 대로 정확히 작동하는지 검증하는 절차
* 연관 컴포넌트가 개발되지 않더라도 기능별 개발이 완료 된것을 증명할 수 있음
* */
public class CalculatorTests {
    private static Calculator calc;

    /* 1. Calculator 인스턴스 생성이 잘 되는지 테스트 */
    @BeforeAll
    public static void setUp() {
        System.out.println("calculator 인스턴스 생성");
        calc = new Calculator();
    }

    /* 2. sumTwoNumber 메소드가 정상 기능하는지 테스트 */
    @Test
    public void testSumTwoNumber_4와_5를_전달하면_합계가_9가_되는지_확인() {
        System.out.println("2-1 테스트 동작");
        int result = calc.sumTwoNumber(4, 5);

        assertEquals(9, result);
    }

    @Test
    public void testSumTwoNumber_6과_7을_전달하면_합계가_13이_되는지_확인() {
        System.out.println("2-2 테스트 동작");
        int result = calc.sumTwoNumber(6, 7);

        assertEquals(12, result,1);
    }

    /* 3. 위의 테스트 결과가 모두 통과하면 해당 클래스의 메소드는 신뢰성 있는 메소드임을 확인 */
    @AfterAll
    public static void afterTest() {
        System.out.println("테스트 완료!");
    }
}
