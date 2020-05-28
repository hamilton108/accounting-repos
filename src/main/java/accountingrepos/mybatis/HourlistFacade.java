package accountingrepos.mybatis;

import accountingrepos.dto.*;

import java.util.List;

public class HourlistFacade {
    /*
    public List<HourlistBean> selectLast5(int invoice) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(HourlistMapper.class);
            return mapper.selectLast5(invoice);
        });
    }

     */
    public List<HourlistBean> selectAll(int invoice) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(HourlistMapper.class);
            return mapper.selectAll(invoice);
        });
    }
    public List<CompanyBean> selectCompanies() {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(InvoiceMapper.class);
            return mapper.selectCompanies();
        });
    }
    public int lastInvoiceNum() {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(InvoiceMapper.class);
            return mapper.lastInvoiceNum();
        });
    }
    public List<CurrentInvoiceBean> selectInvoices() {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(InvoiceMapper.class);
            return mapper.selectInvoices();
        });
    }
    public void insertInvoice(InvoiceBean invoiceBean) {
        MyBatisUtils.withSessionConsumer((session) -> {
            var mapper = session.getMapper(InvoiceMapper.class);
            mapper.insertInvoice(invoiceBean);
        });
    }

    public List<HourlistGroupBean> selectHourlistGroups(boolean showInactive) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(HourlistGroupMapper.class);
            return mapper.selectHourlistGroups(showInactive);
        });
    }
    public void insertHourlist(HourlistBean hourlistBean) {
        MyBatisUtils.withSessionConsumer((session) -> {
            var mapper = session.getMapper(HourlistMapper.class);
            mapper.insertHourlist(hourlistBean);
        });
    }
    public void updateHourlist(HourlistBean hourlistBean) {
        MyBatisUtils.withSessionConsumer((session) -> {
            var mapper = session.getMapper(HourlistMapper.class);
            mapper.updateHourlist(hourlistBean);
        });
    }
    public void insertHourlistGroup(HourlistGroupBean hourlistGroupBean) {
        MyBatisUtils.withSessionConsumer((session) -> {
            var mapper = session.getMapper(HourlistGroupMapper.class);
            mapper.insertHourlistGroup(hourlistGroupBean);
        });
    }
}
