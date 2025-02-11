
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
 * Provides the details of the collateral used in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralData35", propOrder = {
    "asstTp",
    "netXpsrCollstnInd",
    "bsktIdr"
})
public class CollateralData35 {

    @XmlElement(name = "AsstTp")
    protected CollateralType21 asstTp;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected Boolean netXpsrCollstnInd;
    @XmlElement(name = "BsktIdr")
    protected SecurityIdentification26Choice bsktIdr;

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType21 }
     *     
     */
    public CollateralType21 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType21 }
     *     
     */
    public CollateralData35 setAsstTp(CollateralType21 value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralData35 setNetXpsrCollstnInd(Boolean value) {
        this.netXpsrCollstnInd = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public SecurityIdentification26Choice getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public CollateralData35 setBsktIdr(SecurityIdentification26Choice value) {
        this.bsktIdr = value;
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
