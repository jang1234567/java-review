package task;

import java.util.ArrayList;
import java.util.List;

class UserService {
	private List<UserVO> userList;

	public UserService() {
		this.userList = new ArrayList<>();
	}

	public boolean isIdDuplicated(String id) {
		for (UserVO user : userList) {
			if (user.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public void registerUser(String id, String password, String name, int age) {
		if (!isIdDuplicated(id)) {
			userList.add(new UserVO(id, password, name, age));
			System.out.println("회원가입이 완료되었습니다.");
		} else {
			System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 사용해주세요.");
		}
	}

	public UserVO login(String id, String password) {
		for (UserVO user : userList) {
			if (user.getId().equals(id) && user.getPassword().equals(password)) {
				System.out.println("로그인 성공");
				return user;
			}
		}
		System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인해주세요.");
		return null;
	}
}
