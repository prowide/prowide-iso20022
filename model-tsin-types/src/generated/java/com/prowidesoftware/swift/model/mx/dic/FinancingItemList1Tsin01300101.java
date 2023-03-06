
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
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
public class FinancingItemList1Tsin01300101 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "AmtCutOffDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar amtCutOffDt;
    @XmlElement(name = "Assgne", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgne;
    @XmlElement(name = "Assgnr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgnr;
    @XmlElement(name = "NtfctnInf")
    protected List<FinancingNotificationParties1Tsin01300101> ntfctnInf;
    @XmlElement(name = "FinItm")
    protected List<FinancialItem1Tsin01300101> finItm;
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
    public FinancingItemList1Tsin01300101 setIdr(String value) {
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
    public XMLGregorianCalendar getIsseDt() {
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
    public FinancingItemList1Tsin01300101 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the rltdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdDoc property.
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
     */
    public List<JAXBElement<Object>> getRltdDoc() {
        if (rltdDoc == null) {
            rltdDoc = new ArrayList<JAXBElement<Object>>();
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
    public XMLGregorianCalendar getAmtCutOffDt() {
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
    public FinancingItemList1Tsin01300101 setAmtCutOffDt(XMLGregorianCalendar value) {
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
    public FinancingItemList1Tsin01300101 setAssgne(Object value) {
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
    public FinancingItemList1Tsin01300101 setAssgnr(Object value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntfctnInf property.
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
     * {@link FinancingNotificationParties1Tsin01300101 }
     * 
     * 
     */
    public List<FinancingNotificationParties1Tsin01300101> getNtfctnInf() {
        if (ntfctnInf == null) {
            ntfctnInf = new ArrayList<FinancingNotificationParties1Tsin01300101>();
        }
        return this.ntfctnInf;
    }

    /**
     * Gets the value of the finItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finItm property.
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
     * {@link FinancialItem1Tsin01300101 }
     * 
     * 
     */
    public List<FinancialItem1Tsin01300101> getFinItm() {
        if (finItm == null) {
            finItm = new ArrayList<FinancialItem1Tsin01300101>();
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
    public FinancingItemList1Tsin01300101 setItmCnt(String value) {
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
    public FinancingItemList1Tsin01300101 setCtrlSum(BigDecimal value) {
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
    public FinancingItemList1Tsin01300101 setTtlReqAmt(ActiveCurrencyAndAmount value) {
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
    public FinancingItemList1Tsin01300101 setTtlReqFincg(FinancingRateOrAmountChoice value) {
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
    public FinancingItemList1Tsin01300101 setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the fincgInstlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fincgInstlmt property.
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
     */
    public List<Instalment2> getFincgInstlmt() {
        if (fincgInstlmt == null) {
            fincgInstlmt = new ArrayList<Instalment2>();
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
    public FinancingItemList1Tsin01300101 setAddtlInf(String value) {
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
    public FinancingItemList1Tsin01300101 setVldtnStsInf(ValidationStatusInformation1 value) {
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
    public FinancingItemList1Tsin01300101 setFincgSts(FinancingInformationAndStatus1 value) {
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
    public FinancingItemList1Tsin01300101 addRltdDoc(JAXBElement<Object> rltdDoc) {
        getRltdDoc().add(rltdDoc);
        return this;
    }

    /**
     * Adds a new item to the ntfctnInf list.
     * @see #getNtfctnInf()
     * 
     */
    public FinancingItemList1Tsin01300101 addNtfctnInf(FinancingNotificationParties1Tsin01300101 ntfctnInf) {
        getNtfctnInf().add(ntfctnInf);
        return this;
    }

    /**
     * Adds a new item to the finItm list.
     * @see #getFinItm()
     * 
     */
    public FinancingItemList1Tsin01300101 addFinItm(FinancialItem1Tsin01300101 finItm) {
        getFinItm().add(finItm);
        return this;
    }

    /**
     * Adds a new item to the fincgInstlmt list.
     * @see #getFincgInstlmt()
     * 
     */
    public FinancingItemList1Tsin01300101 addFincgInstlmt(Instalment2 fincgInstlmt) {
        getFincgInstlmt().add(fincgInstlmt);
        return this;
    }

}
