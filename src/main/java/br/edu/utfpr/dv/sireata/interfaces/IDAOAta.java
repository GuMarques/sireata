package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Ata;

import java.sql.SQLException;
import java.util.List;

public interface IDAOAta extends IDAO<Ata> {
    Ata buscarPorNumero(int idOrgao, Ata.TipoAta tipo, int numero, int ano) throws SQLException;

    Ata buscarPorPauta(int idPauta) throws SQLException;

    int buscarProximoNumeroAta(int idOrgao, int ano, Ata.TipoAta tipo) throws SQLException;

    List<Ata> listar(int idUsuario, int idCampus, int idDepartamento, int idOrgao, boolean publicadas) throws SQLException;

    public List<Ata> listarPublicadas() throws SQLException;

    public List<Ata> listarPorOrgao(int idOrgao) throws SQLException;

    public List<Ata> listarPorDepartamento(int idDepartamento) throws SQLException;

    public List<Ata> listarPorCampus(int idCampus) throws SQLException;

    public List<Ata> listarNaoPublicadas(int idUsuario) throws SQLException;

    public List<Ata> listarPorOrgao(int idOrgao, int idUsuario) throws SQLException;

    public List<Ata> listarPorDepartamento(int idDepartamento, int idUsuario) throws SQLException;

    public List<Ata> listarPorCampus(int idCampus, int idUsuario) throws SQLException;

    public void publicar(int idAta, byte[] documento) throws SQLException;

    public void liberarComentarios(int idAta) throws SQLException;

    public void bloquearComentarios(int idAta) throws SQLException;

    public boolean temComentarios(int idAta) throws SQLException;

    public boolean isPresidenteOuSecretario(int idUsuario, int idAta) throws SQLException;

    public boolean isPresidente(int idUsuario, int idAta) throws SQLException;

    public boolean isPublicada(int idAta) throws SQLException;

    public boolean excluir(int idAta) throws SQLException;
}
