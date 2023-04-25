
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
 * Details of the statement reporting the bank services billing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingStatement3", propOrder = {
    "stmtId",
    "frToDt",
    "creDtTm",
    "sts",
    "acctChrtcs",
    "rateData",
    "ccyXchg",
    "bal",
    "compstn",
    "svc",
    "taxRgn",
    "balAdjstmnt",
    "svcAdjstmnt"
})
public class BillingStatement3 {

    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "FrToDt", required = true)
    protected DatePeriod1 frToDt;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creDtTm;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected BillingStatementStatus1Code sts;
    @XmlElement(name = "AcctChrtcs", required = true)
    protected CashAccountCharacteristics3 acctChrtcs;
    @XmlElement(name = "RateData")
    protected List<BillingRate1> rateData;
    @XmlElement(name = "CcyXchg")
    protected List<CurrencyExchange6> ccyXchg;
    @XmlElement(name = "Bal")
    protected List<BillingBalance1> bal;
    @XmlElement(name = "Compstn")
    protected List<BillingCompensation1> compstn;
    @XmlElement(name = "Svc")
    protected List<BillingService2> svc;
    @XmlElement(name = "TaxRgn")
    protected List<BillingTaxRegion2> taxRgn;
    @XmlElement(name = "BalAdjstmnt")
    protected List<BalanceAdjustment1> balAdjstmnt;
    @XmlElement(name = "SvcAdjstmnt")
    protected List<BillingServiceAdjustment1> svcAdjstmnt;

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingStatement3 setStmtId(String value) {
        this.stmtId = value;
        return this;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public BillingStatement3 setFrToDt(DatePeriod1 value) {
        this.frToDt = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingStatement3 setCreDtTm(Calendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link BillingStatementStatus1Code }
     *     
     */
    public BillingStatementStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingStatementStatus1Code }
     *     
     */
    public BillingStatement3 setSts(BillingStatementStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the acctChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountCharacteristics3 }
     *     
     */
    public CashAccountCharacteristics3 getAcctChrtcs() {
        return acctChrtcs;
    }

    /**
     * Sets the value of the acctChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountCharacteristics3 }
     *     
     */
    public BillingStatement3 setAcctChrtcs(CashAccountCharacteristics3 value) {
        this.acctChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the rateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingRate1 }
     * 
     * 
     * @return
     *     The value of the rateData property.
     */
    public List<BillingRate1> getRateData() {
        if (rateData == null) {
            rateData = new ArrayList<>();
        }
        return this.rateData;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyXchg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyXchg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyExchange6 }
     * 
     * 
     * @return
     *     The value of the ccyXchg property.
     */
    public List<CurrencyExchange6> getCcyXchg() {
        if (ccyXchg == null) {
            ccyXchg = new ArrayList<>();
        }
        return this.ccyXchg;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingBalance1 }
     * 
     * 
     * @return
     *     The value of the bal property.
     */
    public List<BillingBalance1> getBal() {
        if (bal == null) {
            bal = new ArrayList<>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the compstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the compstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingCompensation1 }
     * 
     * 
     * @return
     *     The value of the compstn property.
     */
    public List<BillingCompensation1> getCompstn() {
        if (compstn == null) {
            compstn = new ArrayList<>();
        }
        return this.compstn;
    }

    /**
     * Gets the value of the svc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingService2 }
     * 
     * 
     * @return
     *     The value of the svc property.
     */
    public List<BillingService2> getSvc() {
        if (svc == null) {
            svc = new ArrayList<>();
        }
        return this.svc;
    }

    /**
     * Gets the value of the taxRgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingTaxRegion2 }
     * 
     * 
     * @return
     *     The value of the taxRgn property.
     */
    public List<BillingTaxRegion2> getTaxRgn() {
        if (taxRgn == null) {
            taxRgn = new ArrayList<>();
        }
        return this.taxRgn;
    }

    /**
     * Gets the value of the balAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceAdjustment1 }
     * 
     * 
     * @return
     *     The value of the balAdjstmnt property.
     */
    public List<BalanceAdjustment1> getBalAdjstmnt() {
        if (balAdjstmnt == null) {
            balAdjstmnt = new ArrayList<>();
        }
        return this.balAdjstmnt;
    }

    /**
     * Gets the value of the svcAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServiceAdjustment1 }
     * 
     * 
     * @return
     *     The value of the svcAdjstmnt property.
     */
    public List<BillingServiceAdjustment1> getSvcAdjstmnt() {
        if (svcAdjstmnt == null) {
            svcAdjstmnt = new ArrayList<>();
        }
        return this.svcAdjstmnt;
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
     * Adds a new item to the rateData list.
     * @see #getRateData()
     * 
     */
    public BillingStatement3 addRateData(BillingRate1 rateData) {
        getRateData().add(rateData);
        return this;
    }

    /**
     * Adds a new item to the ccyXchg list.
     * @see #getCcyXchg()
     * 
     */
    public BillingStatement3 addCcyXchg(CurrencyExchange6 ccyXchg) {
        getCcyXchg().add(ccyXchg);
        return this;
    }

    /**
     * Adds a new item to the bal list.
     * @see #getBal()
     * 
     */
    public BillingStatement3 addBal(BillingBalance1 bal) {
        getBal().add(bal);
        return this;
    }

    /**
     * Adds a new item to the compstn list.
     * @see #getCompstn()
     * 
     */
    public BillingStatement3 addCompstn(BillingCompensation1 compstn) {
        getCompstn().add(compstn);
        return this;
    }

    /**
     * Adds a new item to the svc list.
     * @see #getSvc()
     * 
     */
    public BillingStatement3 addSvc(BillingService2 svc) {
        getSvc().add(svc);
        return this;
    }

    /**
     * Adds a new item to the taxRgn list.
     * @see #getTaxRgn()
     * 
     */
    public BillingStatement3 addTaxRgn(BillingTaxRegion2 taxRgn) {
        getTaxRgn().add(taxRgn);
        return this;
    }

    /**
     * Adds a new item to the balAdjstmnt list.
     * @see #getBalAdjstmnt()
     * 
     */
    public BillingStatement3 addBalAdjstmnt(BalanceAdjustment1 balAdjstmnt) {
        getBalAdjstmnt().add(balAdjstmnt);
        return this;
    }

    /**
     * Adds a new item to the svcAdjstmnt list.
     * @see #getSvcAdjstmnt()
     * 
     */
    public BillingStatement3 addSvcAdjstmnt(BillingServiceAdjustment1 svcAdjstmnt) {
        getSvcAdjstmnt().add(svcAdjstmnt);
        return this;
    }

}
