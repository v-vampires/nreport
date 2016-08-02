package com.demo.controller;

import com.jfinal.core.Controller;

/**
 * Created by fitz.li on 2016/7/27.
 */
public class IndexController extends Controller {

    public void index(){
        render("index.html");
    }
}
