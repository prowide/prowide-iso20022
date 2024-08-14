
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
 * Defines the criteria used to search for a limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitSearchCriteria2", propOrder = {
    "sysId",
    "bilLmtCtrPtyId",
    "dfltLmtTp",
    "curLmtTp",
    "acctOwnr",
    "acctId"
})
public class LimitSearchCriteria2 {

    @XmlElement(name = "SysId")
    protected SystemIdentificationChoice sysId;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected List<MemberIdentificationChoice> bilLmtCtrPtyId;
    @XmlElement(name = "DfltLmtTp")
    @XmlSchemaType(name = "string")
    protected List<LimitType2Code> dfltLmtTp;
    @XmlElement(name = "CurLmtTp")
    @XmlSchemaType(name = "string")
    protected List<LimitType2Code> curLmtTp;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification1Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentificationChoice }
     *     
     */
    public SystemIdentificationChoice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentificationChoice }
     *     
     */
    public LimitSearchCriteria2 setSysId(SystemIdentificationChoice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bilLmtCtrPtyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilLmtCtrPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentificationChoice }
     * 
     * 
     * @return
     *     The value of the bilLmtCtrPtyId property.
     */
    public List<MemberIdentificationChoice> getBilLmtCtrPtyId() {
        if (bilLmtCtrPtyId == null) {
            bilLmtCtrPtyId = new ArrayList<>();
        }
        return this.bilLmtCtrPtyId;
    }

    /**
     * Gets the value of the dfltLmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltLmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltLmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitType2Code }
     * 
     * 
     * @return
     *     The value of the dfltLmtTp property.
     */
    public List<LimitType2Code> getDfltLmtTp() {
        if (dfltLmtTp == null) {
            dfltLmtTp = new ArrayList<>();
        }
        return this.dfltLmtTp;
    }

    /**
     * Gets the value of the curLmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curLmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitType2Code }
     * 
     * 
     * @return
     *     The value of the curLmtTp property.
     */
    public List<LimitType2Code> getCurLmtTp() {
        if (curLmtTp == null) {
            curLmtTp = new ArrayList<>();
        }
        return this.curLmtTp;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LimitSearchCriteria2 setAcctOwnr(String value) {
        this.acctOwnr = value;
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
    public LimitSearchCriteria2 setAcctId(AccountIdentification1Choice value) {
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
     * Adds a new item to the bilLmtCtrPtyId list.
     * @see #getBilLmtCtrPtyId()
     * 
     */
    public LimitSearchCriteria2 addBilLmtCtrPtyId(MemberIdentificationChoice bilLmtCtrPtyId) {
        getBilLmtCtrPtyId().add(bilLmtCtrPtyId);
        return this;
    }

    /**
     * Adds a new item to the dfltLmtTp list.
     * @see #getDfltLmtTp()
     * 
     */
    public LimitSearchCriteria2 addDfltLmtTp(LimitType2Code dfltLmtTp) {
        getDfltLmtTp().add(dfltLmtTp);
        return this;
    }

    /**
     * Adds a new item to the curLmtTp list.
     * @see #getCurLmtTp()
     * 
     */
    public LimitSearchCriteria2 addCurLmtTp(LimitType2Code curLmtTp) {
        getCurLmtTp().add(curLmtTp);
        return this;
    }

}
