package com.mycompany.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mycompany.app.domain.Region;

@Mapper
public interface RegionMapper {
    Region findOneById(int id);
}