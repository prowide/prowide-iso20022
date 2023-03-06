
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment obligation contracted between two financial institutions related to the financing of a commercial transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentObligation2", propOrder = {
    "oblgrBk",
    "rcptBk",
    "pmtOblgtnAmt",
    "chrgs",
    "xpryDt",
    "aplblRules",
    "aplblLaw",
    "plcOfJursdctn",
    "pmtTerms",
    "sttlmTerms"
})
public class PaymentObligation2 {

    @XmlElement(name = "OblgrBk", required = true)
    protected BICIdentification1 oblgrBk;
    @XmlElement(name = "RcptBk", required = true)
    protected BICIdentification1 rcptBk;
    @XmlElement(name = "PmtOblgtnAmt", required = true)
    protected AmountOrPercentage2Choice pmtOblgtnAmt;
    @XmlElement(name = "Chrgs")
    protected List<Charges5> chrgs;
    @XmlElement(name = "XpryDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "AplblRules")
    protected BPOApplicableRules1Choice aplblRules;
    @XmlElement(name = "AplblLaw")
    protected String aplblLaw;
    @XmlElement(name = "PlcOfJursdctn")
    protected Location2 plcOfJursdctn;
    @XmlElement(name = "PmtTerms")
    protected List<PaymentTerms4> pmtTerms;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms3 sttlmTerms;

    /**
     * Gets the value of the oblgrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getOblgrBk() {
        return oblgrBk;
    }

    /**
     * Sets the value of the oblgrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public PaymentObligation2 setOblgrBk(BICIdentification1 value) {
        this.oblgrBk = value;
        return this;
    }

    /**
     * Gets the value of the rcptBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getRcptBk() {
        return rcptBk;
    }

    /**
     * Sets the value of the rcptBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public PaymentObligation2 setRcptBk(BICIdentification1 value) {
        this.rcptBk = value;
        return this;
    }

    /**
     * Gets the value of the pmtOblgtnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public AmountOrPercentage2Choice getPmtOblgtnAmt() {
        return pmtOblgtnAmt;
    }

    /**
     * Sets the value of the pmtOblgtnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public PaymentObligation2 setPmtOblgtnAmt(AmountOrPercentage2Choice value) {
        this.pmtOblgtnAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges5 }
     * 
     * 
     */
    public List<Charges5> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<Charges5>();
        }
        return this.chrgs;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentObligation2 setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the aplblRules property.
     * 
     * @return
     *     possible object is
     *     {@link BPOApplicableRules1Choice }
     *     
     */
    public BPOApplicableRules1Choice getAplblRules() {
        return aplblRules;
    }

    /**
     * Sets the value of the aplblRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPOApplicableRules1Choice }
     *     
     */
    public PaymentObligation2 setAplblRules(BPOApplicableRules1Choice value) {
        this.aplblRules = value;
        return this;
    }

    /**
     * Gets the value of the aplblLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Sets the value of the aplblLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentObligation2 setAplblLaw(String value) {
        this.aplblLaw = value;
        return this;
    }

    /**
     * Gets the value of the plcOfJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link Location2 }
     *     
     */
    public Location2 getPlcOfJursdctn() {
        return plcOfJursdctn;
    }

    /**
     * Sets the value of the plcOfJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location2 }
     *     
     */
    public PaymentObligation2 setPlcOfJursdctn(Location2 value) {
        this.plcOfJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms4 }
     * 
     * 
     */
    public List<PaymentTerms4> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<PaymentTerms4>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms3 }
     *     
     */
    public SettlementTerms3 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms3 }
     *     
     */
    public PaymentObligation2 setSttlmTerms(SettlementTerms3 value) {
        this.sttlmTerms = value;
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
     * Adds a new item to the chrgs list.
     * @see #getChrgs()
     * 
     */
    public PaymentObligation2 addChrgs(Charges5 chrgs) {
        getChrgs().add(chrgs);
        return this;
    }

    /**
     * Adds a new item to the pmtTerms list.
     * @see #getPmtTerms()
     * 
     */
    public PaymentObligation2 addPmtTerms(PaymentTerms4 pmtTerms) {
        getPmtTerms().add(pmtTerms);
        return this;
    }

}
