package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.interfaces.IDAO;

public enum FabricaDAO {
    AnexoDao, AtaDao, AtaParticipanteDao, CampusDao, ComentarioDao, DepartamentoDao, OrgaoDao, PautaDao, UsuarioDao;

    public static IDAO createDAO(FabricaDAO dao) {
        switch(dao) {
            case AnexoDao:
                return new AnexoDAO();
            case AtaDao:
                return new AtaDAO();
            case AtaParticipanteDao:
                return new AtaParticipanteDAO();
            case CampusDao:
                return new CampusDAO();
            case ComentarioDao:
                return new ComentarioDAO();
            case DepartamentoDao:
                return new DepartamentoDAO();
            case OrgaoDao:
                return new OrgaoDAO();
            case PautaDao:
                return new PautaDAO();
            case UsuarioDao:
                return new UsuarioDAO();
            default:
                return null;
        }
    }
}
