
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
 * Element containing the signature.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSignature2Choice", propOrder = {
    "dgtlSgntr",
    "trRltdData"
})
public class ATMSignature2Choice {

    @XmlElement(name = "DgtlSgntr")
    protected ContentInformationType14 dgtlSgntr;
    @XmlElement(name = "TRRltdData")
    protected TRRelatedData2 trRltdData;

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType14 }
     *     
     */
    public ContentInformationType14 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType14 }
     *     
     */
    public ATMSignature2Choice setDgtlSgntr(ContentInformationType14 value) {
        this.dgtlSgntr = value;
        return this;
    }

    /**
     * Gets the value of the trRltdData property.
     * 
     * @return
     *     possible object is
     *     {@link TRRelatedData2 }
     *     
     */
    public TRRelatedData2 getTRRltdData() {
        return trRltdData;
    }

    /**
     * Sets the value of the trRltdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRRelatedData2 }
     *     
     */
    public ATMSignature2Choice setTRRltdData(TRRelatedData2 value) {
        this.trRltdData = value;
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
