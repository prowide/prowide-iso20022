
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
 * Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscretionInstructions1", propOrder = {
    "offset",
    "offsetSgn",
    "rltdPricTp",
    "mvTp",
    "lmtTp",
    "rndDrctn",
    "scp",
    "offsetTp"
})
public class DiscretionInstructions1 {

    @XmlElement(name = "Offset", required = true)
    protected ActiveCurrencyAndAmount offset;
    @XmlElement(name = "OffsetSgn")
    protected boolean offsetSgn;
    @XmlElement(name = "RltdPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfDiscretionPrice1Code rltdPricTp;
    @XmlElement(name = "MvTp", required = true)
    @XmlSchemaType(name = "string")
    protected MoveType1Code mvTp;
    @XmlElement(name = "LmtTp", required = true)
    protected String lmtTp;
    @XmlElement(name = "RndDrctn", required = true)
    protected String rndDrctn;
    @XmlElement(name = "Scp", required = true)
    @XmlSchemaType(name = "string")
    protected PriceProtectionScope2Code scp;
    @XmlElement(name = "OffsetTp", required = true)
    @XmlSchemaType(name = "string")
    protected OffsetType1Code offsetTp;

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
    public DiscretionInstructions1 setOffset(ActiveCurrencyAndAmount value) {
        this.offset = value;
        return this;
    }

    /**
     * Gets the value of the offsetSgn property.
     * 
     */
    public boolean isOffsetSgn() {
        return offsetSgn;
    }

    /**
     * Sets the value of the offsetSgn property.
     * 
     */
    public DiscretionInstructions1 setOffsetSgn(boolean value) {
        this.offsetSgn = value;
        return this;
    }

    /**
     * Gets the value of the rltdPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDiscretionPrice1Code }
     *     
     */
    public TypeOfDiscretionPrice1Code getRltdPricTp() {
        return rltdPricTp;
    }

    /**
     * Sets the value of the rltdPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDiscretionPrice1Code }
     *     
     */
    public DiscretionInstructions1 setRltdPricTp(TypeOfDiscretionPrice1Code value) {
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
    public DiscretionInstructions1 setMvTp(MoveType1Code value) {
        this.mvTp = value;
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
    public DiscretionInstructions1 setLmtTp(String value) {
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
    public DiscretionInstructions1 setRndDrctn(String value) {
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
    public DiscretionInstructions1 setScp(PriceProtectionScope2Code value) {
        this.scp = value;
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
    public DiscretionInstructions1 setOffsetTp(OffsetType1Code value) {
        this.offsetTp = value;
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
