package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Orgao;
import br.edu.utfpr.dv.sireata.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public interface IDAOOrgao extends IDAO<Orgao> {

    public List<Orgao> listarTodos(boolean apenasAtivos) throws SQLException;

    public List<Orgao> listarPorDepartamento(int idDepartamento) throws SQLException;

    public List<Orgao> listarPorCampus(int idCampus) throws SQLException;

    public List<Orgao> listarParaCriacaoAta(int idDepartamento, int idUsuario) throws SQLException;

    public List<Orgao> listarParaConsultaAtas(int idDepartamento, int idUsuario) throws SQLException;

    public Usuario buscarPresidente(int idOrgao) throws SQLException;

    public Usuario buscarSecretario(int idOrgao) throws SQLException;

    public boolean isMembro(int idOrgao, int idUsuario) throws SQLException;
}
