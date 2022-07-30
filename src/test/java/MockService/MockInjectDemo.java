package MockService;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MockInjectDemo {

    @Mock
    List<String> mockList;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    EmployeeClass mockEmployee;

    @Test
    public void employeeMockTest() {
        when(mockList.get(0)).thenReturn("Arun");
        when(mockList.size()).thenReturn(1);

        assertEquals("Arun", mockList.get(0));
        assertEquals(1, mockList.size());

        assertEquals("Arun",mockEmployee.getEmployee().get(0));
        assertEquals(1,mockEmployee.Employee.size());

        //behavior is not defined. hence you will get null as output
        mockList.add(2,"Joe");
        System.out.println(mockList.get(2));
    }

    @Test
    public void mockAnnotationDemo() {

        when(mockList.get(1)).thenReturn("Test Automation");
        assertEquals("Test Automation", mockList.get(1));
    }
}

class EmployeeClass {
    List<String> Employee;

    public List<String> getEmployee() {
        return Employee;
    }

    public void setEmployee(List<String> employee) {
        Employee = employee;
    }


}
