package com.fh.shop.brand.api;

import com.fh.shop.brand.api.po.Brand;
import org.fh.shop.ServerResponse;
import org.springframework.web.bind.annotation.*;

public interface BrandAPI {

    /*  @GetMapping
   public ServerResponse findBrandList(){
      List<BrandVo> brandList = brandService.findBrandList();
      return ServerResponse.success(brandList);
   }*/

   @DeleteMapping(value = "/{id}")
   public ServerResponse delete(@PathVariable Integer id);

   @PostMapping
   public ServerResponse add(@RequestBody Brand brand);

   @GetMapping(value = "/{id}")
   public ServerResponse<Brand> getByIdBrand(@PathVariable Integer id);

   @PutMapping(value = "/{id}")
   public ServerResponse update(@PathVariable Integer id, @RequestBody Brand brand);

   @GetMapping
   public ServerResponse findList(Brand brand);

}
