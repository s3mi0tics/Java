package com.colby.save.travels.save_travels.controllers;

import java.util.List;

import javax.validation.Valid;

import com.colby.save.travels.save_travels.models.Expense;
import com.colby.save.travels.save_travels.services.ExpenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class SaveTravelsController {

    @Autowired
    ExpenseService expenseService;

    //Show all and CreateForm
    @GetMapping("/expenses")
    public String index(@ModelAttribute("expense") Expense expense, Model model) {
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    // Create One
    @PostMapping("/expenses/create")
    public String create(
            @Valid @ModelAttribute("expense") Expense expense,
            BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Expense> expenses = expenseService.allExpenses();
            model.addAttribute("expenses", expenses);
            return "index.jsp";
        } else {
            expenseService.createExpense(expense);
            return "redirect:/expenses";
        }
    }

    //View One
    @GetMapping("/expenses/{id}")
        public String viewOne(@PathVariable("id") Long id, Model model){
            Expense expense = expenseService.findExpense(id);
            model.addAttribute("expense", expense);
            return "viewExpense.jsp";
    }


    // Edit
    @GetMapping("/expenses/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }

    @PutMapping(value = "/expenses/{id}/edit")
    public String update(@Valid @ModelAttribute("expense") Expense expense,
            BindingResult result, @PathVariable("id") Long id, Model model) {
        if (result.hasErrors()) {
            Expense expense1 = expenseService.findExpense(id);
            expense.setName(expense1.getName());
            return "edit.jsp";
        } else {
            expenseService.updateExpense(expense);
            return "redirect:/expenses";
        }
    }

    //Delete
    @DeleteMapping("/expenses/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
}
