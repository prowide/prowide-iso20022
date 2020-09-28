
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
 * MandateRelatedInformationSDD_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedInformationSDD_DFU1", propOrder = {
    "mndtId",
    "dtOfSgntr",
    "amdmntInd",
    "amdmntInfDtls",
    "elctrncSgntr"
})
public class MandateRelatedInformationSDDDFU1 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "DtOfSgntr", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfSgntr;
    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "AmdmntInfDtls")
    protected AmendmentInformationDetailsSDDDFU1 amdmntInfDtls;
    @XmlElement(name = "ElctrncSgntr")
    protected String elctrncSgntr;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformationSDDDFU1 setMndtId(String value) {
        this.mndtId = value;
        return this;
    }

    /**
     * Gets the value of the dtOfSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfSgntr() {
        return dtOfSgntr;
    }

    /**
     * Sets the value of the dtOfSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MandateRelatedInformationSDDDFU1 setDtOfSgntr(XMLGregorianCalendar value) {
        this.dtOfSgntr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MandateRelatedInformationSDDDFU1 setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
        return this;
    }

    /**
     * Gets the value of the amdmntInfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentInformationDetailsSDDDFU1 }
     *     
     */
    public AmendmentInformationDetailsSDDDFU1 getAmdmntInfDtls() {
        return amdmntInfDtls;
    }

    /**
     * Sets the value of the amdmntInfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentInformationDetailsSDDDFU1 }
     *     
     */
    public MandateRelatedInformationSDDDFU1 setAmdmntInfDtls(AmendmentInformationDetailsSDDDFU1 value) {
        this.amdmntInfDtls = value;
        return this;
    }

    /**
     * Gets the value of the elctrncSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncSgntr() {
        return elctrncSgntr;
    }

    /**
     * Sets the value of the elctrncSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformationSDDDFU1 setElctrncSgntr(String value) {
        this.elctrncSgntr = value;
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
