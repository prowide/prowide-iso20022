
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
 * Choice of transaction type, corporate action event or settlement transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementOrCorporateActionEvent3Choice", propOrder = {
    "sctiesTxTp",
    "corpActnEvtTp"
})
public class SettlementOrCorporateActionEvent3Choice {

    @XmlElement(name = "SctiesTxTp")
    protected SecuritiesTransactionType5Choice sctiesTxTp;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType2Choice corpActnEvtTp;

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType5Choice }
     *     
     */
    public SecuritiesTransactionType5Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType5Choice }
     *     
     */
    public SettlementOrCorporateActionEvent3Choice setSctiesTxTp(SecuritiesTransactionType5Choice value) {
        this.sctiesTxTp = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType2Choice }
     *     
     */
    public CorporateActionEventType2Choice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType2Choice }
     *     
     */
    public SettlementOrCorporateActionEvent3Choice setCorpActnEvtTp(CorporateActionEventType2Choice value) {
        this.corpActnEvtTp = value;
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
