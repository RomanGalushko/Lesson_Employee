package pro.sky.Lesson.Service;

import pro.sky.Lesson.Data.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName,
                         Integer departmentId, Integer salary);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    List<Employee> allEmployee();

    List<Employee> employeeMaxSalary(Integer departmentId);

    List<Employee> employeeMinSalary(Integer departmentId);

    List<Employee> employeeAllDepartmentId(Integer departmentId);

    List<Employee> allEmployeeByDepartments();

    void checkInvalidNameException(String lastName, String wrongFirstname);

    void checkThereEmployeeException(Map<String, Employee> Employee, String fullName);

    void checkEmployeeNotFoundException(Map<String, Employee> Employee, String fullName);
}