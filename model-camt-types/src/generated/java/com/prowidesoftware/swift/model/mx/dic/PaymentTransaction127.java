
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides further details on the reference and status on the original transactions, included in the original instruction, to which the cancellation request message applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction127", propOrder = {
    "cxlStsId",
    "rslvdCase",
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlClrSysRef",
    "orgnlUETR",
    "txCxlSts",
    "cxlStsRsnInf",
    "rsltnRltdInf",
    "orgnlIntrBkSttlmAmt",
    "orgnlIntrBkSttlmDt",
    "assgnr",
    "assgne",
    "orgnlTxRef"
})
public class PaymentTransaction127 {

    @XmlElement(name = "CxlStsId")
    protected String cxlStsId;
    @XmlElement(name = "RslvdCase")
    protected Case5 rslvdCase;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlClrSysRef")
    protected String orgnlClrSysRef;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "TxCxlSts")
    @XmlSchemaType(name = "string")
    protected CancellationIndividualStatus1Code txCxlSts;
    @XmlElement(name = "CxlStsRsnInf")
    protected List<CancellationStatusReason4> cxlStsRsnInf;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionData2 rsltnRltdInf;
    @XmlElement(name = "OrgnlIntrBkSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlIntrBkSttlmAmt;
    @XmlElement(name = "OrgnlIntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlIntrBkSttlmDt;
    @XmlElement(name = "Assgnr")
    protected Party40Choice assgnr;
    @XmlElement(name = "Assgne")
    protected Party40Choice assgne;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference31 orgnlTxRef;

    /**
     * Gets the value of the cxlStsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlStsId() {
        return cxlStsId;
    }

    /**
     * Sets the value of the cxlStsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction127 setCxlStsId(String value) {
        this.cxlStsId = value;
        return this;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public PaymentTransaction127 setRslvdCase(Case5 value) {
        this.rslvdCase = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public PaymentTransaction127 setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction127 setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction127 setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction127 setOrgnlTxId(String value) {
        this.orgnlTxId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlClrSysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlClrSysRef() {
        return orgnlClrSysRef;
    }

    /**
     * Sets the value of the orgnlClrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction127 setOrgnlClrSysRef(String value) {
        this.orgnlClrSysRef = value;
        return this;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction127 setOrgnlUETR(String value) {
        this.orgnlUETR = value;
        return this;
    }

    /**
     * Gets the value of the txCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationIndividualStatus1Code }
     *     
     */
    public CancellationIndividualStatus1Code getTxCxlSts() {
        return txCxlSts;
    }

    /**
     * Sets the value of the txCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationIndividualStatus1Code }
     *     
     */
    public PaymentTransaction127 setTxCxlSts(CancellationIndividualStatus1Code value) {
        this.txCxlSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationStatusReason4 }
     * 
     * 
     */
    public List<CancellationStatusReason4> getCxlStsRsnInf() {
        if (cxlStsRsnInf == null) {
            cxlStsRsnInf = new ArrayList<CancellationStatusReason4>();
        }
        return this.cxlStsRsnInf;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionData2 }
     *     
     */
    public ResolutionData2 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionData2 }
     *     
     */
    public PaymentTransaction127 setRsltnRltdInf(ResolutionData2 value) {
        this.rsltnRltdInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlIntrBkSttlmAmt() {
        return orgnlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PaymentTransaction127 setOrgnlIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlIntrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlIntrBkSttlmDt() {
        return orgnlIntrBkSttlmDt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PaymentTransaction127 setOrgnlIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.orgnlIntrBkSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public PaymentTransaction127 setAssgnr(Party40Choice value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public PaymentTransaction127 setAssgne(Party40Choice value) {
        this.assgne = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference31 }
     *     
     */
    public OriginalTransactionReference31 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference31 }
     *     
     */
    public PaymentTransaction127 setOrgnlTxRef(OriginalTransactionReference31 value) {
        this.orgnlTxRef = value;
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
     * Adds a new item to the cxlStsRsnInf list.
     * @see #getCxlStsRsnInf()
     * 
     */
    public PaymentTransaction127 addCxlStsRsnInf(CancellationStatusReason4 cxlStsRsnInf) {
        getCxlStsRsnInf().add(cxlStsRsnInf);
        return this;
    }

}
