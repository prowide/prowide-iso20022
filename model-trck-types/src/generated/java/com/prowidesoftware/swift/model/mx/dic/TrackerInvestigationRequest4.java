
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
 * Provides detailed information on the investigation status as updated in the tracker or investigation facility.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerInvestigationRequest4", propOrder = {
    "invstgtnTp",
    "invstgtnSubTp",
    "stsAndAssgnmt",
    "undrlyg",
    "reqInvstgtnDataCpy",
    "rspnInvstgtnDataCpy"
})
public class TrackerInvestigationRequest4 {

    @XmlElement(name = "InvstgtnTp", required = true)
    protected InvestigationType2Choice invstgtnTp;
    @XmlElement(name = "InvstgtnSubTp")
    protected InvestigationSubType1Choice invstgtnSubTp;
    @XmlElement(name = "StsAndAssgnmt", required = true)
    protected TrackerInvestigationRequestStatus4 stsAndAssgnmt;
    @XmlElement(name = "Undrlyg")
    protected UnderlyingData13Choice undrlyg;
    @XmlElement(name = "ReqInvstgtnDataCpy")
    protected List<InvestigationReason2> reqInvstgtnDataCpy;
    @XmlElement(name = "RspnInvstgtnDataCpy")
    protected List<InvestigationData6> rspnInvstgtnDataCpy;

    /**
     * Gets the value of the invstgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationType2Choice }
     *     
     */
    public InvestigationType2Choice getInvstgtnTp() {
        return invstgtnTp;
    }

    /**
     * Sets the value of the invstgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationType2Choice }
     *     
     */
    public TrackerInvestigationRequest4 setInvstgtnTp(InvestigationType2Choice value) {
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
    public TrackerInvestigationRequest4 setInvstgtnSubTp(InvestigationSubType1Choice value) {
        this.invstgtnSubTp = value;
        return this;
    }

    /**
     * Gets the value of the stsAndAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerInvestigationRequestStatus4 }
     *     
     */
    public TrackerInvestigationRequestStatus4 getStsAndAssgnmt() {
        return stsAndAssgnmt;
    }

    /**
     * Sets the value of the stsAndAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerInvestigationRequestStatus4 }
     *     
     */
    public TrackerInvestigationRequest4 setStsAndAssgnmt(TrackerInvestigationRequestStatus4 value) {
        this.stsAndAssgnmt = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingData13Choice }
     *     
     */
    public UnderlyingData13Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingData13Choice }
     *     
     */
    public TrackerInvestigationRequest4 setUndrlyg(UnderlyingData13Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the reqInvstgtnDataCpy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqInvstgtnDataCpy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqInvstgtnDataCpy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationReason2 }
     * 
     * 
     * @return
     *     The value of the reqInvstgtnDataCpy property.
     */
    public List<InvestigationReason2> getReqInvstgtnDataCpy() {
        if (reqInvstgtnDataCpy == null) {
            reqInvstgtnDataCpy = new ArrayList<>();
        }
        return this.reqInvstgtnDataCpy;
    }

    /**
     * Gets the value of the rspnInvstgtnDataCpy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspnInvstgtnDataCpy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnInvstgtnDataCpy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationData6 }
     * 
     * 
     * @return
     *     The value of the rspnInvstgtnDataCpy property.
     */
    public List<InvestigationData6> getRspnInvstgtnDataCpy() {
        if (rspnInvstgtnDataCpy == null) {
            rspnInvstgtnDataCpy = new ArrayList<>();
        }
        return this.rspnInvstgtnDataCpy;
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
     * Adds a new item to the reqInvstgtnDataCpy list.
     * @see #getReqInvstgtnDataCpy()
     * 
     */
    public TrackerInvestigationRequest4 addReqInvstgtnDataCpy(InvestigationReason2 reqInvstgtnDataCpy) {
        getReqInvstgtnDataCpy().add(reqInvstgtnDataCpy);
        return this;
    }

    /**
     * Adds a new item to the rspnInvstgtnDataCpy list.
     * @see #getRspnInvstgtnDataCpy()
     * 
     */
    public TrackerInvestigationRequest4 addRspnInvstgtnDataCpy(InvestigationData6 rspnInvstgtnDataCpy) {
        getRspnInvstgtnDataCpy().add(rspnInvstgtnDataCpy);
        return this;
    }

}
