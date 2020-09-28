
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
 * Search for a system and a member of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSearch2", propOrder = {
    "sysId",
    "mmbId",
    "ctry",
    "acctId"
})
public class SystemSearch2 {

    @XmlElement(name = "SysId")
    @XmlSchemaType(name = "string")
    protected List<CashClearingSystem1Code> sysId;
    @XmlElement(name = "MmbId")
    protected List<MemberIdentificationChoice> mmbId;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AcctId")
    protected AccountIdentification1Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashClearingSystem1Code }
     * 
     * 
     */
    public List<CashClearingSystem1Code> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<CashClearingSystem1Code>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmbId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmbId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentificationChoice }
     * 
     * 
     */
    public List<MemberIdentificationChoice> getMmbId() {
        if (mmbId == null) {
            mmbId = new ArrayList<MemberIdentificationChoice>();
        }
        return this.mmbId;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSearch2 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public SystemSearch2 setAcctId(AccountIdentification1Choice value) {
        this.acctId = value;
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
     * Adds a new item to the sysId list.
     * @see #getSysId()
     * 
     */
    public SystemSearch2 addSysId(CashClearingSystem1Code sysId) {
        getSysId().add(sysId);
        return this;
    }

    /**
     * Adds a new item to the mmbId list.
     * @see #getMmbId()
     * 
     */
    public SystemSearch2 addMmbId(MemberIdentificationChoice mmbId) {
        getMmbId().add(mmbId);
        return this;
    }

}
