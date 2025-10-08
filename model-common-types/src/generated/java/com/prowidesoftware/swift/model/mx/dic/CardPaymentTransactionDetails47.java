
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "CardPaymentTransactionDetails47", propOrder = {
    "ccy",
    "ttlAmt",
    "cmltvAmt",
    "amtQlfr",
    "dtldAmt",
    "reqdAmt",
    "authrsdAmt",
    "invcAmt",
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
    "addtlInf",
    "iccRltdData"
})
public class CardPaymentTransactionDetails47 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "CmltvAmt")
    protected BigDecimal cmltvAmt;
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
    protected XMLGregorianCalendar vldtyDt;
    @XmlElement(name = "OnLineRsn")
    @XmlSchemaType(name = "string")
    protected List<OnLineReason1Code> onLineRsn;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion15 ccyConvsRslt;
    @XmlElement(name = "Instlmt")
    protected RecurringTransaction2 instlmt;
    @XmlElement(name = "AggtnTx")
    protected AggregationTransaction2 aggtnTx;
    @XmlElement(name = "PdctCdSetId")
    protected String pdctCdSetId;
    @XmlElement(name = "SaleItm")
    protected List<Product6> saleItm;
    @XmlElement(name = "DlvryLctn")
    protected String dlvryLctn;
    @XmlElement(name = "AddtlInf")
    protected List<IndustryData1> addtlInf;
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
    public CardPaymentTransactionDetails47 setCcy(String value) {
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
    public CardPaymentTransactionDetails47 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the cmltvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvAmt() {
        return cmltvAmt;
    }

    /**
     * Sets the value of the cmltvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails47 setCmltvAmt(BigDecimal value) {
        this.cmltvAmt = value;
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
    public CardPaymentTransactionDetails47 setAmtQlfr(TypeOfAmount8Code value) {
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
    public CardPaymentTransactionDetails47 setDtldAmt(DetailedAmount15 value) {
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
    public CardPaymentTransactionDetails47 setReqdAmt(BigDecimal value) {
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
    public CardPaymentTransactionDetails47 setAuthrsdAmt(BigDecimal value) {
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
    public CardPaymentTransactionDetails47 setInvcAmt(BigDecimal value) {
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
    public XMLGregorianCalendar getVldtyDt() {
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
    public CardPaymentTransactionDetails47 setVldtyDt(XMLGregorianCalendar value) {
        this.vldtyDt = value;
        return this;
    }

    /**
     * Gets the value of the onLineRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onLineRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLineRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnLineReason1Code }
     * 
     * 
     */
    public List<OnLineReason1Code> getOnLineRsn() {
        if (onLineRsn == null) {
            onLineRsn = new ArrayList<OnLineReason1Code>();
        }
        return this.onLineRsn;
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
    public CardPaymentTransactionDetails47 setUattnddLvlCtgy(String value) {
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
    public CardPaymentTransactionDetails47 setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion15 }
     *     
     */
    public CurrencyConversion15 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion15 }
     *     
     */
    public CardPaymentTransactionDetails47 setCcyConvsRslt(CurrencyConversion15 value) {
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
    public CardPaymentTransactionDetails47 setInstlmt(RecurringTransaction2 value) {
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
    public CardPaymentTransactionDetails47 setAggtnTx(AggregationTransaction2 value) {
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
    public CardPaymentTransactionDetails47 setPdctCdSetId(String value) {
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
     * {@link Product6 }
     * 
     * 
     */
    public List<Product6> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<Product6>();
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
    public CardPaymentTransactionDetails47 setDlvryLctn(String value) {
        this.dlvryLctn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryData1 }
     * 
     * 
     */
    public List<IndustryData1> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<IndustryData1>();
        }
        return this.addtlInf;
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
    public CardPaymentTransactionDetails47 setICCRltdData(byte[] value) {
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
     * Adds a new item to the onLineRsn list.
     * @see #getOnLineRsn()
     * 
     */
    public CardPaymentTransactionDetails47 addOnLineRsn(OnLineReason1Code onLineRsn) {
        getOnLineRsn().add(onLineRsn);
        return this;
    }

    /**
     * Adds a new item to the saleItm list.
     * @see #getSaleItm()
     * 
     */
    public CardPaymentTransactionDetails47 addSaleItm(Product6 saleItm) {
        getSaleItm().add(saleItm);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public CardPaymentTransactionDetails47 addAddtlInf(IndustryData1 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
