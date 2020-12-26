package hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test2 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();;
            session.beginTransaction();

            List<Employee> employeeList = session.createQuery("from Employee where name = 'Mihail'")
                    .getResultList();

            System.out.println(employeeList.toString());
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
