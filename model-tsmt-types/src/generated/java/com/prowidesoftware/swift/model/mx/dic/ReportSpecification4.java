
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
 * Specifies the parameters for which a transaction report must be generated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSpecification4", propOrder = {
    "txId",
    "txSts",
    "submitrTxRef",
    "nttiesToBeRptd",
    "crspdt",
    "submitgBk",
    "oblgrBk",
    "buyr",
    "sellr",
    "buyrCtry",
    "sellrCtry",
    "crspdtCtry",
    "pdgReqForActn"
})
public class ReportSpecification4 {

    @XmlElement(name = "TxId")
    protected List<String> txId;
    @XmlElement(name = "TxSts")
    protected List<TransactionStatus4> txSts;
    @XmlElement(name = "SubmitrTxRef")
    protected List<String> submitrTxRef;
    @XmlElement(name = "NttiesToBeRptd")
    protected List<BICIdentification1> nttiesToBeRptd;
    @XmlElement(name = "Crspdt")
    protected List<BICIdentification1> crspdt;
    @XmlElement(name = "SubmitgBk")
    protected List<BICIdentification1> submitgBk;
    @XmlElement(name = "OblgrBk")
    protected List<BICIdentification1> oblgrBk;
    @XmlElement(name = "Buyr")
    protected List<PartyIdentification28> buyr;
    @XmlElement(name = "Sellr")
    protected List<PartyIdentification28> sellr;
    @XmlElement(name = "BuyrCtry")
    protected List<String> buyrCtry;
    @XmlElement(name = "SellrCtry")
    protected List<String> sellrCtry;
    @XmlElement(name = "CrspdtCtry")
    protected List<String> crspdtCtry;
    @XmlElement(name = "PdgReqForActn")
    protected List<PendingActivity1> pdgReqForActn;

    /**
     * Gets the value of the txId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxId() {
        if (txId == null) {
            txId = new ArrayList<String>();
        }
        return this.txId;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionStatus4 }
     * 
     * 
     */
    public List<TransactionStatus4> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<TransactionStatus4>();
        }
        return this.txSts;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubmitrTxRef() {
        if (submitrTxRef == null) {
            submitrTxRef = new ArrayList<String>();
        }
        return this.submitrTxRef;
    }

    /**
     * Gets the value of the nttiesToBeRptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nttiesToBeRptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNttiesToBeRptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getNttiesToBeRptd() {
        if (nttiesToBeRptd == null) {
            nttiesToBeRptd = new ArrayList<BICIdentification1>();
        }
        return this.nttiesToBeRptd;
    }

    /**
     * Gets the value of the crspdt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crspdt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrspdt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getCrspdt() {
        if (crspdt == null) {
            crspdt = new ArrayList<BICIdentification1>();
        }
        return this.crspdt;
    }

    /**
     * Gets the value of the submitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getSubmitgBk() {
        if (submitgBk == null) {
            submitgBk = new ArrayList<BICIdentification1>();
        }
        return this.submitgBk;
    }

    /**
     * Gets the value of the oblgrBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oblgrBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOblgrBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getOblgrBk() {
        if (oblgrBk == null) {
            oblgrBk = new ArrayList<BICIdentification1>();
        }
        return this.oblgrBk;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification28 }
     * 
     * 
     */
    public List<PartyIdentification28> getBuyr() {
        if (buyr == null) {
            buyr = new ArrayList<PartyIdentification28>();
        }
        return this.buyr;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification28 }
     * 
     * 
     */
    public List<PartyIdentification28> getSellr() {
        if (sellr == null) {
            sellr = new ArrayList<PartyIdentification28>();
        }
        return this.sellr;
    }

    /**
     * Gets the value of the buyrCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyrCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBuyrCtry() {
        if (buyrCtry == null) {
            buyrCtry = new ArrayList<String>();
        }
        return this.buyrCtry;
    }

    /**
     * Gets the value of the sellrCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellrCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellrCtry() {
        if (sellrCtry == null) {
            sellrCtry = new ArrayList<String>();
        }
        return this.sellrCtry;
    }

    /**
     * Gets the value of the crspdtCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crspdtCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrspdtCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCrspdtCtry() {
        if (crspdtCtry == null) {
            crspdtCtry = new ArrayList<String>();
        }
        return this.crspdtCtry;
    }

    /**
     * Gets the value of the pdgReqForActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdgReqForActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgReqForActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingActivity1 }
     * 
     * 
     */
    public List<PendingActivity1> getPdgReqForActn() {
        if (pdgReqForActn == null) {
            pdgReqForActn = new ArrayList<PendingActivity1>();
        }
        return this.pdgReqForActn;
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
     * Adds a new item to the txId list.
     * @see #getTxId()
     * 
     */
    public ReportSpecification4 addTxId(String txId) {
        getTxId().add(txId);
        return this;
    }

    /**
     * Adds a new item to the txSts list.
     * @see #getTxSts()
     * 
     */
    public ReportSpecification4 addTxSts(TransactionStatus4 txSts) {
        getTxSts().add(txSts);
        return this;
    }

    /**
     * Adds a new item to the submitrTxRef list.
     * @see #getSubmitrTxRef()
     * 
     */
    public ReportSpecification4 addSubmitrTxRef(String submitrTxRef) {
        getSubmitrTxRef().add(submitrTxRef);
        return this;
    }

    /**
     * Adds a new item to the nttiesToBeRptd list.
     * @see #getNttiesToBeRptd()
     * 
     */
    public ReportSpecification4 addNttiesToBeRptd(BICIdentification1 nttiesToBeRptd) {
        getNttiesToBeRptd().add(nttiesToBeRptd);
        return this;
    }

    /**
     * Adds a new item to the crspdt list.
     * @see #getCrspdt()
     * 
     */
    public ReportSpecification4 addCrspdt(BICIdentification1 crspdt) {
        getCrspdt().add(crspdt);
        return this;
    }

    /**
     * Adds a new item to the submitgBk list.
     * @see #getSubmitgBk()
     * 
     */
    public ReportSpecification4 addSubmitgBk(BICIdentification1 submitgBk) {
        getSubmitgBk().add(submitgBk);
        return this;
    }

    /**
     * Adds a new item to the oblgrBk list.
     * @see #getOblgrBk()
     * 
     */
    public ReportSpecification4 addOblgrBk(BICIdentification1 oblgrBk) {
        getOblgrBk().add(oblgrBk);
        return this;
    }

    /**
     * Adds a new item to the buyr list.
     * @see #getBuyr()
     * 
     */
    public ReportSpecification4 addBuyr(PartyIdentification28 buyr) {
        getBuyr().add(buyr);
        return this;
    }

    /**
     * Adds a new item to the sellr list.
     * @see #getSellr()
     * 
     */
    public ReportSpecification4 addSellr(PartyIdentification28 sellr) {
        getSellr().add(sellr);
        return this;
    }

    /**
     * Adds a new item to the buyrCtry list.
     * @see #getBuyrCtry()
     * 
     */
    public ReportSpecification4 addBuyrCtry(String buyrCtry) {
        getBuyrCtry().add(buyrCtry);
        return this;
    }

    /**
     * Adds a new item to the sellrCtry list.
     * @see #getSellrCtry()
     * 
     */
    public ReportSpecification4 addSellrCtry(String sellrCtry) {
        getSellrCtry().add(sellrCtry);
        return this;
    }

    /**
     * Adds a new item to the crspdtCtry list.
     * @see #getCrspdtCtry()
     * 
     */
    public ReportSpecification4 addCrspdtCtry(String crspdtCtry) {
        getCrspdtCtry().add(crspdtCtry);
        return this;
    }

    /**
     * Adds a new item to the pdgReqForActn list.
     * @see #getPdgReqForActn()
     * 
     */
    public ReportSpecification4 addPdgReqForActn(PendingActivity1 pdgReqForActn) {
        getPdgReqForActn().add(pdgReqForActn);
        return this;
    }

}
