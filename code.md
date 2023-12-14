Membuat program sederhana MVC untuk sistem manajemen peminjaman buku perpustakaan dalam Java, saya akan memberikan contoh yang lebih ringkas. Pertama, saya akan jelaskan mengapa saya memilih pattern MVC:

### Mengapa Menggunakan MVC?
1. **Pemisahan Tanggung Jawab**: MVC membagi aplikasi menjadi tiga komponen utama, memudahkan pemisahan antara logika bisnis, tampilan pengguna, dan kontrol alur data. Ini membantu dalam pemeliharaan dan pengembangan.
2. **Pengembangan Modular**: Dengan MVC, berbagai aspek aplikasi dapat dikembangkan dan diuji secara independen, meningkatkan efisiensi dalam pengembangan tim.
3. **Kemudahan Pemeliharaan**: Karena pemisahan yang jelas, membuat perubahan atau pembaruan pada salah satu komponen menjadi lebih mudah tanpa mempengaruhi yang lain.

### Pro dan Kontra dari MVC
**Pro**:
1. **Modularitas Tinggi**: Memudahkan dalam mengelola dan meng-update kode.
2. **Reusable Code**: Komponen dapat digunakan kembali di berbagai bagian aplikasi.
3. **Pengujian yang Mudah**: Dengan pemisahan, unit testing menjadi lebih sederhana.

**Kontra**:
1. **Kompleksitas Awal**: Untuk proyek kecil, penggunaan MVC mungkin terasa berlebihan.
2. **Kurva Pembelajaran**: Bagi pemula, memahami dan menerapkan MVC mungkin membutuhkan waktu.
3. **Overhead Tambahan**: Dapat memperkenalkan overhead tambahan dalam hal pengaturan awal dan penggunaan memori.

### Contoh Program Java MVC Sederhana

#### Model (Book.java)
```java
public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
```

#### View (BookView.java)
```java
public class BookView {
    public void printBookDetails(String bookTitle, String bookAuthor){
        System.out.println("Book: ");
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
    }
}
```

#### Controller (BookController.java)
```java
public class BookController {
    private Book model;
    private BookView view;

    // Constructor
    public BookController(Book model, BookView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.printBookDetails(model.getTitle(), model.getAuthor());
    }
}
```

#### Main (Main.java)
```java
public class Main {
    public static void main(String[] args) {
        Book model = retrieveBookFromDatabase();
        BookView view = new BookView();
        BookController controller = new BookController(model, view);

        controller.updateView();
    }

    private static Book retrieveBookFromDatabase(){
        // Asumsikan kita mendapat data ini dari database
        return new Book("To Kill a Mockingbird", "Harper Lee");
    }
}
```

Dalam contoh ini, `Book` adalah model yang menyimpan data, `BookView` adalah view yang menyajikan data ke pengguna, dan `BookController` menghubungkan model dan view. Program ini memisahkan logika bisnis dari tampilan pengguna, membuatnya lebih mudah untuk dikelola dan diuji..
