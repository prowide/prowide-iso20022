
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
 * Amount of money due to a party as compensation for a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission12", propOrder = {
    "tp",
    "xtndedTp",
    "bsis",
    "xtndedBsis",
    "amt",
    "rcptId",
    "comrclAgrmtRef"
})
public class Commission12 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CommissionType7Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Bsis")
    @XmlSchemaType(name = "string")
    protected TaxationBasis4Code bsis;
    @XmlElement(name = "XtndedBsis")
    protected String xtndedBsis;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType7Code }
     *     
     */
    public CommissionType7Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType7Code }
     *     
     */
    public Commission12 setTp(CommissionType7Code value) {
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
    public Commission12 setXtndedTp(String value) {
        this.xtndedTp = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis4Code }
     *     
     */
    public TaxationBasis4Code getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis4Code }
     *     
     */
    public Commission12 setBsis(TaxationBasis4Code value) {
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
    public Commission12 setXtndedBsis(String value) {
        this.xtndedBsis = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Commission12 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
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
    public Commission12 setRcptId(PartyIdentification2Choice value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Commission12 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
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
