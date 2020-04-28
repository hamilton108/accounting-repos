package accountingrepos.mybatis;

import accountingrepos.dto.HourlistBean;
import accountingrepos.dto.HourlistGroupBean;
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
