package com.fh.shop.brand.api;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "shop-brand-producer", path = "/api/brand", fallback = BrandAPIFeignClientBack.class)
public interface BrandAPIFeignClient extends BrandAPI {

}
