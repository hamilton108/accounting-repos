package generaljournal.mybatis;

import generaljournal.dto.GeneralJournalBean;
import generaljournal.dto.HourlistBean;

import java.util.List;

public class HourlistFacade {
    public List<HourlistBean> selectLast5(int invoice) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(HourlistMapper.class);
            return mapper.selectLast5(invoice);
        });
    }
}
