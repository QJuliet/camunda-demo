package com.camunda.github;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@Named("MainProcessDelegate")
public class MainProcess implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("Start main process");

    public void execute(DelegateExecution execution) throws Exception{

        List<Integer> productList = new ArrayList<Integer>();

        productList.add(1);
        productList.add(2);
        productList.add(3);
        productList.add(2);

        execution.setVariable("productList", productList);
    }
}
