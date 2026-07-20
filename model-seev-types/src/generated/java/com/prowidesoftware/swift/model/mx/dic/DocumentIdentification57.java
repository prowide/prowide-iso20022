
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
 * Identifies a document by a unique identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification57", propOrder = {
    "buyrPrtcnInstrId",
    "prcrInstrId"
})
public class DocumentIdentification57 {

    @XmlElement(name = "BuyrPrtcnInstrId", required = true)
    protected String buyrPrtcnInstrId;
    @XmlElement(name = "PrcrInstrId")
    protected String prcrInstrId;

    /**
     * Gets the value of the buyrPrtcnInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrPrtcnInstrId() {
        return buyrPrtcnInstrId;
    }

    /**
     * Sets the value of the buyrPrtcnInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentIdentification57 setBuyrPrtcnInstrId(String value) {
        this.buyrPrtcnInstrId = value;
        return this;
    }

    /**
     * Gets the value of the prcrInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrInstrId() {
        return prcrInstrId;
    }

    /**
     * Sets the value of the prcrInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentIdentification57 setPrcrInstrId(String value) {
        this.prcrInstrId = value;
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
