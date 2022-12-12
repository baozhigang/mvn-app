package com.mycompany.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mycompany.app.domain.Hello;

@Mapper
public interface HelloMapper {
    Hello findOneById(int id);
}