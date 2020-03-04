package accountingrepos.mybatis;

import accountingrepos.dto.Ns4102Bean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/30/13
 * Time: 1:30 PM
 */
public interface Ns4102Mapper {
    List<Ns4102Bean> selectNs4102();
    List<Ns4102Bean> selectDebits();
}
