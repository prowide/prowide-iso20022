
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
 * Defines the criteria used to search for a limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitSearchCriteria3", propOrder = {
    "sysId",
    "bilLmtCtrPtyId",
    "dfltLmtTp",
    "curLmtTp",
    "acctOwnr",
    "acctId",
    "usdAmt",
    "usdPctg",
    "lmtCcy",
    "lmtAmt",
    "lmtVldAsOfDt"
})
public class LimitSearchCriteria3 {

    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected List<BranchAndFinancialInstitutionIdentification5> bilLmtCtrPtyId;
    @XmlElement(name = "DfltLmtTp")
    protected List<LimitType1Choice> dfltLmtTp;
    @XmlElement(name = "CurLmtTp")
    protected List<LimitType1Choice> curLmtTp;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification5 acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "UsdAmt")
    protected AmountRange2Choice usdAmt;
    @XmlElement(name = "UsdPctg")
    protected PercentageRange1Choice usdPctg;
    @XmlElement(name = "LmtCcy")
    protected String lmtCcy;
    @XmlElement(name = "LmtAmt")
    protected AmountRange2Choice lmtAmt;
    @XmlElement(name = "LmtVldAsOfDt")
    protected DateAndPeriod2Choice lmtVldAsOfDt;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public LimitSearchCriteria3 setSysId(SystemIdentification2Choice value) {
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
     * {@link BranchAndFinancialInstitutionIdentification5 }
     * 
     * 
     * @return
     *     The value of the bilLmtCtrPtyId property.
     */
    public List<BranchAndFinancialInstitutionIdentification5> getBilLmtCtrPtyId() {
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
     * {@link LimitType1Choice }
     * 
     * 
     * @return
     *     The value of the dfltLmtTp property.
     */
    public List<LimitType1Choice> getDfltLmtTp() {
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
     * {@link LimitType1Choice }
     * 
     * 
     * @return
     *     The value of the curLmtTp property.
     */
    public List<LimitType1Choice> getCurLmtTp() {
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
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public LimitSearchCriteria3 setAcctOwnr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public LimitSearchCriteria3 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the usdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRange2Choice }
     *     
     */
    public AmountRange2Choice getUsdAmt() {
        return usdAmt;
    }

    /**
     * Sets the value of the usdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRange2Choice }
     *     
     */
    public LimitSearchCriteria3 setUsdAmt(AmountRange2Choice value) {
        this.usdAmt = value;
        return this;
    }

    /**
     * Gets the value of the usdPctg property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRange1Choice }
     *     
     */
    public PercentageRange1Choice getUsdPctg() {
        return usdPctg;
    }

    /**
     * Sets the value of the usdPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRange1Choice }
     *     
     */
    public LimitSearchCriteria3 setUsdPctg(PercentageRange1Choice value) {
        this.usdPctg = value;
        return this;
    }

    /**
     * Gets the value of the lmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtCcy() {
        return lmtCcy;
    }

    /**
     * Sets the value of the lmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LimitSearchCriteria3 setLmtCcy(String value) {
        this.lmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the lmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRange2Choice }
     *     
     */
    public AmountRange2Choice getLmtAmt() {
        return lmtAmt;
    }

    /**
     * Sets the value of the lmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRange2Choice }
     *     
     */
    public LimitSearchCriteria3 setLmtAmt(AmountRange2Choice value) {
        this.lmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the lmtVldAsOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPeriod2Choice }
     *     
     */
    public DateAndPeriod2Choice getLmtVldAsOfDt() {
        return lmtVldAsOfDt;
    }

    /**
     * Sets the value of the lmtVldAsOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPeriod2Choice }
     *     
     */
    public LimitSearchCriteria3 setLmtVldAsOfDt(DateAndPeriod2Choice value) {
        this.lmtVldAsOfDt = value;
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
    public LimitSearchCriteria3 addBilLmtCtrPtyId(BranchAndFinancialInstitutionIdentification5 bilLmtCtrPtyId) {
        getBilLmtCtrPtyId().add(bilLmtCtrPtyId);
        return this;
    }

    /**
     * Adds a new item to the dfltLmtTp list.
     * @see #getDfltLmtTp()
     * 
     */
    public LimitSearchCriteria3 addDfltLmtTp(LimitType1Choice dfltLmtTp) {
        getDfltLmtTp().add(dfltLmtTp);
        return this;
    }

    /**
     * Adds a new item to the curLmtTp list.
     * @see #getCurLmtTp()
     * 
     */
    public LimitSearchCriteria3 addCurLmtTp(LimitType1Choice curLmtTp) {
        getCurLmtTp().add(curLmtTp);
        return this;
    }

}
