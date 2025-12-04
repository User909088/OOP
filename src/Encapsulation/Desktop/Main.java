package Encapsulation.Desktop;

class Desktop{
        private String brand;
        private String processor;
        private int ram_size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam_size() {
        return ram_size;
    }

    public void setRam_size(int ram_size) {
        this.ram_size = ram_size;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void increase_Ram(int additional_ram){
        if (additional_ram > 0){
            this.ram_size += additional_ram;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Desktop d = new Desktop();

        d.setBrand("Dell");
        d.setProcessor("XPS 8940");
        d.setRam_size(8);

        d.increase_Ram(8);
        d.increase_Ram(16);

        System.out.println("Brand: " + d.getBrand());
        System.out.println("Processor: " + d.getProcessor());
        System.out.println("RAM: " + d.getRam_size());
    }
}
