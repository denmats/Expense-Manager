package com.denmats.expensetracker.service;

import com.denmats.expensetracker.dao.ExpenseRepository;
import com.denmats.expensetracker.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }
}
