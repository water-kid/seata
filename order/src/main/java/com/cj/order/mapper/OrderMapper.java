package com.cj.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    @Insert("insert into order_tbl ( user_id, commodity_code, count, money) values(#{userId},#{commodityCode},#{count},#{money})")
    public int addOrder(@Param("userId") String userId,@Param("commodityCode") String commodityCode,@Param("count") Integer count,@Param("money") Double money);

}
