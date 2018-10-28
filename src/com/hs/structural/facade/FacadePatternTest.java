package com.hs.structural.facade;

public class FacadePatternTest {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}