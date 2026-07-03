
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
 * Report parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundCashForecastParameters2", propOrder = {
    "finInstrmDtls",
    "tradDtTm",
    "dtldRptParam"
})
public class FundCashForecastParameters2 {

    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument17 finInstrmDtls;
    @XmlElement(name = "TradDtTm")
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "DtldRptParam")
    protected ReportParameters dtldRptParam;

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument17 }
     *     
     */
    public FinancialInstrument17 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument17 }
     *     
     */
    public FundCashForecastParameters2 setFinInstrmDtls(FinancialInstrument17 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public FundCashForecastParameters2 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dtldRptParam property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters }
     *     
     */
    public ReportParameters getDtldRptParam() {
        return dtldRptParam;
    }

    /**
     * Sets the value of the dtldRptParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters }
     *     
     */
    public FundCashForecastParameters2 setDtldRptParam(ReportParameters value) {
        this.dtldRptParam = value;
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
