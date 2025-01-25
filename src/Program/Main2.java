package Program;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
        Department department;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha a opção: ");
        int t = sc.nextInt();


        switch (t){
            case 1:
                System.out.println("==== TEST 1: department insert ====");
                Department newDepartment = new Department(null, "Food");
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
        }



    }
}
