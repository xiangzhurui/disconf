package com.baidu.disconf.web.config;

import lombok.ToString;
import org.springframework.stereotype.Service;

/**
 * @author knightliao
 */
@ToString
@Service
public class ApplicationPropertyConfig {

    /**
     * 邮件服务器
     */
    private String emailHost;

    /**
     * 发件人密码
     */
    private String emailPassword;
    /**
     * 发件人用户名
     */
    private String emailUser;
    /**
     * email 发件端口号
     */
    private String emailPort;
    /**
     * 发件人邮箱地址
     */
    private String fromEmail;
    /**
     * 收件人邮箱地址
     */
    private String emailReceiver;
    /**
     * 邮件监控开关
     */
    private boolean emailMonitorOn = false;

    /**
     * consistency
     */
    private boolean checkConsistencyOn = false;

    /**
     * 服务域名
     */
    private String domain;

    public String getEmailHost() {
        return emailHost;
    }

    public void setEmailHost(String emailHost) {
        this.emailHost = emailHost;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getEmailPort() {
        return emailPort;
    }

    public void setEmailPort(String emailPort) {
        this.emailPort = emailPort;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public boolean isEmailMonitorOn() {
        return emailMonitorOn;
    }

    public void setEmailMonitorOn(boolean emailMonitorOn) {
        this.emailMonitorOn = emailMonitorOn;
    }

    public boolean isCheckConsistencyOn() {
        return checkConsistencyOn;
    }

    public void setCheckConsistencyOn(boolean checkConsistencyOn) {
        this.checkConsistencyOn = checkConsistencyOn;
    }

    public String getEmailReceiver() {
        return emailReceiver;
    }

    public void setEmailReceiver(String emailReceiver) {
        this.emailReceiver = emailReceiver;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


}
