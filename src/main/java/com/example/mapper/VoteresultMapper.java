package com.example.mapper;

import com.example.model.Voteresult;
import com.example.model.VoteresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteresultMapper {
    long countByExample(VoteresultExample example);

    int deleteByExample(VoteresultExample example);

    int insert(Voteresult record);

    int insertSelective(Voteresult record);

    List<Voteresult> selectByExample(VoteresultExample example);

    int updateByExampleSelective(@Param("record") Voteresult record, @Param("example") VoteresultExample example);

    int updateByExample(@Param("record") Voteresult record, @Param("example") VoteresultExample example);
}