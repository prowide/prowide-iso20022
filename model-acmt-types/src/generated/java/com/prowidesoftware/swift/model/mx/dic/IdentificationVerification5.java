
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
 * Provides the details of the identification data that is requested to be verified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationVerification5", propOrder = {
    "id",
    "ptyAndAcctId"
})
public class IdentificationVerification5 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "PtyAndAcctId", required = true)
    protected IdentificationInformation5 ptyAndAcctId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationVerification5 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ptyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation5 }
     *     
     */
    public IdentificationInformation5 getPtyAndAcctId() {
        return ptyAndAcctId;
    }

    /**
     * Sets the value of the ptyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation5 }
     *     
     */
    public IdentificationVerification5 setPtyAndAcctId(IdentificationInformation5 value) {
        this.ptyAndAcctId = value;
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
