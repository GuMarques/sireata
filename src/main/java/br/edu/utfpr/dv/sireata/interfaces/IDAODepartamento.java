package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Departamento;

import java.sql.SQLException;
import java.util.List;

public interface IDAODepartamento extends IDAO<Departamento> {
    public Departamento buscarPorOrgao(int idOrgao) throws SQLException;

    public List<Departamento> listarTodos(boolean apenasAtivos) throws SQLException;

    public List<Departamento> listarPorCampus(int idCampus, boolean apenasAtivos) throws SQLException;

    public List<Departamento> listarParaCriacaoAta(int idCampus, int idUsuario) throws SQLException;

    public List<Departamento> listarParaConsultaAtas(int idCampus, int idUsuario) throws SQLException;

}
