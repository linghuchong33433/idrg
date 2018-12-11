package com.fartecx.utils;

import com.fartecx.dao.UserEntityDao;
import com.fartecx.service.Impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/12/5
 * Time:09:16
 * ========================
 */
public class SendMailCode {


    /**
     * 发送激活邮件
     *
     * @param mail 用户mail
     */
    public static void sendMailCode(String mail, String code, String id) {


        ConfigReadUtil s = ConfigReadUtil.getInstance();
        String host = s.getConfigItem("sendMailHost");
        String fromName = s.getConfigItem("sendMailAddress");
        String fromPwd = s.getConfigItem("sendMailSafeCod");
        String content = s.getConfigItem("sendMailContent");
        String[] toAry = {mail};
        // 创建邮件工具类对象
        MailManager mailManager = new MailManager(host, fromName, fromPwd);
        // 发送邮件
        boolean flag;
        try {
            flag = mailManager.SendMail(toAry, "验证码",
                    "<html><head></head><body><h1>这是一封激活邮件，激活请点击以下链接</h1><h3>" +
                            "<a href='http://http://120.77.154.146:8080/ldrg/api/vi/code?code=" + code + "&id=" + id + "'>http://http://120.77.154.146:8080/ldrg/api/vi/code?code=" + code + "</a></h3></body></html>");
            if (flag) {
                System.out.println("发送成功");
            } else {
                System.out.println("发送失败");
            }
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 发送邮件验证码
     *
     * @param mail 用户mail
     */
    public static void sendMailCode(String mail, String code) {

        ConfigReadUtil s = ConfigReadUtil.getInstance();
        String host = s.getConfigItem("sendMailHost");
        String fromName = s.getConfigItem("sendMailAddress");
        String fromPwd = s.getConfigItem("sendMailSafeCod");
        String content = s.getConfigItem("sendMailContent");
        String[] toAry = {mail};
        // 创建邮件工具类对象
        MailManager mailManager = new MailManager(host, fromName, fromPwd);
        // 发送邮件
        boolean flag;
        try {
            flag = mailManager.SendMail(toAry, "您收到注册验证码", "您好，你收到的验证码为：" + code);
            if (flag) {
                System.out.println("发送成功");
            } else {
                System.out.println("发送失败");
            }
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] strings) {
        String code = "";// 随机产生4个字符
        for (int i = 0; i < 4; i++) {
            code += randomChar();
        }

        String s = MD5.md5(code);

        SendMailCode.sendMailCode("", code);
    }

    /**
     * 随机参数一个字符
     *
     * @return
     */
    private static char randomChar() {
        Random r = new Random();
        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
        return s.charAt(r.nextInt(s.length()));
    }
}
