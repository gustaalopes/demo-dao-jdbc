package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department findByID ===");

		Department department = departmentDao.findById(6);
		System.out.println(department);

		System.out.println();

		System.out.println("=== TEST 4: Department Insert ===");
		Department newDepartment = new Department(null, "Forniture");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New ID = " + newDepartment.getId());
		System.out.println();

		System.out.println("=== TEST 5: Seller Update ===");
		Department departmentUpdated = departmentDao.findById(1);
		System.out.println(departmentUpdated);
		departmentUpdated.setName("PC");
		departmentDao.update(departmentUpdated);
		System.out.println("Update Completed");

		System.out.println("=== TEST 2: Department findAll ===");

		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
