
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "ClearingRecordData2", propOrder = {
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
public class ClearingRecordData2 {

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
    protected Amount17 clrAmt;
    @XmlElement(name = "IntrchngFee")
    protected Amount17 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount17 agtFee;
    @XmlElement(name = "OthrAmt")
    protected OtherAmount4 othrAmt;

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
    public ClearingRecordData2 setOrgtr(Originator1 value) {
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
    public ClearingRecordData2 setDstn(Destination1 value) {
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
    public ClearingRecordData2 setClrMtd(ClearingMethod2Code value) {
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
    public ClearingRecordData2 setOthrClrMtd(String value) {
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
    public ClearingRecordData2 setClrPrty(String value) {
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
    public ClearingRecordData2 setClrDt(XMLGregorianCalendar value) {
        this.clrDt = value;
        return this;
    }

    /**
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public ClearingRecordData2 setClrAmt(Amount17 value) {
        this.clrAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public ClearingRecordData2 setIntrchngFee(Amount17 value) {
        this.intrchngFee = value;
        return this;
    }

    /**
     * Gets the value of the agtFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getAgtFee() {
        return agtFee;
    }

    /**
     * Sets the value of the agtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public ClearingRecordData2 setAgtFee(Amount17 value) {
        this.agtFee = value;
        return this;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmount4 }
     *     
     */
    public OtherAmount4 getOthrAmt() {
        return othrAmt;
    }

    /**
     * Sets the value of the othrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmount4 }
     *     
     */
    public ClearingRecordData2 setOthrAmt(OtherAmount4 value) {
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
