package accountingrepos.dto;

import java.time.LocalDate;

public class FakturaposterBean {
    //values (#{fromDate}, #{toDate}, #{invoiceNr}, #{amount}, #{unitRate}, #{unit}, #{description})
    private int oid;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int invoiceNr;
    private double amount;
    private int unitRate;
    private String unit;
    private String description;

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public int getInvoiceNr() {
        return invoiceNr;
    }

    public void setInvoiceNr(int invoiceNr) {
        this.invoiceNr = invoiceNr;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getUnitRate() {
        return unitRate;
    }

    public void setUnitRate(int unitRate) {
        this.unitRate = unitRate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
}
