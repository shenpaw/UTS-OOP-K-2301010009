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
 * note: main
 * 
 */
public class MainApp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            MedicineManager manager = new MedicineManager();
            int choice;
            
            do {
                System.out.println("\n=== APLIKASI MANAJEMEN OBAT ===");
                System.out.println("1. Tambah Obat");
                System.out.println("2. Tampilkan Semua Obat");
                System.out.println("3. Ubah Data Obat");
                System.out.println("4. Hapus Obat");
                System.out.println("5. Aktif/Nonaktifkan Obat");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        sc.nextLine(); // buang newline

                        String name;
                        do {
                            System.out.print("Nama: ");
                            name = sc.nextLine();
                            if (name.trim().isEmpty()) System.out.println("Nama tidak boleh kosong.");
                        } while (name.trim().isEmpty());

                        String dose;
                        do {
                            System.out.print("Dosis: ");
                            dose = sc.nextLine();
                            if (dose.trim().isEmpty()) System.out.println("Dosis tidak boleh kosong.");
                        } while (dose.trim().isEmpty());

                        System.out.print("Deskripsi (boleh dikosongkan): ");
                        String desc = sc.nextLine();

                        System.out.print("Harga: ");
                        int price = Integer.parseInt(sc.nextLine());

                        System.out.print("Perlu resep? (true/false): ");
                        boolean needPrescription = Boolean.parseBoolean(sc.nextLine());

                        System.out.print("Peringatan penggunaan: ");
                        String warning = sc.nextLine();

                        int id = (int) (Math.random() * 10000); // ID acak
                        Medicine med = new SpecialMedicine(id, name, dose, desc, price, needPrescription, warning);
                        manager.addMedicine(med);
                        break;

                    case 2:
                        manager.displayAll();
                        break;
                    case 3:
                        System.out.print("ID Obat yang akan diubah: ");
                        int editId = sc.nextInt();
                        manager.editMedicine(editId, sc);
                        break;
                    case 4:
                        System.out.print("ID Obat yang akan dihapus: ");
                        int delId = sc.nextInt();
                        manager.deleteMedicine(delId);
                        break;
                    case 5:
                        System.out.print("ID Obat yang akan diubah statusnya: ");
                        int statId = sc.nextInt();
                        manager.toggleStatus(statId);
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan aplikasi.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (choice != 0);
        }
    }
}
