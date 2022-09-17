package com.mycompany.app.mapper;

import org.apache.ibatis.annotations.Select;
import com.mycompany.app.domain.Region;

public interface RegionMapper {
    @Select("select * from region where id= #{id}")
    Region selectRegion(int id);
}