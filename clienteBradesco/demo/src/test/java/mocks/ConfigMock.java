package mocks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class ConfigMock {
    private AutoCloseable closeable;
    @BeforeEach
    public void openMock(){
        closeable = MockitoAnnotations.openMocks(this);

    }
    @AfterEach
    public void releaseMock() throws Exception {
        closeable.close();

    }

}
