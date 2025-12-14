package encapsulation.smartphone;
class Smartphone{
    private String brand;
    private String model;
    private int storage_Capacity;

    public int getStorage_Capacity() {
        return storage_Capacity;
    }

    public void setStorage_Capacity(int storage_Capacity) {
        this.storage_Capacity = storage_Capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void increase_Storage(int additional_storage){
        if (additional_storage > 0){
            this.storage_Capacity += additional_storage;
        }
    }
}

public class Mobile {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.setBrand("Apple");
        s.setModel("Iphone 14 pro Max");
        s.setStorage_Capacity(256);

        s.increase_Storage(256);
        s.increase_Storage(512);

        System.out.println("Brand: " + s.getBrand());
        System.out.println("Model: " + s.getModel());
        System.out.println("Storage (GB): " + s.getStorage_Capacity());
    }
}
