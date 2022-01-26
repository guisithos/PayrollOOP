package com.example.oop.employeectl;

import com.example.oop.model.Employee;

public interface EmployeeDAO {

    public void save (Employee employess);
    public void update (Employee employess);
    public void delete (Employee employess);
    public Employee get(int id);
    public List<Employee> list();

}
