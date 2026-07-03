
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An account servicer sends a TotalPortfolioValuationReport to an account owner to provide detailed valuation information for a portfolio.
 * Usage
 * The TotalPortfolioValuationReport will be sent by the account servicer to the account owner on an agreed basis. The report may also be requested using a SecuritiesStatementQuery.
 * The TotalPortfolioValuationReport is used to report on a portfolio without Investment Funds; or to report on a portfolio when an investment fund is regarded as a portfolio containing, only one or multiple investment funds
 * The TotalPortfolioValuationReport may also be used to:
 * - re-send a message previously sent (the CopyDuplicate value is DUPL),
 * - provide a third party with a copy of a message for information (the CopyDuplicate value is COPY),
 * - re-send to a third party a copy of a message for information (the CopyDuplicate value is CODU).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPortfolioValuationReportV01", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "acctDtls",
    "ttlPrtflValtn",
    "bal",
    "splmtryData"
})
public class TotalPortfolioValuationReportV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected Report4 rptGnlDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected SecuritiesAccount21 acctDtls;
    @XmlElement(name = "TtlPrtflValtn", required = true)
    protected TotalPortfolioValuation1 ttlPrtflValtn;
    @XmlElement(name = "Bal")
    protected PortfolioBalance1 bal;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public TotalPortfolioValuationReportV01 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Report4 }
     *     
     */
    public Report4 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report4 }
     *     
     */
    public TotalPortfolioValuationReportV01 setRptGnlDtls(Report4 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount21 }
     *     
     */
    public SecuritiesAccount21 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount21 }
     *     
     */
    public TotalPortfolioValuationReportV01 setAcctDtls(SecuritiesAccount21 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtflValtn property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPortfolioValuation1 }
     *     
     */
    public TotalPortfolioValuation1 getTtlPrtflValtn() {
        return ttlPrtflValtn;
    }

    /**
     * Sets the value of the ttlPrtflValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPortfolioValuation1 }
     *     
     */
    public TotalPortfolioValuationReportV01 setTtlPrtflValtn(TotalPortfolioValuation1 value) {
        this.ttlPrtflValtn = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioBalance1 }
     *     
     */
    public PortfolioBalance1 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioBalance1 }
     *     
     */
    public TotalPortfolioValuationReportV01 setBal(PortfolioBalance1 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public TotalPortfolioValuationReportV01 setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
        return this;
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

}
