
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
 * Provides information about the standing instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionStandingInstruction1", propOrder = {
    "netOrGrss",
    "cshDstrbtnDtls",
    "sctiesDstrbtnDtls",
    "addtlInf"
})
public class CorporateActionStandingInstruction1 {

    @XmlElement(name = "NetOrGrss")
    @XmlSchemaType(name = "string")
    protected StandingInstructionGrossNet1Code netOrGrss;
    @XmlElement(name = "CshDstrbtnDtls")
    protected CashAccount17 cshDstrbtnDtls;
    @XmlElement(name = "SctiesDstrbtnDtls")
    protected SecuritiesAccount6 sctiesDstrbtnDtls;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the netOrGrss property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionGrossNet1Code }
     *     
     */
    public StandingInstructionGrossNet1Code getNetOrGrss() {
        return netOrGrss;
    }

    /**
     * Sets the value of the netOrGrss property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionGrossNet1Code }
     *     
     */
    public CorporateActionStandingInstruction1 setNetOrGrss(StandingInstructionGrossNet1Code value) {
        this.netOrGrss = value;
        return this;
    }

    /**
     * Gets the value of the cshDstrbtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount17 }
     *     
     */
    public CashAccount17 getCshDstrbtnDtls() {
        return cshDstrbtnDtls;
    }

    /**
     * Sets the value of the cshDstrbtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount17 }
     *     
     */
    public CorporateActionStandingInstruction1 setCshDstrbtnDtls(CashAccount17 value) {
        this.cshDstrbtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesDstrbtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount6 }
     *     
     */
    public SecuritiesAccount6 getSctiesDstrbtnDtls() {
        return sctiesDstrbtnDtls;
    }

    /**
     * Sets the value of the sctiesDstrbtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount6 }
     *     
     */
    public CorporateActionStandingInstruction1 setSctiesDstrbtnDtls(SecuritiesAccount6 value) {
        this.sctiesDstrbtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionStandingInstruction1 setAddtlInf(String value) {
        this.addtlInf = value;
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
