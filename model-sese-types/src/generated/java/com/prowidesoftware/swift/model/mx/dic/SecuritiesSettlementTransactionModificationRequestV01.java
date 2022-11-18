
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An account owner sends a SecuritiesSettlementTransactionModificationRequest to an account servicer to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.
 * The account owner will generally be:
 * - a central securities depository participant which has an account with a central securities depository or a market infrastructure
 * - an investment manager which has an account with a custodian acting as accounting and/or settlement agent.
 * Usage
 * The modification must only contain the data to be modified.
 * The message may also be used to:
 * - re-send a message sent by the account owner to the account servicer,
 * - provide a third party with a copy of a message being sent by the account owner for information,
 * - re-send to a third party a copy of a message being sent by the account owner for information.
 * using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestV01", propOrder = {
    "modfdTxDtls",
    "updTp"
})
public class SecuritiesSettlementTransactionModificationRequestV01 {

    @XmlElement(name = "ModfdTxDtls", required = true)
    protected TransactionDetails41 modfdTxDtls;
    @XmlElement(name = "UpdTp", required = true)
    protected List<UpdateType5Choice> updTp;

    /**
     * Gets the value of the modfdTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails41 }
     *     
     */
    public TransactionDetails41 getModfdTxDtls() {
        return modfdTxDtls;
    }

    /**
     * Sets the value of the modfdTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails41 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestV01 setModfdTxDtls(TransactionDetails41 value) {
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
     * {@link UpdateType5Choice }
     * 
     * 
     */
    public List<UpdateType5Choice> getUpdTp() {
        if (updTp == null) {
            updTp = new ArrayList<UpdateType5Choice>();
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
    public SecuritiesSettlementTransactionModificationRequestV01 addUpdTp(UpdateType5Choice updTp) {
        getUpdTp().add(updTp);
        return this;
    }

}
