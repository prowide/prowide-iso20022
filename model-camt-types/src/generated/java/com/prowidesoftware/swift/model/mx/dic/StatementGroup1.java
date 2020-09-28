
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
 * Group of the statement header reporting the bank services billing and the billing statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementGroup1", propOrder = {
    "grpId",
    "sndr",
    "sndrIndvCtct",
    "rcvr",
    "rcvrIndvCtct",
    "bllgStmt"
})
public class StatementGroup1 {

    @XmlElement(name = "GrpId", required = true)
    protected String grpId;
    @XmlElement(name = "Sndr", required = true)
    protected PartyIdentification58 sndr;
    @XmlElement(name = "SndrIndvCtct")
    protected List<ContactDetails3> sndrIndvCtct;
    @XmlElement(name = "Rcvr", required = true)
    protected PartyIdentification58 rcvr;
    @XmlElement(name = "RcvrIndvCtct")
    protected List<ContactDetails3> rcvrIndvCtct;
    @XmlElement(name = "BllgStmt", required = true)
    protected List<BillingStatement1> bllgStmt;

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatementGroup1 setGrpId(String value) {
        this.grpId = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification58 }
     *     
     */
    public PartyIdentification58 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification58 }
     *     
     */
    public StatementGroup1 setSndr(PartyIdentification58 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the sndrIndvCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sndrIndvCtct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndrIndvCtct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetails3 }
     * 
     * 
     */
    public List<ContactDetails3> getSndrIndvCtct() {
        if (sndrIndvCtct == null) {
            sndrIndvCtct = new ArrayList<ContactDetails3>();
        }
        return this.sndrIndvCtct;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification58 }
     *     
     */
    public PartyIdentification58 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification58 }
     *     
     */
    public StatementGroup1 setRcvr(PartyIdentification58 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the rcvrIndvCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcvrIndvCtct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcvrIndvCtct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetails3 }
     * 
     * 
     */
    public List<ContactDetails3> getRcvrIndvCtct() {
        if (rcvrIndvCtct == null) {
            rcvrIndvCtct = new ArrayList<ContactDetails3>();
        }
        return this.rcvrIndvCtct;
    }

    /**
     * Gets the value of the bllgStmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bllgStmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllgStmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingStatement1 }
     * 
     * 
     */
    public List<BillingStatement1> getBllgStmt() {
        if (bllgStmt == null) {
            bllgStmt = new ArrayList<BillingStatement1>();
        }
        return this.bllgStmt;
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
     * Adds a new item to the sndrIndvCtct list.
     * @see #getSndrIndvCtct()
     * 
     */
    public StatementGroup1 addSndrIndvCtct(ContactDetails3 sndrIndvCtct) {
        getSndrIndvCtct().add(sndrIndvCtct);
        return this;
    }

    /**
     * Adds a new item to the rcvrIndvCtct list.
     * @see #getRcvrIndvCtct()
     * 
     */
    public StatementGroup1 addRcvrIndvCtct(ContactDetails3 rcvrIndvCtct) {
        getRcvrIndvCtct().add(rcvrIndvCtct);
        return this;
    }

    /**
     * Adds a new item to the bllgStmt list.
     * @see #getBllgStmt()
     * 
     */
    public StatementGroup1 addBllgStmt(BillingStatement1 bllgStmt) {
        getBllgStmt().add(bllgStmt);
        return this;
    }

}
