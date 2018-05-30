package com.camunda.github;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class SendSms implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("Start sms process");

    public void execute(DelegateExecution execution) throws Exception{
        Integer product = (Integer) execution.getVariable("product");

        LOGGER.info("SMS for : " + product);
    }
}
