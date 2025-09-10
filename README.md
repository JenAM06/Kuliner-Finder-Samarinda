# Kuliner-Finder-Samarinda
Program ini dirancang untuk mengelola dan memfasilitasi pencarian data kuliner di Samarinda. Aplikasi ini membantu pengguna untuk mencatat tempat-tempat kuliner dan menu-menu di dalamnya, serta menyediakan fitur-fitur pencarian yang memudahkan pengguna mencari kriteria kuliner yang diinginkan. Perkembangan

# Deskripsi Program
Perkembangan awal program adalah sistem manajemen data sederhana yang mengimplementasikan konsep Create, Read, Update, Delete (CRUD). Data kuliner dibagi menjadi dua entitas utama:
1. TempatKuliner: Menyimpan informasi tentang tempat makan atau kafe, termasuk nama, lokasi, dan rating.
2. MenuKuliner: Menyimpan informasi tentang menu yang tersedia di suatu tempat, termasuk nama, jenis (makanan/minuman), harga, dan rating.

# Fitur-Fitur Utama
1. Create (Buat)

Tambah Tempat Kuliner: Menambahkan data tempat kuliner baru, lengkap dengan nama, lokasi, dan rating.

Tambah Menu: Menambahkan menu baru ke tempat kuliner yang sudah ada. Jenis menu dibatasi menjadi dua pilihan: "Makanan" atau "Minuman".

Read (Baca)

Tampilkan Semua Kuliner: Menampilkan seluruh data tempat kuliner dan menu yang tercatat di dalam sistem.

Cari Kuliner: Mencari tempat atau menu berdasarkan kata kunci.

Filter Kuliner: Melakukan pencarian spesifik dengan filter multi-level, yaitu:

Filter Rating: Menyaring menu berdasarkan rentang rating (1-2, 3-4, atau 5).

Filter Harga: Menyaring menu berdasarkan rentang harga (< Rp 15.000, Rp 15.000 - Rp 30.000, atau > Rp 30.000).

Kombinasi Filter: Setelah memilih satu filter, pengguna dapat memilih untuk menambahkan filter lain (misalnya, mencari menu dengan rating tinggi dan harga terjangkau).

Rekomendasi Makanan: Menampilkan daftar menu dengan rating tertinggi yang tercatat dalam sistem.

Update (Perbarui)

Perbarui Tempat: Mengubah nama, lokasi, atau rating dari tempat kuliner.

Perbarui Menu: Mengubah nama, jenis, harga, atau rating dari menu tertentu.

Delete (Hapus)

Hapus Tempat: Menghapus data tempat kuliner beserta seluruh menu di dalamnya.

Hapus Menu: Menghapus menu dari sebuah tempat kuliner.
