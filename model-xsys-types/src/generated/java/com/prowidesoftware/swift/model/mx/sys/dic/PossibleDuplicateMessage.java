
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for PossibleDuplicateMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleDuplicateMessage", propOrder = {
    "swiftTime"
})
public class PossibleDuplicateMessage {

    @XmlElement(name = "SwiftTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String swiftTime;

    /**
     * DeliveryTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftTime() {
        return swiftTime;
    }

    /**
     * Sets the value of the swiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PossibleDuplicateMessage setSwiftTime(String value) {
        this.swiftTime = value;
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
