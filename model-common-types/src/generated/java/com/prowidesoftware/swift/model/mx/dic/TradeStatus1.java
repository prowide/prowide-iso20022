
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
 * Specifies the status of a trade in a central settlement system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStatus1", propOrder = {
    "allgdTrad",
    "mtchgSysUnqRef",
    "sts",
    "xtndedSts",
    "stsSubTp",
    "stsTm",
    "stsOrgtr"
})
public class TradeStatus1 {

    @XmlElement(name = "AllgdTrad")
    protected Boolean allgdTrad;
    @XmlElement(name = "MtchgSysUnqRef", required = true)
    protected String mtchgSysUnqRef;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected TradeStatus1Code sts;
    @XmlElement(name = "XtndedSts")
    protected String xtndedSts;
    @XmlElement(name = "StsSubTp")
    protected String stsSubTp;
    @XmlElement(name = "StsTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsTm;
    @XmlElement(name = "StsOrgtr")
    protected String stsOrgtr;

    /**
     * Gets the value of the allgdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllgdTrad() {
        return allgdTrad;
    }

    /**
     * Sets the value of the allgdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeStatus1 setAllgdTrad(Boolean value) {
        this.allgdTrad = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysUnqRef() {
        return mtchgSysUnqRef;
    }

    /**
     * Sets the value of the mtchgSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeStatus1 setMtchgSysUnqRef(String value) {
        this.mtchgSysUnqRef = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus1Code }
     *     
     */
    public TradeStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus1Code }
     *     
     */
    public TradeStatus1 setSts(TradeStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the xtndedSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedSts() {
        return xtndedSts;
    }

    /**
     * Sets the value of the xtndedSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeStatus1 setXtndedSts(String value) {
        this.xtndedSts = value;
        return this;
    }

    /**
     * Gets the value of the stsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsSubTp() {
        return stsSubTp;
    }

    /**
     * Sets the value of the stsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeStatus1 setStsSubTp(String value) {
        this.stsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the stsTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsTm() {
        return stsTm;
    }

    /**
     * Sets the value of the stsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeStatus1 setStsTm(XMLGregorianCalendar value) {
        this.stsTm = value;
        return this;
    }

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeStatus1 setStsOrgtr(String value) {
        this.stsOrgtr = value;
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
