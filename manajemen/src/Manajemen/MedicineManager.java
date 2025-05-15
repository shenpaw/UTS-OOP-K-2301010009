/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen;
import java.util.Scanner;

/**
 *
 * @author Shendy Aulia Mursyd
 * note: penyimpanan dan pengelolaan array
 * 
 */
public class MedicineManager {
    private final Medicine[] medicines = new Medicine[100];
    private int count = 0;

    public void addMedicine(Medicine med) {
        medicines[count++] = med;
        System.out.println("Obat berhasil ditambahkan!");
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("Belum ada data obat.");
            return;
        }
        for (int i = 0; i < count; i++) {
            medicines[i].displaySummary();
        }
    }

    public Medicine findById(int id) {
        for (int i = 0; i < count; i++) {
            if (medicines[i].getId() == id) return medicines[i];
        }
        return null;
    }

    public void editMedicine(int id, Scanner sc) {
        Medicine med = findById(id);
        if (med != null) {
            sc.nextLine(); // consume newline
            System.out.print("Nama baru: ");
            med.setName(sc.nextLine());
            System.out.print("Dosis baru: ");
            med.setDose(sc.nextLine());
            System.out.print("Deskripsi baru: ");
            med.setDescription(sc.nextLine());
            System.out.print("Harga baru: ");
            med.setPrice(Integer.parseInt(sc.nextLine()));
            System.out.println("Data obat berhasil diperbarui.");
        } else {
            System.out.println("Obat tidak ditemukan.");
        }
    }

    public void deleteMedicine(int id) {
        for (int i = 0; i < count; i++) {
            if (medicines[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    medicines[j] = medicines[j + 1];
                }
                medicines[--count] = null;
                System.out.println("Obat berhasil dihapus.");
                return;
            }
        }
        System.out.println("Obat tidak ditemukan.");
    }

    public void toggleStatus(int id) {
        Medicine med = findById(id);
        if (med != null) {
            med.setActive(!med.isActive()); // gunakan getter dan setter
            System.out.println("Status berhasil diubah menjadi: " + (med.isActive() ? "Aktif" : "Nonaktif"));
        } else {
            System.out.println("Obat tidak ditemukan.");
        }
    }
}
