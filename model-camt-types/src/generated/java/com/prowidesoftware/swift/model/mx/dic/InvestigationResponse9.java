
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
 * Provides details of the investigation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResponse9", propOrder = {
    "msgId",
    "rspndrInvstgtnId",
    "invstgtnSts",
    "nxtRspndr",
    "invstgtnData"
})
public class InvestigationResponse9 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "RspndrInvstgtnId")
    protected String rspndrInvstgtnId;
    @XmlElement(name = "InvstgtnSts", required = true)
    protected InvestigationStatus2 invstgtnSts;
    @XmlElement(name = "NxtRspndr")
    protected Party40Choice nxtRspndr;
    @XmlElement(name = "InvstgtnData")
    protected List<InvestigationData6> invstgtnData;

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
    public InvestigationResponse9 setMsgId(String value) {
        this.msgId = value;
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
    public InvestigationResponse9 setRspndrInvstgtnId(String value) {
        this.rspndrInvstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus2 }
     *     
     */
    public InvestigationStatus2 getInvstgtnSts() {
        return invstgtnSts;
    }

    /**
     * Sets the value of the invstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus2 }
     *     
     */
    public InvestigationResponse9 setInvstgtnSts(InvestigationStatus2 value) {
        this.invstgtnSts = value;
        return this;
    }

    /**
     * Gets the value of the nxtRspndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getNxtRspndr() {
        return nxtRspndr;
    }

    /**
     * Sets the value of the nxtRspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public InvestigationResponse9 setNxtRspndr(Party40Choice value) {
        this.nxtRspndr = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstgtnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstgtnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationData6 }
     * 
     * 
     */
    public List<InvestigationData6> getInvstgtnData() {
        if (invstgtnData == null) {
            invstgtnData = new ArrayList<InvestigationData6>();
        }
        return this.invstgtnData;
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
     * Adds a new item to the invstgtnData list.
     * @see #getInvstgtnData()
     * 
     */
    public InvestigationResponse9 addInvstgtnData(InvestigationData6 invstgtnData) {
        getInvstgtnData().add(invstgtnData);
        return this;
    }

}
