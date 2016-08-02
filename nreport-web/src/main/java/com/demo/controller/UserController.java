package com.demo.controller;

import com.demo.model.User;
import com.jfinal.core.Controller;

/**
 * Created by fitz.li on 2016/7/29.
 */
public class UserController extends Controller {

    public void list(){
        setAttr("userPage", User.me.paginate(getParaToInt(0, 1), 10));
        render("list.html");
    }

    public void edit(){
        setAttr("user", User.me.findById(getParaToInt()));
        render("edit.html");
    }


    public void update(){
        getModel(User.class).update();
        redirect("/user/list");
    }

    public void delete(){
        User.me.deleteById(getParaToInt());
        redirect("/user/list");
    }
}
