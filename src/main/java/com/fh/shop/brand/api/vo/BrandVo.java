package com.fh.shop.brand.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BrandVo implements Serializable {

   private Integer id;

   private String brandName;

   private String createDate;
}
