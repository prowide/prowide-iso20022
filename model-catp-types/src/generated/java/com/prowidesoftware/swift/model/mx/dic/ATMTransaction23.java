
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
 * Transfer information for the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction23", propOrder = {
    "txId",
    "rcncltnId",
    "cdtrLabl",
    "dbtrLabl",
    "pmtRef",
    "acctFr",
    "prtctdAcctFr",
    "acctTo",
    "prtctdAcctTo",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "reqdExctnDt",
    "instntTrfPrgm",
    "rcrngTrf",
    "reqdRct",
    "iccRltdData"
})
public class ATMTransaction23 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "CdtrLabl")
    protected String cdtrLabl;
    @XmlElement(name = "DbtrLabl")
    protected String dbtrLabl;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "AcctFr")
    protected CardAccount7 acctFr;
    @XmlElement(name = "PrtctdAcctFr")
    protected ContentInformationType10 prtctdAcctFr;
    @XmlElement(name = "AcctTo")
    protected List<CardAccount7> acctTo;
    @XmlElement(name = "PrtctdAcctTo")
    protected ContentInformationType10 prtctdAcctTo;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount17 dtldReqdAmt;
    @XmlElement(name = "ReqdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "InstntTrfPrgm")
    protected String instntTrfPrgm;
    @XmlElement(name = "RcrngTrf")
    protected RecurringTransaction3 rcrngTrf;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public ATMTransaction23 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction23 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the cdtrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrLabl() {
        return cdtrLabl;
    }

    /**
     * Sets the value of the cdtrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction23 setCdtrLabl(String value) {
        this.cdtrLabl = value;
        return this;
    }

    /**
     * Gets the value of the dbtrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrLabl() {
        return dbtrLabl;
    }

    /**
     * Sets the value of the dbtrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction23 setDbtrLabl(String value) {
        this.dbtrLabl = value;
        return this;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction23 setPmtRef(String value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount7 }
     *     
     */
    public CardAccount7 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount7 }
     *     
     */
    public ATMTransaction23 setAcctFr(CardAccount7 value) {
        this.acctFr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdAcctFr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctFr() {
        return prtctdAcctFr;
    }

    /**
     * Sets the value of the prtctdAcctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMTransaction23 setPrtctdAcctFr(ContentInformationType10 value) {
        this.prtctdAcctFr = value;
        return this;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount7 }
     * 
     * 
     */
    public List<CardAccount7> getAcctTo() {
        if (acctTo == null) {
            acctTo = new ArrayList<CardAccount7>();
        }
        return this.acctTo;
    }

    /**
     * Gets the value of the prtctdAcctTo property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctTo() {
        return prtctdAcctTo;
    }

    /**
     * Sets the value of the prtctdAcctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMTransaction23 setPrtctdAcctTo(ContentInformationType10 value) {
        this.prtctdAcctTo = value;
        return this;
    }

    /**
     * Gets the value of the ttlReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Sets the value of the ttlReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransaction23 setTtlReqdAmt(BigDecimal value) {
        this.ttlReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount17 }
     *     
     */
    public DetailedAmount17 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount17 }
     *     
     */
    public ATMTransaction23 setDtldReqdAmt(DetailedAmount17 value) {
        this.dtldReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction23 setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the instntTrfPrgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstntTrfPrgm() {
        return instntTrfPrgm;
    }

    /**
     * Sets the value of the instntTrfPrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction23 setInstntTrfPrgm(String value) {
        this.instntTrfPrgm = value;
        return this;
    }

    /**
     * Gets the value of the rcrngTrf property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction3 }
     *     
     */
    public RecurringTransaction3 getRcrngTrf() {
        return rcrngTrf;
    }

    /**
     * Sets the value of the rcrngTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction3 }
     *     
     */
    public ATMTransaction23 setRcrngTrf(RecurringTransaction3 value) {
        this.rcrngTrf = value;
        return this;
    }

    /**
     * Gets the value of the reqdRct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdRct() {
        return reqdRct;
    }

    /**
     * Sets the value of the reqdRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction23 setReqdRct(Boolean value) {
        this.reqdRct = value;
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
    public ATMTransaction23 setICCRltdData(byte[] value) {
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
     * Adds a new item to the acctTo list.
     * @see #getAcctTo()
     * 
     */
    public ATMTransaction23 addAcctTo(CardAccount7 acctTo) {
        getAcctTo().add(acctTo);
        return this;
    }

}
