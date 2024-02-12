package com.tushar.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
//        return "index";
          return "index1";
    }

    //Servlet way of doing
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }
//    @RequestMapping("/add")
//    public String add(int num1, int num2, HttpSession session){ //we will pass the query parameters in this
//
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }

    /*@RequestMapping("/add")
    public String add(int num1, int num2, Model model){ //we will pass the query parameters in this

        int result = num1 + num2;
        model.addAttribute("result", result);
        return "result";
    }*/

//    @RequestMapping("/add")
//    public ModelAndView add(int num1, int num2, ModelAndView mv){ //we will pass the query parameters in this
//
//        int result = num1 + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//    }

    //---------
    //what if we want to save some data coming from client in our DB

//    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){ //we will pass the query parameters in this
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//        return mv;
//    }

//    @RequestMapping("/addAlien")
//    public String addAlien(@ModelAttribute("alien") Alien alien){ //we will pass the query parameters in this
//        return "result";
//    }

    //model attribute is also optional;
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){ //we will pass the query parameters in this
        return "result";
    }

    //we can use modelAttribute on top of method as well
    //if we want to make any variable as dynamic

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
}
