
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
 * Provides information about the notification advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotification1", propOrder = {
    "anncmntDt",
    "frthrDtldAnncmntDt",
    "offclAnncmntPblctnDt",
    "prcgSts"
})
public class CorporateActionNotification1 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat4Choice anncmntDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat4Choice frthrDtldAnncmntDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat4Choice offclAnncmntPblctnDt;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus1FormatChoice prcgSts;

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionNotification1 setAnncmntDt(DateFormat4Choice value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the frthrDtldAnncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getFrthrDtldAnncmntDt() {
        return frthrDtldAnncmntDt;
    }

    /**
     * Sets the value of the frthrDtldAnncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionNotification1 setFrthrDtldAnncmntDt(DateFormat4Choice value) {
        this.frthrDtldAnncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the offclAnncmntPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getOffclAnncmntPblctnDt() {
        return offclAnncmntPblctnDt;
    }

    /**
     * Sets the value of the offclAnncmntPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionNotification1 setOffclAnncmntPblctnDt(DateFormat4Choice value) {
        this.offclAnncmntPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus1FormatChoice }
     *     
     */
    public ProcessingStatus1FormatChoice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus1FormatChoice }
     *     
     */
    public CorporateActionNotification1 setPrcgSts(ProcessingStatus1FormatChoice value) {
        this.prcgSts = value;
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
