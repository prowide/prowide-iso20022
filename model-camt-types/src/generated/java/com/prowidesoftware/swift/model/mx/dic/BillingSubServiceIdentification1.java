
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
 * Specifies the identification of a billing subservice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingSubServiceIdentification1", propOrder = {
    "issr",
    "id"
})
public class BillingSubServiceIdentification1 {

    @XmlElement(name = "Issr", required = true)
    protected BillingSubServiceQualifier1Choice issr;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSubServiceQualifier1Choice }
     *     
     */
    public BillingSubServiceQualifier1Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSubServiceQualifier1Choice }
     *     
     */
    public BillingSubServiceIdentification1 setIssr(BillingSubServiceQualifier1Choice value) {
        this.issr = value;
        return this;
    }

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
    public BillingSubServiceIdentification1 setId(String value) {
        this.id = value;
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
