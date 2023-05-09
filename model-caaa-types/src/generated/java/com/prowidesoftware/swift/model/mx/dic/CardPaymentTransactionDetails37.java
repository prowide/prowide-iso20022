
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Details of the transaction in the completion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails37", propOrder = {
    "ccy",
    "ttlAmt",
    "amtQlfr",
    "dtldAmt",
    "reqdAmt",
    "authrsdAmt",
    "invcAmt",
    "vldtyDt",
    "uattnddLvlCtgy",
    "acctTp",
    "ccyConvsRslt",
    "instlmt",
    "aggtnTx",
    "pdctCdSetId",
    "saleItm",
    "dlvryLctn",
    "cardPmtInvc",
    "iccRltdData"
})
public class CardPaymentTransactionDetails37 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount8Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount15 dtldAmt;
    @XmlElement(name = "ReqdAmt")
    protected BigDecimal reqdAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected BigDecimal authrsdAmt;
    @XmlElement(name = "InvcAmt")
    protected BigDecimal invcAmt;
    @XmlElement(name = "VldtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldtyDt;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion13 ccyConvsRslt;
    @XmlElement(name = "Instlmt")
    protected RecurringTransaction2 instlmt;
    @XmlElement(name = "AggtnTx")
    protected AggregationTransaction2 aggtnTx;
    @XmlElement(name = "PdctCdSetId")
    protected String pdctCdSetId;
    @XmlElement(name = "SaleItm")
    protected List<Product3> saleItm;
    @XmlElement(name = "DlvryLctn")
    protected String dlvryLctn;
    @XmlElement(name = "CardPmtInvc")
    protected CardPaymentInvoice2 cardPmtInvc;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

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
    public CardPaymentTransactionDetails37 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails37 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount8Code }
     *     
     */
    public TypeOfAmount8Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount8Code }
     *     
     */
    public CardPaymentTransactionDetails37 setAmtQlfr(TypeOfAmount8Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount15 }
     *     
     */
    public DetailedAmount15 getDtldAmt() {
        return dtldAmt;
    }

    /**
     * Sets the value of the dtldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount15 }
     *     
     */
    public CardPaymentTransactionDetails37 setDtldAmt(DetailedAmount15 value) {
        this.dtldAmt = value;
        return this;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails37 setReqdAmt(BigDecimal value) {
        this.reqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the authrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthrsdAmt() {
        return authrsdAmt;
    }

    /**
     * Sets the value of the authrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails37 setAuthrsdAmt(BigDecimal value) {
        this.authrsdAmt = value;
        return this;
    }

    /**
     * Gets the value of the invcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvcAmt() {
        return invcAmt;
    }

    /**
     * Sets the value of the invcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails37 setInvcAmt(BigDecimal value) {
        this.invcAmt = value;
        return this;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails37 setVldtyDt(LocalDate value) {
        this.vldtyDt = value;
        return this;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails37 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardPaymentTransactionDetails37 setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion13 }
     *     
     */
    public CurrencyConversion13 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion13 }
     *     
     */
    public CardPaymentTransactionDetails37 setCcyConvsRslt(CurrencyConversion13 value) {
        this.ccyConvsRslt = value;
        return this;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction2 }
     *     
     */
    public RecurringTransaction2 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction2 }
     *     
     */
    public CardPaymentTransactionDetails37 setInstlmt(RecurringTransaction2 value) {
        this.instlmt = value;
        return this;
    }

    /**
     * Gets the value of the aggtnTx property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationTransaction2 }
     *     
     */
    public AggregationTransaction2 getAggtnTx() {
        return aggtnTx;
    }

    /**
     * Sets the value of the aggtnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationTransaction2 }
     *     
     */
    public CardPaymentTransactionDetails37 setAggtnTx(AggregationTransaction2 value) {
        this.aggtnTx = value;
        return this;
    }

    /**
     * Gets the value of the pdctCdSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCdSetId() {
        return pdctCdSetId;
    }

    /**
     * Sets the value of the pdctCdSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails37 setPdctCdSetId(String value) {
        this.pdctCdSetId = value;
        return this;
    }

    /**
     * Gets the value of the saleItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product3 }
     * 
     * 
     * @return
     *     The value of the saleItm property.
     */
    public List<Product3> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<>();
        }
        return this.saleItm;
    }

    /**
     * Gets the value of the dlvryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryLctn() {
        return dlvryLctn;
    }

    /**
     * Sets the value of the dlvryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails37 setDlvryLctn(String value) {
        this.dlvryLctn = value;
        return this;
    }

    /**
     * Gets the value of the cardPmtInvc property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentInvoice2 }
     *     
     */
    public CardPaymentInvoice2 getCardPmtInvc() {
        return cardPmtInvc;
    }

    /**
     * Sets the value of the cardPmtInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentInvoice2 }
     *     
     */
    public CardPaymentTransactionDetails37 setCardPmtInvc(CardPaymentInvoice2 value) {
        this.cardPmtInvc = value;
        return this;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardPaymentTransactionDetails37 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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
     * Adds a new item to the saleItm list.
     * @see #getSaleItm()
     * 
     */
    public CardPaymentTransactionDetails37 addSaleItm(Product3 saleItm) {
        getSaleItm().add(saleItm);
        return this;
    }

}
