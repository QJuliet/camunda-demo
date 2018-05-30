package com.camunda.github;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@Named("MainProcessByProduct")
public class MainProcessByProduct implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("Start main process by product");

    public void execute(DelegateExecution execution) throws Exception{
        Integer product = (Integer) execution.getVariable("product");

        LOGGER.info("DAY: " + product);
    }
}
