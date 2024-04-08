package task;

public class BasicTv {
    // 필드
    String color; // TV 색상
    int inch; // TV 크기(인치)
    int price; // TV 가격
    boolean power; // TV 전원 상태 (true: 켜짐, false: 꺼짐)
    int channel = 1; // 현재 채널

    // 생성자: 색상, 인치, 가격을 받는 생성자
    public BasicTv(String color, int inch, int price) {
        this.color = color;
        this.inch = inch;
        this.price = price;
    }

    // 생성자: 색상, 인치, 가격, 채널을 받는 생성자
    public BasicTv(String color, int inch, int price, int channel) {
        this.color = color;
        this.inch = inch;
        this.price = price;
        this.channel = channel;
    }

    // 메소드: 전원을 켜거나 끄는 메소드
    // 매개변수 없음, 리턴값 없음
    void powerOnOff() {
        power = !power; // 전원 상태 변경
        if (power) {
            System.out.println("TV 전원이 켜졌습니다");
        } else {
            System.out.println("TV 전원이 꺼졌습니다");
        }
    }

    // 메소드: 채널을 올리는 메소드
    // 매개변수 없음, 현재 채널을 반환
    int channelUp() {
        return ++channel; // 채널을 1 증가시키고 반환
    }

    // 메소드: 채널을 내리는 메소드
    // 매개변수 없음, 현재 채널을 반환
    int channelDown() {
        return --channel; // 채널을 1 감소시키고 반환
    }
}
