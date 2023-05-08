
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details from participant profile account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantAccount1", propOrder = {
    "acctTpNm",
    "acctTpShrtNm",
    "opngDt",
    "clsgDt",
    "deltnDt",
    "licWdrwlDoc",
    "acctRstrctns",
    "dsgntdAcct",
    "lqdtyPoolPtcptDtls",
    "lmts",
    "arrsts",
    "mgrtn"
})
public class ParticipantAccount1 {

    @XmlElement(name = "AcctTpNm", required = true)
    protected String acctTpNm;
    @XmlElement(name = "AcctTpShrtNm", required = true)
    protected String acctTpShrtNm;
    @XmlElement(name = "OpngDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar opngDt;
    @XmlElement(name = "ClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar clsgDt;
    @XmlElement(name = "DeltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar deltnDt;
    @XmlElement(name = "LicWdrwlDoc")
    protected DocumentIdentification11 licWdrwlDoc;
    @XmlElement(name = "AcctRstrctns")
    protected List<AccountRestrictions1> acctRstrctns;
    @XmlElement(name = "DsgntdAcct")
    protected DefaultAccountDetails1 dsgntdAcct;
    @XmlElement(name = "LqdtyPoolPtcptDtls")
    protected LiquidityPoolMembers1Choice lqdtyPoolPtcptDtls;
    @XmlElement(name = "Lmts")
    protected List<AccountLimits1> lmts;
    @XmlElement(name = "Arrsts")
    protected List<ArrestedFunds1> arrsts;
    @XmlElement(name = "Mgrtn")
    protected SystemMigration1 mgrtn;

    /**
     * Gets the value of the acctTpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTpNm() {
        return acctTpNm;
    }

    /**
     * Sets the value of the acctTpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantAccount1 setAcctTpNm(String value) {
        this.acctTpNm = value;
        return this;
    }

    /**
     * Gets the value of the acctTpShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTpShrtNm() {
        return acctTpShrtNm;
    }

    /**
     * Sets the value of the acctTpShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantAccount1 setAcctTpShrtNm(String value) {
        this.acctTpShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantAccount1 setOpngDt(Calendar value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantAccount1 setClsgDt(Calendar value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the deltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDeltnDt() {
        return deltnDt;
    }

    /**
     * Sets the value of the deltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantAccount1 setDeltnDt(Calendar value) {
        this.deltnDt = value;
        return this;
    }

    /**
     * Gets the value of the licWdrwlDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getLicWdrwlDoc() {
        return licWdrwlDoc;
    }

    /**
     * Sets the value of the licWdrwlDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public ParticipantAccount1 setLicWdrwlDoc(DocumentIdentification11 value) {
        this.licWdrwlDoc = value;
        return this;
    }

    /**
     * Gets the value of the acctRstrctns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctRstrctns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctRstrctns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRestrictions1 }
     * 
     * 
     * @return
     *     The value of the acctRstrctns property.
     */
    public List<AccountRestrictions1> getAcctRstrctns() {
        if (acctRstrctns == null) {
            acctRstrctns = new ArrayList<>();
        }
        return this.acctRstrctns;
    }

    /**
     * Gets the value of the dsgntdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultAccountDetails1 }
     *     
     */
    public DefaultAccountDetails1 getDsgntdAcct() {
        return dsgntdAcct;
    }

    /**
     * Sets the value of the dsgntdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultAccountDetails1 }
     *     
     */
    public ParticipantAccount1 setDsgntdAcct(DefaultAccountDetails1 value) {
        this.dsgntdAcct = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyPoolPtcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityPoolMembers1Choice }
     *     
     */
    public LiquidityPoolMembers1Choice getLqdtyPoolPtcptDtls() {
        return lqdtyPoolPtcptDtls;
    }

    /**
     * Sets the value of the lqdtyPoolPtcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityPoolMembers1Choice }
     *     
     */
    public ParticipantAccount1 setLqdtyPoolPtcptDtls(LiquidityPoolMembers1Choice value) {
        this.lqdtyPoolPtcptDtls = value;
        return this;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountLimits1 }
     * 
     * 
     * @return
     *     The value of the lmts property.
     */
    public List<AccountLimits1> getLmts() {
        if (lmts == null) {
            lmts = new ArrayList<>();
        }
        return this.lmts;
    }

    /**
     * Gets the value of the arrsts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the arrsts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrsts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrestedFunds1 }
     * 
     * 
     * @return
     *     The value of the arrsts property.
     */
    public List<ArrestedFunds1> getArrsts() {
        if (arrsts == null) {
            arrsts = new ArrayList<>();
        }
        return this.arrsts;
    }

    /**
     * Gets the value of the mgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMigration1 }
     *     
     */
    public SystemMigration1 getMgrtn() {
        return mgrtn;
    }

    /**
     * Sets the value of the mgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMigration1 }
     *     
     */
    public ParticipantAccount1 setMgrtn(SystemMigration1 value) {
        this.mgrtn = value;
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
     * Adds a new item to the acctRstrctns list.
     * @see #getAcctRstrctns()
     * 
     */
    public ParticipantAccount1 addAcctRstrctns(AccountRestrictions1 acctRstrctns) {
        getAcctRstrctns().add(acctRstrctns);
        return this;
    }

    /**
     * Adds a new item to the lmts list.
     * @see #getLmts()
     * 
     */
    public ParticipantAccount1 addLmts(AccountLimits1 lmts) {
        getLmts().add(lmts);
        return this;
    }

    /**
     * Adds a new item to the arrsts list.
     * @see #getArrsts()
     * 
     */
    public ParticipantAccount1 addArrsts(ArrestedFunds1 arrsts) {
        getArrsts().add(arrsts);
        return this;
    }

}
