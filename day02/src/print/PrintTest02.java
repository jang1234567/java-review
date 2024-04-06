package print;

public class PrintTest02 {	//PrintTest02 클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		System.out.println("printf() 메소드 연습");
//		printf() 메소드 연습 출력후 줄바꿈;
		System.out.println("내 java 점수는 100점 입니다.");
//		내 java 점수는 100점 입니다. 출력후 줄바꿈
		
		System.out.printf("내 java 점수는 %d점 입니다\n", 100);
//		내 java 점수는 100점 입니다 출력;
		System.out.printf("내 평균 점수는 %.2f점 입니다\n", 99.55);
//		내 평균 점수는 99.55점 입니다 출력
		System.out.printf("내 학점은 %c점 입니다\n", 'A');
//		내 학점은 A점 입니다 출력
		System.out.printf("내 이름은 %s 입니다\n", "슈퍼맨");
//		내 이름은 슈퍼맨 입니다 출력
		
		//제 이름은 %s이고, 나이는 %d살이고, 취미는 %s입니다
		//printf()
		System.out.printf("제 이름은 \"%s\"이고, 나이는 %d살이고, 취미는 %s입니다","장윤근",26,"헬스");
//		제 이름은 "장윤근"이고, 나이는 26살이고, 취미는 헬스입니다 출력
		
	}	//메인메소드의 끝 영역

}	////PrintTest02 클래스의 끝 영역
