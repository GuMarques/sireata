package br.edu.utfpr.dv.sireata.interfaces;

import java.sql.SQLException;

public interface IDAO<T> {
    public T buscarPorId(int id) throws SQLException;

    public int salvar(T objeto) throws SQLException;
}
