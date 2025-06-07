
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
 * Status of a case resulting from a case assignment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseForwardingNotification3", propOrder = {
    "justfn"
})
public class CaseForwardingNotification3 {

    @XmlElement(name = "Justfn", required = true)
    @XmlSchemaType(name = "string")
    protected CaseForwardingNotification3Code justfn;

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link CaseForwardingNotification3Code }
     *     
     */
    public CaseForwardingNotification3Code getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseForwardingNotification3Code }
     *     
     */
    public CaseForwardingNotification3 setJustfn(CaseForwardingNotification3Code value) {
        this.justfn = value;
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
