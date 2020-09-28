
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
@XmlType(name = "UpdateType22Choice", propOrder = {
    "addtn",
    "deltn",
    "mod"
})
public class UpdateType22Choice {

    @XmlElement(name = "Addtn")
    protected SecuritiesSettlementTransactionDetails23 addtn;
    @XmlElement(name = "Deltn")
    protected SecuritiesSettlementTransactionDetails24 deltn;
    @XmlElement(name = "Mod")
    protected SecuritiesSettlementTransactionDetails25 mod;

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails23 }
     *     
     */
    public SecuritiesSettlementTransactionDetails23 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails23 }
     *     
     */
    public UpdateType22Choice setAddtn(SecuritiesSettlementTransactionDetails23 value) {
        this.addtn = value;
        return this;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails24 }
     *     
     */
    public SecuritiesSettlementTransactionDetails24 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails24 }
     *     
     */
    public UpdateType22Choice setDeltn(SecuritiesSettlementTransactionDetails24 value) {
        this.deltn = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails25 }
     *     
     */
    public SecuritiesSettlementTransactionDetails25 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails25 }
     *     
     */
    public UpdateType22Choice setMod(SecuritiesSettlementTransactionDetails25 value) {
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
