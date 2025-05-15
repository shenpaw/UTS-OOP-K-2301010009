/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manajemen;

/**
 *
 * @author Shendy Aulia Mursyd
 * note: class turunan + overriding
 * 
 */
public class SpecialMedicine extends Medicine {
    private boolean needPrescription;
    private String warning;

    public SpecialMedicine(int id, String name, String dose, String desc, int price, boolean needPrescription, String warning) {
        super(id, name, dose, desc, price);
        this.needPrescription = needPrescription;
        this.warning = warning;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memerlukan Resep Dokter: " + (needPrescription ? "Ya" : "Tidak"));
        System.out.println("Peringatan Penggunaan: " + warning);
    }

    // Getter dan setter (jika dibutuhkan)
    public boolean isNeedPrescription() { return needPrescription; }
    public void setNeedPrescription(boolean needPrescription) { this.needPrescription = needPrescription; }

    public String getWarning() { return warning; }
    public void setWarning(String warning) { this.warning = warning; }
}

