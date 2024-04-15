package marvelheroes;

public class Hero {//Hero클래스 시작

	// Hero.java - 기본 마블 히어로 클래스
	//접근제한자 -private => 같은 클래스 내에서만 사용가능
//	=> 다른클래스에서 사용하려면 getter/setter메소드 이용
	    private String name;
	    
	    //getter/setter메소드 
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
		//메소드
	    public void useSuperpower() {
	    	if(name != null) {
	        System.out.println(name + "가(이) 슈퍼파워를 사용합니다.");
	    	}else {
	    		System.out.println("이름이 설정되지 않았습니다");
	    	}
	    }
	    //메소드
	    public void sayCatchphrase() {
	        System.out.println(name + "가(이) 대사를 외칩니다.");
	    }


	    

	// IronMan.java - 아이언맨 클래스 (Hero를 상속)
	// Hulk.java - 헐크 클래스 (Hero를 상속)
	// SpiderMan.java - 스파이더맨 클래스 (Hero를 상속)
	// Main.java - 히어로 객체를 생성하고 슈퍼파워를 사용하기(업캐스팅, 다운캐스팅을 이용하여 슈퍼파워 메소드의 내용 출력하기)

//	생성자 없이 이름이 같이 출력될 수 있도록해야함
}//Hero클래스 종료












