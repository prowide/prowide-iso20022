
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction38", propOrder = {
    "cxlId",
    "_case",
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlClrSysRef",
    "orgnlIntrBkSttlmAmt",
    "orgnlIntrBkSttlmDt",
    "assgnr",
    "assgne",
    "cxlRsnInf",
    "orgnlTxRef"
})
public class PaymentTransaction38 {

    @XmlElement(name = "CxlId")
    protected String cxlId;
    @XmlElement(name = "Case")
    protected Case3 _case;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation3 orgnlGrpInf;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlClrSysRef")
    protected String orgnlClrSysRef;
    @XmlElement(name = "OrgnlIntrBkSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlIntrBkSttlmAmt;
    @XmlElement(name = "OrgnlIntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar orgnlIntrBkSttlmDt;
    @XmlElement(name = "Assgnr")
    protected BranchAndFinancialInstitutionIdentification5 assgnr;
    @XmlElement(name = "Assgne")
    protected BranchAndFinancialInstitutionIdentification5 assgne;
    @XmlElement(name = "CxlRsnInf")
    protected List<PaymentCancellationReason2> cxlRsnInf;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference16 orgnlTxRef;

    /**
     * Gets the value of the cxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlId() {
        return cxlId;
    }

    /**
     * Sets the value of the cxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction38 setCxlId(String value) {
        this.cxlId = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case3 }
     *     
     */
    public Case3 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case3 }
     *     
     */
    public PaymentTransaction38 setCase(Case3 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation3 }
     *     
     */
    public OriginalGroupInformation3 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation3 }
     *     
     */
    public PaymentTransaction38 setOrgnlGrpInf(OriginalGroupInformation3 value) {
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
    public PaymentTransaction38 setOrgnlInstrId(String value) {
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
    public PaymentTransaction38 setOrgnlEndToEndId(String value) {
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
    public PaymentTransaction38 setOrgnlTxId(String value) {
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
    public PaymentTransaction38 setOrgnlClrSysRef(String value) {
        this.orgnlClrSysRef = value;
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
    public PaymentTransaction38 setOrgnlIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlIntrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrgnlIntrBkSttlmDt() {
        return orgnlIntrBkSttlmDt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction38 setOrgnlIntrBkSttlmDt(Calendar value) {
        this.orgnlIntrBkSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public PaymentTransaction38 setAssgnr(BranchAndFinancialInstitutionIdentification5 value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public PaymentTransaction38 setAssgne(BranchAndFinancialInstitutionIdentification5 value) {
        this.assgne = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCancellationReason2 }
     * 
     * 
     * @return
     *     The value of the cxlRsnInf property.
     */
    public List<PaymentCancellationReason2> getCxlRsnInf() {
        if (cxlRsnInf == null) {
            cxlRsnInf = new ArrayList<>();
        }
        return this.cxlRsnInf;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference16 }
     *     
     */
    public OriginalTransactionReference16 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference16 }
     *     
     */
    public PaymentTransaction38 setOrgnlTxRef(OriginalTransactionReference16 value) {
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
     * Adds a new item to the cxlRsnInf list.
     * @see #getCxlRsnInf()
     * 
     */
    public PaymentTransaction38 addCxlRsnInf(PaymentCancellationReason2 cxlRsnInf) {
        getCxlRsnInf().add(cxlRsnInf);
        return this;
    }

}
