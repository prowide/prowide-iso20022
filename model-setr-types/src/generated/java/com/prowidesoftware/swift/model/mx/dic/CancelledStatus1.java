
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
 * Status is cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelledStatus1", propOrder = {
    "noRsn",
    "rsn",
    "dataSrcSchme"
})
public class CancelledStatus1 {

    @XmlElement(name = "NoRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noRsn;
    @XmlElement(name = "Rsn")
    protected CancelledStatusReason1 rsn;
    @XmlElement(name = "DataSrcSchme")
    protected GenericIdentification1 dataSrcSchme;

    /**
     * Gets the value of the noRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoRsn() {
        return noRsn;
    }

    /**
     * Sets the value of the noRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CancelledStatus1 setNoRsn(NoReasonCode value) {
        this.noRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason1 }
     *     
     */
    public CancelledStatusReason1 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason1 }
     *     
     */
    public CancelledStatus1 setRsn(CancelledStatusReason1 value) {
        this.rsn = value;
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
    public CancelledStatus1 setDataSrcSchme(GenericIdentification1 value) {
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
