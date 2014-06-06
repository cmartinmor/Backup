package es.tri.dao;

import es.tri.dao.model.TriTEjercicios;
import es.tri.dao.model.TriTEjerciciosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTEjerciciosMapper {
    int deleteByPrimaryKey(Integer id_ejercicio);

    int insert(TriTEjercicios record);

    int insertSelective(TriTEjercicios record);

    List<TriTEjercicios> selectByExample(TriTEjerciciosExample example);

    TriTEjercicios selectByPrimaryKey(Integer id_ejercicio);

    int updateByExampleSelective(@Param("record") TriTEjercicios record, @Param("example") TriTEjerciciosExample example);

    int updateByExample(@Param("record") TriTEjercicios record, @Param("example") TriTEjerciciosExample example);

    int updateByPrimaryKeySelective(TriTEjercicios record);

    int updateByPrimaryKey(TriTEjercicios record);
}