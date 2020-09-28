
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
 * Provides details on the calculation of the margin.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Margin2", propOrder = {
    "finInstrmId",
    "xpsrAmt",
    "ttlMrgnAmt",
    "vartnMrgn",
    "initlMrgn",
    "incrCvrg",
    "minRqrmntDpst",
    "collOnDpst",
    "mrgnRslt"
})
public class Margin2 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "XpsrAmt")
    protected Amount2 xpsrAmt;
    @XmlElement(name = "TtlMrgnAmt", required = true)
    protected ActiveCurrencyAndAmount ttlMrgnAmt;
    @XmlElement(name = "VartnMrgn", required = true)
    protected VariationMargin2 vartnMrgn;
    @XmlElement(name = "InitlMrgn", required = true)
    protected Amount2 initlMrgn;
    @XmlElement(name = "IncrCvrg")
    protected ActiveCurrencyAndAmount incrCvrg;
    @XmlElement(name = "MinRqrmntDpst")
    protected ActiveCurrencyAndAmount minRqrmntDpst;
    @XmlElement(name = "CollOnDpst")
    protected Collateral3 collOnDpst;
    @XmlElement(name = "MrgnRslt")
    protected MarginResult1Choice mrgnRslt;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public Margin2 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the xpsrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getXpsrAmt() {
        return xpsrAmt;
    }

    /**
     * Sets the value of the xpsrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public Margin2 setXpsrAmt(Amount2 value) {
        this.xpsrAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlMrgnAmt() {
        return ttlMrgnAmt;
    }

    /**
     * Sets the value of the ttlMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Margin2 setTtlMrgnAmt(ActiveCurrencyAndAmount value) {
        this.ttlMrgnAmt = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link VariationMargin2 }
     *     
     */
    public VariationMargin2 getVartnMrgn() {
        return vartnMrgn;
    }

    /**
     * Sets the value of the vartnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationMargin2 }
     *     
     */
    public Margin2 setVartnMrgn(VariationMargin2 value) {
        this.vartnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getInitlMrgn() {
        return initlMrgn;
    }

    /**
     * Sets the value of the initlMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public Margin2 setInitlMrgn(Amount2 value) {
        this.initlMrgn = value;
        return this;
    }

    /**
     * Gets the value of the incrCvrg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrCvrg() {
        return incrCvrg;
    }

    /**
     * Sets the value of the incrCvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Margin2 setIncrCvrg(ActiveCurrencyAndAmount value) {
        this.incrCvrg = value;
        return this;
    }

    /**
     * Gets the value of the minRqrmntDpst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinRqrmntDpst() {
        return minRqrmntDpst;
    }

    /**
     * Sets the value of the minRqrmntDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Margin2 setMinRqrmntDpst(ActiveCurrencyAndAmount value) {
        this.minRqrmntDpst = value;
        return this;
    }

    /**
     * Gets the value of the collOnDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral3 }
     *     
     */
    public Collateral3 getCollOnDpst() {
        return collOnDpst;
    }

    /**
     * Sets the value of the collOnDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral3 }
     *     
     */
    public Margin2 setCollOnDpst(Collateral3 value) {
        this.collOnDpst = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginResult1Choice }
     *     
     */
    public MarginResult1Choice getMrgnRslt() {
        return mrgnRslt;
    }

    /**
     * Sets the value of the mrgnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginResult1Choice }
     *     
     */
    public Margin2 setMrgnRslt(MarginResult1Choice value) {
        this.mrgnRslt = value;
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
