
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax authorities require corporates to report their sales based value added tax (VAT). This message is targeted to this reporting based on information in sales invoices and card transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTaxReportV01", propOrder = {
    "invcTaxRptHdr",
    "taxRpt",
    "splmtryData"
})
public class InvoiceTaxReportV01 {

    @XmlElement(name = "InvcTaxRptHdr", required = true)
    protected TaxReportHeader1 invcTaxRptHdr;
    @XmlElement(name = "TaxRpt", required = true)
    protected List<TaxReport1> taxRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the invcTaxRptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReportHeader1 }
     *     
     */
    public TaxReportHeader1 getInvcTaxRptHdr() {
        return invcTaxRptHdr;
    }

    /**
     * Sets the value of the invcTaxRptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReportHeader1 }
     *     
     */
    public InvoiceTaxReportV01 setInvcTaxRptHdr(TaxReportHeader1 value) {
        this.invcTaxRptHdr = value;
        return this;
    }

    /**
     * Gets the value of the taxRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReport1 }
     * 
     * 
     */
    public List<TaxReport1> getTaxRpt() {
        if (taxRpt == null) {
            taxRpt = new ArrayList<TaxReport1>();
        }
        return this.taxRpt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the taxRpt list.
     * @see #getTaxRpt()
     * 
     */
    public InvoiceTaxReportV01 addTaxRpt(TaxReport1 taxRpt) {
        getTaxRpt().add(taxRpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InvoiceTaxReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
