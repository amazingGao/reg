package com.wechat.reg.dao;

import com.wechat.reg.model.FUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FUserDAO {
    List<FUser> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(FUser record);

    int insertSelective(FUser record);

    FUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FUser record);

    int updateByPrimaryKey(FUser record);
}