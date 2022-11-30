package com.jyp.controller;

import com.jyp.pojo.User;
import com.jyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/23 12:41
 */
@Controller
public class ForeController {
    @Autowired
    UserService userService;

    @RequestMapping("confirmpay")
    public String confirmpay() {
        return "fore/confirmpay";
    }

    @RequestMapping("confirmreceip")
    public String confirmreceip() {
        return "fore/confirmreceip";
    }

    @RequestMapping("dodo")
    public String dodo() {
        return "fore/dodo";
    }

    @RequestMapping("evalute")
    public String evalute() {
        return "fore/evalute";
    }

    @RequestMapping("footer")
    public String footer() {
        return "fore/footer";
    }

    @RequestMapping("forebought")
    public String forebought() {
        return "fore/forebought";
    }

    @RequestMapping("gdcart")
    public String gdcart() {
        return "fore/gdcart";
    }

    @RequestMapping("goodsdetails")
    public String goodsdetails() {
        return "fore/goodsdetails";
    }

    @RequestMapping("header")
    public String header() {
        return "fore/header";
    }

    @RequestMapping("login")
    public String login() {
        return "fore/login";
    }

    @RequestMapping("newfirstpage")
    public String newfirstpage() {
        return "fore/newfirstpage";
    }

    @RequestMapping("newfirstpage/{uid}")
    public String newfirstpage1() {
        return "fore/newfirstpage";
    }

    @RequestMapping("nodelivery")
    public String nodelivery() {
        return "fore/nodelivery";
    }

    @RequestMapping("noevaluate")
    public String noevaluate() {
        return "fore/noevaluate";
    }

    @RequestMapping("noreceipt")
    public String noreceipt() {
        return "fore/noreceipt";
    }

    @RequestMapping("nppay")
    public String nppay() {
        return "fore/nppay";
    }

    @RequestMapping("regist")
    public String regist() {
        return "fore/regist";
    }

    @RequestMapping("succ")
    public String succ() {
        return "fore/succ";
    }

    @RequestMapping("succreceip")
    public String succreceip() {
        return "fore/succreceip";
    }

    @RequestMapping("Personalcenter")
    public String PersonalCenter() {
        return "fore/Personalcenter";
    }

    @RequestMapping("Personalcenter/{uid}")
    public String PersonalCenter1() {
        return "fore/Personalcenter";
    }

    @RequestMapping("分类页面")
    public String foreCategory() {
        return "fore/分类页面";
    }

    @RequestMapping("Category1/{uid}/{cid}")
    public String foreCategory1() {
        return "fore/分类页面";
    }

    @RequestMapping("支付成功界面")
    public String paysuccess() {
        return "fore/支付成功界面";
    }

    @RequestMapping("支付页面")
    public String payPage() {
        return "fore/支付页面";
    }

    @RequestMapping("首页")
    public String firstPage22() {
        return "fore/首页";
    }

    @RequestMapping("adduser")
    public String addUser(User u) {
        userService.addUser(u);
        return "redirect:/login";
    }

    @RequestMapping("userlogin")
    public String UserLogin(User u) {
        List<User> loginselect = userService.loginselect(u);
        if (!loginselect.isEmpty()) {
            u = loginselect.get(0);
            return "redirect:/newfirstpage/" + u.getId();
        } else {
            return "admin/error";
        }
    }
}
