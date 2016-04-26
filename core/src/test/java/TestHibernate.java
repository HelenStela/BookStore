import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dz.labs.api.domain.*;
import ru.dz.labs.api.service.GoodService;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @author Gataullin Kamil
 *         12.10.2014 0:03
 */
public class TestHibernate {

    public static GoodService goodService;

    public static void init() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"tutor-core.xml"}, true);
        goodService = (GoodService) context.getBean("goodService");
    }

    public static void main(String[] args) throws SQLException {
        init();
        //testSubject();
        //testTutor();
        testGood();
    }

    public static void testGood() {
        Good good = new Good();
        good.setName("Book1");
        good.setCount(3);
        good.setPrice(192.0);
        good.setCountry("Russia");
        good.setImage("b1.jpg");
//        good.setCategory(new Category());
        good.setDescription("A very-very good book!!!");
        good.setYear(1992);
        goodService.add(good);


        Good good2 = new Good();
        good2.setName("Book2");
        good2.setCount(2);
        good2.setYear(1993);
        good2.setDescription("Another good book!");
        good2.setCountry("England");
        good2.setImage("b2.jpg");
        //     good2.setCategory(new Category());
        good2.setPrice(134.7);
        goodService.add(good2);
    }

    public static void testSubject() {
        //List<SubjectInfo> subjects = subjectService.getAllSubjects();
        System.out.println("======== All subjects =========");
        /*for(SubjectInfo subject : subjects) {
            System.out.println("id : " + subject.getId() + ", name : " + subject.getName());
        }*/
        System.out.println("=============================");
    }

//    public static void testTutor() {
//        CityInfo cityInfo = new CityInfo("khv", "Хабаровск");
//        cityService.add(cityInfo);
//
//        tutorService.add(new TutorInfo("Имя", "Фамилия", "Отчество", new Date(), null, cityInfo));
//        List<TutorInfo> tutors = tutorService.getAllTutor();
//        System.out.println("======== All tutors =========");
//        for(TutorInfo tutorInfo : tutors) {
//            System.out.println("id : " + tutorInfo.getId() + ", name : " + tutorInfo.getName());
//        }
//        System.out.println("=============================");
//    }
}
