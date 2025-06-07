
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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument29", propOrder = {
    "id",
    "nm",
    "splmtryId",
    "clssTp",
    "sctiesForm",
    "dstrbtnPlcy",
    "pdctGrp",
    "blckdHldgDtls"
})
public class FinancialInstrument29 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "PdctGrp")
    protected String pdctGrp;
    @XmlElement(name = "BlckdHldgDtls")
    protected BlockedHoldingDetails1 blckdHldgDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public SecurityIdentification3Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public FinancialInstrument29 setId(SecurityIdentification3Choice value) {
        this.id = value;
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
    public FinancialInstrument29 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument29 setSplmtryId(String value) {
        this.splmtryId = value;
        return this;
    }

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument29 setClssTp(String value) {
        this.clssTp = value;
        return this;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FinancialInstrument29 setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public FinancialInstrument29 setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
        return this;
    }

    /**
     * Gets the value of the pdctGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctGrp() {
        return pdctGrp;
    }

    /**
     * Sets the value of the pdctGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument29 setPdctGrp(String value) {
        this.pdctGrp = value;
        return this;
    }

    /**
     * Gets the value of the blckdHldgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedHoldingDetails1 }
     *     
     */
    public BlockedHoldingDetails1 getBlckdHldgDtls() {
        return blckdHldgDtls;
    }

    /**
     * Sets the value of the blckdHldgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedHoldingDetails1 }
     *     
     */
    public FinancialInstrument29 setBlckdHldgDtls(BlockedHoldingDetails1 value) {
        this.blckdHldgDtls = value;
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
