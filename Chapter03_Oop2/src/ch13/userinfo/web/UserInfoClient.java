package ch13.userinfo.web;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        // db.properties의 "key=value"같이 쌍으로 되어 있는 것을 쌍(페어)으로 불러 들일 수 있는 객체(기능).
        Properties prop = new Properties();
        prop.load(fis);

        // 키인 DBTYPE에 대한 value를 반환해준다.
        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("asdf");
        userInfo.setPasswd("12345");
        userInfo.setUserName("이둘리");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("db support error!");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
