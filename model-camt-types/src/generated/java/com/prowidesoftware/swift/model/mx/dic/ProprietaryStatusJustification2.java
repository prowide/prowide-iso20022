
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
 * Defines proprietary reason to reject a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryStatusJustification2", propOrder = {
    "prtryStsRsn",
    "rsn"
})
public class ProprietaryStatusJustification2 {

    @XmlElement(name = "PrtryStsRsn", required = true)
    protected String prtryStsRsn;
    @XmlElement(name = "Rsn", required = true)
    protected String rsn;

    /**
     * Gets the value of the prtryStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryStsRsn() {
        return prtryStsRsn;
    }

    /**
     * Sets the value of the prtryStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProprietaryStatusJustification2 setPrtryStsRsn(String value) {
        this.prtryStsRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProprietaryStatusJustification2 setRsn(String value) {
        this.rsn = value;
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
