
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
 * Information related to the clearing of the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeClearing11", propOrder = {
    "clrOblgtn",
    "clrSts",
    "intraGrp"
})
public class TradeClearing11 {

    @XmlElement(name = "ClrOblgtn")
    @XmlSchemaType(name = "string")
    protected ClearingObligationType1Code clrOblgtn;
    @XmlElement(name = "ClrSts")
    protected Cleared23Choice clrSts;
    @XmlElement(name = "IntraGrp")
    protected Boolean intraGrp;

    /**
     * Gets the value of the clrOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingObligationType1Code }
     *     
     */
    public ClearingObligationType1Code getClrOblgtn() {
        return clrOblgtn;
    }

    /**
     * Sets the value of the clrOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingObligationType1Code }
     *     
     */
    public TradeClearing11 setClrOblgtn(ClearingObligationType1Code value) {
        this.clrOblgtn = value;
        return this;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Cleared23Choice }
     *     
     */
    public Cleared23Choice getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cleared23Choice }
     *     
     */
    public TradeClearing11 setClrSts(Cleared23Choice value) {
        this.clrSts = value;
        return this;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeClearing11 setIntraGrp(Boolean value) {
        this.intraGrp = value;
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
