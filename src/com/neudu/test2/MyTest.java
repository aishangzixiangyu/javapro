package com.neudu.test2;

public class MyTest {
    public static void main(String[] args) {
      I3 i3 = new I3();
      I5 i5 = new I5();
      I7 i7 = new I7();
      MainBoard mainBoard = new MainBoard();
      //参数需要传CPU类型
      mainBoard.setCpu(i5);
      mainBoard.method();
    }
}
