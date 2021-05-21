package com.cxd;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class text {
    public static void main(String[] args) {
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.163.com");
        email.setCharset("utf-8");
        try {
            email.addTo("1574656528@qq.com");
            email.setFrom("17385767631@163.com","cxd");
            email.setAuthentication("17385767631@163.com","YGAVMYYUEIJSBVAQ");
            email.setSubject("主题是这个，我想告诉你");
            email.setMsg("这是我想要说的内容，希望您能看看");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }
}
