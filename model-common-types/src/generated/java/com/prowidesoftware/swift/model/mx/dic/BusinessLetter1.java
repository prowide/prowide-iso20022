
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
 * Defines a business letter containing identifications of involved entities and their roles, references to documents, free form text and signatures.
 * The semantics of this information are defined by usual business practices for the exchange and tracing of business letters. The described references and party identifiers permit to establish a linked informal trace of sequences of letters.
 * This message component contains three types of elements that can be referenced using IDREF:
 * (1) - all elements defining qualified parties,
 * (2) - all elements defining qualified documents or references to them,
 * (3) - the LegalContext element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessLetter1", propOrder = {
    "applCntxt",
    "lttrIdr",
    "dt",
    "rltdLttr",
    "rltdMsg",
    "cnttIdr",
    "instrPrty",
    "orgtr",
    "pmryRcpt",
    "sndr",
    "authstnUsr",
    "rspnRcpt",
    "cpyRcpt",
    "othrPty",
    "assoctdDoc",
    "govngCtrct",
    "lglCntxt",
    "addtlInf",
    "ntce",
    "vldtnStsInf",
    "dgtlSgntr"
})
public class BusinessLetter1 {

    @XmlElement(name = "ApplCntxt")
    protected String applCntxt;
    @XmlElement(name = "LttrIdr", required = true)
    protected QualifiedDocumentInformation1 lttrIdr;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "RltdLttr")
    protected List<QualifiedDocumentInformation1> rltdLttr;
    @XmlElement(name = "RltdMsg")
    protected List<QualifiedDocumentInformation1> rltdMsg;
    @XmlElement(name = "CnttIdr")
    protected List<String> cnttIdr;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code instrPrty;
    @XmlElement(name = "Orgtr", required = true)
    protected QualifiedPartyIdentification1 orgtr;
    @XmlElement(name = "PmryRcpt", required = true)
    protected List<QualifiedPartyIdentification1> pmryRcpt;
    @XmlElement(name = "Sndr")
    protected List<QualifiedPartyIdentification1> sndr;
    @XmlElement(name = "AuthstnUsr", required = true)
    protected List<QualifiedPartyIdentification1> authstnUsr;
    @XmlElement(name = "RspnRcpt")
    protected List<QualifiedPartyIdentification1> rspnRcpt;
    @XmlElement(name = "CpyRcpt")
    protected List<QualifiedPartyIdentification1> cpyRcpt;
    @XmlElement(name = "OthrPty")
    protected List<QualifiedPartyIdentification1> othrPty;
    @XmlElement(name = "AssoctdDoc")
    protected List<QualifiedDocumentInformation1> assoctdDoc;
    @XmlElement(name = "GovngCtrct")
    protected List<QualifiedDocumentInformation1> govngCtrct;
    @XmlElement(name = "LglCntxt")
    protected List<GovernanceRules2> lglCntxt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Ntce")
    protected String ntce;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<QualifiedPartyAndXMLSignature1> dgtlSgntr;

    /**
     * Gets the value of the applCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplCntxt() {
        return applCntxt;
    }

    /**
     * Sets the value of the applCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessLetter1 setApplCntxt(String value) {
        this.applCntxt = value;
        return this;
    }

    /**
     * Gets the value of the lttrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedDocumentInformation1 }
     *     
     */
    public QualifiedDocumentInformation1 getLttrIdr() {
        return lttrIdr;
    }

    /**
     * Sets the value of the lttrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedDocumentInformation1 }
     *     
     */
    public BusinessLetter1 setLttrIdr(QualifiedDocumentInformation1 value) {
        this.lttrIdr = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public BusinessLetter1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the rltdLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdLttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdLttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getRltdLttr() {
        if (rltdLttr == null) {
            rltdLttr = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.rltdLttr;
    }

    /**
     * Gets the value of the rltdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getRltdMsg() {
        if (rltdMsg == null) {
            rltdMsg = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.rltdMsg;
    }

    /**
     * Gets the value of the cnttIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnttIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnttIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCnttIdr() {
        if (cnttIdr == null) {
            cnttIdr = new ArrayList<String>();
        }
        return this.cnttIdr;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public BusinessLetter1 setInstrPrty(Priority3Code value) {
        this.instrPrty = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedPartyIdentification1 }
     *     
     */
    public QualifiedPartyIdentification1 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedPartyIdentification1 }
     *     
     */
    public BusinessLetter1 setOrgtr(QualifiedPartyIdentification1 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the pmryRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmryRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getPmryRcpt() {
        if (pmryRcpt == null) {
            pmryRcpt = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.pmryRcpt;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sndr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.sndr;
    }

    /**
     * Gets the value of the authstnUsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authstnUsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstnUsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getAuthstnUsr() {
        if (authstnUsr == null) {
            authstnUsr = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.authstnUsr;
    }

    /**
     * Gets the value of the rspnRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rspnRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getRspnRcpt() {
        if (rspnRcpt == null) {
            rspnRcpt = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.rspnRcpt;
    }

    /**
     * Gets the value of the cpyRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpyRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpyRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getCpyRcpt() {
        if (cpyRcpt == null) {
            cpyRcpt = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.cpyRcpt;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.othrPty;
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
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.assoctdDoc;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lglCntxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglCntxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernanceRules2 }
     * 
     * 
     */
    public List<GovernanceRules2> getLglCntxt() {
        if (lglCntxt == null) {
            lglCntxt = new ArrayList<GovernanceRules2>();
        }
        return this.lglCntxt;
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
    public BusinessLetter1 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the ntce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtce() {
        return ntce;
    }

    /**
     * Sets the value of the ntce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessLetter1 setNtce(String value) {
        this.ntce = value;
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
    public BusinessLetter1 setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyAndXMLSignature1 }
     * 
     * 
     */
    public List<QualifiedPartyAndXMLSignature1> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<QualifiedPartyAndXMLSignature1>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the rltdLttr list.
     * @see #getRltdLttr()
     * 
     */
    public BusinessLetter1 addRltdLttr(QualifiedDocumentInformation1 rltdLttr) {
        getRltdLttr().add(rltdLttr);
        return this;
    }

    /**
     * Adds a new item to the rltdMsg list.
     * @see #getRltdMsg()
     * 
     */
    public BusinessLetter1 addRltdMsg(QualifiedDocumentInformation1 rltdMsg) {
        getRltdMsg().add(rltdMsg);
        return this;
    }

    /**
     * Adds a new item to the cnttIdr list.
     * @see #getCnttIdr()
     * 
     */
    public BusinessLetter1 addCnttIdr(String cnttIdr) {
        getCnttIdr().add(cnttIdr);
        return this;
    }

    /**
     * Adds a new item to the pmryRcpt list.
     * @see #getPmryRcpt()
     * 
     */
    public BusinessLetter1 addPmryRcpt(QualifiedPartyIdentification1 pmryRcpt) {
        getPmryRcpt().add(pmryRcpt);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public BusinessLetter1 addSndr(QualifiedPartyIdentification1 sndr) {
        getSndr().add(sndr);
        return this;
    }

    /**
     * Adds a new item to the authstnUsr list.
     * @see #getAuthstnUsr()
     * 
     */
    public BusinessLetter1 addAuthstnUsr(QualifiedPartyIdentification1 authstnUsr) {
        getAuthstnUsr().add(authstnUsr);
        return this;
    }

    /**
     * Adds a new item to the rspnRcpt list.
     * @see #getRspnRcpt()
     * 
     */
    public BusinessLetter1 addRspnRcpt(QualifiedPartyIdentification1 rspnRcpt) {
        getRspnRcpt().add(rspnRcpt);
        return this;
    }

    /**
     * Adds a new item to the cpyRcpt list.
     * @see #getCpyRcpt()
     * 
     */
    public BusinessLetter1 addCpyRcpt(QualifiedPartyIdentification1 cpyRcpt) {
        getCpyRcpt().add(cpyRcpt);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public BusinessLetter1 addOthrPty(QualifiedPartyIdentification1 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the assoctdDoc list.
     * @see #getAssoctdDoc()
     * 
     */
    public BusinessLetter1 addAssoctdDoc(QualifiedDocumentInformation1 assoctdDoc) {
        getAssoctdDoc().add(assoctdDoc);
        return this;
    }

    /**
     * Adds a new item to the govngCtrct list.
     * @see #getGovngCtrct()
     * 
     */
    public BusinessLetter1 addGovngCtrct(QualifiedDocumentInformation1 govngCtrct) {
        getGovngCtrct().add(govngCtrct);
        return this;
    }

    /**
     * Adds a new item to the lglCntxt list.
     * @see #getLglCntxt()
     * 
     */
    public BusinessLetter1 addLglCntxt(GovernanceRules2 lglCntxt) {
        getLglCntxt().add(lglCntxt);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public BusinessLetter1 addDgtlSgntr(QualifiedPartyAndXMLSignature1 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
