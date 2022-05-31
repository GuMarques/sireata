package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Comentario;

import java.sql.SQLException;
import java.util.List;

public interface IDAOComentario extends IDAO<Comentario> {
    public Comentario buscarPorUsuario(int idUsuario, int idPauta) throws SQLException;

    public List<Comentario> listarPorPauta(int idPauta) throws SQLException;
}
