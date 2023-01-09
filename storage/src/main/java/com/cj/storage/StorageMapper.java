package com.cj.storage;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StorageMapper {

    @Update("update storage_tbl set count=count - #{count}  where commodity_code = #{commodity}")
    int deductStock(@Param("commodity") String commodity, @Param("count") Integer count);

    @Select("select count from storage_tbl where  commodity_code=#{commodity}")
    Integer findStock(String commodity);
}
