# java-oop-abstract-interface
Bu proje, Java'da Nesne Yönelimli Programlama (OOP) kavramlarının nasıl kullanıldığını gösteren temel bir örnektir. Bir veteriner kliniği senaryosu üzerinden soyut sınıflar ve arayüzler modellenmiştir.

**İçerilen OOP Kavramları:**
* **Abstract Class (`Hayvan`):** Tüm hayvanların ortak davranışlarını (uyuma) barındırırken, hayvanlara göre değişiklik gösteren davranışları (`sesCikar`) alt sınıfların doldurması için soyut (abstract) bırakır.
* **Interface (`EvcilOlma`):** Sadece belirli bir gruba ait olan özellikleri (`sevdirKendini`) tanımlar.
* **Polymorphism / Çok Biçimlilik (`Veteriner`):** Veteriner sınıfındaki muayene metodunun, sadece tek bir hayvan türünü değil, `Hayvan` sınıfından türeyen tüm nesneleri (Kedi, Köpek, Kuş vb.) kabul edebilmesini sağlar.
* **Type Casting:** Üst referanstan (Hayvan) alt referansa (Kedi) dönüşüm işlemi.

**Kullanılan Dil:**
* Java
