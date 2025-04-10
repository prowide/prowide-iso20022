
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details on the margin calculation per financial instrument or per currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCalculation2", propOrder = {
    "finInstrmId",
    "xpsrAmt",
    "ttlMrgnAmt",
    "collOnDpst",
    "minRqrmntDpst",
    "mrgnRslt",
    "mrgnTpAmt"
})
public class MarginCalculation2 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "XpsrAmt")
    protected Amount2 xpsrAmt;
    @XmlElement(name = "TtlMrgnAmt", required = true)
    protected AmountAndDirection20 ttlMrgnAmt;
    @XmlElement(name = "CollOnDpst")
    protected List<Collateral6> collOnDpst;
    @XmlElement(name = "MinRqrmntDpst")
    protected ActiveCurrencyAndAmount minRqrmntDpst;
    @XmlElement(name = "MrgnRslt")
    protected MarginResult1Choice mrgnRslt;
    @XmlElement(name = "MrgnTpAmt")
    protected Margin3 mrgnTpAmt;

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
    public MarginCalculation2 setFinInstrmId(SecurityIdentification14 value) {
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
    public MarginCalculation2 setXpsrAmt(Amount2 value) {
        this.xpsrAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getTtlMrgnAmt() {
        return ttlMrgnAmt;
    }

    /**
     * Sets the value of the ttlMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public MarginCalculation2 setTtlMrgnAmt(AmountAndDirection20 value) {
        this.ttlMrgnAmt = value;
        return this;
    }

    /**
     * Gets the value of the collOnDpst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collOnDpst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollOnDpst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral6 }
     * 
     * 
     * @return
     *     The value of the collOnDpst property.
     */
    public List<Collateral6> getCollOnDpst() {
        if (collOnDpst == null) {
            collOnDpst = new ArrayList<>();
        }
        return this.collOnDpst;
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
    public MarginCalculation2 setMinRqrmntDpst(ActiveCurrencyAndAmount value) {
        this.minRqrmntDpst = value;
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
    public MarginCalculation2 setMrgnRslt(MarginResult1Choice value) {
        this.mrgnRslt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnTpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Margin3 }
     *     
     */
    public Margin3 getMrgnTpAmt() {
        return mrgnTpAmt;
    }

    /**
     * Sets the value of the mrgnTpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Margin3 }
     *     
     */
    public MarginCalculation2 setMrgnTpAmt(Margin3 value) {
        this.mrgnTpAmt = value;
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

    /**
     * Adds a new item to the collOnDpst list.
     * @see #getCollOnDpst()
     * 
     */
    public MarginCalculation2 addCollOnDpst(Collateral6 collOnDpst) {
        getCollOnDpst().add(collOnDpst);
        return this;
    }

}
