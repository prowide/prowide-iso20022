
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax3", propOrder = {
    "tp",
    "amt",
    "bsis",
    "rcptId",
    "xmptnInd",
    "xmptnRsn"
})
public class Tax3 {

    @XmlElement(name = "Tp", required = true)
    protected TaxTypeFormat2Choice tp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Bsis")
    @XmlSchemaType(name = "string")
    protected TaxationBasis2Code bsis;
    @XmlElement(name = "RcptId")
    protected PartyIdentification1Choice rcptId;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsn")
    protected TaxExemptionReasonFormatChoice xmptnRsn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeFormat2Choice }
     *     
     */
    public TaxTypeFormat2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeFormat2Choice }
     *     
     */
    public Tax3 setTp(TaxTypeFormat2Choice value) {
        this.tp = value;
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
    public Tax3 setAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
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
    public Tax3 setBsis(TaxationBasis2Code value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public Tax3 setRcptId(PartyIdentification1Choice value) {
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
    public Tax3 setXmptnInd(boolean value) {
        this.xmptnInd = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonFormatChoice }
     *     
     */
    public TaxExemptionReasonFormatChoice getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonFormatChoice }
     *     
     */
    public Tax3 setXmptnRsn(TaxExemptionReasonFormatChoice value) {
        this.xmptnRsn = value;
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
