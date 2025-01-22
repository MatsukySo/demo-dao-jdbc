package Program;

import model.entities.Departmant;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Departmant obj = new Departmant(1,"Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
    }
}