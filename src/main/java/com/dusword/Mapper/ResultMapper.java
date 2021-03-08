package com.dusword.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dusword.entity.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface ResultMapper extends BaseMapper<Result> {
    @Select("select * from result where Id = #{id}")
    Result selectById(Integer id);
}
