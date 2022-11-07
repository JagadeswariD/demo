package com.numpyninja.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.numpyninja.lms.controller.ProgBatchController;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
 

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class LmsServicesApplicationTest {
	
	@Autowired            // controller is injected before the test methods are run
	ProgBatchController progBatchController;
	
    @Test
	public void contextLoads() {
    	assertNotNull(progBatchController, "Test Fail: Controller not created." );
    }
}
           