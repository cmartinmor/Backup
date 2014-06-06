package es.tri.dao;

import es.tri.dao.model.TriTUsuarios;
import es.tri.dao.model.TriTUsuariosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTUsuariosMapper {
    int deleteByPrimaryKey(Integer id_usuario);

    int insert(TriTUsuarios record);

    int insertSelective(TriTUsuarios record);

    List<TriTUsuarios> selectByExample(TriTUsuariosExample example);

    TriTUsuarios selectByPrimaryKey(Integer id_usuario);

    int updateByExampleSelective(@Param("record") TriTUsuarios record, @Param("example") TriTUsuariosExample example);

    int updateByExample(@Param("record") TriTUsuarios record, @Param("example") TriTUsuariosExample example);

    int updateByPrimaryKeySelective(TriTUsuarios record);

    int updateByPrimaryKey(TriTUsuarios record);
}