
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
 * Describes the events that occurred for one transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityReportItems2", propOrder = {
    "txId",
    "usrTxRef",
    "rptdNtty",
    "rptdItm",
    "pdgReqForActn"
})
public class ActivityReportItems2 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "RptdNtty", required = true)
    protected BICIdentification1 rptdNtty;
    @XmlElement(name = "RptdItm", required = true)
    protected List<ActivityDetails1> rptdItm;
    @XmlElement(name = "PdgReqForActn")
    protected List<PendingActivity2> pdgReqForActn;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActivityReportItems2 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification5 }
     * 
     * 
     * @return
     *     The value of the usrTxRef property.
     */
    public List<DocumentIdentification5> getUsrTxRef() {
        if (usrTxRef == null) {
            usrTxRef = new ArrayList<>();
        }
        return this.usrTxRef;
    }

    /**
     * Gets the value of the rptdNtty property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getRptdNtty() {
        return rptdNtty;
    }

    /**
     * Sets the value of the rptdNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public ActivityReportItems2 setRptdNtty(BICIdentification1 value) {
        this.rptdNtty = value;
        return this;
    }

    /**
     * Gets the value of the rptdItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityDetails1 }
     * 
     * 
     * @return
     *     The value of the rptdItm property.
     */
    public List<ActivityDetails1> getRptdItm() {
        if (rptdItm == null) {
            rptdItm = new ArrayList<>();
        }
        return this.rptdItm;
    }

    /**
     * Gets the value of the pdgReqForActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgReqForActn property.
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
     * {@link PendingActivity2 }
     * 
     * 
     * @return
     *     The value of the pdgReqForActn property.
     */
    public List<PendingActivity2> getPdgReqForActn() {
        if (pdgReqForActn == null) {
            pdgReqForActn = new ArrayList<>();
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
     * Adds a new item to the usrTxRef list.
     * @see #getUsrTxRef()
     * 
     */
    public ActivityReportItems2 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

    /**
     * Adds a new item to the rptdItm list.
     * @see #getRptdItm()
     * 
     */
    public ActivityReportItems2 addRptdItm(ActivityDetails1 rptdItm) {
        getRptdItm().add(rptdItm);
        return this;
    }

    /**
     * Adds a new item to the pdgReqForActn list.
     * @see #getPdgReqForActn()
     * 
     */
    public ActivityReportItems2 addPdgReqForActn(PendingActivity2 pdgReqForActn) {
        getPdgReqForActn().add(pdgReqForActn);
        return this;
    }

}
