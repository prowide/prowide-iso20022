
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
 * Sent by an instructing party, a custodian or an affirming party to an executing party (local matching) or to Central Matching Utility (CMU) to affirm (accept) or disaffirm (reject) (central matching) the SecuritiesTradeConfirmation message. If accepting the SecuritiesTradeConfirmation message, then the trade is ready for settlement processing. If rejecting the SecuritiesTradeConfirmation message, then the trade is not ready for settlement.
 * The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.
 * The instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.
 * The custodian or an affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * Initiator: Both in local and central matching, the Initiator may be the Instructing Party, Custodian or Affirming party.
 * Respondent: Executing party does not need to respond if an affirmation. Executing party may respond with modification or cancellation of the rejected SecuritiesTradeConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationResponseV02", propOrder = {
    "id",
    "refs",
    "sts",
    "clrDtls",
    "confPties",
    "splmtryData"
})
public class SecuritiesTradeConfirmationResponseV02 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "Refs", required = true)
    protected List<Linkages52> refs;
    @XmlElement(name = "Sts", required = true)
    protected StatusAndReason46 sts;
    @XmlElement(name = "ClrDtls")
    protected Clearing6 clrDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties8> confPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public TransactiontIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public SecuritiesTradeConfirmationResponseV02 setId(TransactiontIdentification4 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages52 }
     * 
     * 
     */
    public List<Linkages52> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Linkages52>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndReason46 }
     *     
     */
    public StatusAndReason46 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndReason46 }
     *     
     */
    public SecuritiesTradeConfirmationResponseV02 setSts(StatusAndReason46 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the clrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Clearing6 }
     *     
     */
    public Clearing6 getClrDtls() {
        return clrDtls;
    }

    /**
     * Sets the value of the clrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing6 }
     *     
     */
    public SecuritiesTradeConfirmationResponseV02 setClrDtls(Clearing6 value) {
        this.clrDtls = value;
        return this;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties8 }
     * 
     * 
     */
    public List<ConfirmationParties8> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<ConfirmationParties8>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public SecuritiesTradeConfirmationResponseV02 addRefs(Linkages52 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the confPties list.
     * @see #getConfPties()
     * 
     */
    public SecuritiesTradeConfirmationResponseV02 addConfPties(ConfirmationParties8 confPties) {
        getConfPties().add(confPties);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeConfirmationResponseV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
