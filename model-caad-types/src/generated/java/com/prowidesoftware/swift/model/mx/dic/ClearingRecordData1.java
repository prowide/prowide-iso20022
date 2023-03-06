
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information used with financial types of messages when third-party clearing is involved.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingRecordData1", propOrder = {
    "orgtr",
    "dstn",
    "clrMtd",
    "othrClrMtd",
    "clrPrty",
    "clrDt",
    "clrAmt",
    "intrchngFee",
    "agtFee",
    "othrAmt"
})
public class ClearingRecordData1 {

    @XmlElement(name = "Orgtr")
    protected Originator1 orgtr;
    @XmlElement(name = "Dstn")
    protected Destination1 dstn;
    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod2Code clrMtd;
    @XmlElement(name = "OthrClrMtd")
    protected String othrClrMtd;
    @XmlElement(name = "ClrPrty")
    protected String clrPrty;
    @XmlElement(name = "ClrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clrDt;
    @XmlElement(name = "ClrAmt")
    protected Amount14 clrAmt;
    @XmlElement(name = "IntrchngFee")
    protected Amount14 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount14 agtFee;
    @XmlElement(name = "OthrAmt")
    protected OtherAmount2 othrAmt;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link Originator1 }
     *     
     */
    public Originator1 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Originator1 }
     *     
     */
    public ClearingRecordData1 setOrgtr(Originator1 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link Destination1 }
     *     
     */
    public Destination1 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination1 }
     *     
     */
    public ClearingRecordData1 setDstn(Destination1 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingMethod2Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingRecordData1 setClrMtd(ClearingMethod2Code value) {
        this.clrMtd = value;
        return this;
    }

    /**
     * Gets the value of the othrClrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClrMtd() {
        return othrClrMtd;
    }

    /**
     * Sets the value of the othrClrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingRecordData1 setOthrClrMtd(String value) {
        this.othrClrMtd = value;
        return this;
    }

    /**
     * Gets the value of the clrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrPrty() {
        return clrPrty;
    }

    /**
     * Sets the value of the clrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingRecordData1 setClrPrty(String value) {
        this.clrPrty = value;
        return this;
    }

    /**
     * Gets the value of the clrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getClrDt() {
        return clrDt;
    }

    /**
     * Sets the value of the clrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingRecordData1 setClrDt(XMLGregorianCalendar value) {
        this.clrDt = value;
        return this;
    }

    /**
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public ClearingRecordData1 setClrAmt(Amount14 value) {
        this.clrAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public ClearingRecordData1 setIntrchngFee(Amount14 value) {
        this.intrchngFee = value;
        return this;
    }

    /**
     * Gets the value of the agtFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getAgtFee() {
        return agtFee;
    }

    /**
     * Sets the value of the agtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public ClearingRecordData1 setAgtFee(Amount14 value) {
        this.agtFee = value;
        return this;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmount2 }
     *     
     */
    public OtherAmount2 getOthrAmt() {
        return othrAmt;
    }

    /**
     * Sets the value of the othrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmount2 }
     *     
     */
    public ClearingRecordData1 setOthrAmt(OtherAmount2 value) {
        this.othrAmt = value;
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
