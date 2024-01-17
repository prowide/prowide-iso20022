
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
 * Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedInformation1", propOrder = {
    "labl",
    "inf"
})
public class UserDefinedInformation1 {

    @XmlElement(name = "Labl", required = true)
    protected String labl;
    @XmlElement(name = "Inf", required = true)
    protected String inf;

    /**
     * Gets the value of the labl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabl() {
        return labl;
    }

    /**
     * Sets the value of the labl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UserDefinedInformation1 setLabl(String value) {
        this.labl = value;
        return this;
    }

    /**
     * Gets the value of the inf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInf() {
        return inf;
    }

    /**
     * Sets the value of the inf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UserDefinedInformation1 setInf(String value) {
        this.inf = value;
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
