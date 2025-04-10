
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
 * Provides further details on the agents specific to the individual transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAgents6", propOrder = {
    "instgAgt",
    "instdAgt",
    "dbtrAgt",
    "cdtrAgt",
    "intrmyAgt1",
    "intrmyAgt2",
    "intrmyAgt3",
    "rcvgAgt",
    "dlvrgAgt",
    "issgAgt",
    "sttlmPlc",
    "prtry"
})
public class TransactionAgents6 {

    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification8 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification8 instdAgt;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 cdtrAgt;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification8 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification8 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt3")
    protected BranchAndFinancialInstitutionIdentification8 intrmyAgt3;
    @XmlElement(name = "RcvgAgt")
    protected BranchAndFinancialInstitutionIdentification8 rcvgAgt;
    @XmlElement(name = "DlvrgAgt")
    protected BranchAndFinancialInstitutionIdentification8 dlvrgAgt;
    @XmlElement(name = "IssgAgt")
    protected BranchAndFinancialInstitutionIdentification8 issgAgt;
    @XmlElement(name = "SttlmPlc")
    protected BranchAndFinancialInstitutionIdentification8 sttlmPlc;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryAgent5> prtry;

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setInstgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.instgAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setInstdAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.instdAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setCdtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setIntrmyAgt1(BranchAndFinancialInstitutionIdentification8 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setIntrmyAgt2(BranchAndFinancialInstitutionIdentification8 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setIntrmyAgt3(BranchAndFinancialInstitutionIdentification8 value) {
        this.intrmyAgt3 = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getRcvgAgt() {
        return rcvgAgt;
    }

    /**
     * Sets the value of the rcvgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setRcvgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.rcvgAgt = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDlvrgAgt() {
        return dlvrgAgt;
    }

    /**
     * Sets the value of the dlvrgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setDlvrgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dlvrgAgt = value;
        return this;
    }

    /**
     * Gets the value of the issgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getIssgAgt() {
        return issgAgt;
    }

    /**
     * Sets the value of the issgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setIssgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.issgAgt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPlc property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getSttlmPlc() {
        return sttlmPlc;
    }

    /**
     * Sets the value of the sttlmPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public TransactionAgents6 setSttlmPlc(BranchAndFinancialInstitutionIdentification8 value) {
        this.sttlmPlc = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryAgent5 }
     * 
     * 
     * @return
     *     The value of the prtry property.
     */
    public List<ProprietaryAgent5> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<>();
        }
        return this.prtry;
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
     * Adds a new item to the prtry list.
     * @see #getPrtry()
     * 
     */
    public TransactionAgents6 addPrtry(ProprietaryAgent5 prtry) {
        getPrtry().add(prtry);
        return this;
    }

}
