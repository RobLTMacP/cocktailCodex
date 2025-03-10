package maddogsoftworks.cocktail_codex.service;

import maddogsoftworks.cocktail_codex.model.Customer;
import maddogsoftworks.cocktail_codex.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Create
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    // Read
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Update
    public Customer update(Long id, Customer updatedCustomer) {
        Optional<Customer> existingCustomer = customerRepository.findById(id);
        if (existingCustomer.isPresent()) {
            updatedCustomer.setId(id);
            return customerRepository.save(updatedCustomer);
        }
        return null;
    }

    // Delete
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

}
