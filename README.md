# 🚐 Aplikasi Angkot Malang

Aplikasi desktop untuk menampilkan informasi rute dan pemberhentian angkot di Kota Malang menggunakan Java Swing. Aplikasi ini membantu pengguna untuk mengetahui jadwal dan rute perjalanan angkot dengan interface yang mudah digunakan.

## ✨ Fitur Utama

- **Pemilihan Jurusan**: Dropdown untuk memilih dari 15 jurusan angkot yang tersedia
- **Visualisasi Rute**: Tampilan rute lengkap dengan pemberhentian berurutan
- **Timeline Interaktif**: Timeline visual dengan jam keberangkatan di setiap pemberhentian
- **Navigasi Mudah**: Interface yang intuitif dengan tombol navigasi
- **Data Lengkap**: Informasi jadwal keberangkatan untuk setiap pemberhentian

## 🚌 Jurusan Angkot yang Tersedia

1. **ADL** - Arjosari → Dinoyo → Landungsari
2. **AG** - Arjosari → Gadang → Hamid Rusdi
3. **AL** - Arjosari → Landungsari
4. **AT** - Arjosari → Tidar
5. **ABG** - Arjosari → Borobudur → Gadang
6. **AMH** - Arjosari → Mergosono → Gadang → Hamid Rusdi
7. **AJH** - Arjosari → Janti → Gadang → Hamid Rusdi
8. **ASD** - Arjosari → Sarangan → Dieng
9. **HL** - Hamid Rusdi → Gadang → Landungsari
10. **CKL** - Cemorokandang → Landungsari
11. **HML** - Hamid Rusdi → Gadang → Mergan → Landungsari
12. **HM** - Hamid Rusdi → Gadang → Madyopuro
13. **MKS** - Mulyorejo → Klayatan → Sukun
14. **TST** - Tlogowaru → Sarangan → Tasikmadu
15. **TSG** - Tawangmangu → Jl. Soehat → Gasek

## 🛠️ Teknologi

- **Java SE 8+** - Platform utama
- **Swing GUI** - Framework untuk antarmuka pengguna
- **LinkedList** - Struktur data untuk menyimpan pemberhentian
- **ArrayList** - Struktur data untuk menyimpan daftar angkot
- **Graphics2D** - Untuk rendering timeline visual

## 📋 Persyaratan Sistem

- Java Development Kit (JDK) 8 atau lebih baru
- Sistem operasi: Windows, macOS, atau Linux
- RAM minimal 512 MB
- Resolusi layar minimal 1200x800

## 🚀 Cara Instalasi dan Menjalankan

### 1. Persiapan
```bash
# Pastikan Java terinstall
java -version
javac -version
```

### 2. Clone atau Download
```bash
git clone <repository-url>
cd AngkotAPP
```

### 3. Kompilasi
```bash
# Compile semua file Java
javac *.java
```

### 4. Menjalankan Aplikasi
```bash
# Jalankan aplikasi
java MainApp
```

## 📁 Struktur Proyek

```
AngkotAPP/
├── MainApp.java          # Entry point aplikasi
├── LandingPage.java      # Halaman utama pemilihan jurusan
├── RutePage.java         # Halaman tampilan rute
├── DetailPage.java       # Halaman detail dengan timeline
├── TimelinePanel.java    # Panel custom untuk timeline visual
├── Angkot.java          # Model data angkot
├── Pemberhentian.java   # Model data pemberhentian
├── DataProvider.java    # Provider data statis angkot
└── README.md           # Dokumentasi proyek
```

## 🏗️ Arsitektur Aplikasi

### Model Classes
- **Angkot**: Menyimpan informasi jurusan dan daftar pemberhentian
- **Pemberhentian**: Menyimpan nama lokasi dan jadwal keberangkatan

### View Classes
- **LandingPage**: Interface pemilihan jurusan dengan dropdown
- **RutePage**: Menampilkan rute dalam format teks
- **DetailPage**: Menampilkan timeline visual dengan scroll
- **TimelinePanel**: Custom panel untuk menggambar timeline

### Data Layer
- **DataProvider**: Menyediakan data statis semua jurusan angkot

## 🎯 Cara Penggunaan

1. **Jalankan Aplikasi**: Eksekusi `java MainApp`
2. **Pilih Jurusan**: Gunakan dropdown untuk memilih jurusan angkot
3. **Lihat Jalur**: Klik "Lihat Jalur" untuk melihat rute
4. **Detail Timeline**: Klik "Lihat Detail" untuk melihat timeline visual
5. **Navigasi**: Gunakan tombol "Kembali" untuk navigasi

## 🎨 Fitur Timeline

Timeline visual menampilkan:
- **Garis Vertikal Biru**: Representasi jalur angkot
- **Lingkaran Putih**: Titik pemberhentian
- **Nama Lokasi**: Di sebelah kiri timeline
- **Jadwal Keberangkatan**: Di sebelah kanan timeline
- **Scroll Support**: Untuk rute dengan banyak pemberhentian

## 🔧 Pengembangan Lebih Lanjut

### Fitur yang Bisa Ditambahkan:
- Database integration untuk data dinamis
- Pencarian pemberhentian
- Estimasi waktu perjalanan
- Peta interaktif
- Notifikasi jadwal
- Export jadwal ke PDF

### Struktur Data:
- Menggunakan LinkedList untuk efisiensi insertion/deletion
- ArrayList untuk akses random yang cepat
- Observer pattern untuk update real-time

## 📝 Catatan Pengembang

- Data jadwal bersifat statis dan disimpan dalam `DataProvider.java`
- Aplikasi menggunakan resolusi tetap 1200x800
- Timeline menggunakan custom painting dengan Graphics2D
- Navigasi menggunakan dispose() dan create new instance

