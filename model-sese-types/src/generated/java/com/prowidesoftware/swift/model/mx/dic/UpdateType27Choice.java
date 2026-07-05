
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
@XmlType(name = "UpdateType27Choice", propOrder = {
    "addtn",
    "deltn",
    "mod"
})
public class UpdateType27Choice {

    @XmlElement(name = "Addtn")
    protected SecuritiesSettlementTransactionDetails32 addtn;
    @XmlElement(name = "Deltn")
    protected SecuritiesSettlementTransactionDetails33 deltn;
    @XmlElement(name = "Mod")
    protected SecuritiesSettlementTransactionDetails34 mod;

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails32 }
     *     
     */
    public SecuritiesSettlementTransactionDetails32 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails32 }
     *     
     */
    public UpdateType27Choice setAddtn(SecuritiesSettlementTransactionDetails32 value) {
        this.addtn = value;
        return this;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails33 }
     *     
     */
    public SecuritiesSettlementTransactionDetails33 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails33 }
     *     
     */
    public UpdateType27Choice setDeltn(SecuritiesSettlementTransactionDetails33 value) {
        this.deltn = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails34 }
     *     
     */
    public SecuritiesSettlementTransactionDetails34 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails34 }
     *     
     */
    public UpdateType27Choice setMod(SecuritiesSettlementTransactionDetails34 value) {
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
