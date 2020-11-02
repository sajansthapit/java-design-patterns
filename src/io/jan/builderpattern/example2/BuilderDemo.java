package io.jan.builderpattern.example2;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(
                "1TB", "16GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(computer.getComputer());
    }
}
