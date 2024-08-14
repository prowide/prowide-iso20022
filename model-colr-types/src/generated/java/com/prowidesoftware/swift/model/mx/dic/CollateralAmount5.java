
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Collateral and settlement related amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount5", propOrder = {
    "reqrdMrgn",
    "collsd",
    "rmngCollsd",
    "sttld",
    "rmngSttlm"
})
public class CollateralAmount5 {

    @XmlElement(name = "ReqrdMrgn")
    protected AmountAndDirection44 reqrdMrgn;
    @XmlElement(name = "Collsd")
    protected AmountAndDirection44 collsd;
    @XmlElement(name = "RmngCollsd")
    protected AmountAndDirection44 rmngCollsd;
    @XmlElement(name = "Sttld")
    protected AmountAndDirection44 sttld;
    @XmlElement(name = "RmngSttlm")
    protected AmountAndDirection44 rmngSttlm;

    /**
     * Gets the value of the reqrdMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getReqrdMrgn() {
        return reqrdMrgn;
    }

    /**
     * Sets the value of the reqrdMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public CollateralAmount5 setReqrdMrgn(AmountAndDirection44 value) {
        this.reqrdMrgn = value;
        return this;
    }

    /**
     * Gets the value of the collsd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCollsd() {
        return collsd;
    }

    /**
     * Sets the value of the collsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public CollateralAmount5 setCollsd(AmountAndDirection44 value) {
        this.collsd = value;
        return this;
    }

    /**
     * Gets the value of the rmngCollsd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRmngCollsd() {
        return rmngCollsd;
    }

    /**
     * Sets the value of the rmngCollsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public CollateralAmount5 setRmngCollsd(AmountAndDirection44 value) {
        this.rmngCollsd = value;
        return this;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public CollateralAmount5 setSttld(AmountAndDirection44 value) {
        this.sttld = value;
        return this;
    }

    /**
     * Gets the value of the rmngSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRmngSttlm() {
        return rmngSttlm;
    }

    /**
     * Sets the value of the rmngSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public CollateralAmount5 setRmngSttlm(AmountAndDirection44 value) {
        this.rmngSttlm = value;
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
