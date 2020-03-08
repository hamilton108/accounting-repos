package accountingrepos.mybatis;

import accountingrepos.dto.GeneralJournalBean;
import accountingrepos.dto.Ns4102Bean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/26/13
 * Time: 3:44 PM
 */
public class GjFacade {


    public List<GeneralJournalBean> selectByBilag(int numItems) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(GeneralJournalMapper.class);
            return mapper.selectByBilag(numItems);
        });
    }
    public List<GeneralJournalBean> selectByDate(int numItems) {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(GeneralJournalMapper.class);
            return mapper.selectByDate(numItems);
        });
    }
    public List<Ns4102Bean> selectNs4102() {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(Ns4102Mapper.class);
            return mapper.selectNs4102();
        });
    }
    public List<Ns4102Bean> selectDebits() {
        return MyBatisUtils.withSession((session) -> {
            var mapper = session.getMapper(Ns4102Mapper.class);
            return mapper.selectDebits();
        });
    }
    public void insert(GeneralJournalBean bean) {
        MyBatisUtils.withSessionConsumer((session) -> {
            var mapper = session.getMapper(GeneralJournalMapper.class);
            mapper.insertGeneralJournal(bean);
        });
    }

    /*
    public static void main(String[] args) {
        var facade = new Facade();
        var items = facade.selectByBilag(5);
        System.out.println(items);
    }
     */

    /*
    org.apache.log4j.Logger log = Logger.getLogger(getClass().getPackage().getName());

    private static final String conf = "mybatis.conf.xml";

    private static SqlSessionFactory _factory = null;

    //region Hourlist
    public void insertHourlist(HourlistBean hb) {

        SqlSession session = getSession();

        try {

            HourlistMapper mapper = session.getMapper(HourlistMapper.class);

            mapper.insertHourlist(hb);

            session.commit();
        }
        finally {
            session.close();
        }
    }

    public List<InvoiceBean> fetchInvoices() {
        List<InvoiceBean> result = null;

        SqlSession session = getSession();

        try {

            InvoiceMapper mapper = session.getMapper(InvoiceMapper.class);
            result = mapper.selectInvoices();

        }
        finally {
            session.close();
        }
        return result;
    }

    public List<HourlistGroupBean> fetchHourlistGroups() {
        List<HourlistGroupBean> result = null;

        SqlSession session = getSession();

        try {

            HourlistGroupMapper mapper = session.getMapper(HourlistGroupMapper.class);
            result = mapper.selectHourlistGroups(false);

        }
        finally {
            session.close();
        }
        return result;
    }

    //endregion


    //region General Journal
    public List<GeneralJournalBean> selectByBilag() {
        List<GeneralJournalBean> result = null;

        SqlSession session = getSession();

        try {

            GeneralJournalMapper mapper = session.getMapper(GeneralJournalMapper.class);
            result = mapper.selectByBilag(5);

        }
        finally {
            session.close();
        }
        return result;
    }

    public List<GeneralJournalBean> selectByDate() {
        List<GeneralJournalBean> result = null;

        SqlSession session = getSession();

        try {

            GeneralJournalMapper mapper = session.getMapper(GeneralJournalMapper.class);
            result = mapper.selectByDate(5);

        }
        finally {
            session.close();
        }
        return result;
    }

    public void insertGeneralJournal(GeneralJournalBean hb) {

        SqlSession session = getSession();

        try {

            GeneralJournalMapper mapper = session.getMapper(GeneralJournalMapper.class);

            mapper.insertGeneralJournal(hb);

            session.commit();
        }
        finally {
            session.close();
        }
    }

    //endregion

    //region NS 4201
    public List<Ns4102Bean> fetchNs4102() {
        List<Ns4102Bean> result = null;

        SqlSession session = getSession();

        try {

            Ns4102Mapper mapper = session.getMapper(Ns4102Mapper.class);
            result = mapper.selectNs4102();

        }
        finally {
            session.close();
        }
        return result;
    }
    //endregion


    private static SqlSessionFactory getFactory() {
        if (_factory == null) {
            Reader reader = null;
            try {
                reader = Resources.getResourceAsReader(conf);
                SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                _factory = builder.build(reader);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                }
            }
        }
        return _factory;
    }
    public static SqlSession getSession() {
        return getFactory().openSession();
    }

     */
}
