
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the authority entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authority1", propOrder = {
    "ctry",
    "ctrySubDvsnMjr",
    "ctrySubDvsnMnr",
    "ctrySubDvsnMjrNm",
    "ctrySubDvsnMnrNm",
    "nm"
})
public class Authority1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CtrySubDvsnMjr")
    protected String ctrySubDvsnMjr;
    @XmlElement(name = "CtrySubDvsnMnr")
    protected String ctrySubDvsnMnr;
    @XmlElement(name = "CtrySubDvsnMjrNm")
    protected String ctrySubDvsnMjrNm;
    @XmlElement(name = "CtrySubDvsnMnrNm")
    protected String ctrySubDvsnMnrNm;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authority1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjr() {
        return ctrySubDvsnMjr;
    }

    /**
     * Sets the value of the ctrySubDvsnMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authority1 setCtrySubDvsnMjr(String value) {
        this.ctrySubDvsnMjr = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnr() {
        return ctrySubDvsnMnr;
    }

    /**
     * Sets the value of the ctrySubDvsnMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authority1 setCtrySubDvsnMnr(String value) {
        this.ctrySubDvsnMnr = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMjrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjrNm() {
        return ctrySubDvsnMjrNm;
    }

    /**
     * Sets the value of the ctrySubDvsnMjrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authority1 setCtrySubDvsnMjrNm(String value) {
        this.ctrySubDvsnMjrNm = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsnMnrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnrNm() {
        return ctrySubDvsnMnrNm;
    }

    /**
     * Sets the value of the ctrySubDvsnMnrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authority1 setCtrySubDvsnMnrNm(String value) {
        this.ctrySubDvsnMnrNm = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Authority1 setNm(String value) {
        this.nm = value;
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
