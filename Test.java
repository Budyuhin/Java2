package ru.geekbrains.java3.lesson7;

public class Test {
    @BeforeSuite
    public static void test2() {
        System.out.println("test2 BeforSuite");
    }

    @TestTest
    public static void test8() {
        System.out.println("test8");
    }

    @TestTest
    public static void test1() {
        System.out.println("test1");
    }
    @TestTest (priority = 2)
    public static void test3 () {
        System.out.println("test3 priority = 2");
    }
    @TestTest (priority = 7)
    public static void test4 () {
        System.out.println("test3 priority = 7");
    }
    @AfterSuite
    public static void test5() {
        System.out.println("test5 AfterSuite");
    }

}
