package es.tri.dao;

import es.tri.dao.model.TriTaTipoUsuario;
import es.tri.dao.model.TriTaTipoUsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTaTipoUsuarioMapper {
    int deleteByPrimaryKey(Integer id_tipo_usuario);

    int insert(TriTaTipoUsuario record);

    int insertSelective(TriTaTipoUsuario record);

    List<TriTaTipoUsuario> selectByExample(TriTaTipoUsuarioExample example);

    TriTaTipoUsuario selectByPrimaryKey(Integer id_tipo_usuario);

    int updateByExampleSelective(@Param("record") TriTaTipoUsuario record, @Param("example") TriTaTipoUsuarioExample example);

    int updateByExample(@Param("record") TriTaTipoUsuario record, @Param("example") TriTaTipoUsuarioExample example);

    int updateByPrimaryKeySelective(TriTaTipoUsuario record);

    int updateByPrimaryKey(TriTaTipoUsuario record);
}