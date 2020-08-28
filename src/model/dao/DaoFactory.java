
package model.dao;

import model.dao.impl.SellerDaoJDBC;

/**
 *
 * @author Roberto
 */
public class DaoFactory {
    
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
