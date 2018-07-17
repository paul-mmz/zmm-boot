package com.paul.utils;

import com.paul.service.ServiceOne;

public enum ServiceTypeEnum {

    ServiceOne(1, "ONE", new ServiceOne()) {

        public String toString() {
            return "i'm ONe";
        }
    };

    private Integer value;

    private String name;

    private ServiceOne serviceOne;

    ServiceTypeEnum(Integer value, String name, ServiceOne serviceOne) {
        this.value = value;
        this.name = name;
        this.serviceOne = serviceOne;
        System.err.println("enum ServiceOne init" + this.toString());
    }

    public ServiceOne getServiceOne() {
        return serviceOne;
    }
}
