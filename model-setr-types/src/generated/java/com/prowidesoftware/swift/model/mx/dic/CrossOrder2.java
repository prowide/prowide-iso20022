
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
 * Provides details about the order to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossOrder2", propOrder = {
    "crossTp",
    "prtistn",
    "buySdDtls",
    "sellSdDtls",
    "cxlDtls"
})
public class CrossOrder2 {

    @XmlElement(name = "CrossTp", required = true)
    @XmlSchemaType(name = "string")
    protected CrossType1Code crossTp;
    @XmlElement(name = "Prtistn", required = true)
    @XmlSchemaType(name = "string")
    protected Prioritisation1Code prtistn;
    @XmlElement(name = "BuySdDtls", required = true)
    protected Order9 buySdDtls;
    @XmlElement(name = "SellSdDtls", required = true)
    protected Order9 sellSdDtls;
    @XmlElement(name = "CxlDtls", required = true)
    protected CrossOrderCancel1 cxlDtls;

    /**
     * Gets the value of the crossTp property.
     * 
     * @return
     *     possible object is
     *     {@link CrossType1Code }
     *     
     */
    public CrossType1Code getCrossTp() {
        return crossTp;
    }

    /**
     * Sets the value of the crossTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossType1Code }
     *     
     */
    public CrossOrder2 setCrossTp(CrossType1Code value) {
        this.crossTp = value;
        return this;
    }

    /**
     * Gets the value of the prtistn property.
     * 
     * @return
     *     possible object is
     *     {@link Prioritisation1Code }
     *     
     */
    public Prioritisation1Code getPrtistn() {
        return prtistn;
    }

    /**
     * Sets the value of the prtistn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prioritisation1Code }
     *     
     */
    public CrossOrder2 setPrtistn(Prioritisation1Code value) {
        this.prtistn = value;
        return this;
    }

    /**
     * Gets the value of the buySdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order9 }
     *     
     */
    public Order9 getBuySdDtls() {
        return buySdDtls;
    }

    /**
     * Sets the value of the buySdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order9 }
     *     
     */
    public CrossOrder2 setBuySdDtls(Order9 value) {
        this.buySdDtls = value;
        return this;
    }

    /**
     * Gets the value of the sellSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order9 }
     *     
     */
    public Order9 getSellSdDtls() {
        return sellSdDtls;
    }

    /**
     * Sets the value of the sellSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order9 }
     *     
     */
    public CrossOrder2 setSellSdDtls(Order9 value) {
        this.sellSdDtls = value;
        return this;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CrossOrderCancel1 }
     *     
     */
    public CrossOrderCancel1 getCxlDtls() {
        return cxlDtls;
    }

    /**
     * Sets the value of the cxlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossOrderCancel1 }
     *     
     */
    public CrossOrder2 setCxlDtls(CrossOrderCancel1 value) {
        this.cxlDtls = value;
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
