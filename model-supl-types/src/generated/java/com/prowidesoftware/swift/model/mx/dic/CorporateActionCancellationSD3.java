
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding linkage details. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellationSD3", propOrder = {
    "plcAndNm",
    "lkdCorpActnId",
    "lkgTp",
    "lkAddedDt",
    "lkModfdDt"
})
public class CorporateActionCancellationSD3 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "LkdCorpActnId", required = true)
    protected String lkdCorpActnId;
    @XmlElement(name = "LkgTp", required = true)
    @XmlSchemaType(name = "string")
    protected DTCCLinkType1Code lkgTp;
    @XmlElement(name = "LkAddedDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lkAddedDt;
    @XmlElement(name = "LkModfdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lkModfdDt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the lkdCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdCorpActnId() {
        return lkdCorpActnId;
    }

    /**
     * Sets the value of the lkdCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD3 setLkdCorpActnId(String value) {
        this.lkdCorpActnId = value;
        return this;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCLinkType1Code }
     *     
     */
    public DTCCLinkType1Code getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCLinkType1Code }
     *     
     */
    public CorporateActionCancellationSD3 setLkgTp(DTCCLinkType1Code value) {
        this.lkgTp = value;
        return this;
    }

    /**
     * Gets the value of the lkAddedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLkAddedDt() {
        return lkAddedDt;
    }

    /**
     * Sets the value of the lkAddedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionCancellationSD3 setLkAddedDt(XMLGregorianCalendar value) {
        this.lkAddedDt = value;
        return this;
    }

    /**
     * Gets the value of the lkModfdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLkModfdDt() {
        return lkModfdDt;
    }

    /**
     * Sets the value of the lkModfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionCancellationSD3 setLkModfdDt(XMLGregorianCalendar value) {
        this.lkModfdDt = value;
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
