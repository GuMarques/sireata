package br.edu.utfpr.dv.sireata.bo;

import br.edu.utfpr.dv.sireata.dao.FabricaDAO;
import br.edu.utfpr.dv.sireata.interfaces.IDAOPauta;
import br.edu.utfpr.dv.sireata.model.Pauta;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PautaBO {

    public Pauta buscarPorId(int id) throws Exception {
        try {
            IDAOPauta dao = (IDAOPauta) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);

            return dao.buscarPorId(id);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public List<Pauta> listarPorAta(int idAta) throws Exception {
        try {
            IDAOPauta dao = (IDAOPauta) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.listarPorAta(idAta);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public void validarDados(Pauta pauta) throws Exception {
        if (pauta.getTitulo().isEmpty()) {
            throw new Exception("Informe o título da pauta.");
        }
    }

    public int salvar(Pauta pauta) throws Exception {
        try {
            if ((pauta.getAta() == null) || (pauta.getAta().getIdAta() == 0)) {
                throw new Exception("Informe a ata.");
            }

            this.validarDados(pauta);

            IDAOPauta dao = (IDAOPauta) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.salvar(pauta);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public void excluir(Pauta pauta) throws Exception {
        this.excluir(pauta.getIdPauta());
    }

    public void excluir(int id) throws Exception {
        try {
            IDAOPauta dao = (IDAOPauta) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            dao.excluir(id);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

}
