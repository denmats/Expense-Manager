package com.denmats.expensetracker.service;

import com.denmats.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();

    void save(Expense expense);
}
