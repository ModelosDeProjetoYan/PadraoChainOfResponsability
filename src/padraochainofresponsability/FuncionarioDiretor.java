/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraochainofresponsability;

/**
 *
 * @author yan
 */
public class FuncionarioDiretor extends Funcionario{

    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }
    
    
    @Override
    String getDescricaoCargo() {
        return "Diretor";
    }
    
    
}
