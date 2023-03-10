import java.util.Scanner;

public class AutoService {
    public static void modify(Car car) {
        // Заменяем все символы "a" и "A" на "o"
        String brand = car.getBrand().replaceAll("[aA]", "o");
        // Заменяем все символы "i" и "I" на "e"
        brand = brand.replaceAll("[iI]", "e");
        // Приводим все символы к нижнему регистру
        brand = brand.toLowerCase();
        // Устанавливаем измененную марку автомобиля
        car.setBrand(brand);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        // Считываем введенную марку автомобиля
        String brand = scanner.nextLine();
        // Создаем объект автомобиля
        Car car = new Car(brand);
        // Модифицируем марку автомобиля
        AutoService.modify(car);
        // Выводим исходную и измененную марки автомобиля
        System.out.println("Изначальная марка автомобиля: " + brand + ", измененная марка автомобиля: " + car.getBrand());
    }
}

class Car {
    private String brand;

    // конструктор, который устанавливает марку автомобиля
    public Car(String brand) {
        this.brand = brand;
    }

    // метод для получения марки автомобиля
    public String getBrand() {
        return brand;
    }

    // метод для установки марки автомобиля
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
