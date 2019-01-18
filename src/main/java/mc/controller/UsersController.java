package mc.controller;

import javax.annotation.Resource;

import mc.pojo.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mc.service.UsersService;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UsersController {

    @Resource
    private UsersService userService;

    @RequestMapping("/index.html")
    public String index(@ModelAttribute User user) {
        return "index";
    }

    @RequestMapping(value = "/index.html",method = RequestMethod.POST)
    public String login(User user) {
        if(userService.login(user)!=null){
            System.out.println("登陆成功");
        }else
        {
            System.out.println("登陆失败");
        }

        return "index";
    }


}
