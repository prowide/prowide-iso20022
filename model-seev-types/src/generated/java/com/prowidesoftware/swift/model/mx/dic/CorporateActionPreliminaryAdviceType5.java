
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of movement preliminary advice document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPreliminaryAdviceType5", propOrder = {
    "mvmntPrlimryAdvcId",
    "tp",
    "fctn"
})
public class CorporateActionPreliminaryAdviceType5 {

    @XmlElement(name = "MvmntPrlimryAdvcId")
    protected String mvmntPrlimryAdvcId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionPreliminaryAdviceType1Code tp;
    @XmlElement(name = "Fctn", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionMovementPreliminaryAdviceFunction1Code fctn;

    /**
     * Gets the value of the mvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvmntPrlimryAdvcId() {
        return mvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionPreliminaryAdviceType5 setMvmntPrlimryAdvcId(String value) {
        this.mvmntPrlimryAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPreliminaryAdviceType1Code }
     *     
     */
    public CorporateActionPreliminaryAdviceType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPreliminaryAdviceType1Code }
     *     
     */
    public CorporateActionPreliminaryAdviceType5 setTp(CorporateActionPreliminaryAdviceType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceFunction1Code }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceFunction1Code getFctn() {
        return fctn;
    }

    /**
     * Sets the value of the fctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceFunction1Code }
     *     
     */
    public CorporateActionPreliminaryAdviceType5 setFctn(CorporateActionMovementPreliminaryAdviceFunction1Code value) {
        this.fctn = value;
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
