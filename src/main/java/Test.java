import jakarta.persistence.*;
import model.Category;
import model.Product;
import model.Task;

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

//        TypedQuery<Category> query = entityManager.createQuery("select c from Category c where lower(c.name) like ?1", Category.class);
//        query.setParameter(1, "%н%");
//
//        List<Category> resultList = query.getResultList();
//        for (Category category : resultList) {
//            System.out.println(category);
//        }

//        Category category = query.getSingleResult();
//        System.out.println(category);

//        Scanner scanner = new Scanner(System.in);
//        Integer firstPrice = scanner.nextInt();
//
//        Integer secondPrice = scanner.nextInt();
//
//
//        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.price >= ?1 and p.price <= ?2", Product.class);
//        query.setParameter(1, firstPrice);
//        query.setParameter(2, secondPrice);
//
//
//        List<Product> resultList = query.getResultList();
//        for (Product product : resultList) {
//            System.out.println(product);
//        }

//         ====================== Создание ======================
//        Category category = new Category();
//        category.setName("Консоли");
//
//        try {
//            System.out.println("До создания " + category.getId());
//            entityManager.getTransaction().begin();
//
//            entityManager.persist(category);
//
//            entityManager.getTransaction().commit();
//            System.out.println("Категория создана " + category.getId());
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка: " + e.getMessage());
//        }

//// ====================== Обновление ======================
//        Category category = entityManager.find(Category.class, 7);
//        category.setName("Приставки");
//
//        try {
//            entityManager.getTransaction().begin();
//
//            entityManager.merge(category);
//
//            entityManager.getTransaction().commit();
//            System.out.println("Категория обновлена");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//// ====================== Удаление ======================
//        Category category = entityManager.find(Category.class, 7);
//
//        try {
//            entityManager.getTransaction().begin();
//
//            entityManager.remove(category);
//
//            entityManager.getTransaction().commit();
//            System.out.println("Категория удалена");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка: " + e.getMessage());
//        }

//        Category category = new Category();
//        category.setName("Консоли");
//
//        try {
//            System.out.println("До создания " + category.getId());
//            entityManager.getTransaction().begin();
//
//            entityManager.persist(category);
//
//            entityManager.getTransaction().commit();
//            System.out.println("Категория создана " + category.getId());
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка: " + e.getMessage());
//        }

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String description = scanner.nextLine();
        String status = scanner.nextLine();
        String priority = scanner.nextLine();
        String assigned = scanner.nextLine();
        String owner = scanner.nextLine();


        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(status);
        task.setPriority(priority);
        task.setAssigned(assigned);
        task.setOwner(owner);

        try {
            System.out.println("До создания " + task.getId());
            entityManager.getTransaction().begin();

            entityManager.persist(task);

            entityManager.getTransaction().commit();
            System.out.println("Задача создана " + task.getId() + title + " ." + description + " ." + status + " ." + priority + " ." + assigned + " ." + owner);
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
