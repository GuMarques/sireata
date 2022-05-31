package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Pauta;

import java.sql.SQLException;
import java.util.List;

public interface IDAOPauta extends IDAO<Pauta> {
    public List<Pauta> listarPorAta(int idAta) throws SQLException;

    public void excluir(int id) throws SQLException;

}
