package com.yx.ssm.mapper;

import com.yx.ssm.po.Detailnorm;
import com.yx.ssm.po.DetailnormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailnormMapper {
    int countByExample(DetailnormExample example);

    int deleteByExample(DetailnormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Detailnorm record);

    int insertSelective(Detailnorm record);

    List<Detailnorm> selectByExample(DetailnormExample example);

    Detailnorm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Detailnorm record, @Param("example") DetailnormExample example);

    int updateByExample(@Param("record") Detailnorm record, @Param("example") DetailnormExample example);

    int updateByPrimaryKeySelective(Detailnorm record);

    int updateByPrimaryKey(Detailnorm record);
}