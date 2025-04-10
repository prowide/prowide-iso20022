
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
 * Sent by an executing party or an instructing party to the custodian or an affirming party to notify that all the necessary SecuritiesTradeConfirmation message or any other notification of the process have been sent.
 * It may also be sent through Central Matching Utility (CMU).
 * The instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager.
 * The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.
 * The custodian or an affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * Initiator: Executing Party, CMU or Instructing Party
 * Respondent: Custodian or an affirming party does not need to respond.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesEndOfProcessReportV02", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "confPties",
    "invstr",
    "splmtryData"
})
public class SecuritiesEndOfProcessReportV02 {

    @XmlElement(name = "Pgntn")
    protected List<Pagination1> pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected Report6 rptGnlDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties7> confPties;
    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount220> invstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pgntn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPgntn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pagination1 }
     * 
     * 
     */
    public List<Pagination1> getPgntn() {
        if (pgntn == null) {
            pgntn = new ArrayList<Pagination1>();
        }
        return this.pgntn;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Report6 }
     *     
     */
    public Report6 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report6 }
     *     
     */
    public SecuritiesEndOfProcessReportV02 setRptGnlDtls(Report6 value) {
        this.rptGnlDtls = value;
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
     * {@link ConfirmationParties7 }
     * 
     * 
     */
    public List<ConfirmationParties7> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<ConfirmationParties7>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount220 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount220> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<PartyIdentificationAndAccount220>();
        }
        return this.invstr;
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
     * Adds a new item to the pgntn list.
     * @see #getPgntn()
     * 
     */
    public SecuritiesEndOfProcessReportV02 addPgntn(Pagination1 pgntn) {
        getPgntn().add(pgntn);
        return this;
    }

    /**
     * Adds a new item to the confPties list.
     * @see #getConfPties()
     * 
     */
    public SecuritiesEndOfProcessReportV02 addConfPties(ConfirmationParties7 confPties) {
        getConfPties().add(confPties);
        return this;
    }

    /**
     * Adds a new item to the invstr list.
     * @see #getInvstr()
     * 
     */
    public SecuritiesEndOfProcessReportV02 addInvstr(PartyIdentificationAndAccount220 invstr) {
        getInvstr().add(invstr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesEndOfProcessReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
