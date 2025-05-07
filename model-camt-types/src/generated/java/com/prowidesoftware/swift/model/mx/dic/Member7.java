
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
 * Information about the members of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member7", propOrder = {
    "nm",
    "rtrAdr",
    "acct",
    "tp",
    "sts",
    "ctctRef",
    "comAdr"
})
public class Member7 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "RtrAdr")
    protected List<MemberIdentification3Choice> rtrAdr;
    @XmlElement(name = "Acct")
    protected List<CashAccount40> acct;
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
    public Member7 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the rtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtrAdr property.
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
     */
    public List<MemberIdentification3Choice> getRtrAdr() {
        if (rtrAdr == null) {
            rtrAdr = new ArrayList<MemberIdentification3Choice>();
        }
        return this.rtrAdr;
    }

    /**
     * Gets the value of the acct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acct property.
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
     * {@link CashAccount40 }
     * 
     * 
     */
    public List<CashAccount40> getAcct() {
        if (acct == null) {
            acct = new ArrayList<CashAccount40>();
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
    public Member7 setTp(SystemMemberType1Choice value) {
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
    public Member7 setSts(SystemMemberStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the ctctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctctRef property.
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
     */
    public List<ContactIdentificationAndAddress2> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<ContactIdentificationAndAddress2>();
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
    public Member7 setComAdr(CommunicationAddress10 value) {
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
    public Member7 addRtrAdr(MemberIdentification3Choice rtrAdr) {
        getRtrAdr().add(rtrAdr);
        return this;
    }

    /**
     * Adds a new item to the acct list.
     * @see #getAcct()
     * 
     */
    public Member7 addAcct(CashAccount40 acct) {
        getAcct().add(acct);
        return this;
    }

    /**
     * Adds a new item to the ctctRef list.
     * @see #getCtctRef()
     * 
     */
    public Member7 addCtctRef(ContactIdentificationAndAddress2 ctctRef) {
        getCtctRef().add(ctctRef);
        return this;
    }

}
