
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "SecuritiesReferenceDataChange3", propOrder = {
    "finInstrmId",
    "fldNm",
    "odFldVal",
    "newFldVal",
    "oprTmStmp"
})
public class SecuritiesReferenceDataChange3 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;
    @XmlElement(name = "FldNm", required = true)
    protected String fldNm;
    @XmlElement(name = "OdFldVal", required = true)
    protected String odFldVal;
    @XmlElement(name = "NewFldVal", required = true)
    protected String newFldVal;
    @XmlElement(name = "OprTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecuritiesReferenceDataChange3 setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
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
    public SecuritiesReferenceDataChange3 setFldNm(String value) {
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
    public SecuritiesReferenceDataChange3 setOdFldVal(String value) {
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
    public SecuritiesReferenceDataChange3 setNewFldVal(String value) {
        this.newFldVal = value;
        return this;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public SecuritiesReferenceDataChange3 setOprTmStmp(XMLGregorianCalendar value) {
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
