package com.aeells;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("/profile-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public final class OperationTest
{
    @Autowired
    private Operation operation;

    @Test
    public void repeatOperation()
    {
        for (int i = 0; i < 10; i++)
        {
            operation.doItNow();
        }
    }
}
