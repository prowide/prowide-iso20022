
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of an EU capital gain type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EUCapitalGainType2Choice", propOrder = {
    "euCptlGn",
    "prtry"
})
public class EUCapitalGainType2Choice {

    @XmlElement(name = "EUCptlGn")
    @XmlSchemaType(name = "string")
    protected EUCapitalGain2Code euCptlGn;
    @XmlElement(name = "Prtry")
    protected GenericIdentification38 prtry;

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGain2Code getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGainType2Choice setEUCptlGn(EUCapitalGain2Code value) {
        this.euCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification38 }
     *     
     */
    public GenericIdentification38 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification38 }
     *     
     */
    public EUCapitalGainType2Choice setPrtry(GenericIdentification38 value) {
        this.prtry = value;
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
