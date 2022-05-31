package br.edu.utfpr.dv.sireata.bo;

import br.edu.utfpr.dv.sireata.dao.FabricaDAO;
import br.edu.utfpr.dv.sireata.interfaces.IDAOAtaParticipante;
import br.edu.utfpr.dv.sireata.model.AtaParticipante;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtaParticipanteBO {
	
	public AtaParticipante buscarPorId(int id) throws Exception{
		try{
			IDAOAtaParticipante dao = (IDAOAtaParticipante) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);

			return dao.buscarPorId(id);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}
	
	public List<AtaParticipante> listarPorAta(int idAta) throws Exception{
		try{
			IDAOAtaParticipante dao = (IDAOAtaParticipante) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
			return dao.listarPorAta(idAta);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}
	
	public void validarDados(AtaParticipante participante) throws Exception{
		if((participante.getParticipante() == null) || (participante.getParticipante().getIdUsuario() == 0)){
			throw new Exception("Informe o usuário.");
		}
		if((!participante.isPresente()) && (participante.getMotivo().trim().isEmpty())){
			throw new Exception("Informe o motivo da ausência.");
		}
		if(participante.isPresente()){
			participante.setMotivo("");
		}
	}
	
	public int salvar(AtaParticipante participante) throws Exception{
		try{
			if((participante.getAta() == null) || (participante.getAta().getIdAta() == 0)){
				throw new Exception("Informe a ata.");
			}
			
			this.validarDados(participante);

			IDAOAtaParticipante dao = (IDAOAtaParticipante) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
			return dao.salvar(participante);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}
	
	public void excluir(AtaParticipante participante) throws Exception{
		this.excluir(participante.getIdAtaParticipante());
	}
	
	public void excluir(int id) throws Exception{
		try{
			IDAOAtaParticipante dao = (IDAOAtaParticipante) FabricaDAO.createDAO(FabricaDAO.AtaParticipanteDao);
			dao.excluir(id);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}

}
