package com.paul.service;

public class ServiceOne {

    public ServiceOne() {
    }

    private static AuthorService authorService = SpringContextService.getBean(AuthorService.class);

    public void service() {
        System.out.println(authorService.selfIntroduction());
    }

    public static AuthorService getAuthorService() {
        return authorService;
    }

}
