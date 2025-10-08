
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
 * Defines the criteria used to search for a report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQuerySearchCriteria3", propOrder = {
    "acctId",
    "bal",
    "rptNm",
    "msgNmId",
    "ptyId",
    "rspnsblPtyId",
    "dtSch",
    "schdldTm",
    "evt"
})
public class ReportQuerySearchCriteria3 {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationSearchCriteria2Choice> acctId;
    @XmlElement(name = "Bal")
    protected List<CashBalance14> bal;
    @XmlElement(name = "RptNm")
    protected String rptNm;
    @XmlElement(name = "MsgNmId")
    protected String msgNmId;
    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification136 ptyId;
    @XmlElement(name = "RspnsblPtyId")
    protected PartyIdentification136 rspnsblPtyId;
    @XmlElement(name = "DtSch")
    protected DatePeriodSearch1Choice dtSch;
    @XmlElement(name = "SchdldTm")
    protected DateTimePeriod1Choice schdldTm;
    @XmlElement(name = "Evt")
    protected EventType1Choice evt;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     */
    public List<AccountIdentificationSearchCriteria2Choice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountIdentificationSearchCriteria2Choice>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance14 }
     * 
     * 
     */
    public List<CashBalance14> getBal() {
        if (bal == null) {
            bal = new ArrayList<CashBalance14>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the rptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNm() {
        return rptNm;
    }

    /**
     * Sets the value of the rptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportQuerySearchCriteria3 setRptNm(String value) {
        this.rptNm = value;
        return this;
    }

    /**
     * Gets the value of the msgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNmId() {
        return msgNmId;
    }

    /**
     * Sets the value of the msgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportQuerySearchCriteria3 setMsgNmId(String value) {
        this.msgNmId = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public ReportQuerySearchCriteria3 setPtyId(PartyIdentification136 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public ReportQuerySearchCriteria3 setRspnsblPtyId(PartyIdentification136 value) {
        this.rspnsblPtyId = value;
        return this;
    }

    /**
     * Gets the value of the dtSch property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtSch() {
        return dtSch;
    }

    /**
     * Sets the value of the dtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public ReportQuerySearchCriteria3 setDtSch(DatePeriodSearch1Choice value) {
        this.dtSch = value;
        return this;
    }

    /**
     * Gets the value of the schdldTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getSchdldTm() {
        return schdldTm;
    }

    /**
     * Sets the value of the schdldTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public ReportQuerySearchCriteria3 setSchdldTm(DateTimePeriod1Choice value) {
        this.schdldTm = value;
        return this;
    }

    /**
     * Gets the value of the evt property.
     * 
     * @return
     *     possible object is
     *     {@link EventType1Choice }
     *     
     */
    public EventType1Choice getEvt() {
        return evt;
    }

    /**
     * Sets the value of the evt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType1Choice }
     *     
     */
    public ReportQuerySearchCriteria3 setEvt(EventType1Choice value) {
        this.evt = value;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public ReportQuerySearchCriteria3 addAcctId(AccountIdentificationSearchCriteria2Choice acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the bal list.
     * @see #getBal()
     * 
     */
    public ReportQuerySearchCriteria3 addBal(CashBalance14 bal) {
        getBal().add(bal);
        return this;
    }

}
