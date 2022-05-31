package br.edu.utfpr.dv.sireata.bo;

import br.edu.utfpr.dv.sireata.dao.FabricaDAO;
import br.edu.utfpr.dv.sireata.interfaces.IDAOComentario;
import br.edu.utfpr.dv.sireata.model.Comentario;
import br.edu.utfpr.dv.sireata.model.Comentario.SituacaoComentario;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComentarioBO {

    public Comentario buscarPorId(int id) throws Exception {
        try {
            IDAOComentario dao = (IDAOComentario) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);

            return dao.buscarPorId(id);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public Comentario buscarPorUsuario(int idUsuario, int idPauta) throws Exception {
        try {
            IDAOComentario dao = (IDAOComentario) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.buscarPorUsuario(idUsuario, idPauta);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public List<Comentario> listarPorPauta(int idPauta) throws Exception {
        try {
            IDAOComentario dao = (IDAOComentario) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.listarPorPauta(idPauta);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public void validarDados(Comentario comentario) throws Exception {
        if ((comentario.getSituacao() == SituacaoComentario.RECUSADO) && (comentario.getComentarios().trim().isEmpty())) {
            throw new Exception("Informe o seu comentário.");
        }
        if ((comentario.getSituacaoComentarios() == SituacaoComentario.RECUSADO) && (comentario.getMotivo().trim().isEmpty())) {
            throw new Exception("Informe o motivo da recusa.");
        }
    }

    public int salvar(Comentario comentario) throws Exception {
        try {
            if ((comentario.getPauta() == null) || (comentario.getPauta().getIdPauta() == 0)) {
                throw new Exception("Informe a pauta.");
            }

            this.validarDados(comentario);

            IDAOComentario dao = (IDAOComentario) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.salvar(comentario);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

}
