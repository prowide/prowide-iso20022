
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
 * Specifies the type of update requested. That is addition, deletion or modification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType14Choice", propOrder = {
    "addtn",
    "deltn",
    "mod"
})
public class UpdateType14Choice {

    @XmlElement(name = "Addtn")
    protected SecuritiesSettlementTransactionDetails21 addtn;
    @XmlElement(name = "Deltn")
    protected SecuritiesSettlementTransactionDetails20 deltn;
    @XmlElement(name = "Mod")
    protected SecuritiesSettlementTransactionDetails22 mod;

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails21 }
     *     
     */
    public SecuritiesSettlementTransactionDetails21 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails21 }
     *     
     */
    public UpdateType14Choice setAddtn(SecuritiesSettlementTransactionDetails21 value) {
        this.addtn = value;
        return this;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails20 }
     *     
     */
    public SecuritiesSettlementTransactionDetails20 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails20 }
     *     
     */
    public UpdateType14Choice setDeltn(SecuritiesSettlementTransactionDetails20 value) {
        this.deltn = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails22 }
     *     
     */
    public SecuritiesSettlementTransactionDetails22 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails22 }
     *     
     */
    public UpdateType14Choice setMod(SecuritiesSettlementTransactionDetails22 value) {
        this.mod = value;
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
