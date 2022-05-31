package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Anexo;

import java.sql.SQLException;
import java.util.List;

public interface IDAOAnexo extends IDAO<Anexo> {
    List<Anexo> listarPorAta(int id) throws SQLException;

    void excluir(int id) throws SQLException;
}
