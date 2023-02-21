
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ComparisonResult1", propOrder = {
    "elmtSeqNb",
    "elmtPth",
    "elmtNm",
    "rplcmnt",
    "deltn",
    "addtn"
})
public class ComparisonResult1 {

    @XmlElement(name = "ElmtSeqNb", required = true)
    protected BigDecimal elmtSeqNb;
    @XmlElement(name = "ElmtPth", required = true)
    protected String elmtPth;
    @XmlElement(name = "ElmtNm", required = true)
    protected String elmtNm;
    @XmlElement(name = "Rplcmnt")
    protected Replacement1 rplcmnt;
    @XmlElement(name = "Deltn")
    protected Deletion1 deltn;
    @XmlElement(name = "Addtn")
    protected Addition1 addtn;

    /**
     * Gets the value of the elmtSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElmtSeqNb() {
        return elmtSeqNb;
    }

    /**
     * Sets the value of the elmtSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ComparisonResult1 setElmtSeqNb(BigDecimal value) {
        this.elmtSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the elmtPth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtPth() {
        return elmtPth;
    }

    /**
     * Sets the value of the elmtPth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ComparisonResult1 setElmtPth(String value) {
        this.elmtPth = value;
        return this;
    }

    /**
     * Gets the value of the elmtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtNm() {
        return elmtNm;
    }

    /**
     * Sets the value of the elmtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ComparisonResult1 setElmtNm(String value) {
        this.elmtNm = value;
        return this;
    }

    /**
     * Gets the value of the rplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Replacement1 }
     *     
     */
    public Replacement1 getRplcmnt() {
        return rplcmnt;
    }

    /**
     * Sets the value of the rplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Replacement1 }
     *     
     */
    public ComparisonResult1 setRplcmnt(Replacement1 value) {
        this.rplcmnt = value;
        return this;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link Deletion1 }
     *     
     */
    public Deletion1 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deletion1 }
     *     
     */
    public ComparisonResult1 setDeltn(Deletion1 value) {
        this.deltn = value;
        return this;
    }

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link Addition1 }
     *     
     */
    public Addition1 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addition1 }
     *     
     */
    public ComparisonResult1 setAddtn(Addition1 value) {
        this.addtn = value;
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
