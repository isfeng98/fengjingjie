package com.fh.shop.brand.api;

import com.fh.shop.brand.api.po.Brand;
import org.fh.shop.ServerResponse;
import org.springframework.stereotype.Component;

@Component
public class BrandAPIFeignClientBack implements BrandAPIFeignClient {
   @Override
   public ServerResponse delete(Integer id) {
      return null;
   }

   @Override
   public ServerResponse add(Brand brand) {
      System.out.println("============"+11111);
      return null;
   }

   @Override
   public ServerResponse getByIdBrand(Integer id) {
      return null;
   }

   @Override
   public ServerResponse update(Integer id, Brand brand) {
      return null;
   }

   @Override
   public ServerResponse findList(Brand brand) {
      return null;
   }
}
