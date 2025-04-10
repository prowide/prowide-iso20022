
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
 * Information about the members of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member5", propOrder = {
    "nm",
    "rtrAdr",
    "acct",
    "tp",
    "sts",
    "ctctRef",
    "comAdr"
})
public class Member5 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "RtrAdr")
    protected List<MemberIdentification3Choice> rtrAdr;
    @XmlElement(name = "Acct")
    protected List<CashAccount38> acct;
    @XmlElement(name = "Tp")
    protected SystemMemberType1Choice tp;
    @XmlElement(name = "Sts")
    protected SystemMemberStatus1Choice sts;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress2> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddress10 comAdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Member5 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the rtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentification3Choice }
     * 
     * 
     * @return
     *     The value of the rtrAdr property.
     */
    public List<MemberIdentification3Choice> getRtrAdr() {
        if (rtrAdr == null) {
            rtrAdr = new ArrayList<>();
        }
        return this.rtrAdr;
    }

    /**
     * Gets the value of the acct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount38 }
     * 
     * 
     * @return
     *     The value of the acct property.
     */
    public List<CashAccount38> getAcct() {
        if (acct == null) {
            acct = new ArrayList<>();
        }
        return this.acct;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMemberType1Choice }
     *     
     */
    public SystemMemberType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMemberType1Choice }
     *     
     */
    public Member5 setTp(SystemMemberType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMemberStatus1Choice }
     *     
     */
    public SystemMemberStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMemberStatus1Choice }
     *     
     */
    public Member5 setSts(SystemMemberStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the ctctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentificationAndAddress2 }
     * 
     * 
     * @return
     *     The value of the ctctRef property.
     */
    public List<ContactIdentificationAndAddress2> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<>();
        }
        return this.ctctRef;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public CommunicationAddress10 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public Member5 setComAdr(CommunicationAddress10 value) {
        this.comAdr = value;
        return this;
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
     * Adds a new item to the rtrAdr list.
     * @see #getRtrAdr()
     * 
     */
    public Member5 addRtrAdr(MemberIdentification3Choice rtrAdr) {
        getRtrAdr().add(rtrAdr);
        return this;
    }

    /**
     * Adds a new item to the acct list.
     * @see #getAcct()
     * 
     */
    public Member5 addAcct(CashAccount38 acct) {
        getAcct().add(acct);
        return this;
    }

    /**
     * Adds a new item to the ctctRef list.
     * @see #getCtctRef()
     * 
     */
    public Member5 addCtctRef(ContactIdentificationAndAddress2 ctctRef) {
        getCtctRef().add(ctctRef);
        return this;
    }

}
