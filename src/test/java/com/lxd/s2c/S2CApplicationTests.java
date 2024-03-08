package com.lxd.s2c;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;

@SpringBootTest
class S2CApplicationTests {
//    @Mock
//    S2CApplication s2CApplication;

    @Test
    void contextLoads() {
        System.out.println("Hello Salaqi");
        System.out.println("Goto the Shanghai");
        String[] str = {"Start", "123"};
        S2CApplication.main(str);
    }
    @Test
    void contextLoads2() {
        System.out.println("Hello Salaqi");
        System.out.println("Goto the Shanghai");
        String[] str = {"Start", "123", "456"};
        S2CApplication.main(str);
    }
}
