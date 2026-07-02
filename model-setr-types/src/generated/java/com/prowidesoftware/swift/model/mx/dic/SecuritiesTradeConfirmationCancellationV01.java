
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
 * Sent by an executing party to an instructing party directly or through Central Matching Utility (CMU) to cancel the referenced SecuritiesTradeConfirmation message that was previously sent.
 * The instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.
 * The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.
 * It may also be used to cancel the trade confirmation previously sent from an executing party or an instructing party to a custodian or an affirming party directly or through CMU.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * Initiator: Both in local and central matching, the Initiator may be either the Executing Party or Instructing Party.
 * Respondent: Instructing party, a custodian or an affirming party optionally responds with SecuritiesTradeConfirmationResponse (accept or reject) message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationCancellationV01", propOrder = {
    "id",
    "refs",
    "othrBizPties",
    "splmtryData"
})
public class SecuritiesTradeConfirmationCancellationV01 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "Refs")
    protected List<Linkages15> refs;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties18 othrBizPties;
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
    public SecuritiesTradeConfirmationCancellationV01 setId(TransactiontIdentification4 value) {
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
     * {@link Linkages15 }
     * 
     * 
     */
    public List<Linkages15> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Linkages15>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties18 }
     *     
     */
    public OtherParties18 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties18 }
     *     
     */
    public SecuritiesTradeConfirmationCancellationV01 setOthrBizPties(OtherParties18 value) {
        this.othrBizPties = value;
        return this;
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
    public SecuritiesTradeConfirmationCancellationV01 addRefs(Linkages15 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeConfirmationCancellationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
