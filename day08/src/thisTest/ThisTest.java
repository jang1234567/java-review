package thisTest;

class Car {
    // 필드
    String brand; // 차량 브랜드
    String color; // 차량 색상
    int price; // 차량 가격

    // 메소드: 차량 정보 출력
    void carInfo() {
        System.out.println(this.brand + "의 색깔은 " + this.color + "입니다");
    }

    // 생성자: 기본 생성자
    public Car() {
        this("벤틀리", "red", 50000); // 다른 생성자 호출하여 초기화
    }

    // 생성자: 브랜드와 색상을 받는 생성자
    public Car(String brand, String color) {
        this(brand, color, 10000); // 다른 생성자 호출하여 초기화
        System.out.println("생성자 실행");
//		this.brand = brand;
//		this.color = color;
    }

    // 생성자: 브랜드, 색상, 가격을 받는 생성자
    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
}

public class ThisTest {
    public static void main(String[] args) {
        // 객체 생성
        Car car1 = new Car(); // 기본 생성자 호출
        Car car2 = new Car("BMW", "White"); // 브랜드와 색상을 받는 생성자 호출
        Car car3 = new Car("KIA", "Black", 2000); // 브랜드, 색상, 가격을 받는 생성자 호출

        // 객체 정보 출력
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // 객체의 브랜드 및 가격 출력
        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car2.price);
    }
}
