package es.tri.dao;

import es.tri.dao.model.TriTaTipoEntreno;
import es.tri.dao.model.TriTaTipoEntrenoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriTaTipoEntrenoMapper {
    int deleteByPrimaryKey(Integer id_tipo_entreno);

    int insert(TriTaTipoEntreno record);

    int insertSelective(TriTaTipoEntreno record);

    List<TriTaTipoEntreno> selectByExample(TriTaTipoEntrenoExample example);

    TriTaTipoEntreno selectByPrimaryKey(Integer id_tipo_entreno);

    int updateByExampleSelective(@Param("record") TriTaTipoEntreno record, @Param("example") TriTaTipoEntrenoExample example);

    int updateByExample(@Param("record") TriTaTipoEntreno record, @Param("example") TriTaTipoEntrenoExample example);

    int updateByPrimaryKeySelective(TriTaTipoEntreno record);

    int updateByPrimaryKey(TriTaTipoEntreno record);
}