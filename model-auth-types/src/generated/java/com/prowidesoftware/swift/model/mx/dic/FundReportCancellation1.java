
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
 * Specifies the attributes of the money market fund in case of a cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReportCancellation1", propOrder = {
    "ntlRegnNb"
})
public class FundReportCancellation1 {

    @XmlElement(name = "NtlRegnNb", required = true)
    protected GenericOrganisationIdentification1 ntlRegnNb;

    /**
     * Gets the value of the ntlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public GenericOrganisationIdentification1 getNtlRegnNb() {
        return ntlRegnNb;
    }

    /**
     * Sets the value of the ntlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public FundReportCancellation1 setNtlRegnNb(GenericOrganisationIdentification1 value) {
        this.ntlRegnNb = value;
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
