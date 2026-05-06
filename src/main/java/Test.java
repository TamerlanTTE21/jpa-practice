import jakarta.persistence.*;
import model.Category;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

        // Получение по id
//        Category category = entityManager.find(Category.class, 1);
//        System.out.println(category.getId() + ". " + category.getName());

        // Получение всех
//        TypedQuery<Category> query = entityManager.createQuery("select c from Category c", Category.class);
//        List<Category> resultList = query.getResultList();
//
//        for (Category category : resultList) {
//            System.out.println(category.getId() + ". " + category.getName());
//        }


        // Запрос с условием
//        Scanner scanner = new Scanner(System.in);
//        String categoryName = scanner.nextLine();

        TypedQuery<Category> query = entityManager.createQuery("select c from Category c where lower(c.name) like ?1", Category.class);
        query.setParameter(1, "%н%");

        List<Category> resultList = query.getResultList();
        for (Category category : resultList) {
            System.out.println(category);
        }

//        Category category = query.getSingleResult();
//        System.out.println(category);


    }
}
