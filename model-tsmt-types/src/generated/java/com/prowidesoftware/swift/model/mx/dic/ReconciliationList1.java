
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
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
 * Specifies a list of reconciliation information concerning financial items.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationList1", propOrder = {
    "dt",
    "rltdDoc",
    "rcpt",
    "advsr",
    "params",
    "pmtRef",
    "pmtMeans",
    "pmtDt",
    "pmtTerms",
    "pmtAmt",
    "itm",
    "itmCnt",
    "ctrlSum",
    "assoctdDoc",
    "addtlInf",
    "vldtnStsInf"
})
public class ReconciliationList1 {

    @XmlElement(name = "Dt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "Rcpt", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Advsr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object advsr;
    @XmlElement(name = "Params", required = true)
    protected FinancialItemParameters1 params;
    @XmlElement(name = "PmtRef", required = true)
    protected PaymentIdentification1 pmtRef;
    @XmlElement(name = "PmtMeans", required = true)
    protected PaymentMeans1 pmtMeans;
    @XmlElement(name = "PmtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDt;
    @XmlElement(name = "PmtTerms", required = true)
    protected PaymentTerms6 pmtTerms;
    @XmlElement(name = "PmtAmt", required = true)
    protected CurrencyAndAmount pmtAmt;
    @XmlElement(name = "Itm", required = true)
    protected List<FinancialItem1Tsmt05300101> itm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReconciliationList1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
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
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public ReconciliationList1 setRcpt(Object value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the advsr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvsr() {
        return advsr;
    }

    /**
     * Sets the value of the advsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public ReconciliationList1 setAdvsr(Object value) {
        this.advsr = value;
        return this;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public FinancialItemParameters1 getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public ReconciliationList1 setParams(FinancialItemParameters1 value) {
        this.params = value;
        return this;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification1 }
     *     
     */
    public PaymentIdentification1 getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification1 }
     *     
     */
    public ReconciliationList1 setPmtRef(PaymentIdentification1 value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the pmtMeans property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeans1 }
     *     
     */
    public PaymentMeans1 getPmtMeans() {
        return pmtMeans;
    }

    /**
     * Sets the value of the pmtMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeans1 }
     *     
     */
    public ReconciliationList1 setPmtMeans(PaymentMeans1 value) {
        this.pmtMeans = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReconciliationList1 setPmtDt(XMLGregorianCalendar value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms6 }
     *     
     */
    public PaymentTerms6 getPmtTerms() {
        return pmtTerms;
    }

    /**
     * Sets the value of the pmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms6 }
     *     
     */
    public ReconciliationList1 setPmtTerms(PaymentTerms6 value) {
        this.pmtTerms = value;
        return this;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public ReconciliationList1 setPmtAmt(CurrencyAndAmount value) {
        this.pmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the itm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialItem1Tsmt05300101 }
     * 
     * 
     */
    public List<FinancialItem1Tsmt05300101> getItm() {
        if (itm == null) {
            itm = new ArrayList<FinancialItem1Tsmt05300101>();
        }
        return this.itm;
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
    public ReconciliationList1 setItmCnt(String value) {
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
    public ReconciliationList1 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<JAXBElement<Object>>();
        }
        return this.assoctdDoc;
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
    public ReconciliationList1 setAddtlInf(String value) {
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
    public ReconciliationList1 setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
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
    public ReconciliationList1 addRltdDoc(JAXBElement<Object> rltdDoc) {
        getRltdDoc().add(rltdDoc);
        return this;
    }

    /**
     * Adds a new item to the itm list.
     * @see #getItm()
     * 
     */
    public ReconciliationList1 addItm(FinancialItem1Tsmt05300101 itm) {
        getItm().add(itm);
        return this;
    }

    /**
     * Adds a new item to the assoctdDoc list.
     * @see #getAssoctdDoc()
     * 
     */
    public ReconciliationList1 addAssoctdDoc(JAXBElement<Object> assoctdDoc) {
        getAssoctdDoc().add(assoctdDoc);
        return this;
    }

}
