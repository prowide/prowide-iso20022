
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the transaction in the authorisation request in a batch.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails31", propOrder = {
    "ccy",
    "ttlAmt",
    "amtQlfr",
    "dtldAmt",
    "vldtyDt",
    "onLineRsn",
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
public class CardPaymentTransactionDetails31 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount1Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount15 dtldAmt;
    @XmlElement(name = "VldtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtyDt;
    @XmlElement(name = "OnLineRsn")
    @XmlSchemaType(name = "string")
    protected OnLineReason1Code onLineRsn;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion8 ccyConvsRslt;
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
    public CardPaymentTransactionDetails31 setCcy(String value) {
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
    public CardPaymentTransactionDetails31 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public TypeOfAmount1Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public CardPaymentTransactionDetails31 setAmtQlfr(TypeOfAmount1Code value) {
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
    public CardPaymentTransactionDetails31 setDtldAmt(DetailedAmount15 value) {
        this.dtldAmt = value;
        return this;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CardPaymentTransactionDetails31 setVldtyDt(XMLGregorianCalendar value) {
        this.vldtyDt = value;
        return this;
    }

    /**
     * Gets the value of the onLineRsn property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineReason1Code }
     *     
     */
    public OnLineReason1Code getOnLineRsn() {
        return onLineRsn;
    }

    /**
     * Sets the value of the onLineRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineReason1Code }
     *     
     */
    public CardPaymentTransactionDetails31 setOnLineRsn(OnLineReason1Code value) {
        this.onLineRsn = value;
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
    public CardPaymentTransactionDetails31 setUattnddLvlCtgy(String value) {
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
    public CardPaymentTransactionDetails31 setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion8 }
     *     
     */
    public CurrencyConversion8 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion8 }
     *     
     */
    public CardPaymentTransactionDetails31 setCcyConvsRslt(CurrencyConversion8 value) {
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
    public CardPaymentTransactionDetails31 setInstlmt(RecurringTransaction2 value) {
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
    public CardPaymentTransactionDetails31 setAggtnTx(AggregationTransaction2 value) {
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
    public CardPaymentTransactionDetails31 setPdctCdSetId(String value) {
        this.pdctCdSetId = value;
        return this;
    }

    /**
     * Gets the value of the saleItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleItm property.
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
     */
    public List<Product3> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<Product3>();
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
    public CardPaymentTransactionDetails31 setDlvryLctn(String value) {
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
    public CardPaymentTransactionDetails31 setCardPmtInvc(CardPaymentInvoice2 value) {
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
    public CardPaymentTransactionDetails31 setICCRltdData(byte[] value) {
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
    public CardPaymentTransactionDetails31 addSaleItm(Product3 saleItm) {
        getSaleItm().add(saleItm);
        return this;
    }

}
