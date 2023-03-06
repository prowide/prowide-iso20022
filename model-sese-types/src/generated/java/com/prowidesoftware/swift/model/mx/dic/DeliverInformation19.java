
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverInformation19", propOrder = {
    "trfr",
    "trfrRegdAcct",
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
public class DeliverInformation19 {

    @XmlElement(name = "Trfr")
    protected PartyIdentification113 trfr;
    @XmlElement(name = "TrfrRegdAcct")
    protected Account24 trfrRegdAcct;
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
    protected DeliveringPartiesAndAccount17 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrf")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code physTrf;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters4 physTrfDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference8 clntRef;

    /**
     * Gets the value of the trfr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getTrfr() {
        return trfr;
    }

    /**
     * Sets the value of the trfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public DeliverInformation19 setTrfr(PartyIdentification113 value) {
        this.trfr = value;
        return this;
    }

    /**
     * Gets the value of the trfrRegdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account24 }
     *     
     */
    public Account24 getTrfrRegdAcct() {
        return trfrRegdAcct;
    }

    /**
     * Sets the value of the trfrRegdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account24 }
     *     
     */
    public DeliverInformation19 setTrfrRegdAcct(Account24 value) {
        this.trfrRegdAcct = value;
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
    public DeliverInformation19 setReqdSttlmDt(XMLGregorianCalendar value) {
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
    public DeliverInformation19 setSttlmAmt(ActiveCurrencyAndAmount value) {
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
    public DeliverInformation19 setStmpDty(StampDutyType2Code value) {
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
    public DeliverInformation19 setNetAmt(ActiveCurrencyAndAmount value) {
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
     *     {@link DeliveringPartiesAndAccount17 }
     *     
     */
    public DeliveringPartiesAndAccount17 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount17 }
     *     
     */
    public DeliverInformation19 setSttlmPtiesDtls(DeliveringPartiesAndAccount17 value) {
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
    public DeliverInformation19 setPhysTrf(PhysicalTransferType1Code value) {
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
    public DeliverInformation19 setPhysTrfDtls(DeliveryParameters4 value) {
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
    public DeliverInformation19 setClntRef(AdditionalReference8 value) {
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
    public DeliverInformation19 addIntrmyInf(Intermediary41 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the fees list.
     * @see #getFees()
     * 
     */
    public DeliverInformation19 addFees(Fees1 fees) {
        getFees().add(fees);
        return this;
    }

    /**
     * Adds a new item to the indvTax list.
     * @see #getIndvTax()
     * 
     */
    public DeliverInformation19 addIndvTax(Tax34 indvTax) {
        getIndvTax().add(indvTax);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public DeliverInformation19 addFXDtls(ForeignExchangeTerms33 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

}
