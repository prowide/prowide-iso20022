
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
 * The InvestigationRequest message is sent between agents or parties to create a payment or account related investigation or request a status update on an open payment or account related investigation.
 * 
 * Usage
 * The InvestigationRequest message can be used to create an investigation for these business scenarios -
 * - unable to apply;
 * - request for information;
 * - request value date adjustment;
 * - claim non-receipt;
 * - request debit authorisation;
 * - request use of funds;
 * - payment initiation not confirmed;
 * - miscellaenous business scenarios.
 * The InvestigationRequest message covers one and only one transaction or entry at a time in most business scenarios. In a request for information an agent or party may refer to more than one transaction within the Narrative element. For all other scenarios if an agent or party needs to create investigations that relate to several transactions or entries then several InvestigationRequest messages should be sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationRequestV01", propOrder = {
    "invstgtnReq",
    "invstgtnData",
    "splmtryData"
})
public class InvestigationRequestV01 {

    @XmlElement(name = "InvstgtnReq", required = true)
    protected InvestigationRequest2 invstgtnReq;
    @XmlElement(name = "InvstgtnData", required = true)
    protected List<InvestigationReason2> invstgtnData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the invstgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequest2 }
     *     
     */
    public InvestigationRequest2 getInvstgtnReq() {
        return invstgtnReq;
    }

    /**
     * Sets the value of the invstgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequest2 }
     *     
     */
    public InvestigationRequestV01 setInvstgtnReq(InvestigationRequest2 value) {
        this.invstgtnReq = value;
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
     * {@link InvestigationReason2 }
     * 
     * 
     */
    public List<InvestigationReason2> getInvstgtnData() {
        if (invstgtnData == null) {
            invstgtnData = new ArrayList<InvestigationReason2>();
        }
        return this.invstgtnData;
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
     * Adds a new item to the invstgtnData list.
     * @see #getInvstgtnData()
     * 
     */
    public InvestigationRequestV01 addInvstgtnData(InvestigationReason2 invstgtnData) {
        getInvstgtnData().add(invstgtnData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InvestigationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
