//Here Employee "has-a" Department → Aggregation.
//Weak relationship
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

class Employee {
    String empName;
    Department dept;

    Employee(String empName, Department dept) {
        this.empName = empName;
        this.dept = dept;
    }
}
