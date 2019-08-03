package com.fh.shop.brand.api.po;

import lombok.Data;

import java.util.Date;

@Data
public class Brand {
   private int id;

   private String brandName;

   private Date createTime;
}
