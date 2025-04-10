
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
 * Defines a list of party management registration and guarantee requests.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingAgreementList1", propOrder = {
    "idr",
    "dt",
    "rltdDoc",
    "agrmtRqstr",
    "agrmtRspndr",
    "grntApplcnt",
    "grntNbfcry",
    "grntIssr",
    "ntfctnInf",
    "itm",
    "itmCnt",
    "ctrlSum",
    "addtlInf",
    "vldtnStsInf"
})
public class FinancingAgreementList1Tsin01000101 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "Dt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "AgrmtRqstr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object agrmtRqstr;
    @XmlElement(name = "AgrmtRspndr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object agrmtRspndr;
    @XmlElement(name = "GrntApplcnt", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object grntApplcnt;
    @XmlElement(name = "GrntNbfcry", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object grntNbfcry;
    @XmlElement(name = "GrntIssr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object grntIssr;
    @XmlElement(name = "NtfctnInf")
    protected List<FinancingNotificationParties1Tsin01000101> ntfctnInf;
    @XmlElement(name = "Itm", required = true)
    protected List<FinancingAgreementItem1> itm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;

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
    public FinancingAgreementList1Tsin01000101 setIdr(String value) {
        this.idr = value;
        return this;
    }

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
    public FinancingAgreementList1Tsin01000101 setDt(XMLGregorianCalendar value) {
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
     * Gets the value of the agrmtRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgrmtRqstr() {
        return agrmtRqstr;
    }

    /**
     * Sets the value of the agrmtRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingAgreementList1Tsin01000101 setAgrmtRqstr(Object value) {
        this.agrmtRqstr = value;
        return this;
    }

    /**
     * Gets the value of the agrmtRspndr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgrmtRspndr() {
        return agrmtRspndr;
    }

    /**
     * Sets the value of the agrmtRspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingAgreementList1Tsin01000101 setAgrmtRspndr(Object value) {
        this.agrmtRspndr = value;
        return this;
    }

    /**
     * Gets the value of the grntApplcnt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGrntApplcnt() {
        return grntApplcnt;
    }

    /**
     * Sets the value of the grntApplcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingAgreementList1Tsin01000101 setGrntApplcnt(Object value) {
        this.grntApplcnt = value;
        return this;
    }

    /**
     * Gets the value of the grntNbfcry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGrntNbfcry() {
        return grntNbfcry;
    }

    /**
     * Sets the value of the grntNbfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingAgreementList1Tsin01000101 setGrntNbfcry(Object value) {
        this.grntNbfcry = value;
        return this;
    }

    /**
     * Gets the value of the grntIssr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGrntIssr() {
        return grntIssr;
    }

    /**
     * Sets the value of the grntIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingAgreementList1Tsin01000101 setGrntIssr(Object value) {
        this.grntIssr = value;
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
     * {@link FinancingNotificationParties1Tsin01000101 }
     * 
     * 
     */
    public List<FinancingNotificationParties1Tsin01000101> getNtfctnInf() {
        if (ntfctnInf == null) {
            ntfctnInf = new ArrayList<FinancingNotificationParties1Tsin01000101>();
        }
        return this.ntfctnInf;
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
     * {@link FinancingAgreementItem1 }
     * 
     * 
     */
    public List<FinancingAgreementItem1> getItm() {
        if (itm == null) {
            itm = new ArrayList<FinancingAgreementItem1>();
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
    public FinancingAgreementList1Tsin01000101 setItmCnt(String value) {
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
    public FinancingAgreementList1Tsin01000101 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
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
    public FinancingAgreementList1Tsin01000101 setAddtlInf(String value) {
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
    public FinancingAgreementList1Tsin01000101 setVldtnStsInf(ValidationStatusInformation1 value) {
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
    public FinancingAgreementList1Tsin01000101 addRltdDoc(JAXBElement<Object> rltdDoc) {
        getRltdDoc().add(rltdDoc);
        return this;
    }

    /**
     * Adds a new item to the ntfctnInf list.
     * @see #getNtfctnInf()
     * 
     */
    public FinancingAgreementList1Tsin01000101 addNtfctnInf(FinancingNotificationParties1Tsin01000101 ntfctnInf) {
        getNtfctnInf().add(ntfctnInf);
        return this;
    }

    /**
     * Adds a new item to the itm list.
     * @see #getItm()
     * 
     */
    public FinancingAgreementList1Tsin01000101 addItm(FinancingAgreementItem1 itm) {
        getItm().add(itm);
        return this;
    }

}
