
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "Member4", propOrder = {
    "nm",
    "rtrAdr",
    "acct",
    "tp",
    "sts",
    "ctctRef",
    "comAdr"
})
public class Member4 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "RtrAdr")
    protected List<MemberIdentification2Choice> rtrAdr;
    @XmlElement(name = "Acct")
    protected List<CashAccount24> acct;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected MemberType1Code tp;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected MemberStatus1Code sts;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress1> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddress8 comAdr;

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
    public Member4 setNm(String value) {
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
     * {@link MemberIdentification2Choice }
     * 
     * 
     */
    public List<MemberIdentification2Choice> getRtrAdr() {
        if (rtrAdr == null) {
            rtrAdr = new ArrayList<MemberIdentification2Choice>();
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
     * {@link CashAccount24 }
     * 
     * 
     */
    public List<CashAccount24> getAcct() {
        if (acct == null) {
            acct = new ArrayList<CashAccount24>();
        }
        return this.acct;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MemberType1Code }
     *     
     */
    public MemberType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberType1Code }
     *     
     */
    public Member4 setTp(MemberType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link MemberStatus1Code }
     *     
     */
    public MemberStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberStatus1Code }
     *     
     */
    public Member4 setSts(MemberStatus1Code value) {
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
     * {@link ContactIdentificationAndAddress1 }
     * 
     * 
     */
    public List<ContactIdentificationAndAddress1> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<ContactIdentificationAndAddress1>();
        }
        return this.ctctRef;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public CommunicationAddress8 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public Member4 setComAdr(CommunicationAddress8 value) {
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
    public Member4 addRtrAdr(MemberIdentification2Choice rtrAdr) {
        getRtrAdr().add(rtrAdr);
        return this;
    }

    /**
     * Adds a new item to the acct list.
     * @see #getAcct()
     * 
     */
    public Member4 addAcct(CashAccount24 acct) {
        getAcct().add(acct);
        return this;
    }

    /**
     * Adds a new item to the ctctRef list.
     * @see #getCtctRef()
     * 
     */
    public Member4 addCtctRef(ContactIdentificationAndAddress1 ctctRef) {
        getCtctRef().add(ctctRef);
        return this;
    }

}
