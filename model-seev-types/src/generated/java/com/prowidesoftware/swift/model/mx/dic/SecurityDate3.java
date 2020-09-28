
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
 * Specifies security date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDate3", propOrder = {
    "pstngDt",
    "avlblDt",
    "prpssDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "pmtDt"
})
public class SecurityDate3 {

    @XmlElement(name = "PstngDt", required = true)
    protected DateAndDateTimeChoice pstngDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat9Choice avlblDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat9Choice prpssDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat9Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat9Choice earlstPmtDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat9Choice pmtDt;

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecurityDate3 setPstngDt(DateAndDateTimeChoice value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public SecurityDate3 setAvlblDt(DateFormat9Choice value) {
        this.avlblDt = value;
        return this;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public SecurityDate3 setPrpssDt(DateFormat9Choice value) {
        this.prpssDt = value;
        return this;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public SecurityDate3 setDvddRnkgDt(DateFormat9Choice value) {
        this.dvddRnkgDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public SecurityDate3 setEarlstPmtDt(DateFormat9Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public SecurityDate3 setPmtDt(DateFormat9Choice value) {
        this.pmtDt = value;
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
