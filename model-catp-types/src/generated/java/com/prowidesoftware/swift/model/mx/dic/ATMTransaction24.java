
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
@XmlType(name = "ATMTransaction24", propOrder = {
    "txId",
    "rcncltnId",
    "cdtrLabl",
    "dbtrLabl",
    "trfIdr",
    "pmtRef",
    "txRspn",
    "actn",
    "acctFr",
    "prtctdAcctFr",
    "acctTo",
    "prtctdAcctTo",
    "ttlAuthrsdAmt",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "addtlChrg",
    "lmts",
    "reqdExctnDt",
    "propsdExctnDt",
    "instntTrfPrgm",
    "rcrngTrf",
    "authstnRslt",
    "iccRltdData",
    "cmd"
})
public class ATMTransaction24 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "CdtrLabl")
    protected String cdtrLabl;
    @XmlElement(name = "DbtrLabl")
    protected String dbtrLabl;
    @XmlElement(name = "TrfIdr")
    protected String trfIdr;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType7 txRspn;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;
    @XmlElement(name = "AcctFr")
    protected CardAccount13 acctFr;
    @XmlElement(name = "PrtctdAcctFr")
    protected ContentInformationType10 prtctdAcctFr;
    @XmlElement(name = "AcctTo")
    protected List<CardAccount13> acctTo;
    @XmlElement(name = "PrtctdAcctTo")
    protected ContentInformationType10 prtctdAcctTo;
    @XmlElement(name = "TtlAuthrsdAmt", required = true)
    protected AmountAndCurrency1 ttlAuthrsdAmt;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount17 dtldReqdAmt;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount18> addtlChrg;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts6 lmts;
    @XmlElement(name = "ReqdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "PropsdExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar propsdExctnDt;
    @XmlElement(name = "InstntTrfPrgm")
    protected String instntTrfPrgm;
    @XmlElement(name = "RcrngTrf")
    protected RecurringTransaction3 rcrngTrf;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult13 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

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
    public ATMTransaction24 setTxId(TransactionIdentifier1 value) {
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
    public ATMTransaction24 setRcncltnId(String value) {
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
    public ATMTransaction24 setCdtrLabl(String value) {
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
    public ATMTransaction24 setDbtrLabl(String value) {
        this.dbtrLabl = value;
        return this;
    }

    /**
     * Gets the value of the trfIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfIdr() {
        return trfIdr;
    }

    /**
     * Sets the value of the trfIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction24 setTrfIdr(String value) {
        this.trfIdr = value;
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
    public ATMTransaction24 setPmtRef(String value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public ATMTransaction24 setTxRspn(ResponseType7 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action7>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount13 }
     *     
     */
    public CardAccount13 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount13 }
     *     
     */
    public ATMTransaction24 setAcctFr(CardAccount13 value) {
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
    public ATMTransaction24 setPrtctdAcctFr(ContentInformationType10 value) {
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
     * {@link CardAccount13 }
     * 
     * 
     */
    public List<CardAccount13> getAcctTo() {
        if (acctTo == null) {
            acctTo = new ArrayList<CardAccount13>();
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
    public ATMTransaction24 setPrtctdAcctTo(ContentInformationType10 value) {
        this.prtctdAcctTo = value;
        return this;
    }

    /**
     * Gets the value of the ttlAuthrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlAuthrsdAmt() {
        return ttlAuthrsdAmt;
    }

    /**
     * Sets the value of the ttlAuthrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public ATMTransaction24 setTtlAuthrsdAmt(AmountAndCurrency1 value) {
        this.ttlAuthrsdAmt = value;
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
    public ATMTransaction24 setTtlReqdAmt(BigDecimal value) {
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
    public ATMTransaction24 setDtldReqdAmt(DetailedAmount17 value) {
        this.dtldReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     */
    public List<DetailedAmount18> getAddtlChrg() {
        if (addtlChrg == null) {
            addtlChrg = new ArrayList<DetailedAmount18>();
        }
        return this.addtlChrg;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public ATMTransactionAmounts6 getLmts() {
        return lmts;
    }

    /**
     * Sets the value of the lmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public ATMTransaction24 setLmts(ATMTransactionAmounts6 value) {
        this.lmts = value;
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
    public ATMTransaction24 setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the propsdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPropsdExctnDt() {
        return propsdExctnDt;
    }

    /**
     * Sets the value of the propsdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction24 setPropsdExctnDt(XMLGregorianCalendar value) {
        this.propsdExctnDt = value;
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
    public ATMTransaction24 setInstntTrfPrgm(String value) {
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
    public ATMTransaction24 setRcrngTrf(RecurringTransaction3 value) {
        this.rcrngTrf = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult13 }
     *     
     */
    public AuthorisationResult13 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult13 }
     *     
     */
    public ATMTransaction24 setAuthstnRslt(AuthorisationResult13 value) {
        this.authstnRslt = value;
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
    public ATMTransaction24 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
        return this;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand7 }
     * 
     * 
     */
    public List<ATMCommand7> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<ATMCommand7>();
        }
        return this.cmd;
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public ATMTransaction24 addActn(Action7 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the acctTo list.
     * @see #getAcctTo()
     * 
     */
    public ATMTransaction24 addAcctTo(CardAccount13 acctTo) {
        getAcctTo().add(acctTo);
        return this;
    }

    /**
     * Adds a new item to the addtlChrg list.
     * @see #getAddtlChrg()
     * 
     */
    public ATMTransaction24 addAddtlChrg(DetailedAmount18 addtlChrg) {
        getAddtlChrg().add(addtlChrg);
        return this;
    }

    /**
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMTransaction24 addCmd(ATMCommand7 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
