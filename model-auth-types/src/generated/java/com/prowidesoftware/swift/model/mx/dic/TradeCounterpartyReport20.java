
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to parties in the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCounterpartyReport20", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "brkr",
    "submitgAgt",
    "clrMmb",
    "bnfcry",
    "nttyRspnsblForRpt",
    "exctnAgt",
    "rltshRcrd"
})
public class TradeCounterpartyReport20 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected Counterparty45 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected Counterparty46 othrCtrPty;
    @XmlElement(name = "Brkr")
    protected OrganisationIdentification15Choice brkr;
    @XmlElement(name = "SubmitgAgt")
    protected OrganisationIdentification15Choice submitgAgt;
    @XmlElement(name = "ClrMmb")
    protected PartyIdentification248Choice clrMmb;
    @XmlElement(name = "Bnfcry")
    protected List<PartyIdentification248Choice> bnfcry;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;
    @XmlElement(name = "ExctnAgt")
    protected List<OrganisationIdentification15Choice> exctnAgt;
    @XmlElement(name = "RltshRcrd")
    protected List<TradeCounterpartyRelationshipRecord1> rltshRcrd;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty45 }
     *     
     */
    public Counterparty45 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty45 }
     *     
     */
    public TradeCounterpartyReport20 setRptgCtrPty(Counterparty45 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty46 }
     *     
     */
    public Counterparty46 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty46 }
     *     
     */
    public TradeCounterpartyReport20 setOthrCtrPty(Counterparty46 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeCounterpartyReport20 setBrkr(OrganisationIdentification15Choice value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeCounterpartyReport20 setSubmitgAgt(OrganisationIdentification15Choice value) {
        this.submitgAgt = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public TradeCounterpartyReport20 setClrMmb(PartyIdentification248Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification248Choice }
     * 
     * 
     */
    public List<PartyIdentification248Choice> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<PartyIdentification248Choice>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeCounterpartyReport20 setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
        return this;
    }

    /**
     * Gets the value of the exctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exctnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExctnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationIdentification15Choice }
     * 
     * 
     */
    public List<OrganisationIdentification15Choice> getExctnAgt() {
        if (exctnAgt == null) {
            exctnAgt = new ArrayList<OrganisationIdentification15Choice>();
        }
        return this.exctnAgt;
    }

    /**
     * Gets the value of the rltshRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltshRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltshRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeCounterpartyRelationshipRecord1 }
     * 
     * 
     */
    public List<TradeCounterpartyRelationshipRecord1> getRltshRcrd() {
        if (rltshRcrd == null) {
            rltshRcrd = new ArrayList<TradeCounterpartyRelationshipRecord1>();
        }
        return this.rltshRcrd;
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
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public TradeCounterpartyReport20 addBnfcry(PartyIdentification248Choice bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the exctnAgt list.
     * @see #getExctnAgt()
     * 
     */
    public TradeCounterpartyReport20 addExctnAgt(OrganisationIdentification15Choice exctnAgt) {
        getExctnAgt().add(exctnAgt);
        return this;
    }

    /**
     * Adds a new item to the rltshRcrd list.
     * @see #getRltshRcrd()
     * 
     */
    public TradeCounterpartyReport20 addRltshRcrd(TradeCounterpartyRelationshipRecord1 rltshRcrd) {
        getRltshRcrd().add(rltshRcrd);
        return this;
    }

}
