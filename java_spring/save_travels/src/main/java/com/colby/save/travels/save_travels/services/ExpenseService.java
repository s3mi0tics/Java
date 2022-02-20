package com.colby.save.travels.save_travels.services;

import java.util.List;
import java.util.Optional;

import com.colby.save.travels.save_travels.models.Expense;
import com.colby.save.travels.save_travels.repositories.ExpenseRepository;

import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    // Constructor
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    // retrieves all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    // creates an expense
    public Expense createExpense(Expense e) {
        return expenseRepository.save(e);
    }
    // retrieves a expense if it exists (optional)
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if (optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    
    // update a expense
    public Expense updateExpense(Expense e) {
        return expenseRepository.save(e);
    }
    
    // public Expense updateExpense(Expense expense, Long id) {
    //     Optional<Expense> optionalExpense = expenseRepository.findById(id);
    //     if (optionalExpense.isPresent()) {
    //     Expense expense1 = optionalExpense.get();
    //     expense1.setName(expense.getName());
    //     expense1.setVendor(expense.getVendor());
    //     expense1.setAmount(expense.getAmount());
    //     expense1.setDescription(expense.getDescription());
    //         return expenseRepository.save(expense1);
    //     } else {
    //         return null;
    //     } 
    // }
    // delete a expense
    public String deleteExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if (optionalExpense.isPresent()) {
            expenseRepository.deleteById(id);
            return "Deleted";
        } else {
            return "No expense to delete";
        }
    }
}