package org.example;

import org.passay.PasswordGenerator;

public class User {

    private String password;

    public void initPassword(PasswordGeneratePolicy passwordGenerator){
        // as-is
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator()();
        //String password = randomPasswordGenerator.generatePassword();
        //기존에는 클래스를 import하였지만 변경된 코드는 쿨래스를 import하지않아 결합도를 낮출 수 있다
        // to-be
        String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <=12) {
            this.password = password;
        }


    }

    public String getPasswprd() {
        return password;
    }
}
