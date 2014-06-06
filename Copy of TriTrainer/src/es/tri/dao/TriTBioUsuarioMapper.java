package es.tri.dao;

import es.tri.dao.model.TriTBioUsuario;
import es.tri.dao.model.TriTBioUsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTBioUsuarioMapper {
    int deleteByPrimaryKey(Integer id_usuario);

    int insert(TriTBioUsuario record);

    int insertSelective(TriTBioUsuario record);

    List<TriTBioUsuario> selectByExample(TriTBioUsuarioExample example);

    TriTBioUsuario selectByPrimaryKey(Integer id_usuario);

    int updateByExampleSelective(@Param("record") TriTBioUsuario record, @Param("example") TriTBioUsuarioExample example);

    int updateByExample(@Param("record") TriTBioUsuario record, @Param("example") TriTBioUsuarioExample example);

    int updateByPrimaryKeySelective(TriTBioUsuario record);

    int updateByPrimaryKey(TriTBioUsuario record);
}