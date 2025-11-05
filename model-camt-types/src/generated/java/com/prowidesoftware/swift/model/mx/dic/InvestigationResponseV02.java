
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
 * Scope
 * The InvestigationResponse message is sent between agents to provide a response or status update on an investigation.
 * Usage
 * The InvestigationResponse message should be used to respond to an InvestigationRequest message. The responses cover these business scenarios -
 * - unable to apply;
 * - request for information;
 * - request value date adjustment;
 * - claim non-receipt;
 * - request debit authorisation;
 * - request use of funds;
 * - payment initiation not confirmed;
 * - miscellaenous business scenarios.
 * The InvestigationResponse message covers one and only one transaction or entry at a time except when responding to some requests for information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResponseV02", propOrder = {
    "invstgtnRspn",
    "orgnlInvstgtnReq",
    "splmtryData"
})
public class InvestigationResponseV02 {

    @XmlElement(name = "InvstgtnRspn", required = true)
    protected InvestigationResponse9 invstgtnRspn;
    @XmlElement(name = "OrgnlInvstgtnReq", required = true)
    protected InvestigationRequest3 orgnlInvstgtnReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the invstgtnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationResponse9 }
     *     
     */
    public InvestigationResponse9 getInvstgtnRspn() {
        return invstgtnRspn;
    }

    /**
     * Sets the value of the invstgtnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationResponse9 }
     *     
     */
    public InvestigationResponseV02 setInvstgtnRspn(InvestigationResponse9 value) {
        this.invstgtnRspn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInvstgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequest3 }
     *     
     */
    public InvestigationRequest3 getOrgnlInvstgtnReq() {
        return orgnlInvstgtnReq;
    }

    /**
     * Sets the value of the orgnlInvstgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequest3 }
     *     
     */
    public InvestigationResponseV02 setOrgnlInvstgtnReq(InvestigationRequest3 value) {
        this.orgnlInvstgtnReq = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InvestigationResponseV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
