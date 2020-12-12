package accountingrepos.mybatis;

import accountingrepos.dto.FakturaposterBean;
import accountingrepos.dto.HourlistBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 4/18/13
 * Time: 8:52 PM
 */

public interface HourlistMapper {
    void updateHourlist(HourlistBean hb);
    void insertHourlist(HourlistBean hb);
    void insertFakturaposter(FakturaposterBean fb);
    //List<HourlistBean> selectLast5(@Param("invoice") int invoice);
    List<HourlistBean> selectAll(@Param("invoice") int invoice);
}
