
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
 * Provides detailed information on the investigation request status from the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerInvestigationRequestStatus2", propOrder = {
    "sts",
    "stsRsn",
    "dt",
    "addtlInf",
    "trckrInfrmgPty",
    "trckrInfrmdPty",
    "trckdMsgId",
    "invstgtnId",
    "instdAgt",
    "invstgtnRqstr",
    "invstgtnRspndr"
})
public class TrackerInvestigationRequestStatus2 {

    @XmlElement(name = "Sts", required = true)
    protected InvestigationRequestStatus1Choice sts;
    @XmlElement(name = "StsRsn")
    protected List<InvestigationRequestStatusReason1Choice> stsRsn;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;
    @XmlElement(name = "TrckrInfrmgPty")
    protected TrackerPartyIdentification2 trckrInfrmgPty;
    @XmlElement(name = "TrckrInfrmdPty")
    protected TrackerPartyIdentification2 trckrInfrmdPty;
    @XmlElement(name = "TrckdMsgId")
    protected OriginalBusinessInstruction4 trckdMsgId;
    @XmlElement(name = "InvstgtnId")
    protected InvestigationIdentification1 invstgtnId;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
    @XmlElement(name = "InvstgtnRqstr")
    protected Party40Choice invstgtnRqstr;
    @XmlElement(name = "InvstgtnRspndr")
    protected Party40Choice invstgtnRspndr;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequestStatus1Choice }
     *     
     */
    public InvestigationRequestStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequestStatus1Choice }
     *     
     */
    public TrackerInvestigationRequestStatus2 setSts(InvestigationRequestStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationRequestStatusReason1Choice }
     * 
     * 
     */
    public List<InvestigationRequestStatusReason1Choice> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<InvestigationRequestStatusReason1Choice>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerInvestigationRequestStatus2 setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the trckrInfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getTrckrInfrmgPty() {
        return trckrInfrmgPty;
    }

    /**
     * Sets the value of the trckrInfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerInvestigationRequestStatus2 setTrckrInfrmgPty(TrackerPartyIdentification2 value) {
        this.trckrInfrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmdPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getTrckrInfrmdPty() {
        return trckrInfrmdPty;
    }

    /**
     * Sets the value of the trckrInfrmdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerInvestigationRequestStatus2 setTrckrInfrmdPty(TrackerPartyIdentification2 value) {
        this.trckrInfrmdPty = value;
        return this;
    }

    /**
     * Gets the value of the trckdMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction4 }
     *     
     */
    public OriginalBusinessInstruction4 getTrckdMsgId() {
        return trckdMsgId;
    }

    /**
     * Sets the value of the trckdMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction4 }
     *     
     */
    public TrackerInvestigationRequestStatus2 setTrckdMsgId(OriginalBusinessInstruction4 value) {
        this.trckdMsgId = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationIdentification1 }
     *     
     */
    public InvestigationIdentification1 getInvstgtnId() {
        return invstgtnId;
    }

    /**
     * Sets the value of the invstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationIdentification1 }
     *     
     */
    public TrackerInvestigationRequestStatus2 setInvstgtnId(InvestigationIdentification1 value) {
        this.invstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerInvestigationRequestStatus2 setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getInvstgtnRqstr() {
        return invstgtnRqstr;
    }

    /**
     * Sets the value of the invstgtnRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public TrackerInvestigationRequestStatus2 setInvstgtnRqstr(Party40Choice value) {
        this.invstgtnRqstr = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnRspndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getInvstgtnRspndr() {
        return invstgtnRspndr;
    }

    /**
     * Sets the value of the invstgtnRspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public TrackerInvestigationRequestStatus2 setInvstgtnRspndr(Party40Choice value) {
        this.invstgtnRspndr = value;
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

    /**
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public TrackerInvestigationRequestStatus2 addStsRsn(InvestigationRequestStatusReason1Choice stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TrackerInvestigationRequestStatus2 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
