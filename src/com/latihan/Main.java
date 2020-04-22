package com.latihan;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	    String namaDepan = "Muhammad";
	    String namaTengah = "Rifqi";
	    String namaBelakang = "Sahbana";

	    int usia = 20;
	    int targetTahunKuliah = 4;
	    double ipk = 4.00;
	    char nilaiAbjad = 'A';
	    boolean SangatTampan = true;

	    System.out.print("Input Nama Depan : ");
	    namaDepan = scanner.nextLine();
		System.out.print("Input Nama Tengah : ");
		namaTengah = scanner.nextLine();
		System.out.print("Input Nama Belakang : ");
		namaBelakang = scanner.nextLine();
		System.out.print("Input Usia : ");
		usia = scanner.nextInt();
		System.out.print("Input IPK : ");
		ipk = scanner.nextDouble();
		System.out.print("");
		System.out.print("Input Nilai Abjad : ");
		nilaiAbjad = scanner.next().charAt(0);
		System.out.print("Tampan? : Ya pasti lah ");
		SangatTampan = scanner.nextBoolean();

		System.out.println("=============OUTPUT============");
		System.out.println("Nama Depan : " + namaDepan );
		System.out.println("Nama Tengah : " + namaTengah );
		System.out.println("Nama Belakang : " + namaBelakang);
		System.out.println("Usia : " + usia);
		System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
		System.out.println("IPK : " + ipk);
		System.out.println("Nilai PBO : " +nilaiAbjad);
		System.err.println("Tampan : " + SangatTampan);

		JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);

    }
}
