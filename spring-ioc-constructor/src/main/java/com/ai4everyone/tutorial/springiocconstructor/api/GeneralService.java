package com.ai4everyone.tutorial.springiocconstructor.api;

public interface GeneralService {
    CustomerService getService();
    void setService(CustomerService service);
}
