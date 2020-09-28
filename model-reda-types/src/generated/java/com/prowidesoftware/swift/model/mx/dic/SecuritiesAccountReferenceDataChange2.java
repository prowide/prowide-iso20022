
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
 * Describes the comparison between the currently established baseline elements and the proposed ones.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountReferenceDataChange2", propOrder = {
    "sctiesAcctId",
    "fldNm",
    "odFldVal",
    "newFldVal",
    "oprTmStmp"
})
public class SecuritiesAccountReferenceDataChange2 {

    @XmlElement(name = "SctiesAcctId", required = true)
    protected SecuritiesAccount19 sctiesAcctId;
    @XmlElement(name = "FldNm", required = true)
    protected String fldNm;
    @XmlElement(name = "OdFldVal", required = true)
    protected String odFldVal;
    @XmlElement(name = "NewFldVal", required = true)
    protected String newFldVal;
    @XmlElement(name = "OprTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccountReferenceDataChange2 setSctiesAcctId(SecuritiesAccount19 value) {
        this.sctiesAcctId = value;
        return this;
    }

    /**
     * Gets the value of the fldNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldNm() {
        return fldNm;
    }

    /**
     * Sets the value of the fldNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccountReferenceDataChange2 setFldNm(String value) {
        this.fldNm = value;
        return this;
    }

    /**
     * Gets the value of the odFldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdFldVal() {
        return odFldVal;
    }

    /**
     * Sets the value of the odFldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccountReferenceDataChange2 setOdFldVal(String value) {
        this.odFldVal = value;
        return this;
    }

    /**
     * Gets the value of the newFldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFldVal() {
        return newFldVal;
    }

    /**
     * Sets the value of the newFldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesAccountReferenceDataChange2 setNewFldVal(String value) {
        this.newFldVal = value;
        return this;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOprTmStmp() {
        return oprTmStmp;
    }

    /**
     * Sets the value of the oprTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SecuritiesAccountReferenceDataChange2 setOprTmStmp(XMLGregorianCalendar value) {
        this.oprTmStmp = value;
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
