package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.AtaParticipante;

import java.sql.SQLException;
import java.util.List;

public interface IDAOAtaParticipante extends IDAO<AtaParticipante> {
    public List<AtaParticipante> listarPorAta(int idAta) throws SQLException;

    public void excluir(int id) throws SQLException;
}
