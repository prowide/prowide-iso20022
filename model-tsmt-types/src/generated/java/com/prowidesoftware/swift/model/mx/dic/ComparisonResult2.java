
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ComparisonResult2", propOrder = {
    "elmtSeqNb",
    "elmtPth",
    "elmtNm",
    "rplcmnt",
    "deltn",
    "addtn"
})
public class ComparisonResult2 {

    @XmlElement(name = "ElmtSeqNb", required = true)
    protected BigDecimal elmtSeqNb;
    @XmlElement(name = "ElmtPth", required = true)
    protected String elmtPth;
    @XmlElement(name = "ElmtNm", required = true)
    protected String elmtNm;
    @XmlElement(name = "Rplcmnt")
    protected Replacement2 rplcmnt;
    @XmlElement(name = "Deltn")
    protected Deletion2 deltn;
    @XmlElement(name = "Addtn")
    protected Addition2 addtn;

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
    public ComparisonResult2 setElmtSeqNb(BigDecimal value) {
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
    public ComparisonResult2 setElmtPth(String value) {
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
    public ComparisonResult2 setElmtNm(String value) {
        this.elmtNm = value;
        return this;
    }

    /**
     * Gets the value of the rplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Replacement2 }
     *     
     */
    public Replacement2 getRplcmnt() {
        return rplcmnt;
    }

    /**
     * Sets the value of the rplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Replacement2 }
     *     
     */
    public ComparisonResult2 setRplcmnt(Replacement2 value) {
        this.rplcmnt = value;
        return this;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link Deletion2 }
     *     
     */
    public Deletion2 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deletion2 }
     *     
     */
    public ComparisonResult2 setDeltn(Deletion2 value) {
        this.deltn = value;
        return this;
    }

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link Addition2 }
     *     
     */
    public Addition2 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addition2 }
     *     
     */
    public ComparisonResult2 setAddtn(Addition2 value) {
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
