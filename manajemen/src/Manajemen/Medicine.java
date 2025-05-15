/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen;

/**
 *
 * @author Shendy Aulia Mursyd
 * note: class induk
 * 
 */
public class Medicine {
    private int id;
    private String name;
    private String dose;
    private String description;
    private int price;
    private boolean isActive;

    // Constructor lengkap
    public Medicine(int id, String name, String dose, String description, int stock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.description = description;
        this.price = price;
        this.isActive = true;
    }

    // Constructor overloading (tanpa deskripsi & stok default)
    public Medicine(int id, String name, String dose) {
        this(id, name, dose, "Belum ada deskripsi", 0);
    }

    // Getter & Setter
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDose() { return dose; }
    public void setDose(String dose) { this.dose = dose; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Dosis: " + dose);
        System.out.println("Deskripsi: " + (description == null || description.trim().isEmpty() ? "Belum ada deskripsi" : description));
        System.out.println("Harga: " + price);
        System.out.println("Status: " + (isActive ? "Aktif" : "Nonaktif"));
        System.out.println("--------------------------------");
    }

    // ✅ Method tambahan ringkasan obat
    public void displaySummary() {
        System.out.println("[" + id + "] " + name + " - " + dose +
            " | Harga: " + price + " | " + (isActive ? "Aktif" : "Nonaktif"));
    }
}
