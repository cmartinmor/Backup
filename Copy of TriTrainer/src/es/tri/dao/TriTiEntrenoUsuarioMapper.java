package es.tri.dao;

import es.tri.dao.model.TriTiEntrenoUsuario;
import es.tri.dao.model.TriTiEntrenoUsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTiEntrenoUsuarioMapper {
    int deleteByPrimaryKey(Integer id_entreno);

    int insert(TriTiEntrenoUsuario record);

    int insertSelective(TriTiEntrenoUsuario record);

    List<TriTiEntrenoUsuario> selectByExample(TriTiEntrenoUsuarioExample example);

    TriTiEntrenoUsuario selectByPrimaryKey(Integer id_entreno);

    int updateByExampleSelective(@Param("record") TriTiEntrenoUsuario record, @Param("example") TriTiEntrenoUsuarioExample example);

    int updateByExample(@Param("record") TriTiEntrenoUsuario record, @Param("example") TriTiEntrenoUsuarioExample example);

    int updateByPrimaryKeySelective(TriTiEntrenoUsuario record);

    int updateByPrimaryKey(TriTiEntrenoUsuario record);
}