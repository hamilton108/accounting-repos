package accountingrepos.mybatis;

import accountingrepos.dto.CompanyBean;
import accountingrepos.dto.CurrentInvoiceBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/27/13
 * Time: 4:05 PM
 */
public interface InvoiceMapper {
    List<CurrentInvoiceBean> selectInvoices();
    int lastInvoiceNum();

    List<CompanyBean> selectCompanies();

    void updateVoucher(@Param("bilag") int bilag,
                       @Param("fnr") int fnr);
    void insertInvoice(CurrentInvoiceBean currentInvoiceBean);
}
