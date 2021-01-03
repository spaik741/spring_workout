package hibernate_test_one_to_one;

import hibernate_test_one_to_one.entity.Detail;
import hibernate_test_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = new Employee("Sonya","Dr","HR", 900);
//            Detail detail = new Detail("Moscow","362628","sonya@email.com");
//            employee.setEmpDetail(detail);
//            session.save(employee);
            Detail detail = session.get(Detail.class,3);
            session.delete(detail);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
