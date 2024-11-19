
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "SecurityDate1", propOrder = {
    "pstngDt",
    "avlblDt",
    "prpssDt",
    "dvddRnkgDt",
    "earlstPmtDt",
    "pmtDt"
})
public class SecurityDate1 {

    @XmlElement(name = "PstngDt", required = true)
    protected DateAndDateTimeChoice pstngDt;
    @XmlElement(name = "AvlblDt")
    protected DateFormat6Choice avlblDt;
    @XmlElement(name = "PrpssDt")
    protected DateFormat6Choice prpssDt;
    @XmlElement(name = "DvddRnkgDt")
    protected DateFormat6Choice dvddRnkgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat6Choice earlstPmtDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat6Choice pmtDt;

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
    public SecurityDate1 setPstngDt(DateAndDateTimeChoice value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public SecurityDate1 setAvlblDt(DateFormat6Choice value) {
        this.avlblDt = value;
        return this;
    }

    /**
     * Gets the value of the prpssDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getPrpssDt() {
        return prpssDt;
    }

    /**
     * Sets the value of the prpssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public SecurityDate1 setPrpssDt(DateFormat6Choice value) {
        this.prpssDt = value;
        return this;
    }

    /**
     * Gets the value of the dvddRnkgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getDvddRnkgDt() {
        return dvddRnkgDt;
    }

    /**
     * Sets the value of the dvddRnkgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public SecurityDate1 setDvddRnkgDt(DateFormat6Choice value) {
        this.dvddRnkgDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public SecurityDate1 setEarlstPmtDt(DateFormat6Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public SecurityDate1 setPmtDt(DateFormat6Choice value) {
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
