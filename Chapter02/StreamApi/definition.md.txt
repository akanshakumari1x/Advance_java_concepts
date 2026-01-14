#How Streams Are Used in Spring Boot Services:-

##In Spring Boot, Streams are mostly used in:
Service layer
DTO conversion
Filtering data
Grouping & aggregation
Business logic
They usually come after data is fetched from database using JPA/Hibernate.


1. Filtering Data from Repository.
Repository Layer
List<Employee> findAll();

2.Service Layer
public List<Employee> getHighSalaryEmployees() {
    return employeeRepository.findAll()
                             .stream()
                             .filter(e -> e.getSalary() > 50000)
                             .toList();
}
