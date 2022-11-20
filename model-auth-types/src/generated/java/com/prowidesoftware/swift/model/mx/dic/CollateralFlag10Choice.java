
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
 * Data on collateral used for the securities lending transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralFlag10Choice", propOrder = {
    "collsd",
    "uncollsd"
})
public class CollateralFlag10Choice {

    @XmlElement(name = "Collsd")
    protected CollaterisedData8 collsd;
    @XmlElement(name = "Uncollsd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode uncollsd;

    /**
     * Gets the value of the collsd property.
     * 
     * @return
     *     possible object is
     *     {@link CollaterisedData8 }
     *     
     */
    public CollaterisedData8 getCollsd() {
        return collsd;
    }

    /**
     * Sets the value of the collsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaterisedData8 }
     *     
     */
    public CollateralFlag10Choice setCollsd(CollaterisedData8 value) {
        this.collsd = value;
        return this;
    }

    /**
     * Gets the value of the uncollsd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getUncollsd() {
        return uncollsd;
    }

    /**
     * Sets the value of the uncollsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CollateralFlag10Choice setUncollsd(NoReasonCode value) {
        this.uncollsd = value;
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
