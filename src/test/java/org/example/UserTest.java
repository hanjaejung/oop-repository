package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest(){

        // given
        User user = new User();

        //user.initPassword(new RandomPasswordGenerator());
        user.initPassword(new CorrectPasswordGenerator());
        //initPassword메소드 수행시 RandomPasswordGenerator클래스를 import하지 않아
        //결합도가 더 낮아졌다
        assertThat(user.getPasswprd()).isNotNull();
    }

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest2(){

        // given
        User user = new User();

        //user.initPassword(new RandomPasswordGenerator());
        user.initPassword(new WrongPasswordGenerator());
        //initPassword메소드 수행시 RandomPasswordGenerator클래스를 import하지 않아
        //결합도가 더 낮아졌다

        assertThat(user.getPasswprd()).isNull();
    }
}
