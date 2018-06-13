package cn.mybatis.dove.mapper;

import cn.mybatis.dove.model.entity.RuleType;

public interface RuleTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RuleType record);

    int insertSelective(RuleType record);

    RuleType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RuleType record);

    int updateByPrimaryKey(RuleType record);
}