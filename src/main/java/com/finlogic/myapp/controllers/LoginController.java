package com.finlogic.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("login.fin")
public class LoginController
{
    @RequestMapping(params="cmdAction=getLandingPage", method = RequestMethod.GET)
    public ModelAndView showLandingPage(HttpServletRequest request, HttpServletResponse response) {
      ModelAndView mav = new ModelAndView("landing");
      
      return mav;
    }
    @RequestMapping(params="cmdAction=getErrorPage", method = RequestMethod.GET)
    public ModelAndView showErrorPage(HttpServletRequest request, HttpServletResponse response) {
      ModelAndView mav = new ModelAndView("error");
      
      return mav;
    }
}