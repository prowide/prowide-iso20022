
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
 * Choice of transaction type, corporate action event or settlement transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementOrCorporateActionEvent6Choice", propOrder = {
    "sctiesTxTp",
    "corpActnEvtTp"
})
public class SettlementOrCorporateActionEvent6Choice {

    @XmlElement(name = "SctiesTxTp")
    protected SecuritiesTransactionType11Choice sctiesTxTp;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType1Choice corpActnEvtTp;

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType11Choice }
     *     
     */
    public SecuritiesTransactionType11Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType11Choice }
     *     
     */
    public SettlementOrCorporateActionEvent6Choice setSctiesTxTp(SecuritiesTransactionType11Choice value) {
        this.sctiesTxTp = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType1Choice }
     *     
     */
    public CorporateActionEventType1Choice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType1Choice }
     *     
     */
    public SettlementOrCorporateActionEvent6Choice setCorpActnEvtTp(CorporateActionEventType1Choice value) {
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
