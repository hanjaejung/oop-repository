# oop-repository
객체지향 MVC 만들기

2022-11-18
junit 테스트 클래스 중 UserTest 클래스에서
passwordTest 메소드 테스트는
initPassword메소드에 비밀번호 8자 이상 12자 이하인 값을 불러와 테스트시 (벨리데이션에 걸리지 않는 패스워드)
user 리턴값이 null이 아니면 정상적으로 테스트 완료입니다.

passwordTest2 메소드 테스트는
initPassword메소드에 비밀번호 8자 미만 값을 불러와 테스트시 (벨리데이션에 걸리는 패스워드)
user 리턴값이 null이 이면 정상적으로 테스트 완료입니다.

기존에는 initPassword메소드에 랜덤하게 비밀번호를 추출해주는 클래스(RandomPasswordGenerator)를 직접 import하였지만
그러면 결합도가 강해지게 되므로 입력값을 인터페이스로 하여
벨리데이션에 걸리지 않는 패스워드 값만 내는 클래스(CorrectPasswordGenerator)와
벨리데이션에 걸리는 패스워드 값만 내는 클래스(WrongPasswordGenerator)를 상속받게 해
결합도를 느슨하게 하였습니다.
