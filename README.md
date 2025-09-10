# Kuliner-Finder-Samarinda
Program ini dirancang untuk mengelola dan memfasilitasi pencarian data kuliner di Samarinda. Aplikasi ini membantu pengguna untuk mencatat tempat-tempat kuliner dan menu-menu di dalamnya, serta menyediakan fitur-fitur pencarian yang memudahkan pengguna mencari kriteria kuliner yang diinginkan. Perkembangan

# Deskripsi Program
Perkembangan awal program adalah sistem manajemen data sederhana yang mengimplementasikan konsep Create, Read, Update, Delete (CRUD). Data kuliner dibagi menjadi dua entitas utama:
1. TempatKuliner: Menyimpan informasi tentang tempat makan atau kafe, termasuk nama, lokasi, dan rating.
2. MenuKuliner: Menyimpan informasi tentang menu yang tersedia di suatu tempat, termasuk nama, jenis (makanan/minuman), harga, dan rating.

# Fitur-Fitur Utama
1. Create (Buat)
* Tambah Tempat Kuliner: Menambahkan data tempat kuliner baru, lengkap dengan nama, lokasi, dan rating.
* Tambah Menu: Menambahkan menu baru ke tempat kuliner yang sudah ada. 

2. Read (Baca)
* Tampilkan Semua Kuliner: Menampilkan seluruh data tempat kuliner dan menu yang tercatat di dalam sistem.
* Cari Kuliner: Mencari tempat atau menu berdasarkan kata kunci.
* Filter Kuliner: Melakukan pencarian spesifik dengan filter multi-level, yaitu:
* Filter Rating: Menyaring menu berdasarkan rentang rating (1-2, 3-4, atau 5).
* Filter Harga: Menyaring menu berdasarkan rentang harga (< Rp 15.000, Rp 15.000 - Rp 30.000, atau > Rp 30.000).
* Rekomendasi Makanan: Menampilkan daftar menu dengan rating tertinggi yang tercatat dalam sistem.

3. Update (Perbarui)
* Perbarui Tempat: Mengubah nama, lokasi, atau rating dari tempat kuliner.
* Perbarui Menu: Mengubah nama, jenis, harga, atau rating dari menu tertentu.

4. Delete (Hapus)
* Hapus Tempat: Menghapus data tempat kuliner beserta seluruh menu di dalamnya.
* Hapus Menu: Menghapus menu dari sebuah tempat kuliner.

# Alur Program
## Menu Utama
Saat program dijalankan, pengguna akan ditampilkan menu utama. pengguna dapat menginputkan nomor yang sesuai dengan keperluan sebagai berikut:
1. Create → Menambahkan data tempat kuliner atau menu
2. Read → Melihat data kuliner (lihat semua, cari, filter)
3. Update → Mengubah data tempat kuliner atau menu
4. Delete → Menghapus data tempat kuliner atau menu
5. Keluar → Menghentikan program
   
<img width="392" height="178" alt="image" src="https://github.com/user-attachments/assets/02366ea0-948a-4dad-83e1-a0507345b4b0" />

## Fitur 'Tambah tempat kuliner atau menu' (Create)
Ketik 1 untuk masuk kedalam sub-menu 'Create' yang berisi 2 pilihan untuk menambahkan tempat kuliner yang baru atau menambahkan menu baru pada tempat kuliner yang sudah tercatat di program.

<img width="392" height="149" alt="image" src="https://github.com/user-attachments/assets/6aca16df-7e25-42b8-b2e7-798594e8b2f7" />

1. Ketik 1 pada sub-menu untuk menembahkan tempat kuliner yang baru.
   
   <img width="727" height="184" alt="image" src="https://github.com/user-attachments/assets/0bd2e93b-8a3b-4e24-9c06-5db2ae5f3e17" />
   
   Pengguna harus mengisi data seperti nama, lokasi, dan rating kuliner yang ditambahkan. Setelah menambahkan, pengguna akan kembali ke sub-menu create.
   
   <img width="724" height="229" alt="image" src="https://github.com/user-attachments/assets/e538f79e-b1db-4bfa-8626-7457f0bd139e" />

2. Ketik 2 untuk menambahkan menu baru pada tempat kuliner yang sudah tercatat
   
   <img width="695" height="285" alt="image" src="https://github.com/user-attachments/assets/6d6f7049-649e-4119-9fb6-2570a199d45f" />

## Fitur 'Telusuri Kuliner' (Read)
Ketik 2 untuk masuk pada submenu yang berfungsi sebagai menu untuk memilih menampilkan semua kuliner yang tercatat, mencari kuliner, flter dan rekomendasi kuliner.

   <img width="459" height="237" alt="image" src="https://github.com/user-attachments/assets/f0c4ce45-931a-4f74-ada1-7c02a49654be" />

1. Tampilkan semua kuliner
   Ketik 1 untuk menampilkan tempat dan makanan kuliner yang ada di program. program menggunakan data dummy agar tidak perlu menggunakan fitur 'create'.
   
   <img width="764" height="508" alt="image" src="https://github.com/user-attachments/assets/c2f14df4-cbf0-4b78-89e6-a8eb6916123d" />

3. Cari kuliner
   fitur untuk input nomor 3 bisa mencari kuliner berdasarkan tempat atau nama makanan bahkan bisa menggunakan sepenggal kata saja.
   
   <img width="699" height="230" alt="image" src="https://github.com/user-attachments/assets/ae2cdde4-9967-4a80-95cf-c15f13cc14dc" />

5. Filter kuliner
   Pilihan nomor 4 akan menampilkan lagi pilihan untuk filter yang ingin digunakan. Jika sudah memilih pilihan filter, pengguna bisa menginput nomor 3 untuk menampilkan hasil.
   
  <img width="288" height="134" alt="image" src="https://github.com/user-attachments/assets/be4f4103-0c1a-428d-a698-a693df8a8d72" />

* Filter berdasarkan rating
  
  Pengguna menginput angka 1 dan memilih rentang rating menu makanan yang disediakan. Program akan menyimpan pilihan filter dan kembali pada tampilan untuk menambah filter lagi atau langsung menampilkan hasil filter.
  
  <img width="409" height="284" alt="image" src="https://github.com/user-attachments/assets/384b9a1e-c9e8-4e8c-aae2-e905485c5ba6" />

   Berikut hasil filter ketika menginput angka 2 untuk memfilter rentang rating makanan dari 3 sampai 4.

  <img width="760" height="511" alt="image" src="https://github.com/user-attachments/assets/63e5aa23-2a7e-4de5-8263-ccd05fadc3bc" />

* Filter berdasarkan harga

  Pengguna menginput angka 2 dan memilih rentang harga yang disediakan. berikut output jika memilih filter berdasarkan harga.

  <img width="759" height="514" alt="image" src="https://github.com/user-attachments/assets/d99ef003-238f-4173-baac-505b3be4c618" />

* Hasil Filter jika menggunakan 2 filter
  Berikut output jika menggunakan 2 filter sekaligus dengan hanya menampilkan rating menu makanan 3-4 dan harga dibawah Rp15000
  <img width="391" height="142" alt="image" src="https://github.com/user-attachments/assets/04acf33b-78ac-4f5b-be2e-e7bd191f34e0" />
  <img width="761" height="594" alt="image" src="https://github.com/user-attachments/assets/d42be0fb-77e9-40e3-9a98-595e4795d6d5" />

6. Rekomendasi makanan
   Program yang sekrang hanyalah menampilkan rekomendasi dengan rating makanan atau minuman tertinggi. Bisa menampilkan rekomendasi dengan input angka 4.

7. Kembali
   Input angka 5 untuk kembali ke menu utama.

## Ubah tempat kuliner atau menu (Update)
Sebelum mengubah isi data kuliner setelah menginput angka 4 pada menu utama, pengguna akan diperintah untuk input nama tempat atau id kuliner yang ingin dirubah datanya.

<img width="649" height="465" alt="image" src="https://github.com/user-attachments/assets/871cf0d3-8361-406b-8488-fbbea4d7b0b3" />

1.  Ubah nama, lokasi, atau rating tempat kuliner
   Pengguna dapat memilih angka 1 sampai 3 jika ingin mengubah salah satu data pada empat kuliner. Beriku salah satu output yang dihasilkan.

<img width="385" height="260" alt="image" src="https://github.com/user-attachments/assets/7e8a234d-fdef-4790-82ca-e6422cc57e41" />

2. Ubah Menu
   Tampilan saat pengguna menginput angka 4 untuk mengubah menu, pengguna akan kembali diperintah untuk menginput id atau nama makanan yang akan diubah
   
   <img width="601" height="578" alt="image" src="https://github.com/user-attachments/assets/cc795021-efc2-4e06-8fce-48e9937e0da2" />



   



