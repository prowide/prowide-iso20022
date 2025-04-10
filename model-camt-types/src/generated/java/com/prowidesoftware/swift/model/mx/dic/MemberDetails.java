
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "MemberDetails", propOrder = {
    "nm",
    "mmbRtrAdr",
    "acct",
    "tp",
    "sts",
    "ctctRef",
    "comAdr"
})
public class MemberDetails {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "MmbRtrAdr")
    protected List<MemberIdentificationChoice> mmbRtrAdr;
    @XmlElement(name = "Acct")
    protected List<AccountIdentificationAndName> acct;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected MemberType1Code tp;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected MemberStatus1Code sts;
    @XmlElement(name = "CtctRef")
    protected List<ContactIdentificationAndAddress> ctctRef;
    @XmlElement(name = "ComAdr")
    protected CommunicationAddressDetails comAdr;

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
    public MemberDetails setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the mmbRtrAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmbRtrAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmbRtrAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentificationChoice }
     * 
     * 
     */
    public List<MemberIdentificationChoice> getMmbRtrAdr() {
        if (mmbRtrAdr == null) {
            mmbRtrAdr = new ArrayList<MemberIdentificationChoice>();
        }
        return this.mmbRtrAdr;
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
     * {@link AccountIdentificationAndName }
     * 
     * 
     */
    public List<AccountIdentificationAndName> getAcct() {
        if (acct == null) {
            acct = new ArrayList<AccountIdentificationAndName>();
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
    public MemberDetails setTp(MemberType1Code value) {
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
    public MemberDetails setSts(MemberStatus1Code value) {
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
     * {@link ContactIdentificationAndAddress }
     * 
     * 
     */
    public List<ContactIdentificationAndAddress> getCtctRef() {
        if (ctctRef == null) {
            ctctRef = new ArrayList<ContactIdentificationAndAddress>();
        }
        return this.ctctRef;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddressDetails }
     *     
     */
    public CommunicationAddressDetails getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddressDetails }
     *     
     */
    public MemberDetails setComAdr(CommunicationAddressDetails value) {
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
     * Adds a new item to the mmbRtrAdr list.
     * @see #getMmbRtrAdr()
     * 
     */
    public MemberDetails addMmbRtrAdr(MemberIdentificationChoice mmbRtrAdr) {
        getMmbRtrAdr().add(mmbRtrAdr);
        return this;
    }

    /**
     * Adds a new item to the acct list.
     * @see #getAcct()
     * 
     */
    public MemberDetails addAcct(AccountIdentificationAndName acct) {
        getAcct().add(acct);
        return this;
    }

    /**
     * Adds a new item to the ctctRef list.
     * @see #getCtctRef()
     * 
     */
    public MemberDetails addCtctRef(ContactIdentificationAndAddress ctctRef) {
        getCtctRef().add(ctctRef);
        return this;
    }

}
