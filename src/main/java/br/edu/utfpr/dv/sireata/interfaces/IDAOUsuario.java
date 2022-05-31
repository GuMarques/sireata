package br.edu.utfpr.dv.sireata.interfaces;

import br.edu.utfpr.dv.sireata.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public interface IDAOUsuario extends IDAO<Usuario> {
    public Usuario buscarPorLogin(String login) throws SQLException;

    public String buscarEmail(int id) throws SQLException;

    public List<Usuario> listarTodos(boolean apenasAtivos) throws SQLException;

    public List<Usuario> listar(String nome, boolean apenasAtivos, boolean apenasExternos) throws SQLException;

    public String[] buscarEmails(int[] ids) throws SQLException;

    public boolean podeCriarAta(int idUsuario) throws SQLException;


}
