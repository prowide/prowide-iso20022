
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification6Choice", propOrder = {
    "isin",
    "othrId",
    "instrmDesc"
})
public class SecurityIdentification6Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OthrId")
    protected AlternateSecurityIdentification1 othrId;
    @XmlElement(name = "InstrmDesc")
    protected SecurityInstrumentDescription2 instrmDesc;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification6Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification1 }
     *     
     */
    public AlternateSecurityIdentification1 getOthrId() {
        return othrId;
    }

    /**
     * Sets the value of the othrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification1 }
     *     
     */
    public SecurityIdentification6Choice setOthrId(AlternateSecurityIdentification1 value) {
        this.othrId = value;
        return this;
    }

    /**
     * Gets the value of the instrmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription2 }
     *     
     */
    public SecurityInstrumentDescription2 getInstrmDesc() {
        return instrmDesc;
    }

    /**
     * Sets the value of the instrmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription2 }
     *     
     */
    public SecurityIdentification6Choice setInstrmDesc(SecurityInstrumentDescription2 value) {
        this.instrmDesc = value;
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
