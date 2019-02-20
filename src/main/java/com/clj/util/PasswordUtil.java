package com.clj.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class PasswordUtil {

    public static String md5(String username,String password){
        Md5Hash md5Hash = new Md5Hash(password,username);
        return md5Hash.toString();
    }
}
