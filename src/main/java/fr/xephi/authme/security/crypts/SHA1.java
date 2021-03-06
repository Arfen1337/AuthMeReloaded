package fr.xephi.authme.security.crypts;

import fr.xephi.authme.security.HashUtils;

public class SHA1 extends UnsaltedMethod {

    @Override
    public String computeHash(String password) {
        return HashUtils.sha1(password);
    }

}
