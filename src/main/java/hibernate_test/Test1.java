package hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Valeria", "Br", "Maxima", 1200);
            session.beginTransaction();
//            session.save(employee);
            Employee employee2 = session.get(Employee.class, 3);
            session.remove(employee2);
            System.out.println(employee2);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
