
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "UpdateType37Choice", propOrder = {
    "addtn",
    "deltn",
    "mod"
})
public class UpdateType37Choice {

    @XmlElement(name = "Addtn")
    protected SecuritiesSettlementTransactionDetails52 addtn;
    @XmlElement(name = "Deltn")
    protected SecuritiesSettlementTransactionDetails50 deltn;
    @XmlElement(name = "Mod")
    protected SecuritiesSettlementTransactionDetails51 mod;

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails52 }
     *     
     */
    public SecuritiesSettlementTransactionDetails52 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails52 }
     *     
     */
    public UpdateType37Choice setAddtn(SecuritiesSettlementTransactionDetails52 value) {
        this.addtn = value;
        return this;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails50 }
     *     
     */
    public SecuritiesSettlementTransactionDetails50 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails50 }
     *     
     */
    public UpdateType37Choice setDeltn(SecuritiesSettlementTransactionDetails50 value) {
        this.deltn = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails51 }
     *     
     */
    public SecuritiesSettlementTransactionDetails51 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails51 }
     *     
     */
    public UpdateType37Choice setMod(SecuritiesSettlementTransactionDetails51 value) {
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
