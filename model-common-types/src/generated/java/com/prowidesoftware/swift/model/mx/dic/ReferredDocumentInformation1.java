
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
 * Structured information supplied to fully identify the documents referred to in the remittance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation1", propOrder = {
    "rfrdDocTp",
    "rfrdDocNb"
})
public class ReferredDocumentInformation1 {

    @XmlElement(name = "RfrdDocTp")
    protected ReferredDocumentType1 rfrdDocTp;
    @XmlElement(name = "RfrdDocNb")
    protected String rfrdDocNb;

    /**
     * Gets the value of the rfrdDocTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentType1 }
     *     
     */
    public ReferredDocumentType1 getRfrdDocTp() {
        return rfrdDocTp;
    }

    /**
     * Sets the value of the rfrdDocTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentType1 }
     *     
     */
    public ReferredDocumentInformation1 setRfrdDocTp(ReferredDocumentType1 value) {
        this.rfrdDocTp = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDocNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrdDocNb() {
        return rfrdDocNb;
    }

    /**
     * Sets the value of the rfrdDocNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReferredDocumentInformation1 setRfrdDocNb(String value) {
        this.rfrdDocNb = value;
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
