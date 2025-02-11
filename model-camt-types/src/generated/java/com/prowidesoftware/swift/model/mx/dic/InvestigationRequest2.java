
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
 * Specifies the details of an investigation request, including identification and type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationRequest2", propOrder = {
    "msgId",
    "rqstrInvstgtnId",
    "rspndrInvstgtnId",
    "eir",
    "reqActn",
    "invstgtnTp",
    "invstgtnSubTp",
    "undrlygInstrm",
    "undrlyg",
    "rqstr",
    "rspndr",
    "reqOrgtr",
    "xpctdRspndr",
    "svcLvl"
})
public class InvestigationRequest2 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "RqstrInvstgtnId")
    protected String rqstrInvstgtnId;
    @XmlElement(name = "RspndrInvstgtnId")
    protected String rspndrInvstgtnId;
    @XmlElement(name = "EIR")
    protected String eir;
    @XmlElement(name = "ReqActn")
    protected InvestigationRequestAction1 reqActn;
    @XmlElement(name = "InvstgtnTp", required = true)
    protected InvestigationType1Choice invstgtnTp;
    @XmlElement(name = "InvstgtnSubTp")
    protected InvestigationSubType1Choice invstgtnSubTp;
    @XmlElement(name = "UndrlygInstrm")
    protected UnderlyingInvestigationInstrument1Choice undrlygInstrm;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingData2Choice undrlyg;
    @XmlElement(name = "Rqstr", required = true)
    protected Party40Choice rqstr;
    @XmlElement(name = "Rspndr", required = true)
    protected Party40Choice rspndr;
    @XmlElement(name = "ReqOrgtr")
    protected Party40Choice reqOrgtr;
    @XmlElement(name = "XpctdRspndr")
    protected Party40Choice xpctdRspndr;
    @XmlElement(name = "SvcLvl")
    protected List<InvestigationServiceLevel1Choice> svcLvl;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationRequest2 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rqstrInvstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrInvstgtnId() {
        return rqstrInvstgtnId;
    }

    /**
     * Sets the value of the rqstrInvstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationRequest2 setRqstrInvstgtnId(String value) {
        this.rqstrInvstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the rspndrInvstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndrInvstgtnId() {
        return rspndrInvstgtnId;
    }

    /**
     * Sets the value of the rspndrInvstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationRequest2 setRspndrInvstgtnId(String value) {
        this.rspndrInvstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the eir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIR() {
        return eir;
    }

    /**
     * Sets the value of the eir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationRequest2 setEIR(String value) {
        this.eir = value;
        return this;
    }

    /**
     * Gets the value of the reqActn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequestAction1 }
     *     
     */
    public InvestigationRequestAction1 getReqActn() {
        return reqActn;
    }

    /**
     * Sets the value of the reqActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequestAction1 }
     *     
     */
    public InvestigationRequest2 setReqActn(InvestigationRequestAction1 value) {
        this.reqActn = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationType1Choice }
     *     
     */
    public InvestigationType1Choice getInvstgtnTp() {
        return invstgtnTp;
    }

    /**
     * Sets the value of the invstgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationType1Choice }
     *     
     */
    public InvestigationRequest2 setInvstgtnTp(InvestigationType1Choice value) {
        this.invstgtnTp = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationSubType1Choice }
     *     
     */
    public InvestigationSubType1Choice getInvstgtnSubTp() {
        return invstgtnSubTp;
    }

    /**
     * Sets the value of the invstgtnSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationSubType1Choice }
     *     
     */
    public InvestigationRequest2 setInvstgtnSubTp(InvestigationSubType1Choice value) {
        this.invstgtnSubTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInvestigationInstrument1Choice }
     *     
     */
    public UnderlyingInvestigationInstrument1Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInvestigationInstrument1Choice }
     *     
     */
    public InvestigationRequest2 setUndrlygInstrm(UnderlyingInvestigationInstrument1Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingData2Choice }
     *     
     */
    public UnderlyingData2Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingData2Choice }
     *     
     */
    public InvestigationRequest2 setUndrlyg(UnderlyingData2Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the rqstr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRqstr() {
        return rqstr;
    }

    /**
     * Sets the value of the rqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public InvestigationRequest2 setRqstr(Party40Choice value) {
        this.rqstr = value;
        return this;
    }

    /**
     * Gets the value of the rspndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRspndr() {
        return rspndr;
    }

    /**
     * Sets the value of the rspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public InvestigationRequest2 setRspndr(Party40Choice value) {
        this.rspndr = value;
        return this;
    }

    /**
     * Gets the value of the reqOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getReqOrgtr() {
        return reqOrgtr;
    }

    /**
     * Sets the value of the reqOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public InvestigationRequest2 setReqOrgtr(Party40Choice value) {
        this.reqOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the xpctdRspndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getXpctdRspndr() {
        return xpctdRspndr;
    }

    /**
     * Sets the value of the xpctdRspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public InvestigationRequest2 setXpctdRspndr(Party40Choice value) {
        this.xpctdRspndr = value;
        return this;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcLvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcLvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationServiceLevel1Choice }
     * 
     * 
     * @return
     *     The value of the svcLvl property.
     */
    public List<InvestigationServiceLevel1Choice> getSvcLvl() {
        if (svcLvl == null) {
            svcLvl = new ArrayList<>();
        }
        return this.svcLvl;
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
     * Adds a new item to the svcLvl list.
     * @see #getSvcLvl()
     * 
     */
    public InvestigationRequest2 addSvcLvl(InvestigationServiceLevel1Choice svcLvl) {
        getSvcLvl().add(svcLvl);
        return this;
    }

}
