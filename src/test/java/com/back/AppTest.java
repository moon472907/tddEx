package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @Test
    @DisplayName("rq.getActionName")
    void t1(){rq rq = new rq ("수정id =1");
        String actionName = rq.getActionName();;
        assertEquals("수정", actionName);
    }

}
