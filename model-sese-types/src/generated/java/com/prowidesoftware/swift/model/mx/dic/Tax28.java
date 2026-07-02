
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
 * Tax related to an investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax28", propOrder = {
    "tp",
    "amt",
    "bsis",
    "rcptId",
    "xmptnInd",
    "xmptnRsn",
    "taxClctnDtls"
})
public class Tax28 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType1Choice tp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Bsis")
    protected TaxBasis1Choice bsis;
    @XmlElement(name = "RcptId")
    protected PartyIdentification70Choice rcptId;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsn")
    protected ExemptionReason1Choice xmptnRsn;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation8 taxClctnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType1Choice }
     *     
     */
    public TaxType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType1Choice }
     *     
     */
    public Tax28 setTp(TaxType1Choice value) {
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
    public Tax28 setAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBasis1Choice }
     *     
     */
    public TaxBasis1Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBasis1Choice }
     *     
     */
    public Tax28 setBsis(TaxBasis1Choice value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public Tax28 setRcptId(PartyIdentification70Choice value) {
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
    public Tax28 setXmptnInd(boolean value) {
        this.xmptnInd = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReason1Choice }
     *     
     */
    public ExemptionReason1Choice getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReason1Choice }
     *     
     */
    public Tax28 setXmptnRsn(ExemptionReason1Choice value) {
        this.xmptnRsn = value;
        return this;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation8 }
     *     
     */
    public TaxCalculationInformation8 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation8 }
     *     
     */
    public Tax28 setTaxClctnDtls(TaxCalculationInformation8 value) {
        this.taxClctnDtls = value;
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
