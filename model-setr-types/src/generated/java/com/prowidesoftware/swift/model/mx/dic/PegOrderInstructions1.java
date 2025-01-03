
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about instructions specific to pegged orders.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PegOrderInstructions1", propOrder = {
    "offset",
    "rltdPricTp",
    "mvTp",
    "offsetTp",
    "lmtTp",
    "rndDrctn",
    "scp",
    "offsetSgn",
    "pegSctyDtls"
})
public class PegOrderInstructions1 {

    @XmlElement(name = "Offset")
    protected ActiveCurrencyAndAmount offset;
    @XmlElement(name = "RltdPricTp")
    @XmlSchemaType(name = "string")
    protected PegType1Code rltdPricTp;
    @XmlElement(name = "MvTp")
    @XmlSchemaType(name = "string")
    protected MoveType1Code mvTp;
    @XmlElement(name = "OffsetTp")
    @XmlSchemaType(name = "string")
    protected OffsetType1Code offsetTp;
    @XmlElement(name = "LmtTp")
    protected String lmtTp;
    @XmlElement(name = "RndDrctn")
    protected String rndDrctn;
    @XmlElement(name = "Scp")
    @XmlSchemaType(name = "string")
    protected PriceProtectionScope2Code scp;
    @XmlElement(name = "OffsetSgn")
    protected Boolean offsetSgn;
    @XmlElement(name = "PegSctyDtls")
    protected SecurityIdentification7 pegSctyDtls;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public PegOrderInstructions1 setOffset(ActiveCurrencyAndAmount value) {
        this.offset = value;
        return this;
    }

    /**
     * Gets the value of the rltdPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link PegType1Code }
     *     
     */
    public PegType1Code getRltdPricTp() {
        return rltdPricTp;
    }

    /**
     * Sets the value of the rltdPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PegType1Code }
     *     
     */
    public PegOrderInstructions1 setRltdPricTp(PegType1Code value) {
        this.rltdPricTp = value;
        return this;
    }

    /**
     * Gets the value of the mvTp property.
     * 
     * @return
     *     possible object is
     *     {@link MoveType1Code }
     *     
     */
    public MoveType1Code getMvTp() {
        return mvTp;
    }

    /**
     * Sets the value of the mvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveType1Code }
     *     
     */
    public PegOrderInstructions1 setMvTp(MoveType1Code value) {
        this.mvTp = value;
        return this;
    }

    /**
     * Gets the value of the offsetTp property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetType1Code }
     *     
     */
    public OffsetType1Code getOffsetTp() {
        return offsetTp;
    }

    /**
     * Sets the value of the offsetTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetType1Code }
     *     
     */
    public PegOrderInstructions1 setOffsetTp(OffsetType1Code value) {
        this.offsetTp = value;
        return this;
    }

    /**
     * Gets the value of the lmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtTp() {
        return lmtTp;
    }

    /**
     * Sets the value of the lmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PegOrderInstructions1 setLmtTp(String value) {
        this.lmtTp = value;
        return this;
    }

    /**
     * Gets the value of the rndDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRndDrctn() {
        return rndDrctn;
    }

    /**
     * Sets the value of the rndDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PegOrderInstructions1 setRndDrctn(String value) {
        this.rndDrctn = value;
        return this;
    }

    /**
     * Gets the value of the scp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceProtectionScope2Code }
     *     
     */
    public PriceProtectionScope2Code getScp() {
        return scp;
    }

    /**
     * Sets the value of the scp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceProtectionScope2Code }
     *     
     */
    public PegOrderInstructions1 setScp(PriceProtectionScope2Code value) {
        this.scp = value;
        return this;
    }

    /**
     * Gets the value of the offsetSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffsetSgn() {
        return offsetSgn;
    }

    /**
     * Sets the value of the offsetSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PegOrderInstructions1 setOffsetSgn(Boolean value) {
        this.offsetSgn = value;
        return this;
    }

    /**
     * Gets the value of the pegSctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getPegSctyDtls() {
        return pegSctyDtls;
    }

    /**
     * Sets the value of the pegSctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public PegOrderInstructions1 setPegSctyDtls(SecurityIdentification7 value) {
        this.pegSctyDtls = value;
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
