package br.edu.utfpr.dv.sireata.bo;

import br.edu.utfpr.dv.sireata.dao.FabricaDAO;
import br.edu.utfpr.dv.sireata.interfaces.IDAOCampus;
import br.edu.utfpr.dv.sireata.model.Campus;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CampusBO {

    public Campus buscarPorId(int id) throws Exception {
        try {
            IDAOCampus dao = (IDAOCampus) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);

            return dao.buscarPorId(id);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public Campus buscarPorDepartamento(int idDepartamento) throws Exception {
        try {
            IDAOCampus dao = (IDAOCampus) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.buscarPorDepartamento(idDepartamento);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public List<Campus> listarTodos(boolean apenasAtivos) throws Exception {
        try {
            IDAOCampus dao = (IDAOCampus) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.listarTodos(apenasAtivos);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public List<Campus> listarParaCriacaoAta(int idUsuario) throws Exception {
        try {
            IDAOCampus dao = (IDAOCampus) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.listarParaCriacaoAta(idUsuario);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public List<Campus> listarParaConsultaAtas(int idUsuario) throws Exception {
        try {
            IDAOCampus dao = (IDAOCampus) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.listarParaConsultaAtas(idUsuario);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

    public int salvar(Campus campus) throws Exception {
        if (campus.getNome().isEmpty()) {
            throw new Exception("Informe o nome do câmpus.");
        }

        try {
            IDAOCampus dao = (IDAOCampus) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
            return dao.salvar(campus);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

            throw new Exception(e.getMessage());
        }
    }

}
