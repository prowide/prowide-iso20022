
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the tax income header details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeHeader1", propOrder = {
    "rptId",
    "rptDt",
    "cmonId",
    "ttlNbOfRcrds",
    "acctOwnr",
    "acctOwnrTxId",
    "initgPtyTxId"
})
public class TaxIncomeHeader1 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "RptDt")
    protected DateAndDateTime2Choice rptDt;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "TtlNbOfRcrds")
    protected BigDecimal ttlNbOfRcrds;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification71Choice acctOwnr;
    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "InitgPtyTxId")
    protected String initgPtyTxId;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIncomeHeader1 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRptDt() {
        return rptDt;
    }

    /**
     * Sets the value of the rptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TaxIncomeHeader1 setRptDt(DateAndDateTime2Choice value) {
        this.rptDt = value;
        return this;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIncomeHeader1 setCmonId(String value) {
        this.cmonId = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRcrds() {
        return ttlNbOfRcrds;
    }

    /**
     * Sets the value of the ttlNbOfRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxIncomeHeader1 setTtlNbOfRcrds(BigDecimal value) {
        this.ttlNbOfRcrds = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public PartyIdentification71Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public TaxIncomeHeader1 setAcctOwnr(PartyIdentification71Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIncomeHeader1 setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
        return this;
    }

    /**
     * Gets the value of the initgPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitgPtyTxId() {
        return initgPtyTxId;
    }

    /**
     * Sets the value of the initgPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIncomeHeader1 setInitgPtyTxId(String value) {
        this.initgPtyTxId = value;
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
