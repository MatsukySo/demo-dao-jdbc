package Program;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o campo onde ira trablhar(department, seller): ");
        String op = sc.next();

            switch (op){
                case "department":

                    DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
                    Department department;

                    System.out.println("1: department insert\n2: department Update\n3: department find by ID\n4: department delete");
                    System.out.print("Select: ");
                    int t = sc.nextInt();
                    switch (t){
                        case 1:

                            System.out.println("==== TEST 1: department insert ====");
                            System.out.println("Digite o nome do departamento");
                            String name = sc.next();
                            Department newDepartment = new Department(null, name);
                            departmentDao.insert(newDepartment);
                            System.out.println("Inserted! New Id = " + newDepartment.getId());
                            break;

                        case 2:

                            System.out.println("==== TEST 2: department Update ====");
                            department = departmentDao.findById(1);
                            department.setName("Music");
                            departmentDao.update(department);
                            System.out.println("Update completed");

                            break;

                        case 3:

                            System.out.println("==== TEST 3: department find by ID ====");
                            department = departmentDao.findById(3);
                            System.out.println(department);
                            break;

                        case 4:

                            System.out.println("==== TEST 4: department delete ====");
                            System.out.println("Departamentos a deletar:");
                            List<Department> list = departmentDao.findAll();
                            for(Department d : list){
                                System.out.println(d);
                            }

                            System.out.println("Enter id for delete test: ");
                            int id = sc.nextInt();
                            departmentDao.deleteById(id);
                            System.out.println("Delete completed");
                            break;

                        case 5:

                            list = departmentDao.findAll();
                            for(Department d : list){
                                System.out.println(d);
                            }

                            break;
                    }

                    break;

                case "seller":

                    SellerDao sellerDao = DaoFactory.creatSellerDao();

                    System.out.println("1: seller finfById\n2: seller finfByDepartment\n3: eller finfAll\n4: seller insert\n5: seller update\n6: seller delete");
                    System.out.print("Select:  ");
                    t = sc.nextInt();
                    switch (t){
                        case 1:

                            System.out.println("==== TEST 1: seller finfById ====");
                            Seller seller = sellerDao.findById(3);
                            System.out.println(seller);

                            break;

                        case 2:

                            System.out.println("\n==== TEST 2: seller finfByDepartment ====");
                            department = new Department(2, null);
                            List<Seller> list = sellerDao.findByDepartment(department);
                            for(Seller obj : list){
                                System.out.println(obj);
                            }

                            break;

                        case 3:

                            System.out.println("\n==== TEST 3: seller finfAll ====");
                            list = sellerDao.findAll();
                            for(Seller obj : list){
                                System.out.println(obj);
                            }

                            break;

                        case 4:

                            System.out.println("\n==== TEST 4: seller insert ====");
                            department = new Department(2, null);
                            Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
                            sellerDao.insert(newSeller);
                            System.out.println("Inserted! New id = " + newSeller.getId());

                            break;

                        case 5:

                            System.out.println("\n==== TEST 5: seller update ====");
                            seller = sellerDao.findById(1);
                            seller.setName("Martha Waine");
                            sellerDao.update(seller);
                            System.out.println("Uptade completed");

                            break;

                        case 6:

                            System.out.println("\n==== TEST 6: seller delete ====");
                            System.out.print("Enter id for delete test: ");
                            int id = sc.nextInt();
                            sellerDao.deleteById(id);
                            System.out.println("Delete completed");

                            break;
                    }
                    break;

                    default:

                        System.out.println("Digitado errado JUMENTA!");

                    break;
            }
    }
}