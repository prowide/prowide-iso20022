
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
 * Information related to a configuration stored on a terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMVersionReport1", propOrder = {
    "cfgtnVrsn",
    "cfgtnSts",
    "failRsn"
})
public class ATMVersionReport1 {

    @XmlElement(name = "CfgtnVrsn", required = true)
    protected String cfgtnVrsn;
    @XmlElement(name = "CfgtnSts", required = true)
    @XmlSchemaType(name = "string")
    protected ActivationStatus2Code cfgtnSts;
    @XmlElement(name = "FailRsn")
    protected String failRsn;

    /**
     * Gets the value of the cfgtnVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgtnVrsn() {
        return cfgtnVrsn;
    }

    /**
     * Sets the value of the cfgtnVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMVersionReport1 setCfgtnVrsn(String value) {
        this.cfgtnVrsn = value;
        return this;
    }

    /**
     * Gets the value of the cfgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationStatus2Code }
     *     
     */
    public ActivationStatus2Code getCfgtnSts() {
        return cfgtnSts;
    }

    /**
     * Sets the value of the cfgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationStatus2Code }
     *     
     */
    public ATMVersionReport1 setCfgtnSts(ActivationStatus2Code value) {
        this.cfgtnSts = value;
        return this;
    }

    /**
     * Gets the value of the failRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailRsn() {
        return failRsn;
    }

    /**
     * Sets the value of the failRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMVersionReport1 setFailRsn(String value) {
        this.failRsn = value;
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
