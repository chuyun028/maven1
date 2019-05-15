package com.kgc.emailTest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    /**
     * 1.
     * @throws Exception
     */
    @Test
    public void testSimpleMail() throws Exception {
    	mailService.sendSimpleMail("1525031069@qq.com","test simple mail"," 测试发送简单邮件");
    }
    /**
     * 2
     * @throws Exception
     */
    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("1525031069@qq.com","test simple mail",content);
    }
    
    /**
     * 3.
     */
    @Test
    public void sendAttachmentsMail() {
        String filePath="e:\\tmp\\application.log";
        mailService.sendAttachmentsMail("1525031069@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }
}
