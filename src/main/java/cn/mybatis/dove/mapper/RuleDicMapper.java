package cn.mybatis.dove.mapper;

import cn.mybatis.dove.model.entity.RuleDic;

public interface RuleDicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RuleDic record);

    int insertSelective(RuleDic record);

    RuleDic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RuleDic record);

    int updateByPrimaryKey(RuleDic record);
}