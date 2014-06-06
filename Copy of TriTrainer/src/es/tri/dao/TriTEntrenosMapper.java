package es.tri.dao;

import es.tri.dao.model.TriTEntrenos;
import es.tri.dao.model.TriTEntrenosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTEntrenosMapper {
    int deleteByPrimaryKey(Integer id_entreno_ejercicio);

    int insert(TriTEntrenos record);

    int insertSelective(TriTEntrenos record);

    List<TriTEntrenos> selectByExample(TriTEntrenosExample example);

    TriTEntrenos selectByPrimaryKey(Integer id_entreno_ejercicio);

    int updateByExampleSelective(@Param("record") TriTEntrenos record, @Param("example") TriTEntrenosExample example);

    int updateByExample(@Param("record") TriTEntrenos record, @Param("example") TriTEntrenosExample example);

    int updateByPrimaryKeySelective(TriTEntrenos record);

    int updateByPrimaryKey(TriTEntrenos record);
}