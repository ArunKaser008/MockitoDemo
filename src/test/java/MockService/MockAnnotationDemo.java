package MockService;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MockAnnotationDemo {

    @Mock
    List<String> mockList;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockAnnotationDemo(){

        when(mockList.get(1)).thenReturn("Test Automation");
        assertEquals("Test Automation",mockList.get(1));
    }
}
