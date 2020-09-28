
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
 * Remittance information that provides all remittance address elements, that enables the matching, i.e.  reconciliation, of a payment with the items that the transaction in intended to settle.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation1", propOrder = {
    "rmtId",
    "rmtLctnMtd",
    "rmtLctnElctrncAdr",
    "rmtLctnPstlAdr"
})
public class RemittanceLocation1 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnMtd")
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod1Code rmtLctnMtd;
    @XmlElement(name = "RmtLctnElctrncAdr")
    protected String rmtLctnElctrncAdr;
    @XmlElement(name = "RmtLctnPstlAdr")
    protected NameAndAddress3 rmtLctnPstlAdr;

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
    public RemittanceLocation1 setRmtId(String value) {
        this.rmtId = value;
        return this;
    }

    /**
     * Gets the value of the rmtLctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod1Code }
     *     
     */
    public RemittanceLocationMethod1Code getRmtLctnMtd() {
        return rmtLctnMtd;
    }

    /**
     * Sets the value of the rmtLctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod1Code }
     *     
     */
    public RemittanceLocation1 setRmtLctnMtd(RemittanceLocationMethod1Code value) {
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
    public RemittanceLocation1 setRmtLctnElctrncAdr(String value) {
        this.rmtLctnElctrncAdr = value;
        return this;
    }

    /**
     * Gets the value of the rmtLctnPstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress3 }
     *     
     */
    public NameAndAddress3 getRmtLctnPstlAdr() {
        return rmtLctnPstlAdr;
    }

    /**
     * Sets the value of the rmtLctnPstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress3 }
     *     
     */
    public RemittanceLocation1 setRmtLctnPstlAdr(NameAndAddress3 value) {
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
