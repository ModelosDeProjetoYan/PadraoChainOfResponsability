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
public class FuncionarioReitor  extends Funcionario{

    public FuncionarioReitor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoDiploma.getTipoDocumentoDiploma());
        setFuncionarioSuperior(superior);
    }
    
    
    @Override
    String getDescricaoCargo() {
        return "Reitor";
    }
    
}
