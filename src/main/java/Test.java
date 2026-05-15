import jakarta.persistence.*;
import model.*;

import javax.swing.text.AttributeSet;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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

////        Задача
//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        String description = scanner.nextLine();
//        String status = scanner.nextLine();
//        String priority = scanner.nextLine();
//        String assigned = scanner.nextLine();
//        String owner = scanner.nextLine();
//
//
//        Task task = new Task();
//        task.setTitle(title);
//        task.setDescription(description);
//        task.setStatus(status);
//        task.setPriority(priority);
//        task.setAssigned(assigned);
//        task.setOwner(owner);
//
//        try {
//            System.out.println("До создания " + task.getId());
//            entityManager.getTransaction().begin();
//
//            entityManager.persist(task);
//
//            entityManager.getTransaction().commit();
//            System.out.println("Задача создана " + task.getId() + title + " ." + description + " ." + status + " ." + priority + " ." + assigned + " ." + owner);
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка: " + e.getMessage());
//        }

//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product);

//        List<Product> products = entityManager.createQuery("select p from Product p", Product.class)
//                .getResultList();
//
//        for (Product product : products) {
//            System.out.println(product);
//        }

        //// ==============Создание товара через input связь many to one ==========================
//        List<Category> list = entityManager.createQuery("select c from Category c", Category.class).getResultList();
//
//        for (Category category : list) {
//            System.out.println(category.getId() + ". " + category.getName());
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Выберите категорию :");
//        Integer chooseCategory = Integer.parseInt(scanner.nextLine());
//
//        Category category = entityManager.find(Category.class, chooseCategory);
//        if (category == null) {
//            System.out.println("Неверная категория");
//            return;
//        }
//
//        System.out.println("Введите название товара :");
//        String name = scanner.nextLine();
//        System.out.println("Введите стоимость :");
//        Double price = Double.parseDouble(scanner.nextLine());
//
//
//        Product product = new Product();
//        product.setName(name);
//        product.setPrice(price);
//        product.setCategory(category);
//
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.persist(product);
//            entityManager.getTransaction().commit();
//            System.out.println("Товар создан");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка " + e.getMessage());
//        }


        //// ==============Создание товара через input связь one to many ==========================
//        List<Category> categories = entityManager.createQuery("select c from Category c", Category.class).getResultList();
//         for (Category c : categories) {
//             System.out.println("_________" + c.getName());
//             for (Product product : c.getProductList()) {
//                 System.out.println(product.getId() + ". " + product.getName() + " (" + product.getPrice() +")");
//             }
//         }

        //// CW

//        Category category = entityManager.find(Category.class, 3);
//        System.out.println(category.getName());
//            for (Attribute attribute : category.getAttributeList()) {
//                System.out.println(attribute.getId() + ". " + attribute.getName());
//            }
//        }

        //// HW

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите название категории :");
//        String name = scanner.nextLine();
//        System.out.println("Введите характеристики (через запятую и пробел) :");
//        String characteristic = scanner.nextLine();
//        String[] attributes = characteristic.split(", ");
//
//        Category category = new Category();
//        category.setName(name);
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.persist(category);
//
//            for (String a : attributes) {
//                Attribute attribute = new Attribute();
//                attribute.setName(a);
//                attribute.setCategory(category);
//
//                entityManager.persist(attribute);
//
//            }
//            entityManager.getTransaction().commit();
//            System.out.println("Категория создана");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println("Ошибка " + e.getMessage());
//        }

        //// CW ENUM

        //// Получение задачи по id через ENUM
//        Task task = entityManager.find(Task.class, 1);
//        System.out.println(task.getId() + ". "+ task.getTitle());
//        System.out.println("status=" + task.getStatus());

        //// создание задачи через ENUM
//        Task task = new Task();
//        task.setTitle("Задача по внедрению X");
//        task.setDescription("...");
//        task.setPriority(TaskPriority.NORMAL);
//        task.setStatus(TaskStatus.OPEN);
//        task.setAssigned("empolyee1");
//        task.setOwner("employee4");
//
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.persist(task);
//            entityManager.getTransaction().commit();
//            System.out.println("Задача создана");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            System.out.println(e.getMessage());
//        }


    }
}

