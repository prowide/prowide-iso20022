
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
 * Provides the details of the security or cash pledged as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralType6Choice", propOrder = {
    "scty",
    "csh"
})
public class CollateralType6Choice {

    @XmlElement(name = "Scty")
    protected SecurityReuseData1 scty;
    @XmlElement(name = "Csh")
    protected CashReuseData1 csh;

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityReuseData1 }
     *     
     */
    public SecurityReuseData1 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityReuseData1 }
     *     
     */
    public CollateralType6Choice setScty(SecurityReuseData1 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the csh property.
     * 
     * @return
     *     possible object is
     *     {@link CashReuseData1 }
     *     
     */
    public CashReuseData1 getCsh() {
        return csh;
    }

    /**
     * Sets the value of the csh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashReuseData1 }
     *     
     */
    public CollateralType6Choice setCsh(CashReuseData1 value) {
        this.csh = value;
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
