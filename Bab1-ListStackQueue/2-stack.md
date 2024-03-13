# 2 - Konsep Stack

Stack adalah struktur data LIFO (last-in-first-out) yang artinya elemen yang dimasukkan terakhir, ialah yang pertama kali harus keluar, sama halnya dengan tumpukan buku. Perhatikan contoh ilustrasi di bawah:

![Ilustrasi](https://visualgo.net/img/stack_illustration.png)

Dalam bahasa Java, stack dapat diakses melalui header `<stack>` dan memanfaatkan linked list sebagai tempat penyimpanannya.

## 2.1. Deklarasi

Contoh:
```java
std::stack<std::string> books;
```

## 2.2. Operasi

### Push

Memasukkan elemen ke bagian atas stack:
```java
books.push("HTML for Babies");
```

### Top

Mengakses elemen yang berada di bagian atas stack:
```java
std::string pick = books.peek();
```

### Pop

Mengeluarkan elemen yang berada di bagian atas stack:
```java
books.pop();
```

## Selengkapnya

- [Java Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)
