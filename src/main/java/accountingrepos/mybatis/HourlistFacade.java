package accountingrepos.mybatis;

import accountingrepos.dto.HourlistBean;
import accountingrepos.dto.InvoiceBean;

import java.util.List;

public class HourlistFacade {
    public List<HourlistBean> selectLast5(int invoice) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(HourlistMapper.class);
            return mapper.selectLast5(invoice);
        });
    }

    public List<InvoiceBean> selectInvoices() {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(InvoiceMapper.class);
            return mapper.selectInvoices();
        });
    }
}
