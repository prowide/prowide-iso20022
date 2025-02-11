
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
 * Information provided to claim funds
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInformation1", propOrder = {
    "clmCrdntls",
    "assgnr"
})
public class ClaimInformation1 {

    @XmlElement(name = "ClmCrdntls")
    protected String clmCrdntls;
    @XmlElement(name = "Assgnr")
    protected String assgnr;

    /**
     * Gets the value of the clmCrdntls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmCrdntls() {
        return clmCrdntls;
    }

    /**
     * Sets the value of the clmCrdntls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClaimInformation1 setClmCrdntls(String value) {
        this.clmCrdntls = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClaimInformation1 setAssgnr(String value) {
        this.assgnr = value;
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
