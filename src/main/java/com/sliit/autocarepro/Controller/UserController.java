package com.sliit.autocarepro.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer registerCustomer(@RequestBody Customer customer) {
        customerService.registerCustomer(customer);
        return customer;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return customer;
    }

    @DeleteMapping(params = "id")
    public void deleteCustomer(@RequestParam int id) {
        customerService.deleteCustomer(id);
    }
}
