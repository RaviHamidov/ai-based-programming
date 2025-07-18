# Interface

**Java'da Interface**, bir class'in hansi funksiyalarin olmali olduqunu gosteren bir **sablondur**, Icinde sadece metod adlari olur, **nece isledikleri ise metodlari yazan class terefinden teyin olunur**.

> Loruca desek: `Interface` - "Ne etmelisen" deyir, "Nece etmelisen" demir

- `interface` keyword'du ile yaradilir
- Class birden chox interface `implement` ede biler
- 100% abstraction temin edir, Meselen deyekki seni SmartPhone istifade edirsen ve telefonda mueyyen application'lar var ve bunlari istifade edirsen ama bunlari kim nece yaradib nece edir maraqlanmirsan meselen bu insan'in `interface`-idi desek yalan olmaz

```Java
interface Car {
    void startEngine();
    void accelerate();
    void brake();
}

class Sedan implements Car {

    public void startEngine() {
        System.out.println("Sedan engine started.");
    }

    public void accelerate() {
        System.out.println("Sedan is accelerating smoothly.");
    }

    public void brake() {
        System.out.println("Sedan is slowing down.");
    }
}

class SportCar implements Car {

    public void startEngine() {
        System.out.println("SportCar engine roars to life!");
    }

    public void accelerate() {
        System.out.println("SportCar accelerates like a rocket!");
    }

    public void brake() {
        System.out.println("SportCar brakes instantly.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car mySedan = new Sedan();
        Car mySportCar = new SportCar();

        System.out.println("--- Sedan ---");
        mySedan.startEngine();
        mySedan.accelerate();
        mySedan.brake();

        System.out.println("\n--- SportCar ---");
        mySportCar.startEngine();
        mySportCar.accelerate();
        mySportCar.brake();
    }
}
```
