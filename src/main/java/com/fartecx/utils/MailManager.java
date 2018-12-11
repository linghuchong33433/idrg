package com.fartecx.utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailManager {

	private String host;

	private String username;

	private String password;
	
	private String email;// 收件人邮箱
    private String code;// 激活码
	private String uid;//登录账号的uuid
	private String mark;//跟随验证码的标识

	/**
	 * 
	 * @param host		服务器地址
	 * @param username	发件人用户名
	 * @param password	发件人密码
	 */
	public MailManager(String host,String username, String password) {
		this.host = host;
		this.username = username;
		this.password = password;
	}
	public MailManager(String host,String username, String password, String code) {
		this.host = host;
		this.username = username;
		this.password = password;
		this.code = code;
	}
	public MailManager(String host,String username, String password, String code,String uid,String mark) {
		this.host = host;
		this.username = username;
		this.password = password;
		this.code = code;
		this.uid = uid;
		this.mark = mark;
	}

	/**
	 * 发送邮件
	 * 
	 * @param to
	 *            接收人
	 * @param subject
	 *            标题
	 * @param msgtext
	 *            内容
	 * @return
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	public boolean SendMail(String[] to, String subject, String msgtext)
			throws MessagingException, UnsupportedEncodingException {
		boolean flag = false;
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", host);
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");

		// 使用环境属性和授权信息，创建邮件会话
		Session session = Session.getDefaultInstance(props);
		// 控制台打印日志
		session.setDebug(true);
		// 创建邮件消息
		Message msg = new MimeMessage(session);

		// 设置发件人
		InternetAddress from = new InternetAddress(username);
		msg.setFrom(from);

		if (to.length > 0) {
			InternetAddress[] toAddr = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddr[i] = new InternetAddress(to[i]);
			}
			// 设置收件人的邮箱
			msg.setRecipients(RecipientType.TO, toAddr);
			// 设置邮件标题
			msg.setSubject(subject);
			// 设置发送时间
			msg.setSentDate(new Date());
			// 设置邮件的内容体
			BodyPart mbp = new MimeBodyPart();
			mbp.setContent(msgtext, "text/html;charset=utf-8");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mbp);
			msg.setContent(multipart);

			msg.saveChanges();
			// 建立邮件传输对象
			Transport transport = session.getTransport("smtp");
			// 与服务端建立连接
			transport.connect(host, username, password);
			// 发送邮件
			transport.sendMessage(msg, msg.getAllRecipients());
			// 关闭
			transport.close();

			flag = true;
		} else {
			System.out.println("接收用户为空");
		}

		return flag;
	}
}
