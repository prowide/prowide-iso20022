
package com.prowidesoftware.swift.model.mx.dic;

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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes a financing relation between two parties, for example invoice, credit, financing request, cash accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingAgreementItem1", propOrder = {
    "itmCntxt",
    "itmActn",
    "pmtInstrm",
    "vldtnStsInf",
    "ratg",
    "reopIndctn",
    "grnt",
    "grntSts",
    "rltdGrntLttr",
    "assoctdDoc",
    "addtlInf"
})
public class FinancingAgreementItem1 {

    @XmlElement(name = "ItmCntxt", required = true)
    protected FinancialItemParameters1Tsin01000101 itmCntxt;
    @XmlElement(name = "ItmActn")
    @XmlSchemaType(name = "string")
    protected AgreementItemAction1Code itmActn;
    @XmlElement(name = "PmtInstrm")
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentCode pmtInstrm;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "Ratg")
    protected boolean ratg;
    @XmlElement(name = "ReopIndctn")
    protected boolean reopIndctn;
    @XmlElement(name = "Grnt")
    protected List<GuaranteeDetails1> grnt;
    @XmlElement(name = "GrntSts")
    protected ValidationStatusInformation1 grntSts;
    @XmlElement(name = "RltdGrntLttr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rltdGrntLttr;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the itmCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialItemParameters1Tsin01000101 }
     *     
     */
    public FinancialItemParameters1Tsin01000101 getItmCntxt() {
        return itmCntxt;
    }

    /**
     * Sets the value of the itmCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialItemParameters1Tsin01000101 }
     *     
     */
    public FinancingAgreementItem1 setItmCntxt(FinancialItemParameters1Tsin01000101 value) {
        this.itmCntxt = value;
        return this;
    }

    /**
     * Gets the value of the itmActn property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementItemAction1Code }
     *     
     */
    public AgreementItemAction1Code getItmActn() {
        return itmActn;
    }

    /**
     * Sets the value of the itmActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementItemAction1Code }
     *     
     */
    public FinancingAgreementItem1 setItmActn(AgreementItemAction1Code value) {
        this.itmActn = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentCode }
     *     
     */
    public PaymentInstrumentCode getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentCode }
     *     
     */
    public FinancingAgreementItem1 setPmtInstrm(PaymentInstrumentCode value) {
        this.pmtInstrm = value;
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
    public FinancingAgreementItem1 setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
        return this;
    }

    /**
     * Gets the value of the ratg property.
     * 
     */
    public boolean isRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     */
    public FinancingAgreementItem1 setRatg(boolean value) {
        this.ratg = value;
        return this;
    }

    /**
     * Gets the value of the reopIndctn property.
     * 
     */
    public boolean isReopIndctn() {
        return reopIndctn;
    }

    /**
     * Sets the value of the reopIndctn property.
     * 
     */
    public FinancingAgreementItem1 setReopIndctn(boolean value) {
        this.reopIndctn = value;
        return this;
    }

    /**
     * Gets the value of the grnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeDetails1 }
     * 
     * 
     */
    public List<GuaranteeDetails1> getGrnt() {
        if (grnt == null) {
            grnt = new ArrayList<GuaranteeDetails1>();
        }
        return this.grnt;
    }

    /**
     * Gets the value of the grntSts property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getGrntSts() {
        return grntSts;
    }

    /**
     * Sets the value of the grntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public FinancingAgreementItem1 setGrntSts(ValidationStatusInformation1 value) {
        this.grntSts = value;
        return this;
    }

    /**
     * Gets the value of the rltdGrntLttr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRltdGrntLttr() {
        return rltdGrntLttr;
    }

    /**
     * Sets the value of the rltdGrntLttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingAgreementItem1 setRltdGrntLttr(Object value) {
        this.rltdGrntLttr = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
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
     * Adds a new item to the grnt list.
     * @see #getGrnt()
     * 
     */
    public FinancingAgreementItem1 addGrnt(GuaranteeDetails1 grnt) {
        getGrnt().add(grnt);
        return this;
    }

    /**
     * Adds a new item to the assoctdDoc list.
     * @see #getAssoctdDoc()
     * 
     */
    public FinancingAgreementItem1 addAssoctdDoc(JAXBElement<Object> assoctdDoc) {
        getAssoctdDoc().add(assoctdDoc);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public FinancingAgreementItem1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
