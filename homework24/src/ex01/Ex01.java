package ex01;

class Movie implements Runnable {
    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(movieName + " 영화 상영중~ (" + i + "/10)");
            try {
                Thread.sleep(1000); // 1초에 한 번씩 표시
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(movieName + " 영화 종료!!!!!");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Movie movieA = new Movie("서울의 봄");
        Movie movieB = new Movie("나폴레옹");
        Movie movieC = new Movie("3일의 휴가");

        Thread threadA = new Thread(movieA);
        Thread threadB = new Thread(movieB);
        Thread threadC = new Thread(movieC);

        threadA.start();

        try {
            threadA.join(); // A관 영화가 끝날 때까지 기다림
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadB.start();
        threadC.start();
    }
}
