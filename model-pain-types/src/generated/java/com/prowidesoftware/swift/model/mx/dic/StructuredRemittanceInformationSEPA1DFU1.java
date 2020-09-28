
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
 * StructuredRemittanceInformationSEPA1_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformationSEPA1_DFU1", propOrder = {
    "cdtrRefInf"
})
public class StructuredRemittanceInformationSEPA1DFU1 {

    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformationSEPA1DFU1 cdtrRefInf;

    /**
     * Gets the value of the cdtrRefInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformationSEPA1DFU1 }
     *     
     */
    public CreditorReferenceInformationSEPA1DFU1 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Sets the value of the cdtrRefInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformationSEPA1DFU1 }
     *     
     */
    public StructuredRemittanceInformationSEPA1DFU1 setCdtrRefInf(CreditorReferenceInformationSEPA1DFU1 value) {
        this.cdtrRefInf = value;
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
