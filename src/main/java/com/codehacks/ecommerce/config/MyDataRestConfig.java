package com.codehacks.ecommerce.config;

import com.codehacks.ecommerce.entity.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    //@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        HttpMethod[] theUnsupportedActions1 = {HttpMethod.DELETE};
        HttpMethod[] theUnsupportedActions2 = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // disable HTTP methods for Product: DELETE
        config.getExposureConfiguration().forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions1))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions1));

        // disable HTTP methods for Product Category: PUT, POST and DELETE
        config.getExposureConfiguration().forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions2))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions2));

    }

}
