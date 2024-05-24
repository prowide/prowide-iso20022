
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for MRRResult complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MRRResult", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "snlId",
    "snlep"
})
public class SwIntMRRResult {

    @XmlElement(name = "SNLId", required = true)
    protected String snlId;
    @XmlElement(name = "SNLEP")
    protected String snlep;

    /**
     * Gets the value of the snlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLId() {
        return snlId;
    }

    /**
     * Sets the value of the snlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntMRRResult setSNLId(String value) {
        this.snlId = value;
        return this;
    }

    /**
     * Gets the value of the snlep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLEP() {
        return snlep;
    }

    /**
     * Sets the value of the snlep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntMRRResult setSNLEP(String value) {
        this.snlep = value;
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
