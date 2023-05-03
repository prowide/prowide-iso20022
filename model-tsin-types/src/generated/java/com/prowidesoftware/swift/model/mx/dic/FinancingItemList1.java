
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies a list of financing items exchanged between two parties, for example invoice, credit, financing request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingItemList1", propOrder = {
    "idr",
    "isseDt",
    "rltdDoc",
    "amtCutOffDt",
    "assgne",
    "assgnr",
    "ntfctnInf",
    "finItm",
    "itmCnt",
    "ctrlSum",
    "ttlReqAmt",
    "ttlReqFincg",
    "agrdRate",
    "fincgInstlmt",
    "addtlInf",
    "vldtnStsInf",
    "fincgSts"
})
public class FinancingItemList1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate isseDt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "AmtCutOffDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate amtCutOffDt;
    @XmlElement(name = "Assgne", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgne;
    @XmlElement(name = "Assgnr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgnr;
    @XmlElement(name = "NtfctnInf")
    protected List<FinancingNotificationParties1Tsin00600101> ntfctnInf;
    @XmlElement(name = "FinItm")
    protected List<FinancialItem1Tsin00600101> finItm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "TtlReqAmt")
    protected ActiveCurrencyAndAmount ttlReqAmt;
    @XmlElement(name = "TtlReqFincg")
    protected FinancingRateOrAmountChoice ttlReqFincg;
    @XmlElement(name = "AgrdRate")
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "FincgInstlmt")
    protected List<Instalment2> fincgInstlmt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "FincgSts")
    protected FinancingInformationAndStatus1 fincgSts;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingItemList1 setIdr(String value) {
        this.idr = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingItemList1 setIsseDt(LocalDate value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the rltdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdDoc property.
     */
    public List<JAXBElement<Object>> getRltdDoc() {
        if (rltdDoc == null) {
            rltdDoc = new ArrayList<>();
        }
        return this.rltdDoc;
    }

    /**
     * Gets the value of the amtCutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAmtCutOffDt() {
        return amtCutOffDt;
    }

    /**
     * Sets the value of the amtCutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingItemList1 setAmtCutOffDt(LocalDate value) {
        this.amtCutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingItemList1 setAssgne(Object value) {
        this.assgne = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingItemList1 setAssgnr(Object value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntfctnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingNotificationParties1Tsin00600101 }
     * 
     * 
     * @return
     *     The value of the ntfctnInf property.
     */
    public List<FinancingNotificationParties1Tsin00600101> getNtfctnInf() {
        if (ntfctnInf == null) {
            ntfctnInf = new ArrayList<>();
        }
        return this.ntfctnInf;
    }

    /**
     * Gets the value of the finItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialItem1Tsin00600101 }
     * 
     * 
     * @return
     *     The value of the finItm property.
     */
    public List<FinancialItem1Tsin00600101> getFinItm() {
        if (finItm == null) {
            finItm = new ArrayList<>();
        }
        return this.finItm;
    }

    /**
     * Gets the value of the itmCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Sets the value of the itmCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingItemList1 setItmCnt(String value) {
        this.itmCnt = value;
        return this;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancingItemList1 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the ttlReqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlReqAmt() {
        return ttlReqAmt;
    }

    /**
     * Sets the value of the ttlReqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancingItemList1 setTtlReqAmt(ActiveCurrencyAndAmount value) {
        this.ttlReqAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlReqFincg property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getTtlReqFincg() {
        return ttlReqFincg;
    }

    /**
     * Sets the value of the ttlReqFincg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingItemList1 setTtlReqFincg(FinancingRateOrAmountChoice value) {
        this.ttlReqFincg = value;
        return this;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public FinancingItemList1 setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the fincgInstlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fincgInstlmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFincgInstlmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment2 }
     * 
     * 
     * @return
     *     The value of the fincgInstlmt property.
     */
    public List<Instalment2> getFincgInstlmt() {
        if (fincgInstlmt == null) {
            fincgInstlmt = new ArrayList<>();
        }
        return this.fincgInstlmt;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancingItemList1 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the vldtnStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Sets the value of the vldtnStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public FinancingItemList1 setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
        return this;
    }

    /**
     * Gets the value of the fincgSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingInformationAndStatus1 getFincgSts() {
        return fincgSts;
    }

    /**
     * Sets the value of the fincgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingItemList1 setFincgSts(FinancingInformationAndStatus1 value) {
        this.fincgSts = value;
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
     * Adds a new item to the rltdDoc list.
     * @see #getRltdDoc()
     * 
     */
    public FinancingItemList1 addRltdDoc(JAXBElement<Object> rltdDoc) {
        getRltdDoc().add(rltdDoc);
        return this;
    }

    /**
     * Adds a new item to the ntfctnInf list.
     * @see #getNtfctnInf()
     * 
     */
    public FinancingItemList1 addNtfctnInf(FinancingNotificationParties1Tsin00600101 ntfctnInf) {
        getNtfctnInf().add(ntfctnInf);
        return this;
    }

    /**
     * Adds a new item to the finItm list.
     * @see #getFinItm()
     * 
     */
    public FinancingItemList1 addFinItm(FinancialItem1Tsin00600101 finItm) {
        getFinItm().add(finItm);
        return this;
    }

    /**
     * Adds a new item to the fincgInstlmt list.
     * @see #getFincgInstlmt()
     * 
     */
    public FinancingItemList1 addFincgInstlmt(Instalment2 fincgInstlmt) {
        getFincgInstlmt().add(fincgInstlmt);
        return this;
    }

}
