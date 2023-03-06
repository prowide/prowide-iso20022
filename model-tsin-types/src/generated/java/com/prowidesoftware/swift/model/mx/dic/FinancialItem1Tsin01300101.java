
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies information about a financing relation between two parties represented by a document, for example invoice, credit.
 * The component may include an external document describing details of the underlying trade object using an external schema.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialItem1", propOrder = {
    "itmCntxt",
    "finDocRef",
    "cdtDbtInd",
    "ttlAmt",
    "dueAmt",
    "instlmtInf",
    "addtlInf",
    "assoctdDoc",
    "vldtnStsInf",
    "fincgSts",
    "prtryDtls"
})
public class FinancialItem1Tsin01300101 {

    @XmlElement(name = "ItmCntxt", required = true)
    protected FinancialItemParameters1Tsin01300101 itmCntxt;
    @XmlElementRef(name = "FinDocRef", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> finDocRef;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TtlAmt", required = true)
    protected InvoiceTotals1 ttlAmt;
    @XmlElement(name = "DueAmt")
    protected ActiveCurrencyAndAmount dueAmt;
    @XmlElement(name = "InstlmtInf")
    protected List<Instalment2> instlmtInf;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "FincgSts")
    protected FinancingInformationAndStatus1 fincgSts;
    @XmlElement(name = "PrtryDtls")
    protected SupplementaryData1 prtryDtls;

    /**
     * Gets the value of the itmCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialItemParameters1Tsin01300101 }
     *     
     */
    public FinancialItemParameters1Tsin01300101 getItmCntxt() {
        return itmCntxt;
    }

    /**
     * Sets the value of the itmCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialItemParameters1Tsin01300101 }
     *     
     */
    public FinancialItem1Tsin01300101 setItmCntxt(FinancialItemParameters1Tsin01300101 value) {
        this.itmCntxt = value;
        return this;
    }

    /**
     * Gets the value of the finDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFinDocRef() {
        if (finDocRef == null) {
            finDocRef = new ArrayList<JAXBElement<Object>>();
        }
        return this.finDocRef;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public FinancialItem1Tsin01300101 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public InvoiceTotals1 getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public FinancialItem1Tsin01300101 setTtlAmt(InvoiceTotals1 value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the dueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDueAmt() {
        return dueAmt;
    }

    /**
     * Sets the value of the dueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancialItem1Tsin01300101 setDueAmt(ActiveCurrencyAndAmount value) {
        this.dueAmt = value;
        return this;
    }

    /**
     * Gets the value of the instlmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instlmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment2 }
     * 
     * 
     */
    public List<Instalment2> getInstlmtInf() {
        if (instlmtInf == null) {
            instlmtInf = new ArrayList<Instalment2>();
        }
        return this.instlmtInf;
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
    public FinancialItem1Tsin01300101 setAddtlInf(String value) {
        this.addtlInf = value;
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
    public FinancialItem1Tsin01300101 setVldtnStsInf(ValidationStatusInformation1 value) {
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
    public FinancialItem1Tsin01300101 setFincgSts(FinancingInformationAndStatus1 value) {
        this.fincgSts = value;
        return this;
    }

    /**
     * Gets the value of the prtryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getPrtryDtls() {
        return prtryDtls;
    }

    /**
     * Sets the value of the prtryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public FinancialItem1Tsin01300101 setPrtryDtls(SupplementaryData1 value) {
        this.prtryDtls = value;
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
     * Adds a new item to the finDocRef list.
     * @see #getFinDocRef()
     * 
     */
    public FinancialItem1Tsin01300101 addFinDocRef(JAXBElement<Object> finDocRef) {
        getFinDocRef().add(finDocRef);
        return this;
    }

    /**
     * Adds a new item to the instlmtInf list.
     * @see #getInstlmtInf()
     * 
     */
    public FinancialItem1Tsin01300101 addInstlmtInf(Instalment2 instlmtInf) {
        getInstlmtInf().add(instlmtInf);
        return this;
    }

    /**
     * Adds a new item to the assoctdDoc list.
     * @see #getAssoctdDoc()
     * 
     */
    public FinancialItem1Tsin01300101 addAssoctdDoc(JAXBElement<Object> assoctdDoc) {
        getAssoctdDoc().add(assoctdDoc);
        return this;
    }

}
