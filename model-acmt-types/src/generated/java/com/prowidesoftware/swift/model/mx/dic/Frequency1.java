
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
 * Details to specify the frequency, pattern and other items to allow for the communication of a series of payments to be made to the same recipient over a period of time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frequency1", propOrder = {
    "seq",
    "startDt",
    "endPtChc",
    "reqdFrqcyPttrn",
    "nonWorkgDayAdjstmnt"
})
public class Frequency1 {

    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "StartDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndPtChc", required = true)
    protected EndPoint1Choice endPtChc;
    @XmlElement(name = "ReqdFrqcyPttrn")
    protected Frequency37Choice reqdFrqcyPttrn;
    @XmlElement(name = "NonWorkgDayAdjstmnt")
    @XmlSchemaType(name = "string")
    protected BusinessDayConvention1Code nonWorkgDayAdjstmnt;

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Frequency1 setSeq(String value) {
        this.seq = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Frequency1 setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endPtChc property.
     * 
     * @return
     *     possible object is
     *     {@link EndPoint1Choice }
     *     
     */
    public EndPoint1Choice getEndPtChc() {
        return endPtChc;
    }

    /**
     * Sets the value of the endPtChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndPoint1Choice }
     *     
     */
    public Frequency1 setEndPtChc(EndPoint1Choice value) {
        this.endPtChc = value;
        return this;
    }

    /**
     * Gets the value of the reqdFrqcyPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency37Choice }
     *     
     */
    public Frequency37Choice getReqdFrqcyPttrn() {
        return reqdFrqcyPttrn;
    }

    /**
     * Sets the value of the reqdFrqcyPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency37Choice }
     *     
     */
    public Frequency1 setReqdFrqcyPttrn(Frequency37Choice value) {
        this.reqdFrqcyPttrn = value;
        return this;
    }

    /**
     * Gets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public BusinessDayConvention1Code getNonWorkgDayAdjstmnt() {
        return nonWorkgDayAdjstmnt;
    }

    /**
     * Sets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public Frequency1 setNonWorkgDayAdjstmnt(BusinessDayConvention1Code value) {
        this.nonWorkgDayAdjstmnt = value;
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
