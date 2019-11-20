package com.yx.ssm.mapper;

import com.yx.ssm.po.Firstnorm;
import com.yx.ssm.po.FirstnormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstnormMapper {
    int countByExample(FirstnormExample example);

    int deleteByExample(FirstnormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Firstnorm record);

    int insertSelective(Firstnorm record);

    List<Firstnorm> selectByExample(FirstnormExample example);

    Firstnorm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Firstnorm record, @Param("example") FirstnormExample example);

    int updateByExample(@Param("record") Firstnorm record, @Param("example") FirstnormExample example);

    int updateByPrimaryKeySelective(Firstnorm record);

    int updateByPrimaryKey(Firstnorm record);
}