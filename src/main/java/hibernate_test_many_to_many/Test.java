package hibernate_test_many_to_many;



import hibernate_test_many_to_many.entity.Child;
import hibernate_test_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Section section =  new Section("Gaming");
//            Child child1 = new Child("Misha",13);
//            Child child2 = new Child("Valeria", 10);
//            Child child3 = new Child("Sonya",5);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//
//            session.beginTransaction();
//            session.save(section);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            Section section1 =  new Section("Football");
            Section section2 =  new Section("Basketball");
            Child child1 = new Child("Vlada",8);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);

            session.beginTransaction();
            session.save(child1);
            session.getTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }

    }
}
