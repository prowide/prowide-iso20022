
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
 * Provides information on the remittance advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation9", propOrder = {
    "rmtId",
    "rmtLctnMtd",
    "rmtLctnElctrncAdr",
    "rmtLctnPstlAdr"
})
public class RemittanceLocation9 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnMtd")
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod2Code rmtLctnMtd;
    @XmlElement(name = "RmtLctnElctrncAdr")
    protected String rmtLctnElctrncAdr;
    @XmlElement(name = "RmtLctnPstlAdr")
    protected NameAndAddress18 rmtLctnPstlAdr;

    /**
     * Gets the value of the rmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Sets the value of the rmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RemittanceLocation9 setRmtId(String value) {
        this.rmtId = value;
        return this;
    }

    /**
     * Gets the value of the rmtLctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod2Code }
     *     
     */
    public RemittanceLocationMethod2Code getRmtLctnMtd() {
        return rmtLctnMtd;
    }

    /**
     * Sets the value of the rmtLctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod2Code }
     *     
     */
    public RemittanceLocation9 setRmtLctnMtd(RemittanceLocationMethod2Code value) {
        this.rmtLctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the rmtLctnElctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtLctnElctrncAdr() {
        return rmtLctnElctrncAdr;
    }

    /**
     * Sets the value of the rmtLctnElctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RemittanceLocation9 setRmtLctnElctrncAdr(String value) {
        this.rmtLctnElctrncAdr = value;
        return this;
    }

    /**
     * Gets the value of the rmtLctnPstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress18 }
     *     
     */
    public NameAndAddress18 getRmtLctnPstlAdr() {
        return rmtLctnPstlAdr;
    }

    /**
     * Sets the value of the rmtLctnPstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress18 }
     *     
     */
    public RemittanceLocation9 setRmtLctnPstlAdr(NameAndAddress18 value) {
        this.rmtLctnPstlAdr = value;
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
