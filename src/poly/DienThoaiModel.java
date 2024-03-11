/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly;

/**
 *
 * @author Acer
 */
public class DienThoaiModel {
    private String ModelName;
    private double Price;
    private String Brand;
    private String Color;
    private String Menmory;
    private String BatteryCapacity;
    private int Quantity;
    private String Status;

    public DienThoaiModel() {
        
    }

    public DienThoaiModel(String ModelName, double Price, String Brand, String Color, String Menmory, String BatteryCapacity, int Quantity, String Status) {
        this.ModelName = ModelName;
        this.Price = Price;
        this.Brand = Brand;
        this.Color = Color;
        this.Menmory = Menmory;
        this.BatteryCapacity = BatteryCapacity;
        this.Quantity = Quantity;
        this.Status = Status;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMenmory() {
        return Menmory;
    }

    public void setMenmory(String Menmory) {
        this.Menmory = Menmory;
    }

    public String getBatteryCapacity() {
        return BatteryCapacity;
    }

    public void setBatteryCapacity(String BatteryCapacity) {
        this.BatteryCapacity = BatteryCapacity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "DienThoaiModel{" + "ModelName=" + ModelName + ", Price=" + Price + ", Brand=" + Brand + ", Color=" + Color + ", Menmory=" + Menmory + ", BatteryCapacity=" + BatteryCapacity + ", Quantity=" + Quantity + ", Status=" + Status + '}';
    }
    
}

   