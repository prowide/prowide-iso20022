
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
 * Corporate action event notification status and contents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotification6", propOrder = {
    "ntfctnTp",
    "prcgSts",
    "elgblBalInd"
})
public class CorporateActionNotification6 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionNotificationType1Code ntfctnTp;
    @XmlElement(name = "PrcgSts", required = true)
    protected CorporateActionProcessingStatus6Choice prcgSts;
    @XmlElement(name = "ElgblBalInd")
    protected Boolean elgblBalInd;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public CorporateActionNotificationType1Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public CorporateActionNotification6 setNtfctnTp(CorporateActionNotificationType1Code value) {
        this.ntfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionProcessingStatus6Choice }
     *     
     */
    public CorporateActionProcessingStatus6Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionProcessingStatus6Choice }
     *     
     */
    public CorporateActionNotification6 setPrcgSts(CorporateActionProcessingStatus6Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the elgblBalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblBalInd() {
        return elgblBalInd;
    }

    /**
     * Sets the value of the elgblBalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionNotification6 setElgblBalInd(Boolean value) {
        this.elgblBalInd = value;
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
