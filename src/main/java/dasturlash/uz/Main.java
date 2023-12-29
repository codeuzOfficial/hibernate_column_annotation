package dasturlash.uz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        ProfileEntity profile = new ProfileEntity();
        profile.setName("Alish");
        profile.setSurname("Aliyev");
        profile.setAge(22);
        profile.setAbout("Some big text");
        profile.setLogin("alishbek");
        profile.setCreatedDate(LocalDateTime.now());

        session.save(profile);
        t.commit();

        factory.close();
        session.close();
    }
}