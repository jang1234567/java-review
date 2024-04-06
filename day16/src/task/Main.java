package task;

public class Main {
	public static void main(String[] args) {
		UserService userService = new UserService();

		// 회원가입
		userService.registerUser("user1", "123", "장윤근", 25);
		userService.registerUser("user2", "456", "장윤", 30);

		// 중복된 아이디로 회원가입 시도
		userService.registerUser("user1", "789", "장", 40);

		// 로그인
		UserVO loggedInUser = userService.login("user1", "123");
		if (loggedInUser != null) {
			System.out.println("로그인된 사용자 정보: " + loggedInUser);
		}
	}
}
