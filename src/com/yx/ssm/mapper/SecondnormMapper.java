package com.yx.ssm.mapper;

import com.yx.ssm.po.Secondnorm;
import com.yx.ssm.po.SecondnormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondnormMapper {
    int countByExample(SecondnormExample example);

    int deleteByExample(SecondnormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Secondnorm record);

    int insertSelective(Secondnorm record);

    List<Secondnorm> selectByExample(SecondnormExample example);

    Secondnorm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Secondnorm record, @Param("example") SecondnormExample example);

    int updateByExample(@Param("record") Secondnorm record, @Param("example") SecondnormExample example);

    int updateByPrimaryKeySelective(Secondnorm record);

    int updateByPrimaryKey(Secondnorm record);
}