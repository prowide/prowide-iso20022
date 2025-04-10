
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
 * Status advising on the rejection of the cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationRejectionStatus1", propOrder = {
    "rsn",
    "xtndedRsn",
    "addtlInf"
})
public class CancellationRejectionStatus1 {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected RejectionReason2Code rsn;
    @XmlElement(name = "XtndedRsn")
    protected String xtndedRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason2Code }
     *     
     */
    public RejectionReason2Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason2Code }
     *     
     */
    public CancellationRejectionStatus1 setRsn(RejectionReason2Code value) {
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
    public CancellationRejectionStatus1 setXtndedRsn(String value) {
        this.xtndedRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationRejectionStatus1 setAddtlInf(String value) {
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
