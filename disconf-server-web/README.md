### Nginx 配置
```
upstream disconf {
        server 127.0.0.1:9090;
    }

server {

    listen   9999;
    server_name disconf.com;
    access_log ~/IdeaProjects/disconf-web-html/logs/disconf/access.log;
    error_log ~/IdeaProjects/disconf-web-html/logs/disconf/error.log;

    location / {
        root ~/IdeaProjects/disconf-web-html/html/;
        # index  login.html main.htm;
        if ($query_string) {
            expires max;
        }
    }

    location ~ ^/(api|export) {
        proxy_pass_header Server;
        proxy_set_header Host $http_host;
        proxy_redirect off;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Scheme $scheme;
        proxy_pass http://disconf;
    }
}
```