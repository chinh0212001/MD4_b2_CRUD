package rikkei.academy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Customer;
import rikkei.academy.service.ICustomerService;

import java.util.List;

@Controller
//@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;
    @GetMapping("/")
    public String showListCustomer(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("listCustomer", customerList);
        return "list";
    }
    @GetMapping("/detail/{id}")
    public String detailCustomer(@PathVariable Long id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "detail";
    }
    @GetMapping("/show/update/{id}")
    public String detailUpdate(@PathVariable Long id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customerUpdate", customer);
        return "edit";
    }
    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customerUpdate") Customer customer){
        customerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/show/delete/{id}")
    public String detailDelete(@PathVariable Long id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customerDelete",customer);
        return "delete";
    }
    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customerDelete")Customer customer){
        customerService.deleteById(customer.getId());
        return "redirect:/";
    }
}