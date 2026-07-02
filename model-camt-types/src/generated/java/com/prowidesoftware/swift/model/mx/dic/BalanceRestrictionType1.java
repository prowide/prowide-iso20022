
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
 * Type providing further information on balance restrictions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceRestrictionType1", propOrder = {
    "tp",
    "desc",
    "prcgTp"
})
public class BalanceRestrictionType1 {

    @XmlElement(name = "Tp", required = true)
    protected GenericIdentification1 tp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "PrcgTp")
    protected ProcessingType1Choice prcgTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public BalanceRestrictionType1 setTp(GenericIdentification1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BalanceRestrictionType1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the prcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingType1Choice }
     *     
     */
    public ProcessingType1Choice getPrcgTp() {
        return prcgTp;
    }

    /**
     * Sets the value of the prcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingType1Choice }
     *     
     */
    public BalanceRestrictionType1 setPrcgTp(ProcessingType1Choice value) {
        this.prcgTp = value;
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
