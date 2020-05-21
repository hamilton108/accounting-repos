package accountingrepos.dto;

import java.time.LocalDate;

public class InvoiceBean {
    /*
    Column      |     Type      | Collation | Nullable |               Default
-----------------+---------------+-----------+----------+--------------------------------------
    oid             | integer       |           | not null | nextval('faktura_oid_seq'::regclass)
    fnr             | fakturanr     |           |          |
    fakturadato     | dato          |           |          |
    forfall         | dato          |           |          |
    spesifikasjon   | spesifikasjon |           |          |
    firma_person_id | oid_type      |           |          |
    bilag           | bilag         |           |          |
    skaar           | skatte_aar    |           |          |
     */

    private int invoiceNum;
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private String description;
    private int companyId;
    private int taxYear;

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }
}
