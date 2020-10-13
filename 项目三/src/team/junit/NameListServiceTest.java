package team.junit;

import org.junit.Test;
import team.domain.Employee;
import team.service.NameListService;
import team.service.TeamException;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee() throws TeamException {
        NameListService service = new NameListService();
        int id = 1;

        try {
            Employee employee = service.getEmployee(id);

        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
