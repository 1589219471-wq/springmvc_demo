package com.itheima.controller;

import com.itheima.pojo.User;
import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
public class RequestController {

    @RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request){
        String name=request.getParameter( "name" );
        int age = Integer.parseInt( request.getParameter( "age" ) );
        System.out.println(name+":"+age);
        return "OK";
    }
}*/
@RestController
public class RequestController {

    @RequestMapping("/simpleParam")
    public String simpleParam2(String name,Integer age){
        System.out.println(name+":"+age);

        return "OK";
    }


    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }
}
