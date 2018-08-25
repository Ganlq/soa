package com.soa.other.spi;

public class ShutDownCommand implements Command{
    @Override
    public void execute() {
        System.out.println("shut down ...");
    }
}
