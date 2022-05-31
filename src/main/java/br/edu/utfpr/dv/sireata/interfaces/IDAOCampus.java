package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Campus;

import java.sql.SQLException;
import java.util.List;

public interface IDAOCampus extends IDAO<Campus> {
    public Campus buscarPorDepartamento(int idDepartamento) throws SQLException;

    public List<Campus> listarTodos(boolean apenasAtivos) throws SQLException;

    public List<Campus> listarParaCriacaoAta(int idUsuario) throws SQLException;

    public List<Campus> listarParaConsultaAtas(int idUsuario) throws SQLException;
}
