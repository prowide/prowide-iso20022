
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
 * Indication of the type of assets subject of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCommodity2Choice", propOrder = {
    "scty",
    "cmmdty"
})
public class SecurityCommodity2Choice {

    @XmlElement(name = "Scty")
    protected Security4 scty;
    @XmlElement(name = "Cmmdty")
    protected Commodity3 cmmdty;

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link Security4 }
     *     
     */
    public Security4 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security4 }
     *     
     */
    public SecurityCommodity2Choice setScty(Security4 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity3 }
     *     
     */
    public Commodity3 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity3 }
     *     
     */
    public SecurityCommodity2Choice setCmmdty(Commodity3 value) {
        this.cmmdty = value;
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
