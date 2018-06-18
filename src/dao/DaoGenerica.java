
package dao;

import java.util.ArrayList;

public interface DaoGenerica<ObjetoGenerico> {
        
        public void inserir(ObjetoGenerico objt);
        
        public void alterar(ObjetoGenerico objt);
        
        public void excluir(Integer id);
        
        public ArrayList<ObjetoGenerico> consultar(); 
    
}
