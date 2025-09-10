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
   
   <img width="699" height="230" alt="image" src="https://github.com/user-attachments/assets/21c3558f-7c4a-4784-9ad8-7a452c4eda30" />

* 
   
   


   



