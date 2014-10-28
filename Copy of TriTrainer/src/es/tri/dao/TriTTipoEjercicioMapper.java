package es.tri.dao;

import es.tri.dao.model.TriTTipoEjercicio;
import es.tri.dao.model.TriTTipoEjercicioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTTipoEjercicioMapper {
    int deleteByPrimaryKey(Integer id_tipo);

    int insert(TriTTipoEjercicio record);

    int insertSelective(TriTTipoEjercicio record);

    List<TriTTipoEjercicio> selectByExample(TriTTipoEjercicioExample example);

    TriTTipoEjercicio selectByPrimaryKey(Integer id_tipo);

    int updateByExampleSelective(@Param("record") TriTTipoEjercicio record, @Param("example") TriTTipoEjercicioExample example);

    int updateByExample(@Param("record") TriTTipoEjercicio record, @Param("example") TriTTipoEjercicioExample example);

    int updateByPrimaryKeySelective(TriTTipoEjercicio record);

    int updateByPrimaryKey(TriTTipoEjercicio record);
}