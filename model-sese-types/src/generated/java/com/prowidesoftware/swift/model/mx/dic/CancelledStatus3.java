
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
 * Reason for the cancelled status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelledStatus3", propOrder = {
    "noSpcfdRsn",
    "rsn",
    "xtndedRsn",
    "dataSrcSchme"
})
public class CancelledStatus3 {

    @XmlElement(name = "NoSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noSpcfdRsn;
    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected CancelledStatusReason3Code rsn;
    @XmlElement(name = "XtndedRsn")
    protected String xtndedRsn;
    @XmlElement(name = "DataSrcSchme")
    protected GenericIdentification1 dataSrcSchme;

    /**
     * Gets the value of the noSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoSpcfdRsn() {
        return noSpcfdRsn;
    }

    /**
     * Sets the value of the noSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CancelledStatus3 setNoSpcfdRsn(NoReasonCode value) {
        this.noSpcfdRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason3Code }
     *     
     */
    public CancelledStatusReason3Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason3Code }
     *     
     */
    public CancelledStatus3 setRsn(CancelledStatusReason3Code value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedRsn() {
        return xtndedRsn;
    }

    /**
     * Sets the value of the xtndedRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancelledStatus3 setXtndedRsn(String value) {
        this.xtndedRsn = value;
        return this;
    }

    /**
     * Gets the value of the dataSrcSchme property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getDataSrcSchme() {
        return dataSrcSchme;
    }

    /**
     * Sets the value of the dataSrcSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public CancelledStatus3 setDataSrcSchme(GenericIdentification1 value) {
        this.dataSrcSchme = value;
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
