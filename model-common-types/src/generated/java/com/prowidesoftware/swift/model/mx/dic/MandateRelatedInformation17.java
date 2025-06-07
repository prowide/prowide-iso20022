
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
 * Provides further details related to a direct debit mandate signed between the creditor and the debtor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedInformation17", propOrder = {
    "mndtId",
    "dtOfSgntr",
    "mndtImg",
    "prtctdMndtImg"
})
public class MandateRelatedInformation17 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "DtOfSgntr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfSgntr;
    @XmlElement(name = "MndtImg")
    protected byte[] mndtImg;
    @XmlElement(name = "PrtctdMndtImg")
    protected ContentInformationType39 prtctdMndtImg;

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
    public MandateRelatedInformation17 setMndtId(String value) {
        this.mndtId = value;
        return this;
    }

    /**
     * Gets the value of the dtOfSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public MandateRelatedInformation17 setDtOfSgntr(XMLGregorianCalendar value) {
        this.dtOfSgntr = value;
        return this;
    }

    /**
     * Gets the value of the mndtImg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMndtImg() {
        return mndtImg;
    }

    /**
     * Sets the value of the mndtImg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MandateRelatedInformation17 setMndtImg(byte[] value) {
        this.mndtImg = value;
        return this;
    }

    /**
     * Gets the value of the prtctdMndtImg property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPrtctdMndtImg() {
        return prtctdMndtImg;
    }

    /**
     * Sets the value of the prtctdMndtImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public MandateRelatedInformation17 setPrtctdMndtImg(ContentInformationType39 value) {
        this.prtctdMndtImg = value;
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
