
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount35", propOrder = {
    "nm",
    "tp",
    "ccy",
    "curMulLmt",
    "ownr",
    "svcr",
    "mulBal",
    "curBilLmt",
    "stgOrdr"
})
public class CashAccount35 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CurMulLmt")
    protected Limit5 curMulLmt;
    @XmlElement(name = "Ownr")
    protected PartyIdentification125 ownr;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification5 svcr;
    @XmlElement(name = "MulBal")
    protected List<CashBalance10> mulBal;
    @XmlElement(name = "CurBilLmt")
    protected List<BilateralLimit2> curBilLmt;
    @XmlElement(name = "StgOrdr")
    protected List<StandingOrder2> stgOrdr;

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
    public CashAccount35 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccount35 setTp(CashAccountType2Choice value) {
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
    public CashAccount35 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the curMulLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Limit5 }
     *     
     */
    public Limit5 getCurMulLmt() {
        return curMulLmt;
    }

    /**
     * Sets the value of the curMulLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit5 }
     *     
     */
    public CashAccount35 setCurMulLmt(Limit5 value) {
        this.curMulLmt = value;
        return this;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125 }
     *     
     */
    public PartyIdentification125 getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125 }
     *     
     */
    public CashAccount35 setOwnr(PartyIdentification125 value) {
        this.ownr = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public CashAccount35 setSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the mulBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mulBal property.
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
     * {@link CashBalance10 }
     * 
     * 
     * @return
     *     The value of the mulBal property.
     */
    public List<CashBalance10> getMulBal() {
        if (mulBal == null) {
            mulBal = new ArrayList<>();
        }
        return this.mulBal;
    }

    /**
     * Gets the value of the curBilLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curBilLmt property.
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
     * {@link BilateralLimit2 }
     * 
     * 
     * @return
     *     The value of the curBilLmt property.
     */
    public List<BilateralLimit2> getCurBilLmt() {
        if (curBilLmt == null) {
            curBilLmt = new ArrayList<>();
        }
        return this.curBilLmt;
    }

    /**
     * Gets the value of the stgOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stgOrdr property.
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
     * {@link StandingOrder2 }
     * 
     * 
     * @return
     *     The value of the stgOrdr property.
     */
    public List<StandingOrder2> getStgOrdr() {
        if (stgOrdr == null) {
            stgOrdr = new ArrayList<>();
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
    public CashAccount35 addMulBal(CashBalance10 mulBal) {
        getMulBal().add(mulBal);
        return this;
    }

    /**
     * Adds a new item to the curBilLmt list.
     * @see #getCurBilLmt()
     * 
     */
    public CashAccount35 addCurBilLmt(BilateralLimit2 curBilLmt) {
        getCurBilLmt().add(curBilLmt);
        return this;
    }

    /**
     * Adds a new item to the stgOrdr list.
     * @see #getStgOrdr()
     * 
     */
    public CashAccount35 addStgOrdr(StandingOrder2 stgOrdr) {
        getStgOrdr().add(stgOrdr);
        return this;
    }

}
