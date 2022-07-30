package MockService;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MockServiceTest {

    @Test
    public void testMock(){
        Mockprovider mockObject = Mockito.mock(Mockprovider.class);
        Mockito.when(mockObject.add(30,50)).thenReturn(80);
        assertEquals(80,mockObject.add(30,50));
    }

    @Test
    public void mockList(){

        List<String> mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(10);
        assertTrue(5==mockList.size());
    }
}
