
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
 * Scope
 * The SecuritiesSettlementTransactionModificationRequest is sent by an account owner to an account servicer. 
 * 
 * The account owner will generally be:
 * - a central securities depository participant which has an account with a central securities depository or a market infrastructure
 * - an investment manager which has an account with a custodian acting as accounting and/or settlement agent.
 * 
 * It is used to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.
 * 
 * Usage
 * The modification must only contain the data to be modified.
 * The message may also be used to:
 * - re-send a message sent by the account owner to the account servicer,
 * - provide a third party with a copy of a message being sent by the account owner for information,
 * - re-send to a third party a copy of a message being sent by the account owner for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequest002V09", propOrder = {
    "modfdTxDtls",
    "updTp"
})
public class SecuritiesSettlementTransactionModificationRequest002V09 {

    @XmlElement(name = "ModfdTxDtls", required = true)
    protected TransactionDetails159 modfdTxDtls;
    @XmlElement(name = "UpdTp", required = true)
    protected List<UpdateType38Choice> updTp;

    /**
     * Gets the value of the modfdTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails159 }
     *     
     */
    public TransactionDetails159 getModfdTxDtls() {
        return modfdTxDtls;
    }

    /**
     * Sets the value of the modfdTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails159 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequest002V09 setModfdTxDtls(TransactionDetails159 value) {
        this.modfdTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateType38Choice }
     * 
     * 
     */
    public List<UpdateType38Choice> getUpdTp() {
        if (updTp == null) {
            updTp = new ArrayList<UpdateType38Choice>();
        }
        return this.updTp;
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
     * Adds a new item to the updTp list.
     * @see #getUpdTp()
     * 
     */
    public SecuritiesSettlementTransactionModificationRequest002V09 addUpdTp(UpdateType38Choice updTp) {
        getUpdTp().add(updTp);
        return this;
    }

}
