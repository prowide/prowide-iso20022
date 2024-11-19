
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
 * Status is in repair.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InRepairStatus1", propOrder = {
    "noRsn",
    "rsn",
    "dataSrcSchme"
})
public class InRepairStatus1 {

    @XmlElement(name = "NoRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noRsn;
    @XmlElement(name = "Rsn")
    protected InRepairStatusReason1 rsn;
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
    public InRepairStatus1 setNoRsn(NoReasonCode value) {
        this.noRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatusReason1 }
     *     
     */
    public InRepairStatusReason1 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatusReason1 }
     *     
     */
    public InRepairStatus1 setRsn(InRepairStatusReason1 value) {
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
    public InRepairStatus1 setDataSrcSchme(GenericIdentification1 value) {
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
