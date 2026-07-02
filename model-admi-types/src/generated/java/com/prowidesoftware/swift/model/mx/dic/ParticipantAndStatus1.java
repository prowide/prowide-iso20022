
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
 * Provides details on the participant and their operational status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantAndStatus1", propOrder = {
    "ptcptId",
    "ptcptCtctDtls",
    "svcAvlbty"
})
public class ParticipantAndStatus1 {

    @XmlElement(name = "PtcptId", required = true)
    protected FinancialInstitutionIdentification13 ptcptId;
    @XmlElement(name = "PtcptCtctDtls")
    protected ContactDetails2 ptcptCtctDtls;
    @XmlElement(name = "SvcAvlbty", required = true)
    protected List<ServiceAvailability1> svcAvlbty;

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification13 }
     *     
     */
    public FinancialInstitutionIdentification13 getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification13 }
     *     
     */
    public ParticipantAndStatus1 setPtcptId(FinancialInstitutionIdentification13 value) {
        this.ptcptId = value;
        return this;
    }

    /**
     * Gets the value of the ptcptCtctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails2 }
     *     
     */
    public ContactDetails2 getPtcptCtctDtls() {
        return ptcptCtctDtls;
    }

    /**
     * Sets the value of the ptcptCtctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails2 }
     *     
     */
    public ParticipantAndStatus1 setPtcptCtctDtls(ContactDetails2 value) {
        this.ptcptCtctDtls = value;
        return this;
    }

    /**
     * Gets the value of the svcAvlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcAvlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAvailability1 }
     * 
     * 
     */
    public List<ServiceAvailability1> getSvcAvlbty() {
        if (svcAvlbty == null) {
            svcAvlbty = new ArrayList<ServiceAvailability1>();
        }
        return this.svcAvlbty;
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
     * Adds a new item to the svcAvlbty list.
     * @see #getSvcAvlbty()
     * 
     */
    public ParticipantAndStatus1 addSvcAvlbty(ServiceAvailability1 svcAvlbty) {
        getSvcAvlbty().add(svcAvlbty);
        return this;
    }

}
