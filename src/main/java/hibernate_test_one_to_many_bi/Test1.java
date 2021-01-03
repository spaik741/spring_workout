package hibernate_test_one_to_many_bi;

import hibernate_test_one_to_many_bi.entity.Department;

import hibernate_test_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = new Department("IT", 1500, 200);
            Employee emp1 = new Employee("Misha", "Br", 500);
            Employee emp2 = new Employee("Lera", "Br", 800);
            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);
            session.save(department);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
