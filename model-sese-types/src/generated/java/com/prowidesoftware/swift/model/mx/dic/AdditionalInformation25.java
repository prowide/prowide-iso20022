
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation25", propOrder = {
    "qryTp",
    "qry",
    "qryRsn",
    "rjctnRsn"
})
public class AdditionalInformation25 {

    @XmlElement(name = "QryTp")
    protected GenericIdentification36 qryTp;
    @XmlElement(name = "Qry", required = true)
    protected String qry;
    @XmlElement(name = "QryRsn")
    protected String qryRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectedReason33Choice rjctnRsn;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public AdditionalInformation25 setQryTp(GenericIdentification36 value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the qry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQry() {
        return qry;
    }

    /**
     * Sets the value of the qry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation25 setQry(String value) {
        this.qry = value;
        return this;
    }

    /**
     * Gets the value of the qryRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRsn() {
        return qryRsn;
    }

    /**
     * Sets the value of the qryRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation25 setQryRsn(String value) {
        this.qryRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedReason33Choice }
     *     
     */
    public RejectedReason33Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedReason33Choice }
     *     
     */
    public AdditionalInformation25 setRjctnRsn(RejectedReason33Choice value) {
        this.rjctnRsn = value;
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
