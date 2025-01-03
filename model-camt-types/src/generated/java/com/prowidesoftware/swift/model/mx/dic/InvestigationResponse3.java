
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
 * Provides details of the investigation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResponse3", propOrder = {
    "msgId",
    "rspndrInvstgtnId",
    "invstgtnSts",
    "nxtRspndr",
    "invstgtnData"
})
public class InvestigationResponse3 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "RspndrInvstgtnId")
    protected String rspndrInvstgtnId;
    @XmlElement(name = "InvstgtnSts", required = true)
    protected InvestigationStatus2 invstgtnSts;
    @XmlElement(name = "NxtRspndr")
    protected Party40Choice nxtRspndr;
    @XmlElement(name = "InvstgtnData")
    protected List<InvestigationData2> invstgtnData;

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
    public InvestigationResponse3 setMsgId(String value) {
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
    public InvestigationResponse3 setRspndrInvstgtnId(String value) {
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
    public InvestigationResponse3 setInvstgtnSts(InvestigationStatus2 value) {
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
    public InvestigationResponse3 setNxtRspndr(Party40Choice value) {
        this.nxtRspndr = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstgtnData property.
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
     * {@link InvestigationData2 }
     * 
     * 
     * @return
     *     The value of the invstgtnData property.
     */
    public List<InvestigationData2> getInvstgtnData() {
        if (invstgtnData == null) {
            invstgtnData = new ArrayList<>();
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
    public InvestigationResponse3 addInvstgtnData(InvestigationData2 invstgtnData) {
        getInvstgtnData().add(invstgtnData);
        return this;
    }

}
