import javafx.geometry.Pos;
import model.OperationTypeEnum;
import model.Posting;
import model.RealestateTypeEnum;
import utils.PostingUtils;

import java.util.Collection;

/*
   Utilizando los métodos de la clase PostingUtils, implementar :
   1- Método que muestre por pantalla los elementos de la collection devuelta por getPostings()
   2- Método que elimine de la collection getPostings() los postings existentes en getPostingsToRemove() y mostrar por pantalla el resultado
   3- Metodo que muestre todos los postings que tiene tipo de operacion SELL y tipo de propiedad APARTMENT
   4- Método que muestre todos los postings que tiene tipo de operacion RENT y tipo de propiedad HOUSE
*/
public class Application {

    public static void main(String[] args) {

        PostingUtils.showPostings();

        System.out.println("\n######################################\n");

        PostingUtils.postingRemove();

        System.out.println("\n######################################\n");

        PostingUtils.showByRealEstateTypeAndOperationType(RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL);

        System.out.println("\n######################################\n");

        PostingUtils.showByRealEstateTypeAndOperationType(RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT);

    }
}
