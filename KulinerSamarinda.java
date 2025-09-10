package com.mycompany.kulinersamarinda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class MenuKuliner {
    String idMenu;
    String namaMenu;
    String jenis; // Makanan / Minuman
    int harga;
    int rating;

    MenuKuliner(String idMenu, String namaMenu, String jenis, int harga, int rating) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.jenis = jenis;
        this.harga = harga;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[" + idMenu + "] " + namaMenu + " | " + jenis + " | Rp" + harga + " | Rating: " + rating;
    }
}

class TempatKuliner {
    String idTempat;
    String namaTempat;
    String lokasi;
    int rating;
    ArrayList<MenuKuliner> daftarMenu = new ArrayList<>();

    TempatKuliner(String idTempat, String namaTempat, String lokasi, int rating) {
        this.idTempat = idTempat;
        this.namaTempat = namaTempat;
        this.lokasi = lokasi;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[" + idTempat + "] " + namaTempat + " | Lokasi: " + lokasi + " | Rating: " + rating;
    }
}

public class KulinerSamarinda {
    static ArrayList<TempatKuliner> daftarTempat = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static int nextTempatId = 1;
    private static int nextMenuId = 1;

    public static void main(String[] args) {
        inisialisasiDataDummy();

        while (true) {
            System.out.println("\n=========== MENU UTAMA ===========");
            System.out.println("1. Tambah tempat kuliner atau menu");
            System.out.println("2. Telusuri Kuliner");
            System.out.println("3. Ubah tempat kuliner atau menu");
            System.out.println("4. Hapus tempat kuliner atau menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            
            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                scanner.nextLine(); // Membersihkan buffer
                continue;
            }
            scanner.nextLine();

            switch (pilihan) {
                case 1: create(); break;
                case 2: read(); break;
                case 3: update(); break;
                case 4: delete(); break;
                case 5: System.out.println("Terima kasih telah menggunakan program ini!"); return;
                default: System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void inisialisasiDataDummy() {
        TempatKuliner t1 = new TempatKuliner("T" + nextTempatId++, "Warung Nasi Kuning Bu Ani", "Jl. Ahmad Yani", 5);
        t1.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Nasi Kuning Komplit", "Makanan", 20000, 5));
        t1.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Teh Manis", "Minuman", 5000, 4));

        TempatKuliner t2 = new TempatKuliner("T" + nextTempatId++, "Cafe Kopi Kita", "Jl. Lambung Mangkurat", 4);
        t2.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Kopi Hitam", "Minuman", 15000, 4));
        t2.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Roti Bakar", "Makanan", 12000, 4));

        TempatKuliner t3 = new TempatKuliner("T" + nextTempatId++, "Sate Madura Pak Kumis", "Jl. Pahlawan", 5);
        t3.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Sate Ayam", "Makanan", 25000, 5));

        TempatKuliner t4 = new TempatKuliner("T" + nextTempatId++, "Bakso Mantap", "Jl. Pemuda", 3);
        t4.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Bakso Urat", "Makanan", 18000, 3));

        TempatKuliner t5 = new TempatKuliner("T" + nextTempatId++, "Ayam Geprek Pedas", "Jl. Antasari", 4);
        t5.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Ayam Geprek", "Makanan", 20000, 4));
        t5.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Es Teh Jumbo", "Minuman", 7000, 3));

        TempatKuliner t6 = new TempatKuliner("T" + nextTempatId++, "Soto Banjar Hj. Ida", "Jl. Juanda", 5);
        t6.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Soto Banjar", "Makanan", 22000, 5));

        TempatKuliner t7 = new TempatKuliner("T" + nextTempatId++, "Martabak Manis 77", "Jl. Merdeka", 4);
        t7.daftarMenu.add(new MenuKuliner("M" + nextMenuId++, "Martabak Coklat Keju", "Makanan", 30000, 5));

        daftarTempat.add(t1);
        daftarTempat.add(t2);
        daftarTempat.add(t3);
        daftarTempat.add(t4);
        daftarTempat.add(t5);
        daftarTempat.add(t6);
        daftarTempat.add(t7);
    }

    // === CRUD ===
    static void create() {
        System.out.println("\n====== Mau Tambah Apa? ======");
        System.out.println("1. Tambah tempat kuliner");
        System.out.println("2. Tambah menu ke tempat kuliner");
        System.out.print("Pilih: ");
        int pilihan = 0;
        try {
            pilihan = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Mohon masukkan angka.");
            scanner.nextLine();
            return;
        }
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                tambahTempat();
                break;
            case 2:
                tambahMenu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    static void tambahTempat() {
        System.out.println("\n--- Tambah Tempat Kuliner Baru ---");
        String idTempat = "T" + nextTempatId++;
        System.out.print("Masukkan nama tempat: ");
        String namaTempat = scanner.nextLine();
        System.out.print("Masukkan lokasi: ");
        String lokasi = scanner.nextLine();
        System.out.print("Masukkan rating (1-5): ");
        int rating = 0;
        try {
            rating = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Rating harus angka.");
            scanner.nextLine();
            return;
        }
        scanner.nextLine();

        TempatKuliner tempatBaru = new TempatKuliner(idTempat, namaTempat, lokasi, rating);
        daftarTempat.add(tempatBaru);
        System.out.println("Tempat '" + namaTempat + "' berhasil ditambahkan dengan ID: " + idTempat);
    }

    static void tambahMenu() {
        System.out.println("\n--- Tambah Menu Makanan Baru ---");
        System.out.print("Masukkan ID atau Nama Tempat: ");
        String keyTempat = scanner.nextLine();
        TempatKuliner targetTempat = findTempat(keyTempat);

        if (targetTempat == null) {
            System.out.println("Tempat tidak ditemukan.");
            return;
        }
        
        System.out.println("Menambahkan menu untuk tempat: " + targetTempat.namaTempat);
        String idMenu = "M" + nextMenuId++;
        System.out.print("Masukkan nama menu: ");
        String namaMenu = scanner.nextLine();
        System.out.print("Pilih jenis (1=Makanan, 2=Minuman): ");
        int jenisPilihan = 0;
        try {
            jenisPilihan = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Mohon masukkan angka 1 atau 2.");
            scanner.nextLine();
            return;
        }
        String jenis = (jenisPilihan == 1) ? "Makanan" : "Minuman";
        System.out.print("Masukkan harga: ");
        int harga = 0;
        try {
            harga = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harga harus angka.");
            scanner.nextLine();
            return;
        }
        System.out.print("Masukkan rating (1-5): ");
        int rating = 0;
        try {
            rating = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Rating harus angka.");
            scanner.nextLine();
            return;
        }
        scanner.nextLine();

        MenuKuliner menuBaru = new MenuKuliner(idMenu, namaMenu, jenis, harga, rating);
        targetTempat.daftarMenu.add(menuBaru);
        System.out.println("Menu '" + namaMenu + "' berhasil ditambahkan ke " + targetTempat.namaTempat);
    }

    static void read() {
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== Yuk Jelajahi Kuliner di Samarinda ===");
            System.out.println("1. Tampilkan semua kuliner");
            System.out.println("2. Cari kuliner");
            System.out.println("3. Filter kuliner (rating & harga)");
            System.out.println("4. Rekomendasi Makanan");
            System.out.println("5. Kembali");
            System.out.print("Pilih: ");
            
            int pilih = 0;
            try {
                pilih = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (pilih) {
                case 1: tampilkanSemua(); break;
                case 2: cariKuliner(); break;
                case 3: filterKuliner(); break;
                case 4: rekomendasiMakanan(); break;
                case 5:
                    lanjut = false;
                    break;
                default: System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void update() {
        System.out.print("\nMasukkan ID Tempat atau Nama Tempat yang ingin diubah: ");
        String key = scanner.nextLine();
        TempatKuliner targetTempat = findTempat(key);

        if (targetTempat == null) {
            System.out.println("Tempat tidak ditemukan.");
            return;
        }

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== UPDATE TEMPAT ===");
            System.out.println("Sedang diubah: " + targetTempat.namaTempat);
            System.out.println("1. Ubah nama tempat");
            System.out.println("2. Ubah lokasi tempat");
            System.out.println("3. Ubah rating tempat");
            System.out.println("4. Ubah menu");
            System.out.println("5. Selesai");
            System.out.print("Pilih: ");
            int pilih = 0;
            try {
                pilih = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama baru: ");
                    targetTempat.namaTempat = scanner.nextLine();
                    System.out.println("Nama tempat berhasil diperbarui.");
                    break;
                case 2:
                    System.out.print("Lokasi baru: ");
                    targetTempat.lokasi = scanner.nextLine();
                    System.out.println("Lokasi tempat berhasil diperbarui.");
                    break;
                case 3:
                    System.out.print("Rating baru (1-5): ");
                    targetTempat.rating = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Rating tempat berhasil diperbarui.");
                    break;
                case 4:
                    updateMenu(targetTempat);
                    break;
                case 5:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void updateMenu(TempatKuliner tempat) {
        if (tempat.daftarMenu.isEmpty()) {
            System.out.println("Tidak ada menu di tempat ini.");
            return;
        }
        System.out.println("\nDaftar menu di " + tempat.namaTempat + ":");
        for (MenuKuliner m : tempat.daftarMenu) {
            System.out.println(" - " + m.toString());
        }
        System.out.print("Masukkan ID Menu atau Nama Menu: ");
        String key = scanner.nextLine();
        MenuKuliner targetMenu = null;

        for (MenuKuliner m : tempat.daftarMenu) {
            if (m.idMenu.equalsIgnoreCase(key) || m.namaMenu.equalsIgnoreCase(key)) {
                targetMenu = m;
                break;
            }
        }

        if (targetMenu == null) {
            System.out.println("Menu tidak ditemukan.");
            return;
        }
        
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== UPDATE MENU ===");
            System.out.println("Sedang ubah menu: " + targetMenu.namaMenu + " di " + tempat.namaTempat);
            System.out.println("1. Ubah nama menu");
            System.out.println("2. Ubah jenis (1=Makanan, 2=Minuman)");
            System.out.println("3. Ubah harga");
            System.out.println("4. Ubah rating (1-5)");
            System.out.println("5. Selesai");
            System.out.print("Pilih: ");
            int pilih = 0;
            try {
                pilih = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama baru: ");
                    targetMenu.namaMenu = scanner.nextLine();
                    System.out.println("Nama menu berhasil diperbarui.");
                    break;
                case 2:
                    System.out.print("Pilih jenis baru (1=Makanan, 2=Minuman): ");
                    int jenisBaruPilihan = 0;
                    try {
                        jenisBaruPilihan = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid. Mohon masukkan angka 1 atau 2.");
                        scanner.nextLine();
                        break;
                    }
                    targetMenu.jenis = (jenisBaruPilihan == 1) ? "Makanan" : "Minuman";
                    System.out.println("Jenis menu berhasil diperbarui.");
                    break;
                case 3:
                    System.out.print("Harga baru: ");
                    targetMenu.harga = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Harga menu berhasil diperbarui.");
                    break;
                case 4:
                    System.out.print("Rating baru (1-5): ");
                    targetMenu.rating = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Rating menu berhasil diperbarui.");
                    break;
                case 5:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void delete() {
        System.out.println("\n=== HAPUS DATA ===");
        System.out.println("1. Hapus tempat kuliner");
        System.out.println("2. Hapus menu dari tempat kuliner");
        System.out.print("Pilih: ");
        int pilih = 0;
        try {
            pilih = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Mohon masukkan angka.");
            scanner.nextLine();
            return;
        }
        scanner.nextLine();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan ID Tempat atau Nama Tempat: ");
                String keyTempat = scanner.nextLine();
                TempatKuliner targetTempat = findTempat(keyTempat);
                if (targetTempat != null) {
                    daftarTempat.remove(targetTempat);
                    System.out.println("Tempat '" + targetTempat.namaTempat + "' dan semua menunya berhasil dihapus.");
                } else {
                    System.out.println("Tempat tidak ditemukan.");
                }
                break;

            case 2:
                System.out.print("Masukkan ID Tempat atau Nama Tempat: ");
                String key = scanner.nextLine();
                TempatKuliner tempat = findTempat(key);
                if (tempat == null) {
                    System.out.println("Tempat tidak ditemukan.");
                    return;
                }

                System.out.println("Daftar menu di " + tempat.namaTempat + ":");
                for (MenuKuliner m : tempat.daftarMenu) {
                    System.out.println(" - " + m.toString());
                }

                System.out.print("Masukkan ID Menu atau Nama Menu: ");
                String keyMenu = scanner.nextLine();
                MenuKuliner targetMenu = findMenu(tempat, keyMenu);
                if (targetMenu != null) {
                    tempat.daftarMenu.remove(targetMenu);
                    System.out.println("Menu '" + targetMenu.namaMenu + "' berhasil dihapus.");
                } else {
                    System.out.println("Menu tidak ditemukan.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    // === READ HELPERS ===
    static void tampilkanSemua() {
        System.out.println("\n=== SEMUA DATA KULINER ===");
        if (daftarTempat.isEmpty()) {
            System.out.println("Tidak ada data kuliner.");
            return;
        }
        for (TempatKuliner t : daftarTempat) {
            System.out.println("-------------------------------------");
            System.out.println(t);
            System.out.println("    > Daftar Menu:");
            if (t.daftarMenu.isEmpty()) {
                System.out.println("    Tidak ada menu.");
            } else {
                for (MenuKuliner m : t.daftarMenu) {
                    System.out.println("       - " + m);
                }
            }
        }
        System.out.println("-------------------------------------");
    }

    // Perbaikan: Logika pencarian sekarang menampilkan menu yang cocok secara
    // mandiri atau semua menu dari tempat yang cocok.
    static void cariKuliner() {
        System.out.print("Masukkan kata kunci nama tempat/menu: ");
        String key = scanner.nextLine().toLowerCase();
        boolean ditemukan = false;

        // Cetak header hasil pencarian
        System.out.println("\n=== HASIL PENCARIAN ===");

        // --- Periksa apakah kata kunci cocok dengan NAMA TEMPAT ---
        for (TempatKuliner t : daftarTempat) {
            if (t.namaTempat.toLowerCase().contains(key) || t.lokasi.toLowerCase().contains(key)) {
                System.out.println("-------------------------------------");
                System.out.println("Tempat Ditemukan:");
                System.out.println(t);
                System.out.println("    > Daftar Menu:");
                // Jika nama tempat cocok, tampilkan SEMUA menu dari tempat tersebut
                if (t.daftarMenu.isEmpty()) {
                    System.out.println("    Tidak ada menu.");
                } else {
                    for (MenuKuliner m : t.daftarMenu) {
                        System.out.println("       - " + m);
                    }
                }
                ditemukan = true;
            }
        }

        // --- Periksa apakah kata kunci cocok dengan NAMA MENU ---
        // Jika belum ada hasil dari pencarian tempat, kita coba cari berdasarkan nama menu
        if (!ditemukan) {
            boolean menuDitemukan = false;
            for (TempatKuliner t : daftarTempat) {
                for (MenuKuliner m : t.daftarMenu) {
                    if (m.namaMenu.toLowerCase().contains(key) || m.jenis.toLowerCase().contains(key)) {
                        System.out.println("-------------------------------------");
                        System.out.println("Menu Ditemukan:");
                        System.out.println("Tempat: " + t.namaTempat);
                        System.out.println("    > Menu: " + m);
                        menuDitemukan = true;
                    }
                }
            }
            if (menuDitemukan) {
                ditemukan = true;
            }
        }

        // Jika tidak ada hasil sama sekali
        if (!ditemukan) {
            System.out.println("Tidak ditemukan kuliner dengan kata kunci '" + key + "'.");
        }
        System.out.println("-------------------------------------");
    }


    static void filterKuliner() {
        int minRating = 0;
        int maxRating = 5;
        int minHarga = 0;
        int maxHarga = Integer.MAX_VALUE;
        boolean lanjutkanFilter = true;

        while(lanjutkanFilter) {
            System.out.println("\n=== FILTER ===");
            System.out.println("1. Berdasarkan Rating");
            System.out.println("2. Berdasarkan Harga");
            System.out.println("3. Tampilkan Hasil Akhir");
            System.out.print("Pilih opsi filter: ");

            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            
            switch(pilihan) {
                case 1:
                    System.out.println("\n--- FILTER BERDASARKAN RATING ---");
                    System.out.println("1. Rating 1 - 2");
                    System.out.println("2. Rating 3 - 4");
                    System.out.println("3. Rating 5");
                    System.out.print("Pilih rentang rating: ");
                    int pilihRating = 0;
                    try {
                        pilihRating = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Pilihan tidak valid.");
                        scanner.nextLine();
                        break;
                    }
                    scanner.nextLine();
                    
                    switch (pilihRating) {
                        case 1: minRating = 1; maxRating = 2; break;
                        case 2: minRating = 3; maxRating = 4; break;
                        case 3: minRating = 5; maxRating = 5; break;
                        default: System.out.println("Pilihan tidak valid. Mengabaikan filter rating.");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- FILTER BERDASARKAN HARGA ---");
                    System.out.println("1. Harga < Rp 15.000");
                    System.out.println("2. Harga Rp 15.000 - Rp 30.000");
                    System.out.println("3. Harga > Rp 30.000");
                    System.out.print("Pilih rentang harga: ");
                    int pilihHarga = 0;
                    try {
                        pilihHarga = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Pilihan tidak valid.");
                        scanner.nextLine();
                        break;
                    }
                    scanner.nextLine();

                    switch (pilihHarga) {
                        case 1: minHarga = 0; maxHarga = 14999; break;
                        case 2: minHarga = 15000; maxHarga = 30000; break;
                        case 3: minHarga = 30001; maxHarga = Integer.MAX_VALUE; break;
                        default: System.out.println("Pilihan tidak valid. Mengabaikan filter harga.");
                    }
                    break;

                case 3:
                    lanjutkanFilter = false;
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        
        tampilkanHasilFilter(minRating, maxRating, minHarga, maxHarga);
    }

    static void tampilkanHasilFilter(int minRating, int maxRating, int minHarga, int maxHarga) {
        System.out.println("\n=== HASIL FILTER AKHIR ===");
        boolean ditemukan = false;
        for (TempatKuliner t : daftarTempat) {
            for (MenuKuliner m : t.daftarMenu) {
                if (m.rating >= minRating && m.rating <= maxRating &&
                    m.harga >= minHarga && m.harga <= maxHarga) {
                    System.out.println("-------------------------------------");
                    System.out.println(t);
                    System.out.println("    - " + m);
                    ditemukan = true;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan hasil yang cocok.");
        }
        System.out.println("-------------------------------------");
    }

    static void rekomendasiMakanan() {
        System.out.println("\n=== REKOMENDASI MAKANAN TERBAIK ===");
        ArrayList<MenuKuliner> menuTerbaik = new ArrayList<>();
        int maxRating = 0;
        
        for(TempatKuliner t : daftarTempat) {
            for(MenuKuliner m : t.daftarMenu) {
                if(m.rating > maxRating) {
                    maxRating = m.rating;
                    menuTerbaik.clear(); // Hapus yang lama, tambahkan yang baru
                    menuTerbaik.add(m);
                } else if (m.rating == maxRating) {
                    menuTerbaik.add(m);
                }
            }
        }

        if (menuTerbaik.isEmpty()) {
            System.out.println("Tidak ada menu yang dapat direkomendasikan.");
        } else {
            System.out.println("Menu dengan rating tertinggi (" + maxRating + "/5):");
            for(MenuKuliner m : menuTerbaik) {
                TempatKuliner tempat = findTempatByMenu(m);
                System.out.println(" - " + m.namaMenu + " (di " + tempat.namaTempat + ")");
            }
        }
    }

    // === HELPER METHODS ===
    static TempatKuliner findTempat(String key) {
        for (TempatKuliner t : daftarTempat) {
            if (t.idTempat.equalsIgnoreCase(key) || t.namaTempat.equalsIgnoreCase(key)) {
                return t;
            }
        }
        return null;
    }

    static MenuKuliner findMenu(TempatKuliner tempat, String key) {
        for (MenuKuliner m : tempat.daftarMenu) {
            if (m.idMenu.equalsIgnoreCase(key) || m.namaMenu.equalsIgnoreCase(key)) {
                return m;
            }
        }
        return null;
    }
    
    static TempatKuliner findTempatByMenu(MenuKuliner menu) {
        for(TempatKuliner t : daftarTempat) {
            if(t.daftarMenu.contains(menu)) {
                return t;
            }
        }
        return null;
    }
}