package com.soa.other.spi;

public class StartCommand implements Command{
    @Override
    public void execute() {
        System.out.println("start ...");
    }
}
