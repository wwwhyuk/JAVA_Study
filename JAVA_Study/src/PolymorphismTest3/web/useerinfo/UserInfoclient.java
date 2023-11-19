package PolymorphismTest3.web.useerinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoclient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String type = prop.getProperty("DB-TYPE");

        if ("ORACLE".equals(type)) {
            System.out.println("oracle");
        } else if ("MYSQL".equals(type)) {
            System.out.println("mysql");
        } else {
            System.out.println("no dbms");
        }
    }
}
