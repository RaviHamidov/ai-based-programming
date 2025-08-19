# Advanced Java Concepts

## ArrayList

### ArrayList nedir ? Array'den ferqi

| Xususiyyet        | Array                                                                                                                  | ArrayList                                                                                                                                 |
| :---------------- | :--------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------------------------------------- |
| **Olcu (Size)**   | **Sabitdir (Fixed).** Yaradilarken olcusu verilir ve deyisdirile bilmez.                                               | **Dinamikdir (Resizable).** Element elave edib sildikce olcusu avtomatik boyuyub-kicilir.                                                 |
| **Tip (Type)**    | **Primitiv** (`int`, `char`) ve **Obyekt** (`String`) tiplerini saxlaya biler.                                         | Yalniz **Obyekt** tiplerini saxlaya biler. Primitivler ucun `Wrapper Class` istifade olunur (`Integer`, `Character`).                     |
| **Performans**    | **Yuksekdir.** Elementlere birbasa (index ile) muraciet olundugu ucun cox suretlidir.                                  | **Bir az asagidir.** Element elave edib silerken (xususile olcu deyisende) arxa planda elave emeliyyatlar aparilir.                       |
| **Funksionalliq** | **Mehduddur.** Yalniz `length` xususiyyeti var. Elave etme, silme kimi emeliyyatlar ucun oz alqoritmlerini yazmalisan. | **Zengindir.** Collections Framework-un bir parcasidir. `add()`, `remove()`, `size()`, `get()`, `contains()` kimi coxlu hazir metodu var. |
| **Generics**      | Generics desteklemir.                                                                                                  | **Generics destekleyir.** Bu, tip tehlukesizliyini (type safety) temin edir (`ArrayList<String>`).                                        |

### ArrayList istifadesi

```java
// ArrayList sinfini istifade etmek ucun onu import edirik
import java.util.ArrayList;
import java.util.Collections; // Sort etmek ucun

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. ArrayList'in yaradilmasi (String tipli elementler saxlayacaq)
        ArrayList<String> seherler = new ArrayList<>();

        // 2. Elementlerin elave edilmesi (.add() metodu)
        seherler.add("Baki");
        seherler.add("Gence");
        seherler.add("Sumqayit");
        seherler.add("Lenkeran");

        // Ilkin siyahini cap edek
        System.out.println("Ilkin siyahi: " + seherler);

        // 3. Elementlerin sayini elde etmek (.size() metodu)
        System.out.println("Siyahidaki elementlerin sayi: " + seherler.size());

        // 4. Spesifik bir elemente muraciet (.get(index) metodu)
        // Indeksler 0-dan baslayir
        String ikinciSeher = seherler.get(1); // 1-ci indeksdeki element (Gence)
        System.out.println("Ikinci seher: " + ikinciSeher);

        // 5. Elementin deyisdirilmesi (.set(index, yeniElement) metodu)
        seherler.set(0, "Susa"); // 0-ci indeksdeki "Baki" elementini "Susa" ile evez edir
        System.out.println("Deyisdirilmis siyahi: " + seherler);

        // 6. Siyahi uzre iterasiya (butun elementleri bir-bir gezmek)
        System.out.println("\n--- Siyahidaki butun seherler ---");
        for (String seher : seherler) {
            System.out.println(seher);
        }

        // 7. Elementin silinmesi (.remove() metodu)
        seherler.remove("Sumqayit"); // Dəyərə görə silmə
        // seherler.remove(1); // İndeksə görə silmə də mümkündür
        System.out.println("\n'Sumqayit' silindikden sonraki siyahi: " + seherler);

        // 8. Elementin movcud olub-olmadigini yoxlamaq (.contains() metodu)
        boolean susaVarmi = seherler.contains("Susa");
        System.out.println("\nSiyahida 'Susa' varmi? " + susaVarmi); // true

        // 9. Siyahini siralamag (sort etmek)
        Collections.sort(seherler);
        System.out.println("\nSiralanmis siyahi: " + seherler);

        // 10. Siyahini tam temizlemek (.clear() metodu)
        seherler.clear();
        System.out.println("\nTemizlenmis siyahi: " + seherler);
        System.out.println("Siyahi bosdurmu? " + seherler.isEmpty()); // true
    }
}
```

## Exception & Exception Handling

> Exception Java programin programin normal axisini pozan xetalarin diger sozle istisnalarin nece idare olunacaqini izah edir, Error'dan ferqi odurki `Exception` programda qarsilasib hell oluncaq problemdir qarsisi alina bilinecek ancaq `Error` programin hell ede bilmeyeceyi ciddi problemler (meselen yaddasin dolmasi kimi)

### Addım 1: `try-catch` Bloku

Xəta baş verə biləcək kod `try` blokunun daxilinə yazılır. Əgər bu blokda bir istisna yaranarsa, proqram dərhal `catch` blokuna keçir və orada olan kodları icra edir.

```Java
try {
// İstisna yarada biləcək kod
} catch (ExceptionType e) {
// İstisna baş verdikdə icra olunacaq kod
}
```

Example: 0'a bolme xetasi

```Java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Bu sətir xəta yaradacaq
            System.out.println("Nəticə: " + result); // Bu sətir icra olunmayacaq
        } catch (ArithmeticException e) {
            System.out.println("Xəta baş verdi: Sıfıra bölmək olmaz!");
        }
        System.out.println("Proqram davam edir...");
    }
}
```

### Addım 2: `finally` Bloku

```Java
try {
    // Kod
} catch (ExceptionType e) {
    // Xətanın idarə olunması
} finally {
    // Hər zaman icra olunacaq kod
}
```

Example:

```Java
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[1]); // Xəta yoxdur
        } catch (Exception e) {
            System.out.println("Bir xəta baş verdi.");
        } finally {
            System.out.println("'finally' bloku həmişə işləyir.");
        }
    }
}
```

### Addim 3: `throw` Acar sozu

`throw` acar sozu ile ozumuz istisna yarada biler ve onu ata bilerik, bu esasen program mentiqine uygun olmayan hallar uchun istifade olunur.

```Java
public class Main {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Giriş qadağandır - yaşınız 18-dən azdır.");
        } else {
            System.out.println("Girişə icazə verildi.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Xəta tutuldu: " + e.getMessage());
        }
    }
}
```
### Addim 4: `throws` Acar sozu

bu keyword'un megzini anlamadi

