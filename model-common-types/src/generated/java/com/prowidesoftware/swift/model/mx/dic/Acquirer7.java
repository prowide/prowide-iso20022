
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
 * Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acquirer7", propOrder = {
    "acqrgInstn",
    "brnch"
})
public class Acquirer7 {

    @XmlElement(name = "AcqrgInstn")
    protected String acqrgInstn;
    @XmlElement(name = "Brnch")
    protected String brnch;

    /**
     * Gets the value of the acqrgInstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrgInstn() {
        return acqrgInstn;
    }

    /**
     * Sets the value of the acqrgInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Acquirer7 setAcqrgInstn(String value) {
        this.acqrgInstn = value;
        return this;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Acquirer7 setBrnch(String value) {
        this.brnch = value;
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
