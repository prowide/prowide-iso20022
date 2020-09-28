
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountDetails3", propOrder = {
    "nm",
    "tp",
    "ccy",
    "curMulLmt",
    "acctOwnr",
    "acctSvcr",
    "mulBal",
    "curBilLmt",
    "stgOrdr"
})
public class CashAccountDetails3 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CashAccountType2Code tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CurMulLmt")
    protected LimitDetails curMulLmt;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected String acctSvcr;
    @XmlElement(name = "MulBal")
    protected List<CashBalanceDetails4> mulBal;
    @XmlElement(name = "CurBilLmt")
    protected List<BilateralLimitDetails2> curBilLmt;
    @XmlElement(name = "StgOrdr")
    protected List<StandingOrderDetails3> stgOrdr;

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
    public CashAccountDetails3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Code }
     *     
     */
    public CashAccountType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Code }
     *     
     */
    public CashAccountDetails3 setTp(CashAccountType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountDetails3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the curMulLmt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetails }
     *     
     */
    public LimitDetails getCurMulLmt() {
        return curMulLmt;
    }

    /**
     * Sets the value of the curMulLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetails }
     *     
     */
    public CashAccountDetails3 setCurMulLmt(LimitDetails value) {
        this.curMulLmt = value;
        return this;
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
    public CashAccountDetails3 setAcctOwnr(String value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountDetails3 setAcctSvcr(String value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the mulBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mulBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMulBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalanceDetails4 }
     * 
     * 
     */
    public List<CashBalanceDetails4> getMulBal() {
        if (mulBal == null) {
            mulBal = new ArrayList<CashBalanceDetails4>();
        }
        return this.mulBal;
    }

    /**
     * Gets the value of the curBilLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curBilLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurBilLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralLimitDetails2 }
     * 
     * 
     */
    public List<BilateralLimitDetails2> getCurBilLmt() {
        if (curBilLmt == null) {
            curBilLmt = new ArrayList<BilateralLimitDetails2>();
        }
        return this.curBilLmt;
    }

    /**
     * Gets the value of the stgOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stgOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStgOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandingOrderDetails3 }
     * 
     * 
     */
    public List<StandingOrderDetails3> getStgOrdr() {
        if (stgOrdr == null) {
            stgOrdr = new ArrayList<StandingOrderDetails3>();
        }
        return this.stgOrdr;
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
     * Adds a new item to the mulBal list.
     * @see #getMulBal()
     * 
     */
    public CashAccountDetails3 addMulBal(CashBalanceDetails4 mulBal) {
        getMulBal().add(mulBal);
        return this;
    }

    /**
     * Adds a new item to the curBilLmt list.
     * @see #getCurBilLmt()
     * 
     */
    public CashAccountDetails3 addCurBilLmt(BilateralLimitDetails2 curBilLmt) {
        getCurBilLmt().add(curBilLmt);
        return this;
    }

    /**
     * Adds a new item to the stgOrdr list.
     * @see #getStgOrdr()
     * 
     */
    public CashAccountDetails3 addStgOrdr(StandingOrderDetails3 stgOrdr) {
        getStgOrdr().add(stgOrdr);
        return this;
    }

}
