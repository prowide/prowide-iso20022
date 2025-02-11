
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
 * Other target market parameter.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTargetMarket1", propOrder = {
    "trgtMktTp",
    "addtlInf"
})
public class OtherTargetMarket1 {

    @XmlElement(name = "TrgtMktTp", required = true)
    protected String trgtMktTp;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the trgtMktTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtMktTp() {
        return trgtMktTp;
    }

    /**
     * Sets the value of the trgtMktTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherTargetMarket1 setTrgtMktTp(String value) {
        this.trgtMktTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public OtherTargetMarket1 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
