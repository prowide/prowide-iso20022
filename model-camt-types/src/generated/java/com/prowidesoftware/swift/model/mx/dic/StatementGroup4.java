
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
 * Group of the statement header reporting the bank services billing and the billing statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementGroup4", propOrder = {
    "grpId",
    "sndr",
    "sndrIndvCtct",
    "rcvr",
    "rcvrIndvCtct",
    "bllgStmt"
})
public class StatementGroup4 {

    @XmlElement(name = "GrpId", required = true)
    protected String grpId;
    @XmlElement(name = "Sndr", required = true)
    protected PartyIdentification138 sndr;
    @XmlElement(name = "SndrIndvCtct")
    protected List<Contact4> sndrIndvCtct;
    @XmlElement(name = "Rcvr", required = true)
    protected PartyIdentification138 rcvr;
    @XmlElement(name = "RcvrIndvCtct")
    protected List<Contact4> rcvrIndvCtct;
    @XmlElement(name = "BllgStmt", required = true)
    protected List<BillingStatement4> bllgStmt;

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
    public StatementGroup4 setGrpId(String value) {
        this.grpId = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification138 }
     *     
     */
    public PartyIdentification138 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification138 }
     *     
     */
    public StatementGroup4 setSndr(PartyIdentification138 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the sndrIndvCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndrIndvCtct property.
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
     * {@link Contact4 }
     * 
     * 
     * @return
     *     The value of the sndrIndvCtct property.
     */
    public List<Contact4> getSndrIndvCtct() {
        if (sndrIndvCtct == null) {
            sndrIndvCtct = new ArrayList<>();
        }
        return this.sndrIndvCtct;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification138 }
     *     
     */
    public PartyIdentification138 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification138 }
     *     
     */
    public StatementGroup4 setRcvr(PartyIdentification138 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the rcvrIndvCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcvrIndvCtct property.
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
     * {@link Contact4 }
     * 
     * 
     * @return
     *     The value of the rcvrIndvCtct property.
     */
    public List<Contact4> getRcvrIndvCtct() {
        if (rcvrIndvCtct == null) {
            rcvrIndvCtct = new ArrayList<>();
        }
        return this.rcvrIndvCtct;
    }

    /**
     * Gets the value of the bllgStmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bllgStmt property.
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
     * {@link BillingStatement4 }
     * 
     * 
     * @return
     *     The value of the bllgStmt property.
     */
    public List<BillingStatement4> getBllgStmt() {
        if (bllgStmt == null) {
            bllgStmt = new ArrayList<>();
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
    public StatementGroup4 addSndrIndvCtct(Contact4 sndrIndvCtct) {
        getSndrIndvCtct().add(sndrIndvCtct);
        return this;
    }

    /**
     * Adds a new item to the rcvrIndvCtct list.
     * @see #getRcvrIndvCtct()
     * 
     */
    public StatementGroup4 addRcvrIndvCtct(Contact4 rcvrIndvCtct) {
        getRcvrIndvCtct().add(rcvrIndvCtct);
        return this;
    }

    /**
     * Adds a new item to the bllgStmt list.
     * @see #getBllgStmt()
     * 
     */
    public StatementGroup4 addBllgStmt(BillingStatement4 bllgStmt) {
        getBllgStmt().add(bllgStmt);
        return this;
    }

}
