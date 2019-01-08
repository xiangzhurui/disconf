package com.baidu.configuration;

import com.baidu.dsp.common.interceptor.login.LoginInterceptor;
import com.baidu.dsp.common.interceptor.session.SessionInterceptor;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 *
 * @author xiangzhurui
 * @version 2018-12-11 17:40
 */
@Configuration
public class InterceptorsConfiguration extends WebMvcConfigurerAdapter {

    @Value("${domain}")
    private String domian;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        SessionInterceptor sessionInterceptor = new SessionInterceptor();

        LoginInterceptor loginInterceptor = new LoginInterceptor();
        loginInterceptor.setNotJsonPathList(Lists.newArrayList("/"));
        loginInterceptor.setNotInterceptPathList(
                Lists.newArrayList(
                        "/api/account/signin",
                        "/api/zoo/hosts",
                        "/api/zoo/prefix",
                        "/api/config/item",
                        "/api/config/file",
                        "/api/config/list",
                        "/api/config/simple/list"

                ));
        loginInterceptor.setXONE_COOKIE_DOMAIN_STRING("domian");

        registry.addInterceptor(sessionInterceptor)
                .addPathPatterns("/**");
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**");

        super.addInterceptors(registry);
    }
}
