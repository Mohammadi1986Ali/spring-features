package com.ai4everyone.tutorial.springiocconstructor.service;

import com.ai4everyone.tutorial.springiocconstructor.api.CustomerService;
import com.ai4everyone.tutorial.springiocconstructor.api.GeneralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralServiceImpl implements GeneralService {
    private static final Logger log = LoggerFactory.getLogger(GeneralServiceImpl.class);
    private CustomerService service;

    public GeneralServiceImpl() {
        log.info("GeneralServiceImpl#GeneralServiceImpl");
    }

    public GeneralServiceImpl(CustomerService service) {
        log.info("GeneralServiceImpl#GeneralServiceImpl: {}", service.getClass());
        this.service = service;
    }

    public void beanInitMethod() {
        log.info("GeneralServiceImpl#beanInitMethod");
    }

    public void beanDestroyMethod() {
        log.info("GeneralServiceImpl#beanDestroyMethod");
    }

    @Override
    public CustomerService getService() {
        return service;
    }

    @Override
    public void setService(CustomerService service) {
        this.service = service;
    }
}
