
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
 * CreditorReferenceTypeSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceTypeSEPA_DFU1", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class CreditorReferenceTypeSEPADFU1 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected CreditorReferenceTypeCodeSEPADFU1 cdOrPrtry;
    @XmlElement(name = "Issr")
    protected String issr;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceTypeCodeSEPADFU1 }
     *     
     */
    public CreditorReferenceTypeCodeSEPADFU1 getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceTypeCodeSEPADFU1 }
     *     
     */
    public CreditorReferenceTypeSEPADFU1 setCdOrPrtry(CreditorReferenceTypeCodeSEPADFU1 value) {
        this.cdOrPrtry = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditorReferenceTypeSEPADFU1 setIssr(String value) {
        this.issr = value;
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
