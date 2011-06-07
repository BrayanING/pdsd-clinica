package ifrn.pds.interfaces;

import java.util.List;

import ifrn.pds.model.*;

public interface IServicoMedico {
	
	public void cadastrarM�dico(Medico medico);
	public Medico buscarMedico();
	public Medico [] listarMedico();
	public Especialidade []listarEspecialidadeMedico();

}
