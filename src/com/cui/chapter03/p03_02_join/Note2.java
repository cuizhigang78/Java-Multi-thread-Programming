package com.cui.chapter03.p03_02_join;

/**
 * 在很多情况下，主线程创建并启动子线程，如果子线程中要进行大量的耗时运算，
 * 主线程往往先于子线程结果。这时，如果主线程想要等待子线程执行完成后再结
 * 束，就要用到join()方法了。
 * join()方法的作用就是等待线程对象销毁。
 */
public class Note2 {
}