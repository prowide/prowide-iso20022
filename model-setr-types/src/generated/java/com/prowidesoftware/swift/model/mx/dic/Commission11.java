
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
@XmlType(name = "Commission11", propOrder = {
    "amt",
    "rate",
    "tp",
    "xtndedTp",
    "comrclAgrmtRef",
    "newComrclAgrmtRefInd"
})
public class Commission11 {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CommissionType6Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "NewComrclAgrmtRefInd")
    protected Boolean newComrclAgrmtRefInd;

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
    public Commission11 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Commission11 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType6Code }
     *     
     */
    public CommissionType6Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType6Code }
     *     
     */
    public Commission11 setTp(CommissionType6Code value) {
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
    public Commission11 setXtndedTp(String value) {
        this.xtndedTp = value;
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
    public Commission11 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
        return this;
    }

    /**
     * Gets the value of the newComrclAgrmtRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewComrclAgrmtRefInd() {
        return newComrclAgrmtRefInd;
    }

    /**
     * Sets the value of the newComrclAgrmtRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Commission11 setNewComrclAgrmtRefInd(Boolean value) {
        this.newComrclAgrmtRefInd = value;
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
