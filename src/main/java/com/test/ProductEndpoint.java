package com.test;

import com.test.products.GetProductRequest;
import com.test.products.GetProductResponse;
import com.test.products.Products;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

@Endpoint
public class ProductEndpoint {

    @PayloadRoot(namespace = "http://test.com/products", localPart = "GetProductRequest")
    @ResponsePayload
    public GetProductResponse getProducts(@RequestPayload GetProductRequest getProductRequest){
        GetProductResponse getProductResponse = new GetProductResponse();
        Products products = new Products();
        products.setId(getProductRequest.getId());
        products.setName("Macbook");
        products.setPrice(2500);
        products.setDescription("This is Macbook from Apple!");
        getProductResponse.setProducts(products);
        return getProductResponse;
    }
}
