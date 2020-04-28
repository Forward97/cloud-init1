package com.example.demo.msorder.service;

import com.example.demo.msorder.entity.Item;
import com.example.demo.msorder.feign.ItemFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {
    @Autowired
    private RestTemplate restTemplate;

    public Item queryItemById0(Long id) {
//        return this.restTemplate.getForObject("http://127.0.0.1:8081/item/" + id, Item.class);
        return this.restTemplate.getForObject("http://app-item/item/" + id, Item.class);
    }
/*    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    public Item queryItemById(Long id) {
//        return this.restTemplate.getForObject("http://127.0.0.1:8081/item/"
//                + id, Item.class);
        // 该方法走eureka注册中心调用(这种方式必须先开启负载均衡@LoadBalanced)
        String itemUrl = "http://app-item/item/{id}";
        Item result = restTemplate.getForObject(itemUrl, Item.class, id);
        System.out.println("订单系统调用商品服务,result:" + result);
        return result;
    }*/


    @Autowired
    private ItemFeignClient itemFeignClient;

//    @HystrixCommand(fallbackMethod = "queryItemByIdFallbackMethod")
    public Item queryItemById(Long id) {
        Item result = itemFeignClient.queryItemById(id);
        System.out.println("===========HystrixCommand queryItemById-线程池名称：" + Thread.currentThread().getName() + "订单系统调用商品服务,result:" + result);
        return result;
    }

}