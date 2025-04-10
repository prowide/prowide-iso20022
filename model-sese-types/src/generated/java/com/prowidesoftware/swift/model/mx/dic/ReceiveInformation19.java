
package com.prowidesoftware.swift.model.mx.dic;

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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveInformation19", propOrder = {
    "trfee",
    "trfeeRegdAcct",
    "intrmyInf",
    "reqdSttlmDt",
    "sttlmAmt",
    "stmpDty",
    "netAmt",
    "fees",
    "indvTax",
    "fxDtls",
    "sttlmPtiesDtls",
    "physTrf",
    "physTrfDtls",
    "clntRef"
})
public class ReceiveInformation19 {

    @XmlElement(name = "Trfee")
    protected PartyIdentification113 trfee;
    @XmlElement(name = "TrfeeRegdAcct")
    protected Account24 trfeeRegdAcct;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary41> intrmyInf;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "StmpDty")
    @XmlSchemaType(name = "string")
    protected StampDutyType2Code stmpDty;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "Fees")
    protected List<Fees1> fees;
    @XmlElement(name = "IndvTax")
    protected List<Tax34> indvTax;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms33> fxDtls;
    @XmlElement(name = "SttlmPtiesDtls")
    protected ReceivingPartiesAndAccount17 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrf")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code physTrf;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters4 physTrfDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference8 clntRef;

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getTrfee() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public ReceiveInformation19 setTrfee(PartyIdentification113 value) {
        this.trfee = value;
        return this;
    }

    /**
     * Gets the value of the trfeeRegdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account24 }
     *     
     */
    public Account24 getTrfeeRegdAcct() {
        return trfeeRegdAcct;
    }

    /**
     * Sets the value of the trfeeRegdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account24 }
     *     
     */
    public ReceiveInformation19 setTrfeeRegdAcct(Account24 value) {
        this.trfeeRegdAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary41 }
     * 
     * 
     */
    public List<Intermediary41> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary41>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReceiveInformation19 setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ReceiveInformation19 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link StampDutyType2Code }
     *     
     */
    public StampDutyType2Code getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link StampDutyType2Code }
     *     
     */
    public ReceiveInformation19 setStmpDty(StampDutyType2Code value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ReceiveInformation19 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fees1 }
     * 
     * 
     */
    public List<Fees1> getFees() {
        if (fees == null) {
            fees = new ArrayList<Fees1>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax34 }
     * 
     * 
     */
    public List<Tax34> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<Tax34>();
        }
        return this.indvTax;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms33 }
     * 
     * 
     */
    public List<ForeignExchangeTerms33> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms33>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount17 }
     *     
     */
    public ReceivingPartiesAndAccount17 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount17 }
     *     
     */
    public ReceiveInformation19 setSttlmPtiesDtls(ReceivingPartiesAndAccount17 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the physTrf property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public PhysicalTransferType1Code getPhysTrf() {
        return physTrf;
    }

    /**
     * Sets the value of the physTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public ReceiveInformation19 setPhysTrf(PhysicalTransferType1Code value) {
        this.physTrf = value;
        return this;
    }

    /**
     * Gets the value of the physTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public DeliveryParameters4 getPhysTrfDtls() {
        return physTrfDtls;
    }

    /**
     * Sets the value of the physTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public ReceiveInformation19 setPhysTrfDtls(DeliveryParameters4 value) {
        this.physTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference8 }
     *     
     */
    public AdditionalReference8 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference8 }
     *     
     */
    public ReceiveInformation19 setClntRef(AdditionalReference8 value) {
        this.clntRef = value;
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
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public ReceiveInformation19 addIntrmyInf(Intermediary41 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the fees list.
     * @see #getFees()
     * 
     */
    public ReceiveInformation19 addFees(Fees1 fees) {
        getFees().add(fees);
        return this;
    }

    /**
     * Adds a new item to the indvTax list.
     * @see #getIndvTax()
     * 
     */
    public ReceiveInformation19 addIndvTax(Tax34 indvTax) {
        getIndvTax().add(indvTax);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public ReceiveInformation19 addFXDtls(ForeignExchangeTerms33 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

}
