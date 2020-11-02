package io.jan.builderpattern.example2;

public class Computer {
    private String hardDisk;
    private String ram;

    private Boolean isGraphicsEnabled;
    private Boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.hardDisk = computerBuilder.hardDisk;
        this.ram = computerBuilder.ram;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicsEnabled = computerBuilder.isGraphicsEnabled;
    }

    public String getComputer() {
        return "Computer with hard disk: " + hardDisk + " ,ram: " + ram + " has graphics: " + isGraphicsEnabled + " and has bluetooth: " + isBluetoothEnabled;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getRam() {
        return ram;
    }

    public Boolean getGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public Boolean getBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        private String hardDisk;
        private String ram;

        private Boolean isGraphicsEnabled;
        private Boolean isBluetoothEnabled;

        public ComputerBuilder(String hardDisk, String ram) {
            this.hardDisk = hardDisk;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(Boolean isGraphicsEnabled) {
            this.isGraphicsEnabled = isGraphicsEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(Boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
