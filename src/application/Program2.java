
package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 *
 * @author Roberto
 */
public class Program2 {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println(" ==== TEST 1 :department findById ====");
        Department newDepartment = departmentDao.findById(7);
        System.out.println(newDepartment);
        
        System.out.println("\n==== TEST 2 :department findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }
        
        System.out.println("==== TEST 3 : department insert ====");
        newDepartment = new Department(null,"Food");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
        
        System.out.println("==== TEST 4 : department update ====");
        newDepartment = departmentDao.findById(8);
        newDepartment.setName("Sport");
        departmentDao.update(newDepartment);
        System.out.println("Update completed!");
        
        System.out.println("\n==== TEST 5 : department delete ====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");
        
        sc.close();
    }    
}
