package com.neudu.test2;

public class MainBoard {
   private CPU cpu;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void method(){
       this.cpu.method();
   }
}
