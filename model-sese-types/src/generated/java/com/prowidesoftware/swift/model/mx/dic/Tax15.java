
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Tax related to an investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax15", propOrder = {
    "tp",
    "xtndedTp",
    "amt",
    "bsis",
    "xtndedBsis",
    "rcptId",
    "xmptnInd",
    "xmptnRsn",
    "xtndedXmptnRsn"
})
public class Tax15 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TaxType13Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Bsis")
    @XmlSchemaType(name = "string")
    protected TaxationBasis2Code bsis;
    @XmlElement(name = "XtndedBsis")
    protected String xtndedBsis;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsn")
    protected String xmptnRsn;
    @XmlElement(name = "XtndedXmptnRsn")
    protected String xtndedXmptnRsn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType13Code }
     *     
     */
    public TaxType13Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType13Code }
     *     
     */
    public Tax15 setTp(TaxType13Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax15 setXtndedTp(String value) {
        this.xtndedTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public Tax15 setAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis2Code }
     *     
     */
    public TaxationBasis2Code getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis2Code }
     *     
     */
    public Tax15 setBsis(TaxationBasis2Code value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the xtndedBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedBsis() {
        return xtndedBsis;
    }

    /**
     * Sets the value of the xtndedBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax15 setXtndedBsis(String value) {
        this.xtndedBsis = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Tax15 setRcptId(PartyIdentification2Choice value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the xmptnInd property.
     * 
     */
    public boolean isXmptnInd() {
        return xmptnInd;
    }

    /**
     * Sets the value of the xmptnInd property.
     * 
     */
    public Tax15 setXmptnInd(boolean value) {
        this.xmptnInd = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax15 setXmptnRsn(String value) {
        this.xmptnRsn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedXmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedXmptnRsn() {
        return xtndedXmptnRsn;
    }

    /**
     * Sets the value of the xtndedXmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax15 setXtndedXmptnRsn(String value) {
        this.xtndedXmptnRsn = value;
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
