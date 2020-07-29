package com.denmats.expensetracker.controller;


import com.denmats.expensetracker.model.Expense;
import com.denmats.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MasterController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
public ModelAndView home(){
    ModelAndView mav = new ModelAndView("home");
    mav.addObject("message","List of expenses");
    List<Expense> expenses = expenseService.findAll();
//        System.out.println(expenses);
    mav.addObject("expenses",expenses);
    return mav;
}
}
