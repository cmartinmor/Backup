package es.tri.dao;

import es.tri.dao.model.TriTaNivelesUsu;
import es.tri.dao.model.TriTaNivelesUsuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTaNivelesUsuMapper {
    int deleteByPrimaryKey(Integer id_nivel);

    int insert(TriTaNivelesUsu record);

    int insertSelective(TriTaNivelesUsu record);

    List<TriTaNivelesUsu> selectByExample(TriTaNivelesUsuExample example);

    TriTaNivelesUsu selectByPrimaryKey(Integer id_nivel);

    int updateByExampleSelective(@Param("record") TriTaNivelesUsu record, @Param("example") TriTaNivelesUsuExample example);

    int updateByExample(@Param("record") TriTaNivelesUsu record, @Param("example") TriTaNivelesUsuExample example);

    int updateByPrimaryKeySelective(TriTaNivelesUsu record);

    int updateByPrimaryKey(TriTaNivelesUsu record);
}