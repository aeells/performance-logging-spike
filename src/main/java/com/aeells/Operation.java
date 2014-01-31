package com.aeells;

import org.perf4j.aop.Profiled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Operation
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Operation.class);

    @Profiled
    public void doItNow()
    {
        LOGGER.info("doing the thing...");

        try
        {
            Thread.sleep(1000);
        }
        catch (final InterruptedException e)
        {
            LOGGER.error("oops!", e);
        }
        finally
        {
            LOGGER.info("done!");
        }
    }
}
